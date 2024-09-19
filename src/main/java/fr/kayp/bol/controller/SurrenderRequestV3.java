package fr.kayp.bol.controller;

import com.baeldung.openapi.api.V2ApiDelegate;
import com.baeldung.openapi.model.*;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v3")
public class SurrenderRequestV3 implements V2ApiDelegate {

   @PostMapping(value = "/ebl-surrender-requests", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> v2EblSurrenderRequestsPost(String eblSurrenderRequest,
                                                                             @RequestHeader(value = "API-Version", required = false) String apiVersion) {
         System.out.println("API Version: " + apiVersion);
         System.out.println("Received request: " + eblSurrenderRequest);
         return ResponseEntity.ok().body(eblSurrenderRequest);
    }

    @PostMapping(value = "/ebl-surrender-responses", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> v2EblSurrenderResponsesPost(String eblSurrenderResponse,
                                                                             @RequestHeader(value = "API-Version", required = false) String apiVersion) {
         System.out.println("API Version: " + apiVersion);
         System.out.println("Received request: " + eblSurrenderResponse);
         return ResponseEntity.ok().body(eblSurrenderResponse);
    }
}
