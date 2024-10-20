package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The weight of an empty container (gross container weight). 
 */

@Schema(name = "Tare_Weight", description = "The weight of an empty container (gross container weight). ")
@JsonTypeName("Tare_Weight")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class TareWeight {

  private Float value;

  /**
   * The unit of measure which can be expressed in imperial or metric terms - `KGM` (Kilograms) - `LBR` (Pounds) 
   */
  public enum UnitEnum {
    KGM("KGM"),
    
    LBR("LBR");

    private String value;

    UnitEnum(String value) {
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
    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private UnitEnum unit;

  public TareWeight() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TareWeight(Float value, UnitEnum unit) {
    this.value = value;
    this.unit = unit;
  }

  public TareWeight value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * The weight of an empty container (gross container weight). 
   * minimum: 0
   * @return value
   */
  @NotNull @DecimalMin(value = "0", inclusive = false) 
  @Schema(name = "value", example = "4800", description = "The weight of an empty container (gross container weight). ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public TareWeight unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

  /**
   * The unit of measure which can be expressed in imperial or metric terms - `KGM` (Kilograms) - `LBR` (Pounds) 
   * @return unit
   */
  @NotNull 
  @Schema(name = "unit", example = "KGM", description = "The unit of measure which can be expressed in imperial or metric terms - `KGM` (Kilograms) - `LBR` (Pounds) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("unit")
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TareWeight tareWeight = (TareWeight) o;
    return Objects.equals(this.value, tareWeight.value) &&
        Objects.equals(this.unit, tareWeight.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TareWeight {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

