package fr.kayp.bol.controller;

import com.baeldung.openapi.api.V2ApiDelegate;
import com.baeldung.openapi.model.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v3")
public class IssuanceRequestV3 implements V2ApiDelegate {

    @PostMapping(value = "ebl-issuance-responses", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> postEblIssuanceResponses(String eblIssuanceResponse,
                                                                       @RequestHeader(value = "API-Version", required = false) String apiVersion) {
        System.out.println("API Version: " + apiVersion);
        System.out.println("Received request: " + eblIssuanceResponse);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "ebl-issuance-requests")
    public ResponseEntity<String> putEblIssuanceRequests(String eblIssuanceRequest,
                                                                    @RequestHeader(value = "API-Version", required = false) String apiVersion) {
        System.out.println("API Version: " + apiVersion);
        System.out.println("Received request: " + eblIssuanceRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}