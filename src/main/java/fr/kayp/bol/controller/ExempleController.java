package fr.kayp.bol.controller;


import com.baeldung.openapi.api.V2ApiDelegate;
import com.baeldung.openapi.model.*;
import fr.kayp.bol.repository.ProofOfAuthenticityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exemple")
public class ExempleController implements V2ApiDelegate {

    final ProofOfAuthenticityRepository proofOfAuthenticityRepository;

    public ExempleController(final ProofOfAuthenticityRepository proofOfAuthenticityRepository) {
        this.proofOfAuthenticityRepository = proofOfAuthenticityRepository;
    }

    @PostMapping("/shipping")
    public ResponseEntity<ShippingInstructionRefStatus> v2ShippingInstructionsPost(ShippingInstructionRequest shippingInstructionRequest,
                                                                                    String apIVersion) {
        System.out.println("hello");
        return new ResponseEntity<>(HttpStatus.ACCEPTED);

    }

    @PostMapping("/test")
    public ResponseEntity<ShippingInstructionRefStatus> test() throws Exception {
        String nftId = proofOfAuthenticityRepository.createProofOfAuthenticity("hello");
        System.out.println("nftId: " + nftId);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
