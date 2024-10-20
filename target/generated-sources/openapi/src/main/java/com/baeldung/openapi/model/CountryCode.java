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
 * CountryCode
 */

@JsonTypeName("Country_Code")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class CountryCode implements PlaceOfIssue {

  private String countryCode;

  private String locationName;

  public CountryCode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public CountryCode countryCode(String countryCode) {
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

  public CountryCode locationName(String locationName) {
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
    CountryCode countryCode = (CountryCode) o;
    return Objects.equals(this.countryCode, countryCode.countryCode) &&
        Objects.equals(this.locationName, countryCode.locationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, locationName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryCode {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

