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
 * Calculated by multiplying the width, height, and length of the packed cargo. 
 */

@Schema(name = "Cargo_Gross_Volume", description = "Calculated by multiplying the width, height, and length of the packed cargo. ")
@JsonTypeName("Cargo_Gross_Volume")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class CargoGrossVolume {

  private Float value;

  /**
   * The unit of measure which can be expressed in either imperial or metric terms - `FTQ` (Cubic foot) - `MTQ` (Cubic meter) 
   */
  public enum UnitEnum {
    MTQ("MTQ"),
    
    FTQ("FTQ");

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

  public CargoGrossVolume() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CargoGrossVolume(Float value, UnitEnum unit) {
    this.value = value;
    this.unit = unit;
  }

  public CargoGrossVolume value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * Calculated by multiplying the width, height, and length of the packed cargo. A maximum of 4 decimals should be provided. 
   * minimum: 0
   * @return value
   */
  @NotNull @DecimalMin(value = "0", inclusive = false) 
  @Schema(name = "value", example = "2.4", description = "Calculated by multiplying the width, height, and length of the packed cargo. A maximum of 4 decimals should be provided. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public CargoGrossVolume unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

  /**
   * The unit of measure which can be expressed in either imperial or metric terms - `FTQ` (Cubic foot) - `MTQ` (Cubic meter) 
   * @return unit
   */
  @NotNull 
  @Schema(name = "unit", example = "MTQ", description = "The unit of measure which can be expressed in either imperial or metric terms - `FTQ` (Cubic foot) - `MTQ` (Cubic meter) ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    CargoGrossVolume cargoGrossVolume = (CargoGrossVolume) o;
    return Objects.equals(this.value, cargoGrossVolume.value) &&
        Objects.equals(this.unit, cargoGrossVolume.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargoGrossVolume {\n");
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

