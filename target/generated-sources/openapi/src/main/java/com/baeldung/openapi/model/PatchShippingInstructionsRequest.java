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
 * PatchShippingInstructionsRequest
 */

@JsonTypeName("patch_shipping_instructions_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class PatchShippingInstructionsRequest {

  private String updatedShippingInstructionsStatus;

  public PatchShippingInstructionsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PatchShippingInstructionsRequest(String updatedShippingInstructionsStatus) {
    this.updatedShippingInstructionsStatus = updatedShippingInstructionsStatus;
  }

  public PatchShippingInstructionsRequest updatedShippingInstructionsStatus(String updatedShippingInstructionsStatus) {
    this.updatedShippingInstructionsStatus = updatedShippingInstructionsStatus;
    return this;
  }

  /**
   * The status of the `Updated Shipping Instructions`. It can only be `UPDATE_CANCELLED` 
   * @return updatedShippingInstructionsStatus
   */
  @NotNull @Size(max = 50) 
  @Schema(name = "updatedShippingInstructionsStatus", example = "UPDATE_CANCELLED", description = "The status of the `Updated Shipping Instructions`. It can only be `UPDATE_CANCELLED` ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updatedShippingInstructionsStatus")
  public String getUpdatedShippingInstructionsStatus() {
    return updatedShippingInstructionsStatus;
  }

  public void setUpdatedShippingInstructionsStatus(String updatedShippingInstructionsStatus) {
    this.updatedShippingInstructionsStatus = updatedShippingInstructionsStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchShippingInstructionsRequest patchShippingInstructionsRequest = (PatchShippingInstructionsRequest) o;
    return Objects.equals(this.updatedShippingInstructionsStatus, patchShippingInstructionsRequest.updatedShippingInstructionsStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedShippingInstructionsStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchShippingInstructionsRequest {\n");
    sb.append("    updatedShippingInstructionsStatus: ").append(toIndentedString(updatedShippingInstructionsStatus)).append("\n");
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

