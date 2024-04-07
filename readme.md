![Color_logo_with_background](https://github.com/theocerdan/kayp_ebl_api/assets/117669219/36bba7d8-8489-4d0b-9271-71cb17b976f0)

# What is KAYP ?

KAYP aims to transform the maritime industry by digitalizing document trade, starting with the bill of lading.

Our solution addresses critical industry challenges, the efficient and secure:

- Generation: Features intuitive and user-friendly input, enabling businesses to save time and minimize entry errors.
- Exchange: Utilizes a virtual service powered by blockchain to encrypt and authenticate document exchanges.
- Storage: Employs blockchain technology for auditing all documents, preserving an immutable record of documents and all user-provided data with the highest level of security

# Getting Started
Follow these steps to clone the repository and start the development server:
//
//
//

# Front-end

This using the following stack:

- Language - [TypeScript](https://www.typescriptlang.org)
- Styling - [Tailwind CSS](https://tailwindcss.com)
- Components - [Shadcn-ui](https://ui.shadcn.com)
- Schema Validations - [Zod](https://zod.dev)
- State Management - [Zustand](https://zustand-demo.pmnd.rs)
- Forms - [React Hook Form](https://ui.shadcn.com/docs/components/form)
- Linting - [ESLint](https://eslint.org)
- Formatting - [Prettier](https://prettier.io)

## Pages

| Pages                                                                       | Specifications              | Preview
|:----------------------------------------------------------------------------|:----------------------------|------------------------------------------------------------------------------------------------------
| [Login](https://localhost:5173/log-in)                                      | Login page                  | ///////////////////////////////////////////////////     |
| [Dashboard](https://localhost:5173/)              | Dashboard                   		            |													  |
| [Create eBL](https://localhost:5173/bol/create)    | Create a new eBL            			    | /////////////////////////////////////////////////////////////// |
| [List eBL](https://localhost:5173/bol/list) | List and manage all the eBL 			    | ////////////////////////////////////////////////////////////////


# Backend
User management with authentication.
To deploy the smart contract we need to get every informations needed to create the bill of Lading. 
In order to do that, we use the DCSA API (https://app.swaggerhub.com/apis/dcsaorg/DCSA_EBL/3.0.0-Beta-1) to standardize the documents.

This using the following stack:

- Language - [Python](https://www.python.org/)
- Framework - [Django](https://www.djangoproject.com/)
- Database - [SQLite](https://www.sqlite.org/)

Lien du swagger : http://localhost:8080/swagger-ui/index.html

# Blockchain Implementation
////////////////////////////
////////////////////////////
