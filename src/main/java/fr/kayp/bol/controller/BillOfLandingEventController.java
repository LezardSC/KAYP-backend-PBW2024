package fr.kayp.bol.controller;

import com.baeldung.openapi.api.V2ApiDelegate;
import com.baeldung.openapi.model.*;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/v2")
public class BillOfLandingEventController implements V2ApiDelegate {
    @GetMapping(value = "/events", consumes = "application/json", produces = "application/json")
    public ResponseEntity<TransportDocumentRefStatus> getEvents(String[] shipmentEventTypeCode,
                                                                String[] documentTypeCode,
                                                                String documentReference,
                                                                String equipmentReference,
                                                                OffsetDateTime eventCreatedDateTime,
                                                                OffsetDateTime eventDateTime,
                                                                Integer limit,
                                                                String sort,
                                                                String apiVersion) {
        return ResponseEntity.ok().body(null);
    }
}
