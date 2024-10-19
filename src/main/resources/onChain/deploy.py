from pytezos import pytezos, ContractInterface
from concrete import fhe
import hashlib
import argparse
import os


@fhe.compiler({"data": "encrypted"})
def encrypt_data(data):
    return data


def get_encrypted_data(data):
    """Function to encrypt data using the FHE encryption scheme and
    setup the client access

    Args:
        data (str): serialized eBl

    Returns:
        str: encrypted data to store on the blockchain
    """
    input = [ord(c) for c in data]
    circuit = encrypt_data.compile(input)
    circuit.keys.generate(seed=42)
    circuit.server.save("smartcontract.zip")

    encyptedString = ""
    for n in input:
        encyptedString += str(circuit.encrypt(n).serialize()) + '|||'
    return encyptedString


def getAddress(key, path):
    """Function to get the address of the owner of the contract

    Args:
        key (str): private key of the owner

    Returns:
        str: address of the owner
    """
    contract = ContractInterface.from_file(path + '/kayp_contract.tz').using(key=key)
    return (contract.storage.dummy()["owner"])


def deploy_contract(serializedeBl):
    """Deploy and fill the smart contract

    Args:
        serializedeBl (str): Serialized eBl

    Returns:
        str: Contract address
    """

    key = "edskRzreHRE5o6miuLLjZ7YFEWVzD7GHzozqCv8BUHCH5thfbiTZkZ2pWRhZ6TwSZSRzqn1PoKidji6DR7bzd3ZTpXYB7ucbyS"
    path = os.path.dirname(os.path.realpath(__file__))
    try:
        contract = ContractInterface.from_file(path + '/kayp_contract.tz')
    except Exception:
        print("Error while loading contract ")
        return "0x"

    encryptedData = get_encrypted_data(serializedeBl)
    hasher = hashlib.sha256()
    hasher.update(encryptedData.encode())
    hashed = hasher.hexdigest()

    try:
        wallet = pytezos.using(key=key)
        initial_storage = {'owner': getAddress(key, path), 'id': hashed}
        value = wallet.origination(script=contract.script(initial_storage)).send(min_confirmations=1)
        opg = pytezos.shell.blocks[value.branch:] \
            .find_operation(value.opg_hash)
    except Exception:
        print("Error while deploying contract ")
        return "0x"

    contract_address = opg["contents"][0]["metadata"]["operation_result"]["originated_contracts"][0]
    return contract_address


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description='Deploy contract')
    parser.add_argument('-ebl', '--ebl', type=str, help='Serialized ebl', required=True)
    args = parser.parse_args()

    result = deploy_contract(args.ebl)
    print(result)
