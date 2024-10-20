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
 * **Only** the &#x60;shippingInstructionsReference&#x60; is returned. 
 */

@Schema(name = "Shipping_Instructions_Response", description = "**Only** the `shippingInstructionsReference` is returned. ")
@JsonTypeName("Shipping_Instructions_Response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class ShippingInstructionsResponse {

  private String shippingInstructionsReference;

  public ShippingInstructionsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ShippingInstructionsResponse(String shippingInstructionsReference) {
    this.shippingInstructionsReference = shippingInstructionsReference;
  }

  public ShippingInstructionsResponse shippingInstructionsReference(String shippingInstructionsReference) {
    this.shippingInstructionsReference = shippingInstructionsReference;
    return this;
  }

  /**
   * The identifier for a `Shipping Instructions` provided by the carrier for system purposes. 
   * @return shippingInstructionsReference
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 100) 
  @Schema(name = "shippingInstructionsReference", example = "e0559d83-00e2-438e-afd9-fdd610c1a008", description = "The identifier for a `Shipping Instructions` provided by the carrier for system purposes. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("shippingInstructionsReference")
  public String getShippingInstructionsReference() {
    return shippingInstructionsReference;
  }

  public void setShippingInstructionsReference(String shippingInstructionsReference) {
    this.shippingInstructionsReference = shippingInstructionsReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingInstructionsResponse shippingInstructionsResponse = (ShippingInstructionsResponse) o;
    return Objects.equals(this.shippingInstructionsReference, shippingInstructionsResponse.shippingInstructionsReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingInstructionsReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingInstructionsResponse {\n");
    sb.append("    shippingInstructionsReference: ").append(toIndentedString(shippingInstructionsReference)).append("\n");
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

