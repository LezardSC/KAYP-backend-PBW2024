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
 * UNLocationCode
 */

@JsonTypeName("UN_Location_Code")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class UNLocationCode implements InvoicePayableAt1, PlaceOfIssue {

  private String unLocationCode;

  private String locationName;

  public UNLocationCode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UNLocationCode(String unLocationCode) {
    this.unLocationCode = unLocationCode;
  }

  public UNLocationCode unLocationCode(String unLocationCode) {
    this.unLocationCode = unLocationCode;
    return this;
  }

  /**
   * The UN Location code specifying where the place is located. The pattern used must be  - 2 characters for the country code using [ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#iso:pub:PUB500001:en) - 3 characters to code a location within that country. Letters A-Z and numbers from 2-9 can be used  More info can be found here: [UN/LOCODE](https://unece.org/trade/cefact/UNLOCODE-Download)
   * @return unLocationCode
   */
  @NotNull @Pattern(regexp = "^[A-Z]{2}[A-Z2-9]{3}$") @Size(min = 5, max = 5) 
  @Schema(name = "UNLocationCode", example = "NLAMS", description = "The UN Location code specifying where the place is located. The pattern used must be  - 2 characters for the country code using [ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#iso:pub:PUB500001:en) - 3 characters to code a location within that country. Letters A-Z and numbers from 2-9 can be used  More info can be found here: [UN/LOCODE](https://unece.org/trade/cefact/UNLOCODE-Download)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("UNLocationCode")
  public String getUnLocationCode() {
    return unLocationCode;
  }

  public void setUnLocationCode(String unLocationCode) {
    this.unLocationCode = unLocationCode;
  }

  public UNLocationCode locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * The name of the location.
   * @return locationName
   */
  @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 100) 
  @Schema(name = "locationName", example = "Port of Amsterdam", description = "The name of the location.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationName")
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UNLocationCode unLocationCode = (UNLocationCode) o;
    return Objects.equals(this.unLocationCode, unLocationCode.unLocationCode) &&
        Objects.equals(this.locationName, unLocationCode.locationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unLocationCode, locationName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UNLocationCode {\n");
    sb.append("    unLocationCode: ").append(toIndentedString(unLocationCode)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
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

