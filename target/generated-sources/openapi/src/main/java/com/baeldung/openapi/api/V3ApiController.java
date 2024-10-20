package com.baeldung.openapi.api;

import com.baeldung.openapi.model.ApproveTransportDocumentRequest;
import com.baeldung.openapi.model.CreateShippingInstructions;
import com.baeldung.openapi.model.ErrorResponse;
import com.baeldung.openapi.model.PatchShippingInstructionsRequest;
import com.baeldung.openapi.model.ShippingInstructions;
import com.baeldung.openapi.model.ShippingInstructionsNotification;
import com.baeldung.openapi.model.ShippingInstructionsResponse;
import com.baeldung.openapi.model.TransportDocument;
import com.baeldung.openapi.model.TransportDocumentNotification;
import com.baeldung.openapi.model.UpdateShippingInstructions;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:17.142927830+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
@Controller
@RequestMapping("${openapi.dCSASpecificationForShippingInstructionsAndTransportDocument.base-path:}")
public class V3ApiController implements V3Api {

    private final V3ApiDelegate delegate;

    public V3ApiController(@Autowired(required = false) V3ApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new V3ApiDelegate() {});
    }

    @Override
    public V3ApiDelegate getDelegate() {
        return delegate;
    }

}
