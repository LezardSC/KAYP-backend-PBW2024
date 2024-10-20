package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * References provided by the shipper or freight forwarder at the time of &#x60;Booking&#x60; or at the time of providing &#x60;Shipping Instructions&#x60;. Carriers share it back when providing &#x60;Track &amp; Trace&#x60; event updates, some are also printed on the B/L. Customers can use these references to track shipments in their internal systems. 
 */

@Schema(name = "Reference", description = "References provided by the shipper or freight forwarder at the time of `Booking` or at the time of providing `Shipping Instructions`. Carriers share it back when providing `Track & Trace` event updates, some are also printed on the B/L. Customers can use these references to track shipments in their internal systems. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class Reference {

  private String type;

  private String value;

  public Reference() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Reference(String type, String value) {
    this.type = type;
    this.value = value;
  }

  public Reference type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The reference type codes defined by DCSA. Possible values are: - `CR` (Customer’s Reference) - `AKG` (Vehicle Identification Number) 
   * @return type
   */
  @NotNull @Size(max = 3) 
  @Schema(name = "type", example = "CR", description = "The reference type codes defined by DCSA. Possible values are: - `CR` (Customer’s Reference) - `AKG` (Vehicle Identification Number) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Reference value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the reference.  
   * @return value
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 35) 
  @Schema(name = "value", example = "HHL00103004", description = "The value of the reference.  ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reference reference = (Reference) o;
    return Objects.equals(this.type, reference.type) &&
        Objects.equals(this.value, reference.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

