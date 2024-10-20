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
 * An object for storing city, state/region and country related information 
 */

@Schema(name = "City", description = "An object for storing city, state/region and country related information ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class City {

  private String city;

  private String stateRegion;

  private String countryCode;

  public City() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public City(String city, String countryCode) {
    this.city = city;
    this.countryCode = countryCode;
  }

  public City city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The name of the city. 
   * @return city
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 35) 
  @Schema(name = "city", example = "Amsterdam", description = "The name of the city. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public City stateRegion(String stateRegion) {
    this.stateRegion = stateRegion;
    return this;
  }

  /**
   * The name of the state/region. 
   * @return stateRegion
   */
  @Size(max = 65) 
  @Schema(name = "stateRegion", example = "North Holland", description = "The name of the state/region. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateRegion")
  public String getStateRegion() {
    return stateRegion;
  }

  public void setStateRegion(String stateRegion) {
    this.stateRegion = stateRegion;
  }

  public City countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The 2 characters for the country code using [ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#iso:pub:PUB500001:en) 
   * @return countryCode
   */
  @NotNull @Pattern(regexp = "^[A-Z]{2}$") @Size(min = 2, max = 2) 
  @Schema(name = "countryCode", example = "NL", description = "The 2 characters for the country code using [ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#iso:pub:PUB500001:en) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    City city = (City) o;
    return Objects.equals(this.city, city.city) &&
        Objects.equals(this.stateRegion, city.stateRegion) &&
        Objects.equals(this.countryCode, city.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, stateRegion, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class City {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateRegion: ").append(toIndentedString(stateRegion)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

