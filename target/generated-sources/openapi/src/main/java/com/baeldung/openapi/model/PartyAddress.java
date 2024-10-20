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

@Schema(name = "PartyAddress", description = "An object for storing address related information ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class PartyAddress {

  private String street;

  private String streetNumber;

  private String floor;

  private String postCode;

  private String pobox;

  private String city;

  private String unLocationCode;

  private String stateRegion;

  private String countryCode;

  public PartyAddress() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PartyAddress(String street, String city, String countryCode) {
    this.street = street;
    this.city = city;
    this.countryCode = countryCode;
  }

  public PartyAddress street(String street) {
    this.street = street;
    return this;
  }

  /**
   * The name of the street of the party’s address.
   * @return street
   */
  @NotNull @Size(max = 70) 
  @Schema(name = "street", example = "Ruijggoordweg", description = "The name of the street of the party’s address.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public PartyAddress streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

  /**
   * The number of the street of the party’s address.
   * @return streetNumber
   */
  @Size(max = 50) 
  @Schema(name = "streetNumber", example = "100", description = "The number of the street of the party’s address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("streetNumber")
  public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public PartyAddress floor(String floor) {
    this.floor = floor;
    return this;
  }

  /**
   * The floor of the party’s street number. 
   * @return floor
   */
  @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 50) 
  @Schema(name = "floor", example = "2nd", description = "The floor of the party’s street number. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("floor")
  public String getFloor() {
    return floor;
  }

  public void setFloor(String floor) {
    this.floor = floor;
  }

  public PartyAddress postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * The post code of the party’s address.
   * @return postCode
   */
  @Size(max = 10) 
  @Schema(name = "postCode", example = "1047 HM", description = "The post code of the party’s address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postCode")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public PartyAddress pobox(String pobox) {
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

  public PartyAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The city name of the party’s address. 
   * @return city
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 35) 
  @Schema(name = "city", example = "Amsterdam", description = "The city name of the party’s address. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PartyAddress unLocationCode(String unLocationCode) {
    this.unLocationCode = unLocationCode;
    return this;
  }

  /**
   * The UN Location code specifying where the carrier booking office is located. The pattern used must be - 2 characters for the country code using [ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#iso:pub:PUB500001:en) - 3 characters to code a location within that country. Letters A-Z and numbers from 2-9 can be used More info can be found here: [UN/LOCODE](https://unece.org/trade/cefact/UNLOCODE-Download) 
   * @return unLocationCode
   */
  @Pattern(regexp = "^[A-Z]{2}[A-Z2-9]{3}$") @Size(min = 5, max = 5) 
  @Schema(name = "UNLocationCode", example = "NLAMS", description = "The UN Location code specifying where the carrier booking office is located. The pattern used must be - 2 characters for the country code using [ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#iso:pub:PUB500001:en) - 3 characters to code a location within that country. Letters A-Z and numbers from 2-9 can be used More info can be found here: [UN/LOCODE](https://unece.org/trade/cefact/UNLOCODE-Download) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UNLocationCode")
  public String getUnLocationCode() {
    return unLocationCode;
  }

  public void setUnLocationCode(String unLocationCode) {
    this.unLocationCode = unLocationCode;
  }

  public PartyAddress stateRegion(String stateRegion) {
    this.stateRegion = stateRegion;
    return this;
  }

  /**
   * The state/region of the party’s address.
   * @return stateRegion
   */
  @Size(max = 65) 
  @Schema(name = "stateRegion", example = "North Holland", description = "The state/region of the party’s address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateRegion")
  public String getStateRegion() {
    return stateRegion;
  }

  public void setStateRegion(String stateRegion) {
    this.stateRegion = stateRegion;
  }

  public PartyAddress countryCode(String countryCode) {
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
    PartyAddress partyAddress = (PartyAddress) o;
    return Objects.equals(this.street, partyAddress.street) &&
        Objects.equals(this.streetNumber, partyAddress.streetNumber) &&
        Objects.equals(this.floor, partyAddress.floor) &&
        Objects.equals(this.postCode, partyAddress.postCode) &&
        Objects.equals(this.pobox, partyAddress.pobox) &&
        Objects.equals(this.city, partyAddress.city) &&
        Objects.equals(this.unLocationCode, partyAddress.unLocationCode) &&
        Objects.equals(this.stateRegion, partyAddress.stateRegion) &&
        Objects.equals(this.countryCode, partyAddress.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, streetNumber, floor, postCode, pobox, city, unLocationCode, stateRegion, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyAddress {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    pobox: ").append(toIndentedString(pobox)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    unLocationCode: ").append(toIndentedString(unLocationCode)).append("\n");
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

