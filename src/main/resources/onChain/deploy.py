from pytezos import pytezos
from pytezos import ContractInterface
from concrete import fhe
import hashlib

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


def fill_contract(contract_address, encryptedData):
    """Fill the smart contract with the encrypted data's hash

    Args:
        contract_address (str): Contact address
        encryptedData (str): Encrypted data

    Returns:
        Boolean: True if the contract is filled successfully, else false
    """
    builder = pytezos.contract(contract_address)
    hasher = hashlib.sha256()
    hasher.update(encryptedData.encode())
    hashed = hasher.hexdigest()
    try:
        opg = pytezos.bulk(builder.eblUpdate(hashed).send(min_confirmations=1))
    except Exception as e:
        print(e)
        return False
    return True


def deploy_contract(serializedeBl):
    """Deploy and fill the smart contract

    Args:
        serializedeBl (str): Serialized eBl

    Returns:
        str: Contract address
    """

    try:
        key = "edskRzreHRE5o6miuLLjZ7YFEWVzD7GHzozqCv8BUHCH5thfbiTZkZ2pWRhZ6TwSZSRzqn1PoKidji6DR7bzd3ZTpXYB7ucbyS"
        contract = ContractInterface.from_file('./kayp_contract.tz').using(key=key)
        ci = contract.using(key=key)
    except Exception:
        print("Error while loading contract")
        return "0x"

    encryptedData = get_encrypted_data(serializedeBl)

    try:
        value = pytezos.origination(script=ci.script()).send(min_confirmations=1)
        opg = pytezos.shell.blocks[value.branch:] \
            .find_operation(value.opg_hash)
    except Exception:
        print("Error while deploying contract")
        return "0x"

    contract_address = opg["contents"][0]["metadata"]["operation_result"]["originated_contracts"][0]

    if not fill_contract(contract_address, encryptedData):
        print("Error while filling contract")
        return "0x"

    return contract_address


print(deploy_contract("test"))
