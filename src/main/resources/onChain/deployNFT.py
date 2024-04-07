import argparse
import xrpl
from xrpl.clients import JsonRpcClient
from xrpl.wallet import Wallet
from xrpl.models.requests import AccountNFTs

testnet_url = "https://s.altnet.rippletest.net:51234"

def mint_token(seed, ebl):
    """mint_token"""
    minter_wallet=Wallet.from_seed(seed)
    client=JsonRpcClient(testnet_url)
    mint_tx=xrpl.models.transactions.NFTokenMint(
        account=minter_wallet.address,
        uri=xrpl.utils.str_to_hex(ebl),
        flags=int(0),
        transfer_fee=int(0),
        nftoken_taxon=int(0)
    )
    reply=""
    try:
        response=xrpl.transaction.submit_and_wait(mint_tx,client,minter_wallet)
        nftoken_id = response.result.get("meta", {}).get("nftoken_id", "")  # Récupérer la valeur de meta.nftoken_id
        reply = nftoken_id  # Renvoyer la valeur de meta.nftoken_id
    except xrpl.transaction.XRPLReliableSubmissionException as e:
        reply = "Submit failed: {e}"
    return reply

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description='Mint XRPL NFT Token')
    parser.add_argument('-s', '--seed', type=str, help='Seed for minter wallet', required=True)
    parser.add_argument('-ebl', '--ebl', type=str, help='Serialized ebl', required=True)
    args = parser.parse_args()

    result = mint_token(args.seed, args.ebl)
    print(result)
