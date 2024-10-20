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
 * Reference that uniquely identifies a party for tax and/or legal purposes in accordance with the relevant jurisdiction.  A small list of **potential** examples:  | Type  | Country | Description | |-------|:-------:|-------------| |PAN|IN|Goods and Services Tax Identification Number in India| |GSTIN|IN|Goods and Services Tax Identification Number in India| |IEC|IN|Importer-Exported Code in India| |RUC|EC|Registro Único del Contribuyente in Ecuador| |RUC|PE|Registro Único del Contribuyente in Peru| |NIF|MG|Numéro d&#39;Identification Fiscal in Madagascar| |NIF|DZ|Numéro d&#39;Identification Fiscal in Algeria| 
 */

@Schema(name = "TaxLegalReference", description = "Reference that uniquely identifies a party for tax and/or legal purposes in accordance with the relevant jurisdiction.  A small list of **potential** examples:  | Type  | Country | Description | |-------|:-------:|-------------| |PAN|IN|Goods and Services Tax Identification Number in India| |GSTIN|IN|Goods and Services Tax Identification Number in India| |IEC|IN|Importer-Exported Code in India| |RUC|EC|Registro Único del Contribuyente in Ecuador| |RUC|PE|Registro Único del Contribuyente in Peru| |NIF|MG|Numéro d'Identification Fiscal in Madagascar| |NIF|DZ|Numéro d'Identification Fiscal in Algeria| ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class TaxLegalReference {

  private String type;

  private String countryCode;

  private String value;

  public TaxLegalReference() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaxLegalReference(String type, String countryCode, String value) {
    this.type = type;
    this.countryCode = countryCode;
    this.value = value;
  }

  public TaxLegalReference type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The reference type code as defined by the relevant tax and/or legal authority. 
   * @return type
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 50) 
  @Schema(name = "type", example = "PAN", description = "The reference type code as defined by the relevant tax and/or legal authority. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TaxLegalReference countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The 2 characters for the country code using [ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#iso:pub:PUB500001:en) 
   * @return countryCode
   */
  @NotNull @Pattern(regexp = "^[A-Z]{2}$") @Size(min = 2, max = 2) 
  @Schema(name = "countryCode", example = "IN", description = "The 2 characters for the country code using [ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#iso:pub:PUB500001:en) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public TaxLegalReference value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the `taxLegalReference` 
   * @return value
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 35) 
  @Schema(name = "value", example = "AAAAA0000A", description = "The value of the `taxLegalReference` ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxLegalReference taxLegalReference = (TaxLegalReference) o;
    return Objects.equals(this.type, taxLegalReference.type) &&
        Objects.equals(this.countryCode, taxLegalReference.countryCode) &&
        Objects.equals(this.value, taxLegalReference.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, countryCode, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxLegalReference {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

