package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApproveTransportDocumentRequest
 */

@JsonTypeName("approve_transport_document_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class ApproveTransportDocumentRequest {

  private String transportDocumentStatus;

  public ApproveTransportDocumentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApproveTransportDocumentRequest(String transportDocumentStatus) {
    this.transportDocumentStatus = transportDocumentStatus;
  }

  public ApproveTransportDocumentRequest transportDocumentStatus(String transportDocumentStatus) {
    this.transportDocumentStatus = transportDocumentStatus;
    return this;
  }

  /**
   * The status of the `Transport Document`. It can only be `APPROVED` 
   * @return transportDocumentStatus
   */
  @NotNull @Size(max = 50) 
  @Schema(name = "transportDocumentStatus", example = "APPROVED", description = "The status of the `Transport Document`. It can only be `APPROVED` ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transportDocumentStatus")
  public String getTransportDocumentStatus() {
    return transportDocumentStatus;
  }

  public void setTransportDocumentStatus(String transportDocumentStatus) {
    this.transportDocumentStatus = transportDocumentStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApproveTransportDocumentRequest approveTransportDocumentRequest = (ApproveTransportDocumentRequest) o;
    return Objects.equals(this.transportDocumentStatus, approveTransportDocumentRequest.transportDocumentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transportDocumentStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApproveTransportDocumentRequest {\n");
    sb.append("    transportDocumentStatus: ").append(toIndentedString(transportDocumentStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

