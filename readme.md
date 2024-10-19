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

## Blockchain Implementation
After getting the hashed document, we deploy the smart contract using Pytezos.

This using the following stack:

- Language - [Python](https://www.python.org/)
- Framework - [Spring boot](https://spring.io/)
