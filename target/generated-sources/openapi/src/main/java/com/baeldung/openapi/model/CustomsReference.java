package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Reference associated with customs and/or excise purposes required by the relevant authorities for the import, export, or transit of the goods.  A small list of **potential** examples:  | Type  | Country | Description | |-------|:-------:|-------------| |ACID|EG|Advance Cargo Information Declaration in Egypt| |CERS|CA|Canadian Export Reporting System| |ITN|US|Internal Transaction Number in US| |PEB|ID|PEB reference number| |CSN|IN|Cargo Summary Notification (CSN)| 
 */

@Schema(name = "CustomsReference", description = "Reference associated with customs and/or excise purposes required by the relevant authorities for the import, export, or transit of the goods.  A small list of **potential** examples:  | Type  | Country | Description | |-------|:-------:|-------------| |ACID|EG|Advance Cargo Information Declaration in Egypt| |CERS|CA|Canadian Export Reporting System| |ITN|US|Internal Transaction Number in US| |PEB|ID|PEB reference number| |CSN|IN|Cargo Summary Notification (CSN)| ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class CustomsReference {

  private String type;

  private String countryCode;

  @Valid
  private List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 35)String> values = new ArrayList<>();

  public CustomsReference() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomsReference(String type, String countryCode, List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 35)String> values) {
    this.type = type;
    this.countryCode = countryCode;
    this.values = values;
  }

  public CustomsReference type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The reference type code as defined in the relevant customs jurisdiction. 
   * @return type
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 50) 
  @Schema(name = "type", example = "ACID", description = "The reference type code as defined in the relevant customs jurisdiction. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CustomsReference countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The 2 characters for the country code using [ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#iso:pub:PUB500001:en) 
   * @return countryCode
   */
  @NotNull @Pattern(regexp = "^[A-Z]{2}$") @Size(min = 2, max = 2) 
  @Schema(name = "countryCode", example = "EG", description = "The 2 characters for the country code using [ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#iso:pub:PUB500001:en) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public CustomsReference values(List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 35)String> values) {
    this.values = values;
    return this;
  }

  public CustomsReference addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
   */
  @NotNull @Size(min = 1) 
  @Schema(name = "values", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("values")
  public List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 35)String> getValues() {
    return values;
  }

  public void setValues(List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 35)String> values) {
    this.values = values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomsReference customsReference = (CustomsReference) o;
    return Objects.equals(this.type, customsReference.type) &&
        Objects.equals(this.countryCode, customsReference.countryCode) &&
        Objects.equals(this.values, customsReference.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, countryCode, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomsReference {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

