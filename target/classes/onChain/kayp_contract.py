import smartpy as sp


# Contract
@sp.module
def main():
    class eblContract(sp.Contract):
        def __init__(self, owner_address, id):
            self.data.owner = owner_address
            self.data.id = id

        @sp.entrypoint
        def eblUpdate(self, id):
            assert self.data.owner == sp.sender
            self.data.id = id

    class Escrow(sp.Contract):
        def __init__(self, buyer_address, seller_address, delivery_address, selling_price):
            self.data.buyer_address = buyer_address
            self.data.seller_address = seller_address
            self.data.delivery_address = delivery_address
            self.data.selling_price = selling_price
            self.data.delivery_state = "AWAITING_PAYMENT"
            
        @sp.entrypoint
        def deposit(self):
            assert self.data.delivery_state == "AWAITING_PAYMENT"
            assert self.data.buyer_address == sp.sender, "You do not have the permission"
            assert self.data.selling_price == sp.amount, "Not the good amount"
            self.data.delivery_state = "PAYMENT_RECEIVED"

        @sp.entrypoint
        def dispatch_items(self):
            assert not self.data.delivery_state == "CANCELED", "The order is cancelled"
            assert self.data.seller_address == sp.sender, "You do not have the permission"
            self.data.delivery_state = "ITEMS_DISPATCHED"

        @sp.entrypoint
        def confirm_delivery(self):
            assert self.data.delivery_address == sp.sender, "You do not have the permission"
            self.data.delivery_state = "ITEMS_DELIVERED"
            sp.send(self.data.seller_address, sp.balance)

        @sp.entrypoint
        def reclaim_fund(self):
            assert self.data.delivery_state == "PAYMENT_RECEIVED", "Item already dispatched, you can not reclaim your found."
            assert self.data.buyer_address == sp.sender, "You do not have the permission"
            sp.send(self.data.buyer_address, sp.balance)
            self.data.delivery_state = "CANCELED"
            
            
# Tests
@sp.add_test()
def test():
    scenario = sp.test_scenario("test_scenario", main)

    owner_address = sp.test_account("admin").address
    c1 = main.eblContract(owner_address, "first id")
    scenario += c1
    scenario.verify(c1.data.id == "first id")

    # Call the entrypoint as admin
    id = "second id"
    c1.eblUpdate(id, _sender=owner_address)
    scenario.verify(c1.data.id == "second id")

    # Verify that you can't call as any other address
    alice = sp.test_account("alice").address
    wrong_id = "wrong id"
    c1.eblUpdate(wrong_id, _sender = alice, _valid = False)


@sp.add_test()
def test():
    buyer = sp.test_account('Buyer')
    seller = sp.test_account('Seller')
    deliverer = sp.test_account('Deliverer')
    scenario = sp.test_scenario("Escrow", main)
    
    scenario.h3("Test that only the buyer can deposit funds.")
    contract = main.Escrow(buyer.address, seller.address, deliverer.address, sp.tez(50))
    scenario += contract
    contract.deposit(_valid=False,_sender=seller, _amount=sp.tez(50))
    contract.deposit(_sender=buyer, _amount=sp.tez(50))
    scenario.verify(contract.balance == sp.tez(50))

    scenario.h3("Test that only the seller can dispatch delivery.")
    contract.dispatch_items(_sender=buyer, _valid=False)
    scenario.verify(contract.data.delivery_state != "ITEMS_DISPATCHED")
    contract.confirm_delivery(_sender=deliverer)
    scenario.verify(contract.data.delivery_state != "ITEMS_DISPATCHED")

    scenario.h3("Test that only the deliverer can confirm delivery.")
    contract.confirm_delivery(_sender=buyer, _valid=False)
    contract.confirm_delivery(_sender=deliverer)
    scenario.verify(contract.data.delivery_state == "ITEMS_DELIVERED")