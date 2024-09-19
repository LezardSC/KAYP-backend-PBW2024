package fr.kayp.bol.controller;

import com.baeldung.openapi.api.V2ApiDelegate;
import com.baeldung.openapi.model.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v3")
public class EnvelopesControllerV3 implements V2ApiDelegate {

    @PostMapping(value = "/envelopes", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> v2EnvelopesPost(String envelope,
                                                    @RequestHeader(value = "API-Version", required = false) String apiVersion) {
        System.out.println("API Version: " + apiVersion);
        System.out.println("Received request: " + envelope);
        return ResponseEntity.ok().body(envelope);
    }

    @PutMapping(value = "/envelopes/{envelopeReference}/additional-documents/{documentChecksum}")
    public ResponseEntity<String> v2EnvelopesEnvelopeReferenceAdditionalDocumentsDocumentChecksumPut(String envelopeReference,
                                                                                                        String documentChecksum,
                                                                                                        @RequestHeader(value = "API-Version", required = false) String apiVersion) {
        return ResponseEntity.ok().body(null);
    }

    @PutMapping(value = "/envelopes/{envelopeReference}/finish-transfer")
    public ResponseEntity<String> v2EnvelopesEnvelopeReferenceFinishTransferPut(String envelopeReference,
                                                                                  @RequestHeader(value = "API-Version", required = false) String apiVersion) {
        return ResponseEntity.ok().body(null);
    }

    @GetMapping(value = "/.well-known/jwks.json")
    public ResponseEntity<String> getWellKnownJwksJson() {
        return ResponseEntity.ok().body(null);
    }
}