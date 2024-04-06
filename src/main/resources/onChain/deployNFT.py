import xrpl
from xrpl.clients import JsonRpcClient
from xrpl.wallet import Wallet
from xrpl.models.requests import AccountNFTs

def mint_token(network, seed, flags, transfer_fee, taxon, serialized):
    """mint_token"""
    testnet_url = network
    minter_wallet=Wallet.from_seed(seed)
    client=JsonRpcClient(testnet_url)
    mint_tx=xrpl.models.transactions.NFTokenMint(
        account=minter_wallet.address,
        flags=int(flags),
        transfer_fee=int(transfer_fee),
        nftoken_taxon=int(taxon)
    )
    reply=""
    try:
        response=xrpl.transaction.submit_and_wait(mint_tx,client,minter_wallet)
        reply=response.result
        ctid = response.result["ctid"]
    except xrpl.transaction.XRPLReliableSubmissionException as e:
        reply=f"Submit failed: {e}"
    return str(ctid)
