package fr.kayp.bol.controller;

import com.baeldung.openapi.api.V3ApiDelegate;
import com.baeldung.openapi.model.*;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v3")
public class TransportDocumentControllerV3 implements V3ApiDelegate {

    @GetMapping(value = "/transport-documents/{transportDocumentReference}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> getTransportDocumentReference(
            @RequestHeader(value = "Api-Version-Major", required = false) String apiVersion,
            @RequestParam (value = "transportDocumentReference", required = true) String transportDocumentReference) {

            //200 OK
            //202 Accepted
            //404 Not Found
            //500 Server Error
            return ResponseEntity.ok().body(null);
    }

    @PatchMapping(value = "/transport-documents/{transportDocumentReference}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> patchTransportDocumentReference(
            @RequestHeader(value = "Api-Version-Major", required = false) String apiVersion,
            @RequestParam (value = "transportDocumentReference", required = true) String transportDocumentReference,
            @RequestBody String transportDocumentStatus) {

            //202 Accepted
            //400 Bad Request
            //404 Not Found
            //409 Conflict
            //500 Server Error
            return ResponseEntity.ok().body(null);
    }


    @PostMapping(value = "/transport-document-notifications", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> postTransportDocumentNotifications(
            @RequestHeader(value = "Api-Version-Major", required = false) String apiVersion,
            @RequestBody TransportDocumentNotification transportDocumentNotification) {

            //204 No Content
            //400 Bad Request
            //500 Server Error
            return ResponseEntity.ok().body(null);
    }
}

