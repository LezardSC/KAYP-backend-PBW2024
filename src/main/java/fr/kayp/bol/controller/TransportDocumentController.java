package fr.kayp.bol.controller;

import com.baeldung.openapi.api.V2ApiDelegate;
import com.baeldung.openapi.model.*;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class TransportDocumentController implements V2ApiDelegate {
    @GetMapping(value = "/transport-document-summaries", consumes = "application/json", produces = "application/json")
    public ResponseEntity<TransportDocumentRefStatus> getTransportDocumentSummaries(String[] carrierBookingReference,
                                                                                    String documentStatus,
                                                                                    Integer limit,
                                                                                    String sort,
                                                                                    String apiVersion) {
        return ResponseEntity.ok().body(null);
    }

    @GetMapping(value = "/transport-documents/{transportDocumentReference}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<TransportDocumentRefStatus> getTransportDocumentsReference(String transportDocumentReference,
                                                                                     String apiVersion) {
        return ResponseEntity.ok().body(null);
    }

    @PatchMapping(value = "/transport-documents/{transportDocumentReference}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<TransportDocumentRefStatus> patchTransportDocumentsReference(String transportDocumentReference,
                                                                                     String apiVersion) {
        return ResponseEntity.ok().body(null);
    }
}
