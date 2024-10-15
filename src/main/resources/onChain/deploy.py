from pytezos import pytezos
from pytezos import ContractInterface
from pytezos.operation.result import OperationResult
from concrete import fhe


key = "edskS2w2qaNik7bepNQi1MinJ52ratUHUJzbnyumdLJMcfGBH9U3p8yjk3Gs1Lh84iSNNfXTbNLkEvekpYB5FTnqAFezNF4jkk"
pytezosWallet = pytezos.using(key=key)


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
        encyptedString += str(circuit.encrypt(n).serialize()) + '#'
    return encyptedString


def fill_contract(contract_address, encryptedData):
    builder = pytezos.contract(contract_address)

    try:
        opg = pytezos.bulk(builder.eblUpdate(id=encryptedData).send(min_confirmations=1))
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
    global key, pytezosWallet

    try:
        contract = ContractInterface.from_file('./kayp_contract.tz')
        ci = contract.using(key=key)
    except Exception as e:
        print(e)
        return "0x"

    encryptedData = get_encrypted_data(serializedeBl)

    try:
        value = pytezosWallet.origination(script=ci.script()) \
            .send(min_confirmations=1)
        opg = pytezos.shell.blocks[value.branch:] \
            .find_operation(value.opg_hash)
    except Exception as e:
        print(e)
        return "0x"

    contract_address = opg["contents"][0]["metadata"]["operation_result"]["originated_contracts"][0]

    if not fill_contract(contract_address, encryptedData):
        return "0x"

    return contract_address


print(deploy_contract("lala"))
