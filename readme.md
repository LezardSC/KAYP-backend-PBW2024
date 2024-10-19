![Color_logo_with_background](https://github.com/theocerdan/kayp_ebl_api/assets/117669219/36bba7d8-8489-4d0b-9271-71cb17b976f0)

# What is KAYP ?

KAYP aims to transform the maritime industry by digitalizing document trade, starting with the bill of lading.

Our solution addresses critical industry challenges, the efficient and secure:

- Generation: Features intuitive and user-friendly input, enabling businesses to save time and minimize entry errors.
- Exchange: Utilizes a virtual service powered by blockchain to encrypt and authenticate document exchanges.
- Storage: Employs blockchain technology for auditing all documents, preserving an immutable record of documents and all user-provided data with the highest level of security

# Getting Started

Follow these steps to clone the repository and start the development server:

- `git clone https://github.com/theocerdan/kayp_ebl_api.git`
- `cd kayp_ebl_api`
- `python3 -m venv venv`
- `source venv/bin/activate`
- `pip install -r requirements.txt`
- `mvn install`
- `java -jar target/bol-0.0.1-SNAPSHOT.jar`

When the server is started go on this link : http://localhost:8080/swagger-ui/index.html
If you want to try the deployment of the contract:
- Click on "POST /v3/shipping-instructions" then "Try it out".
- Go on this link : https://pastebin.com/qWGNWZW0 copy the content and paste it in the "request body" field.
- Click on "Execute" and you will see the response with the contract address in the servers log.

# Backend

The backend implements APIs route that deploy a contract on the blockchain. We serialize the eBl, encrypt and hash it to store it.
For the APIs we use the DCSA standard (https://app.swaggerhub.com/apis/dcsaorg/DCSA_EBL/3.0.0-Beta-1). 

- Language - [Python](https://www.python.org/)
- Framework - [Spring boot](https://spring.io/)
  
# Smart Contract
This repository includes two key smart contracts: the EBL Contract and the Escrow Contract. Each contract is explained below, including its purpose, setup, and usage.

**1. EBL Contract**

The EBL Contract stores a cryptographically secured version of an electronic Bill of Lading (eBL) on the blockchain. This ensures that the information is authenticated and tamper-proof. The contract certifies the eBL, making sure that only the authorized owner can update or modify it.

**Contract Initialization**

Owner Address: The address that has exclusive permission to manage the contract (e.g., a shipping authority).
ID: The crypted version of the eBL to be stored.
Entrypoints
eblUpdate(id): Allows the owner to update the crypted eBL. Only the authorized owner can call this function to ensure security.
Example Scenario
Setup: Initialize with the owner address and a crypted eBL ID.
Update: The owner can update the crypted eBL when necessary.
Access Control: Unauthorized users cannot modify the eBL.

**2. Escrow Contract**

The Escrow Contract enables secure transactions between buyers, sellers, and delivery agents. It ensures that funds are only released when all parties have fulfilled their commitments.

**Contract Initialization**

Buyer Address: The purchaser's address.
Seller Address: The vendor's address.
Delivery Address: The address responsible for confirming receipt.
Selling Price: The agreed transaction amount.
Entrypoints
deposit: Allows the buyer to deposit funds, initiating the transaction.
dispatch_items: The seller confirms dispatching items.
confirm_delivery: The delivery agent confirms receipt, releasing funds to the seller.
reclaim_fund: Allows the buyer to reclaim their funds if the items are not dispatched.

** Example Scenario

Buyer Deposits Funds: The buyer sends the agreed amount, and the state changes to PAYMENT_RECEIVED.
Seller Dispatches Items: The seller marks the items as dispatched.
Delivery Confirmation: Upon confirmation, the contract releases the payment to the seller.
Reclaim Funds: If the items are not dispatched, the buyer can reclaim the funds.



