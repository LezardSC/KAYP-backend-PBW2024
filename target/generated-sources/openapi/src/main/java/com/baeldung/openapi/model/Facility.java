package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An object used to express a location using a &#x60;Facility&#x60;. The facility can either be expressed using a &#x60;BIC&#x60; code or a &#x60;SMDG&#x60; code. The &#x60;facilityCode&#x60; does not contain the &#x60;UNLocationCode&#x60; - this should be provided in the &#x60;UnLocationCode&#x60; attribute. 
 */

@Schema(name = "Facility", description = "An object used to express a location using a `Facility`. The facility can either be expressed using a `BIC` code or a `SMDG` code. The `facilityCode` does not contain the `UNLocationCode` - this should be provided in the `UnLocationCode` attribute. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class Facility {

  private String facilityCode;

  /**
   * The provider used for identifying the facility Code. Some facility codes are only defined in combination with an `UN Location Code` - `BIC` (Requires a UN Location Code) - `SMDG` (Requires a UN Location Code) 
   */
  public enum FacilityCodeListProviderEnum {
    BIC("BIC"),
    
    SMDG("SMDG");

    private String value;

    FacilityCodeListProviderEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FacilityCodeListProviderEnum fromValue(String value) {
      for (FacilityCodeListProviderEnum b : FacilityCodeListProviderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FacilityCodeListProviderEnum facilityCodeListProvider;

  public Facility() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Facility(String facilityCode, FacilityCodeListProviderEnum facilityCodeListProvider) {
    this.facilityCode = facilityCode;
    this.facilityCodeListProvider = facilityCodeListProvider;
  }

  public Facility facilityCode(String facilityCode) {
    this.facilityCode = facilityCode;
    return this;
  }

  /**
   * The code used for identifying the specific facility. This code does not include the UN Location Code. The definition of the code depends on the `facilityCodeListProvider`. As code list providers maintain multiple codeLists the following codeList is used: - `SMDG` (the codeList used is the [SMDG Terminal Code List](https://smdg.org/documents/smdg-code-lists/)) - `BIC` (the codeList used is the [BIC Facility Codes](https://www.bic-code.org/facility-codes/))
   * @return facilityCode
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 6) 
  @Schema(name = "facilityCode", example = "ADT", description = "The code used for identifying the specific facility. This code does not include the UN Location Code. The definition of the code depends on the `facilityCodeListProvider`. As code list providers maintain multiple codeLists the following codeList is used: - `SMDG` (the codeList used is the [SMDG Terminal Code List](https://smdg.org/documents/smdg-code-lists/)) - `BIC` (the codeList used is the [BIC Facility Codes](https://www.bic-code.org/facility-codes/))", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("facilityCode")
  public String getFacilityCode() {
    return facilityCode;
  }

  public void setFacilityCode(String facilityCode) {
    this.facilityCode = facilityCode;
  }

  public Facility facilityCodeListProvider(FacilityCodeListProviderEnum facilityCodeListProvider) {
    this.facilityCodeListProvider = facilityCodeListProvider;
    return this;
  }

  /**
   * The provider used for identifying the facility Code. Some facility codes are only defined in combination with an `UN Location Code` - `BIC` (Requires a UN Location Code) - `SMDG` (Requires a UN Location Code) 
   * @return facilityCodeListProvider
   */
  @NotNull 
  @Schema(name = "facilityCodeListProvider", example = "SMDG", description = "The provider used for identifying the facility Code. Some facility codes are only defined in combination with an `UN Location Code` - `BIC` (Requires a UN Location Code) - `SMDG` (Requires a UN Location Code) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("facilityCodeListProvider")
  public FacilityCodeListProviderEnum getFacilityCodeListProvider() {
    return facilityCodeListProvider;
  }

  public void setFacilityCodeListProvider(FacilityCodeListProviderEnum facilityCodeListProvider) {
    this.facilityCodeListProvider = facilityCodeListProvider;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Facility facility = (Facility) o;
    return Objects.equals(this.facilityCode, facility.facilityCode) &&
        Objects.equals(this.facilityCodeListProvider, facility.facilityCodeListProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facilityCode, facilityCodeListProvider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Facility {\n");
    sb.append("    facilityCode: ").append(toIndentedString(facilityCode)).append("\n");
    sb.append("    facilityCodeListProvider: ").append(toIndentedString(facilityCodeListProvider)).append("\n");
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

