package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.Address;
import com.baeldung.openapi.model.Facility;
import com.baeldung.openapi.model.GeoCoordinate;
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
 * An object to capture &#x60;Place of Receipt&#x60; location specified as: the location where the cargo is handed over by the shipper, or his agent, to the shipping line. This indicates the point at which the shipping line takes on responsibility for carriage of the container.  **Condition:** Only when pre-carriage is done by the carrier.  The location can be specified in **any** of the following ways: &#x60;UN Location Code&#x60;, &#x60;Facility&#x60; or an &#x60;Address&#x60;.  **Condition:** It is expected that if a location is specified in multiple ways (e.g. both as an &#x60;Address&#x60; and as a &#x60;Facility&#x60;) that both ways point to the same location. 
 */

@Schema(name = "PlaceOfReceipt", description = "An object to capture `Place of Receipt` location specified as: the location where the cargo is handed over by the shipper, or his agent, to the shipping line. This indicates the point at which the shipping line takes on responsibility for carriage of the container.  **Condition:** Only when pre-carriage is done by the carrier.  The location can be specified in **any** of the following ways: `UN Location Code`, `Facility` or an `Address`.  **Condition:** It is expected that if a location is specified in multiple ways (e.g. both as an `Address` and as a `Facility`) that both ways point to the same location. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class PlaceOfReceipt {

  private String locationName;

  private Address address;

  private Facility facility;

  private String unLocationCode;

  private GeoCoordinate geoCoordinate;

  public PlaceOfReceipt locationName(String locationName) {
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

  public PlaceOfReceipt address(Address address) {
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

  public PlaceOfReceipt facility(Facility facility) {
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

  public PlaceOfReceipt unLocationCode(String unLocationCode) {
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

  public PlaceOfReceipt geoCoordinate(GeoCoordinate geoCoordinate) {
    this.geoCoordinate = geoCoordinate;
    return this;
  }

  /**
   * Get geoCoordinate
   * @return geoCoordinate
   */
  @Valid 
  @Schema(name = "geoCoordinate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geoCoordinate")
  public GeoCoordinate getGeoCoordinate() {
    return geoCoordinate;
  }

  public void setGeoCoordinate(GeoCoordinate geoCoordinate) {
    this.geoCoordinate = geoCoordinate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceOfReceipt placeOfReceipt = (PlaceOfReceipt) o;
    return Objects.equals(this.locationName, placeOfReceipt.locationName) &&
        Objects.equals(this.address, placeOfReceipt.address) &&
        Objects.equals(this.facility, placeOfReceipt.facility) &&
        Objects.equals(this.unLocationCode, placeOfReceipt.unLocationCode) &&
        Objects.equals(this.geoCoordinate, placeOfReceipt.geoCoordinate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationName, address, facility, unLocationCode, geoCoordinate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceOfReceipt {\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("    unLocationCode: ").append(toIndentedString(unLocationCode)).append("\n");
    sb.append("    geoCoordinate: ").append(toIndentedString(geoCoordinate)).append("\n");
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

