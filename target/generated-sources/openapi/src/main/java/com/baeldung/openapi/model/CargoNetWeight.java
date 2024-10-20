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
 * The weight of the cargo item excluding packaging being carried in the container. Excludes the tare weight of the container. 
 */

@Schema(name = "Cargo_Net_Weight", description = "The weight of the cargo item excluding packaging being carried in the container. Excludes the tare weight of the container. ")
@JsonTypeName("Cargo_Net_Weight")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class CargoNetWeight {

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

  public CargoNetWeight() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CargoNetWeight(Float value, UnitEnum unit) {
    this.value = value;
    this.unit = unit;
  }

  public CargoNetWeight value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * The weight of the cargo item excluding packaging being carried in the container. Excludes the tare weight of the container. A maximum of 3 decimals should be provided. 
   * minimum: 0
   * @return value
   */
  @NotNull @DecimalMin(value = "0", inclusive = false) 
  @Schema(name = "value", example = "2400", description = "The weight of the cargo item excluding packaging being carried in the container. Excludes the tare weight of the container. A maximum of 3 decimals should be provided. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public CargoNetWeight unit(UnitEnum unit) {
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
    CargoNetWeight cargoNetWeight = (CargoNetWeight) o;
    return Objects.equals(this.value, cargoNetWeight.value) &&
        Objects.equals(this.unit, cargoNetWeight.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargoNetWeight {\n");
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

