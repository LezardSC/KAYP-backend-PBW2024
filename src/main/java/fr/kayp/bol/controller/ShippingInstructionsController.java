package fr.kayp.bol.controller;

import com.baeldung.openapi.api.V2ApiDelegate;
import com.baeldung.openapi.model.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class ShippingInstructionsController implements V2ApiDelegate {

    @PostMapping(value = "/shipping-instructions", consumes = "application/json", produces = "application/json")
    public ResponseEntity<ShippingInstructionRefStatus> v2ShippingInstructionsPost(ShippingInstructionRequest shippingInstructionRequest,
                                                                                    @RequestHeader(value = "API-Version", required = false) String apiVersion) {
        System.out.println("API Version: " + apiVersion);
        System.out.println("Received request: " + shippingInstructionRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping(value = "/shipping-instructions-summaries", consumes = "application/json", produces = "application/json")
    public ResponseEntity<ShippingInstructionRefStatus> getShippingInstructionsSummaries(String[] carrierBookingReference,
                                                                                        String documentStatus,
                                                                                        Integer limit,
                                                                                        String sort,
                                                                                        String apiVersion) {
        /*
        documentStatus can only accept:
            RECE (Received)
            PENU (Pending Update)
            DRFT (Draft)
            PENA (Pending Approval)
            APPR (Approved)
            ISSU (Issued)
            SURR (Surrendered)
            VOID (Void)

        limit default value is '100'

         */
        return ResponseEntity.ok().body(null);
    }

    @GetMapping(value = "/shipping-instructions/{shippingInstructionReference}")
    public ResponseEntity<ShippingInstructionRefStatus> getShippingInstructionReference(String shippingInstructionReference,
                                                                                        String apiVersion) {
        return ResponseEntity.ok().body(null);
    }

    @PutMapping(value = "/shipping-instructions/{shippingInstructionReference}")
    public ResponseEntity<ShippingInstructionRefStatus> ShippingInstructionReferencePut(String shippingInstructionReference,
                                                                                        String apiVersion) {
        return ResponseEntity.ok().body(null);
    }
}
