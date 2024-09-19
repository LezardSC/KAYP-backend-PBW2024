package fr.kayp.bol.controller;

import com.baeldung.openapi.api.V2ApiDelegate;
import com.baeldung.openapi.model.*;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v3")
public class TransportDocumentControllerV3 implements V2ApiDelegate {

    @GetMapping(value = "/transport-documents/{transportDocumentReference}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<TransportDocumentRefStatus> getTransportDocumentReference(String transportDocumentReference,
                                                                                    String apiVersion) {
        return ResponseEntity.ok().body(null);
    }

    @PatchMapping(value = "/transport-documents/{transportDocumentReference}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<TransportDocumentRefStatus> patchTransportDocumentReference(String transportDocumentReference,
                                                                                      String apiVersion) {
        System.out.println("API Version: " + apiVersion);
        return ResponseEntity.ok().body(null);
    }


    @PostMapping(value = "/transport-document-notifications", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> postTransportDocumentNotifications(String transportDocumentNotification,
                                                                                            String apiVersion) {
        System.out.println("API Version: " + apiVersion);
        return ResponseEntity.ok().body(null);
    }
}

