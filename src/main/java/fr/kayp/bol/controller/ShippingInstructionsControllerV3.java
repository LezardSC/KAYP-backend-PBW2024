package fr.kayp.bol.controller;

import com.baeldung.openapi.api.V3ApiDelegate;
import com.baeldung.openapi.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import fr.kayp.bol.repository.ProofOfAuthenticityRepository;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.security.MessageDigest;

@RestController
@RequestMapping("/v3")
public class ShippingInstructionsControllerV3 implements V3ApiDelegate { 

        final ProofOfAuthenticityRepository proofOfAuthenticityRepository;

        public ShippingInstructionsControllerV3(final ProofOfAuthenticityRepository proofOfAuthenticityRepository) {
                this.proofOfAuthenticityRepository = proofOfAuthenticityRepository;
        }

        /**
         * This method is used to create a new shipping instructions document reference.
         * 
         * @param apiVersion
         * @param createShippingInstructions
         * @return ResponseEntity<Status>
         */
        @PostMapping(value = "/shipping-instructions", consumes = "application/json", produces = "application/json")
        public ResponseEntity<ShippingInstructionsResponse> postShippingInstructionsDocumentReference(
                @RequestHeader(value = "Api-Version-Major", required = false) String apiVersion,
                @RequestBody CreateShippingInstructions createShippingInstructions) throws Exception {
        
                String jsonEbl = new ObjectMapper().writeValueAsString(createShippingInstructions);
                
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(jsonEbl.getBytes());
                String stringHash = new String(messageDigest.digest());

                String nftId = proofOfAuthenticityRepository.createProofOfAuthenticity(stringHash);
                //202 Accepted
                //400 Bad Request
                //500 Server Error
                ShippingInstructionsResponse shippingInstructionsResponse = new ShippingInstructionsResponse();
                return ResponseEntity.accepted().body(shippingInstructionsResponse);
        }

        @PutMapping(value = "/shipping-instructions/{documentReference}")
        public ResponseEntity<String> putShippingInstructionsDocumentReference(
                @RequestHeader(value = "Api-Version-Major", required = false) String apiVersion,
                @RequestParam (value = "documentReference", required = true) String documentReference,
                @RequestParam(value = "updateShippingInstructions", required = true) UpdateShippingInstructions updateShippingInstructions) {
                
                //202 Accepted
                //400 Bad Request
                //404 Not Found
                //409 Conflict
                //500 Server Error
                return new ResponseEntity<>(HttpStatus.CREATED);
        }

        @GetMapping(value = "/shipping-instructions/{documentReference}")
        public ResponseEntity<String> getShippingInstructionsDocumentReference(
                @RequestHeader(value = "Api-Version-Major", required = false) String apiVersion,
                @RequestParam (value = "documentReference", required = true) String documentReference,
                @RequestParam(value = "updatedContent", required = true) String updateShippingInstructions) {

                //200 OK
                //202 Accepted
                //404 Not Found
                //409 Conflict
                //500 Server Error
                return new ResponseEntity<>(HttpStatus.CREATED);
        }

        @PatchMapping(value = "/shipping-instructions/{documentReference}")
        public ResponseEntity<String> patchShippingInstructionsDocumentReference(
                @RequestHeader(value = "Api-Version-Major", required = false) String apiVersion,
                @RequestParam (value = "documentReference", required = true) String documentReference,
                @RequestBody UpdateShippingInstructions updateShippingInstructions) {

                //202 Accepted
                //400 Bad Request
                //404 Not Found
                //409 Conflict
                //500 Server Error
                return new ResponseEntity<>(HttpStatus.CREATED);
        }

        @PostMapping(value = "shipping-instructions-notifications", consumes = "application/json", produces = "application/json")
        public ResponseEntity<String> postShippingInstructionsNotifications(
                @RequestHeader(value = "Api-Version-Major", required = false) String apiVersion,
                @RequestBody ShippingInstructionsNotification shippingInstructionsNotification) {

                //204 No Content
                //400 Bad Request
                //500 Server Error
                return new ResponseEntity<>(HttpStatus.CREATED);
        }
}