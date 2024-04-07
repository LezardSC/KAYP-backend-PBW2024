![Color_logo_with_background](https://github.com/theocerdan/kayp_ebl_api/assets/117669219/36bba7d8-8489-4d0b-9271-71cb17b976f0)

# What is KAYP ?

KAYP aims to transform the maritime industry by digitalizing document trade, starting with the bill of lading.

Our solution addresses critical industry challenges, the efficient and secure:

- Generation: Features intuitive and user-friendly input, enabling businesses to save time and minimize entry errors.
- Exchange: Utilizes a virtual service powered by blockchain to encrypt and authenticate document exchanges.
- Storage: Employs blockchain technology for auditing all documents, preserving an immutable record of documents and all user-provided data with the highest level of security

# Getting Started

Follow these steps to clone the repository and start the development server:

- `cd backend`
- `mvn clean install`
- `java -jar target/bol-0.0.1-SNAPSHOT.jar`
- git clone the [frontend repository](https://github.com/theocerdan/frontend_kayp/) and follow the instructions

# Backend
User management with authentication.
To deploy the NFT we need to get every informations needed to create the bill of Lading. 
In order to do that, we use the DCSA API (https://app.swaggerhub.com/apis/dcsaorg/DCSA_EBL/3.0.0-Beta-1) to standardize the documents. Then we serialize it and hash it.

## Blockchain Implementation
After getting the hashed document, we mint a NFT and store the hash in its metadata.

This using the following stack:

- Language - [Python](https://www.python.org/)
- Framework - [Spring boot](https://spring.io/)

Swagger link : http://localhost:8080/swagger-ui/index.html
