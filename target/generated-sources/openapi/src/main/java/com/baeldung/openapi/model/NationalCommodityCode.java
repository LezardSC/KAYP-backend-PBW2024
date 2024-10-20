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
 * The national commodity classification code linked to a country with a value.  An example could look like this:  | Type  | Country | Value | |-------|:-------:|-------------| |NCM|BR|[&#39;1515&#39;, &#39;2106&#39;, &#39;2507&#39;, &#39;2512&#39;]| 
 */

@Schema(name = "NationalCommodityCode", description = "The national commodity classification code linked to a country with a value.  An example could look like this:  | Type  | Country | Value | |-------|:-------:|-------------| |NCM|BR|['1515', '2106', '2507', '2512']| ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class NationalCommodityCode {

  private String type;

  private String countryCode;

  @Valid
  private List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 10)String> values = new ArrayList<>();

  public NationalCommodityCode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NationalCommodityCode(String type, String countryCode, List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 10)String> values) {
    this.type = type;
    this.countryCode = countryCode;
    this.values = values;
  }

  public NationalCommodityCode type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The national commodity classification code, which can be one of the following values defined by DCSA: - `NCM` (Nomenclatura Comum do Mercosul) - `HTS` (Harmonized Tariff Schedule) - `SCHEDULE_B` ( Schedule B) - `TARIC` (Integrated Tariff of the European Communities) - `CN` (Combined Nomenclature) - `CUS` (Customs Union and Statistics) 
   * @return type
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 10) 
  @Schema(name = "type", example = "NCM", description = "The national commodity classification code, which can be one of the following values defined by DCSA: - `NCM` (Nomenclatura Comum do Mercosul) - `HTS` (Harmonized Tariff Schedule) - `SCHEDULE_B` ( Schedule B) - `TARIC` (Integrated Tariff of the European Communities) - `CN` (Combined Nomenclature) - `CUS` (Customs Union and Statistics) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NationalCommodityCode countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The 2 characters for the country code using [ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#iso:pub:PUB500001:en) 
   * @return countryCode
   */
  @NotNull @Pattern(regexp = "^[A-Z]{2}$") @Size(min = 2, max = 2) 
  @Schema(name = "countryCode", example = "BR", description = "The 2 characters for the country code using [ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#iso:pub:PUB500001:en) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public NationalCommodityCode values(List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 10)String> values) {
    this.values = values;
    return this;
  }

  public NationalCommodityCode addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * A list of `national commodity codes` values. 
   * @return values
   */
  @NotNull @Size(min = 1) 
  @Schema(name = "values", example = "[\"1515\",\"2106\",\"2507\",\"2512\"]", description = "A list of `national commodity codes` values. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("values")
  public List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 10)String> getValues() {
    return values;
  }

  public void setValues(List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 10)String> values) {
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
    NationalCommodityCode nationalCommodityCode = (NationalCommodityCode) o;
    return Objects.equals(this.type, nationalCommodityCode.type) &&
        Objects.equals(this.countryCode, nationalCommodityCode.countryCode) &&
        Objects.equals(this.values, nationalCommodityCode.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, countryCode, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NationalCommodityCode {\n");
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

