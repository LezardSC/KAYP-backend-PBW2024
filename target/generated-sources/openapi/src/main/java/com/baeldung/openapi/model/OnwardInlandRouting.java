package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.Address;
import com.baeldung.openapi.model.Facility;
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
 * An object to capture &#x60;Onward Inland Routing&#x60; location specified as the end location of the inland movement that takes place after the container(s) being delivered to the port of discharge/place of delivery for account and risk of merchant (merchant haulage).  The location can be specified in **any** of the following ways: &#x60;UN Location Code&#x60;, &#x60;Facility&#x60; or an &#x60;Address&#x60;.  **Condition:** It is expected that if a location is specified in multiple ways (e.g. both as an &#x60;Address&#x60; and as a &#x60;Facility&#x60;) that both ways point to the same location. 
 */

@Schema(name = "OnwardInlandRouting", description = "An object to capture `Onward Inland Routing` location specified as the end location of the inland movement that takes place after the container(s) being delivered to the port of discharge/place of delivery for account and risk of merchant (merchant haulage).  The location can be specified in **any** of the following ways: `UN Location Code`, `Facility` or an `Address`.  **Condition:** It is expected that if a location is specified in multiple ways (e.g. both as an `Address` and as a `Facility`) that both ways point to the same location. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class OnwardInlandRouting {

  private String locationName;

  private Address address;

  private Facility facility;

  private String unLocationCode;

  public OnwardInlandRouting locationName(String locationName) {
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

  public OnwardInlandRouting address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public OnwardInlandRouting facility(Facility facility) {
    this.facility = facility;
    return this;
  }

  /**
   * Get facility
   * @return facility
   */
  @Valid 
  @Schema(name = "facility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("facility")
  public Facility getFacility() {
    return facility;
  }

  public void setFacility(Facility facility) {
    this.facility = facility;
  }

  public OnwardInlandRouting unLocationCode(String unLocationCode) {
    this.unLocationCode = unLocationCode;
    return this;
  }

  /**
   * The UN Location code specifying where the place is located. The pattern used must be  - 2 characters for the country code using [ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#iso:pub:PUB500001:en) - 3 characters to code a location within that country. Letters A-Z and numbers from 2-9 can be used  More info can be found here: [UN/LOCODE](https://unece.org/trade/cefact/UNLOCODE-Download) 
   * @return unLocationCode
   */
  @Pattern(regexp = "^[A-Z]{2}[A-Z2-9]{3}$") @Size(min = 5, max = 5) 
  @Schema(name = "UNLocationCode", example = "NLAMS", description = "The UN Location code specifying where the place is located. The pattern used must be  - 2 characters for the country code using [ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#iso:pub:PUB500001:en) - 3 characters to code a location within that country. Letters A-Z and numbers from 2-9 can be used  More info can be found here: [UN/LOCODE](https://unece.org/trade/cefact/UNLOCODE-Download) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UNLocationCode")
  public String getUnLocationCode() {
    return unLocationCode;
  }

  public void setUnLocationCode(String unLocationCode) {
    this.unLocationCode = unLocationCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnwardInlandRouting onwardInlandRouting = (OnwardInlandRouting) o;
    return Objects.equals(this.locationName, onwardInlandRouting.locationName) &&
        Objects.equals(this.address, onwardInlandRouting.address) &&
        Objects.equals(this.facility, onwardInlandRouting.facility) &&
        Objects.equals(this.unLocationCode, onwardInlandRouting.unLocationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationName, address, facility, unLocationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnwardInlandRouting {\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("    unLocationCode: ").append(toIndentedString(unLocationCode)).append("\n");
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

