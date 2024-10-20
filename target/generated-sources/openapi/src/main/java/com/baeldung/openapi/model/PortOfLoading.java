package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.City;
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
 * An object to capture &#x60;Port of Loading&#x60; location specified as: the location where the cargo is loaded onto a first sea-going vessel for water transportation.  The location can be specified in **any** of the following ways: &#x60;UN Location Code&#x60; or &#x60;City and Country&#x60;.  **Condition:** It is expected that if a location is specified in multiple ways (e.g. both as an &#x60;UN Location Code&#x60; and as a &#x60;City and Country&#x60;) that both ways point to the same location. 
 */

@Schema(name = "PortOfLoading", description = "An object to capture `Port of Loading` location specified as: the location where the cargo is loaded onto a first sea-going vessel for water transportation.  The location can be specified in **any** of the following ways: `UN Location Code` or `City and Country`.  **Condition:** It is expected that if a location is specified in multiple ways (e.g. both as an `UN Location Code` and as a `City and Country`) that both ways point to the same location. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class PortOfLoading {

  private String locationName;

  private City city;

  private String unLocationCode;

  public PortOfLoading locationName(String locationName) {
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

  public PortOfLoading city(City city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */
  @Valid 
  @Schema(name = "city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public PortOfLoading unLocationCode(String unLocationCode) {
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
    PortOfLoading portOfLoading = (PortOfLoading) o;
    return Objects.equals(this.locationName, portOfLoading.locationName) &&
        Objects.equals(this.city, portOfLoading.city) &&
        Objects.equals(this.unLocationCode, portOfLoading.unLocationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationName, city, unLocationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortOfLoading {\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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

