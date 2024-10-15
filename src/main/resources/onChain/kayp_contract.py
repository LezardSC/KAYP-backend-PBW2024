import smartpy as sp

# Contract
@sp.module
def main():
    class eblContract(sp.Contract):
        def __init__(self, owner_address, id):
            self.data.owner = owner_address
            self.data.id = id

        @sp.entrypoint
        def eblUpdate(self, id, status):
            assert self.data.owner == sp.sender
            self.data.id = id


# Tests
@sp.add_test(name="test_eblContract")
def test():
    scenario = sp.test_scenario()  # Create an empty test scenario

    scenario.add_module(main)  # Add the main module explicitly
    owner_address = sp.test_account("admin").address

    c1 = main.eblContract(owner_address, "first id")
    scenario += c1
    scenario.verify(c1.data.id == "first id")

    # Call the entrypoint as admin
    c1.eblUpdate(_sender=owner_address, id="second id")
    scenario.verify(c1.data.id == "second id")

    # Verify that you can't call as any other address
    alice = sp.test_account("alice").address
    c1.eblUpdate(_sender=alice, id="wrong id").run(valid=False)
