package fr.kayp.bol.controller;

import com.baeldung.openapi.api.V2ApiDelegate;
import com.baeldung.openapi.model.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v3")
public class ShippingInstructionsControllerV3 implements V2ApiDelegate {

    @PostMapping(value = "/shipping-instructions", consumes = "application/json", produces = "application/json")
    public ResponseEntity<ShippingInstructionRefStatus> postShippingInstructionsDocumentReference(
            @RequestHeader(value = "API-Version", required = true) String apiVersion) {
    
            return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "/shipping-instructions/{documentReference}")
    public ResponseEntity<ShippingInstructionRefStatus> putShippingInstructionsDocumentReference(String documentReference,
                                                                                                    @RequestHeader(value = "Api-Version-Major", required = true) String apiVersion) {
        System.out.println("API Version: " + apiVersion);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/shipping-instructions/{documentReference}")
    public ResponseEntity<ShippingInstructionRefStatus> getShippingInstructionsDocumentReference(String documentReference,
                                                                                                 @RequestHeader(value = "Api-Version-Major", required = true) String apiVersion) {
        return ResponseEntity.ok().body(null);
    }

    @PatchMapping(value = "/shipping-instructions/{documentReference}")
    public ResponseEntity<ShippingInstructionRefStatus> patchShippingInstructionsDocumentReference(String documentReference,
                                                                                                   @RequestHeader(value = "Api-Version-Major", required = true) String apiVersion) {
        System.out.println("API Version: " + apiVersion);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping(value = "shipping-instructions-notifications", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> postShippingInstructionsNotifications(String shippingInstructionNotification,
                                                                        @RequestHeader(value = "Api-Version-Major", required = false) String apiVersion) {
        System.out.println("API Version: " + apiVersion);
        System.out.println("Received request: " + shippingInstructionNotification);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}