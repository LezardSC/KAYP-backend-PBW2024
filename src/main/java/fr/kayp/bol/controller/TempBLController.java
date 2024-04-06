package fr.kayp.bol.controller;

import fr.kayp.bol.repository.ProofOfAuthenticityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.security.MessageDigest;

@RestController
@RequestMapping("/v2")
public class TempBLController {
    final ProofOfAuthenticityRepository proofOfAuthenticityRepository;

    public class TemplateBl implements Serializable {
        public String seller = "Renault";
        public String buyer = "Louis Vuitton";
        public Integer amount = 10;
        public Integer price = 2600;
        public OffsetDateTime dateOfBl = OffsetDateTime.now();
    }

    public TempBLController(final ProofOfAuthenticityRepository proofOfAuthenticityRepository) {
        this.proofOfAuthenticityRepository = proofOfAuthenticityRepository;
    }

    @PostMapping(value = "/createTempBL")
    public ResponseEntity<String> createTempBLControllerPost(@RequestBody TemplateBl bill) throws Exception {
        String ebl = String.valueOf(new TemplateBl());

        proofOfAuthenticityRepository.createProofOfAuthenticity(ebl);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}