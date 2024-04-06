package fr.kayp.bol.controllers;


import com.baeldung.openapi.api.V2ApiDelegate;
import com.baeldung.openapi.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exemple")
public class ExempleController implements V2ApiDelegate {

    @PostMapping("/shipping")
    public ResponseEntity<ShippingInstructionRefStatus> v2ShippingInstructionsPost(ShippingInstructionRequest shippingInstructionRequest,
                                                                                    String apIVersion) {
        System.out.println("hello");
        return new ResponseEntity<>(HttpStatus.ACCEPTED);

    }
}
