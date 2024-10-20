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
 * An object for storing address related information 
 */

@Schema(name = "Address", description = "An object for storing address related information ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class Address {

  private String street;

  private String streetNumber;

  private String floor;

  private String postCode;

  private String pobox;

  private String city;

  private String stateRegion;

  private String countryCode;

  public Address() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Address(String street, String city, String countryCode) {
    this.street = street;
    this.city = city;
    this.countryCode = countryCode;
  }

  public Address street(String street) {
    this.street = street;
    return this;
  }

  /**
   * The name of the street.
   * @return street
   */
  @NotNull @Size(max = 70) 
  @Schema(name = "street", example = "Ruijggoordweg", description = "The name of the street.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

  /**
   * The number of the street.
   * @return streetNumber
   */
  @Size(max = 50) 
  @Schema(name = "streetNumber", example = "100", description = "The number of the street.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("streetNumber")
  public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public Address floor(String floor) {
    this.floor = floor;
    return this;
  }

  /**
   * The floor of the street number. 
   * @return floor
   */
  @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 50) 
  @Schema(name = "floor", example = "N/A", description = "The floor of the street number. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("floor")
  public String getFloor() {
    return floor;
  }

  public void setFloor(String floor) {
    this.floor = floor;
  }

  public Address postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * The post code of the address.
   * @return postCode
   */
  @Size(max = 10) 
  @Schema(name = "postCode", example = "1047 HM", description = "The post code of the address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postCode")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public Address pobox(String pobox) {
    this.pobox = pobox;
    return this;
  }

  /**
   * A numbered box at a post office where a person or business can have mail or parcels delivered.
   * @return pobox
   */
  @Size(max = 20) 
  @Schema(name = "PObox", example = "123", description = "A numbered box at a post office where a person or business can have mail or parcels delivered.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PObox")
  public String getPobox() {
    return pobox;
  }

  public void setPobox(String pobox) {
    this.pobox = pobox;
  }

  public Address city(String city) {
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

  public Address stateRegion(String stateRegion) {
    this.stateRegion = stateRegion;
    return this;
  }

  /**
   * The name of the state/region.
   * @return stateRegion
   */
  @Size(max = 65) 
  @Schema(name = "stateRegion", example = "North Holland", description = "The name of the state/region.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateRegion")
  public String getStateRegion() {
    return stateRegion;
  }

  public void setStateRegion(String stateRegion) {
    this.stateRegion = stateRegion;
  }

  public Address countryCode(String countryCode) {
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
    Address address = (Address) o;
    return Objects.equals(this.street, address.street) &&
        Objects.equals(this.streetNumber, address.streetNumber) &&
        Objects.equals(this.floor, address.floor) &&
        Objects.equals(this.postCode, address.postCode) &&
        Objects.equals(this.pobox, address.pobox) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.stateRegion, address.stateRegion) &&
        Objects.equals(this.countryCode, address.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, streetNumber, floor, postCode, pobox, city, stateRegion, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    pobox: ").append(toIndentedString(pobox)).append("\n");
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

