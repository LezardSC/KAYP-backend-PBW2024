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
 * An Advance Manifest Filing defined by a Manifest type code in combination with a country code.  A small list of **potential** examples:  | manifestTypeCode | countryCode | Description | |-----------------------|:-------------:|-------------| |ACI|EG|Advance Cargo Information in Egypt| |ACE|US|Automated Commercial Environment in the United States| |AFR|JP|Cargo Summary Notification (CSN)| |ENS|NL|Entry Summary Declaration| 
 */

@Schema(name = "AdvanceManifestFiling", description = "An Advance Manifest Filing defined by a Manifest type code in combination with a country code.  A small list of **potential** examples:  | manifestTypeCode | countryCode | Description | |-----------------------|:-------------:|-------------| |ACI|EG|Advance Cargo Information in Egypt| |ACE|US|Automated Commercial Environment in the United States| |AFR|JP|Cargo Summary Notification (CSN)| |ENS|NL|Entry Summary Declaration| ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class AdvanceManifestFiling {

  private String manifestTypeCode;

  private String countryCode;

  /**
   * Indicates whether the shipper (`SELF`) will perform the advance manifest filing(s) for the House BL directly or if the carrier (`CARRIER`) should file them on their behalf. Allowed values are:  - `SELF` (filing done by the House filer) - `CARRIER` (the carrier does the filing)  In case of self-filing (`SELF`), the shipper can provide their `selfFilerCode` for each manifest.  **Condition:** The `selfFilerCode` must be provided when `manifestTypeCode` is either `ACE` (US) or `ACI` (CA) and the `advanceManifestFilingsHouseBLPerformedBy` is set to `SELF`. 
   */
  public enum AdvanceManifestFilingsHouseBLPerformedByEnum {
    SELF("SELF"),
    
    CARRIER("CARRIER");

    private String value;

    AdvanceManifestFilingsHouseBLPerformedByEnum(String value) {
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
    public static AdvanceManifestFilingsHouseBLPerformedByEnum fromValue(String value) {
      for (AdvanceManifestFilingsHouseBLPerformedByEnum b : AdvanceManifestFilingsHouseBLPerformedByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AdvanceManifestFilingsHouseBLPerformedByEnum advanceManifestFilingsHouseBLPerformedBy;

  private String selfFilerCode;

  private String supplementaryDeclarantEORINumber;

  public AdvanceManifestFiling() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdvanceManifestFiling(String manifestTypeCode, String countryCode, AdvanceManifestFilingsHouseBLPerformedByEnum advanceManifestFilingsHouseBLPerformedBy) {
    this.manifestTypeCode = manifestTypeCode;
    this.countryCode = countryCode;
    this.advanceManifestFilingsHouseBLPerformedBy = advanceManifestFilingsHouseBLPerformedBy;
  }

  public AdvanceManifestFiling manifestTypeCode(String manifestTypeCode) {
    this.manifestTypeCode = manifestTypeCode;
    return this;
  }

  /**
   * The Manifest type code as defined by the provider. 
   * @return manifestTypeCode
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 50) 
  @Schema(name = "manifestTypeCode", example = "ENS", description = "The Manifest type code as defined by the provider. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("manifestTypeCode")
  public String getManifestTypeCode() {
    return manifestTypeCode;
  }

  public void setManifestTypeCode(String manifestTypeCode) {
    this.manifestTypeCode = manifestTypeCode;
  }

  public AdvanceManifestFiling countryCode(String countryCode) {
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

  public AdvanceManifestFiling advanceManifestFilingsHouseBLPerformedBy(AdvanceManifestFilingsHouseBLPerformedByEnum advanceManifestFilingsHouseBLPerformedBy) {
    this.advanceManifestFilingsHouseBLPerformedBy = advanceManifestFilingsHouseBLPerformedBy;
    return this;
  }

  /**
   * Indicates whether the shipper (`SELF`) will perform the advance manifest filing(s) for the House BL directly or if the carrier (`CARRIER`) should file them on their behalf. Allowed values are:  - `SELF` (filing done by the House filer) - `CARRIER` (the carrier does the filing)  In case of self-filing (`SELF`), the shipper can provide their `selfFilerCode` for each manifest.  **Condition:** The `selfFilerCode` must be provided when `manifestTypeCode` is either `ACE` (US) or `ACI` (CA) and the `advanceManifestFilingsHouseBLPerformedBy` is set to `SELF`. 
   * @return advanceManifestFilingsHouseBLPerformedBy
   */
  @NotNull 
  @Schema(name = "advanceManifestFilingsHouseBLPerformedBy", example = "SELF", description = "Indicates whether the shipper (`SELF`) will perform the advance manifest filing(s) for the House BL directly or if the carrier (`CARRIER`) should file them on their behalf. Allowed values are:  - `SELF` (filing done by the House filer) - `CARRIER` (the carrier does the filing)  In case of self-filing (`SELF`), the shipper can provide their `selfFilerCode` for each manifest.  **Condition:** The `selfFilerCode` must be provided when `manifestTypeCode` is either `ACE` (US) or `ACI` (CA) and the `advanceManifestFilingsHouseBLPerformedBy` is set to `SELF`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("advanceManifestFilingsHouseBLPerformedBy")
  public AdvanceManifestFilingsHouseBLPerformedByEnum getAdvanceManifestFilingsHouseBLPerformedBy() {
    return advanceManifestFilingsHouseBLPerformedBy;
  }

  public void setAdvanceManifestFilingsHouseBLPerformedBy(AdvanceManifestFilingsHouseBLPerformedByEnum advanceManifestFilingsHouseBLPerformedBy) {
    this.advanceManifestFilingsHouseBLPerformedBy = advanceManifestFilingsHouseBLPerformedBy;
  }

  public AdvanceManifestFiling selfFilerCode(String selfFilerCode) {
    this.selfFilerCode = selfFilerCode;
    return this;
  }

  /**
   * Code identifying the party who will submit the advance manifest filing(s) for the House BL.  **Mandatory** if `manifestTypeCode` is either `ACE` (US) or `ACI` (CA) and `advanceManifestFilingsHouseBLPerformedBy` is set to `SELF`. 
   * @return selfFilerCode
   */
  @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 100) 
  @Schema(name = "selfFilerCode", example = "FLXP", description = "Code identifying the party who will submit the advance manifest filing(s) for the House BL.  **Mandatory** if `manifestTypeCode` is either `ACE` (US) or `ACI` (CA) and `advanceManifestFilingsHouseBLPerformedBy` is set to `SELF`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selfFilerCode")
  public String getSelfFilerCode() {
    return selfFilerCode;
  }

  public void setSelfFilerCode(String selfFilerCode) {
    this.selfFilerCode = selfFilerCode;
  }

  public AdvanceManifestFiling supplementaryDeclarantEORINumber(String supplementaryDeclarantEORINumber) {
    this.supplementaryDeclarantEORINumber = supplementaryDeclarantEORINumber;
    return this;
  }

  /**
   * The Economic Operators Registration and Identification (EORI) number of the house filer responsible for the `ENS` filing.  **Conditional:** only applicable if `manifestTypeCode` is `ENS`. 
   * @return supplementaryDeclarantEORINumber
   */
  @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 17) 
  @Schema(name = "supplementaryDeclarantEORINumber", example = "FLXP-123321", description = "The Economic Operators Registration and Identification (EORI) number of the house filer responsible for the `ENS` filing.  **Conditional:** only applicable if `manifestTypeCode` is `ENS`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supplementaryDeclarantEORINumber")
  public String getSupplementaryDeclarantEORINumber() {
    return supplementaryDeclarantEORINumber;
  }

  public void setSupplementaryDeclarantEORINumber(String supplementaryDeclarantEORINumber) {
    this.supplementaryDeclarantEORINumber = supplementaryDeclarantEORINumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceManifestFiling advanceManifestFiling = (AdvanceManifestFiling) o;
    return Objects.equals(this.manifestTypeCode, advanceManifestFiling.manifestTypeCode) &&
        Objects.equals(this.countryCode, advanceManifestFiling.countryCode) &&
        Objects.equals(this.advanceManifestFilingsHouseBLPerformedBy, advanceManifestFiling.advanceManifestFilingsHouseBLPerformedBy) &&
        Objects.equals(this.selfFilerCode, advanceManifestFiling.selfFilerCode) &&
        Objects.equals(this.supplementaryDeclarantEORINumber, advanceManifestFiling.supplementaryDeclarantEORINumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifestTypeCode, countryCode, advanceManifestFilingsHouseBLPerformedBy, selfFilerCode, supplementaryDeclarantEORINumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceManifestFiling {\n");
    sb.append("    manifestTypeCode: ").append(toIndentedString(manifestTypeCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    advanceManifestFilingsHouseBLPerformedBy: ").append(toIndentedString(advanceManifestFilingsHouseBLPerformedBy)).append("\n");
    sb.append("    selfFilerCode: ").append(toIndentedString(selfFilerCode)).append("\n");
    sb.append("    supplementaryDeclarantEORINumber: ").append(toIndentedString(supplementaryDeclarantEORINumber)).append("\n");
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

