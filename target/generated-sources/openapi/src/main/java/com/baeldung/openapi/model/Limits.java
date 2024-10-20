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
 * Limits for the &#x60;Dangerous Goods&#x60;. The same &#x60;Temperature Unit&#x60; needs to apply to all attributes in this structure. 
 */

@Schema(name = "Limits", description = "Limits for the `Dangerous Goods`. The same `Temperature Unit` needs to apply to all attributes in this structure. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class Limits {

  /**
   * The unit for **all attributes in the limits structure** in Celsius or Fahrenheit  - `CEL` (Celsius) - `FAH` (Fahrenheit) 
   */
  public enum TemperatureUnitEnum {
    CEL("CEL"),
    
    FAH("FAH");

    private String value;

    TemperatureUnitEnum(String value) {
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
    public static TemperatureUnitEnum fromValue(String value) {
      for (TemperatureUnitEnum b : TemperatureUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TemperatureUnitEnum temperatureUnit;

  private Float flashPoint;

  private Float transportControlTemperature;

  private Float transportEmergencyTemperature;

  private Float SADT;

  private Float SAPT;

  public Limits() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Limits(TemperatureUnitEnum temperatureUnit) {
    this.temperatureUnit = temperatureUnit;
  }

  public Limits temperatureUnit(TemperatureUnitEnum temperatureUnit) {
    this.temperatureUnit = temperatureUnit;
    return this;
  }

  /**
   * The unit for **all attributes in the limits structure** in Celsius or Fahrenheit  - `CEL` (Celsius) - `FAH` (Fahrenheit) 
   * @return temperatureUnit
   */
  @NotNull 
  @Schema(name = "temperatureUnit", example = "CEL", description = "The unit for **all attributes in the limits structure** in Celsius or Fahrenheit  - `CEL` (Celsius) - `FAH` (Fahrenheit) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("temperatureUnit")
  public TemperatureUnitEnum getTemperatureUnit() {
    return temperatureUnit;
  }

  public void setTemperatureUnit(TemperatureUnitEnum temperatureUnit) {
    this.temperatureUnit = temperatureUnit;
  }

  public Limits flashPoint(Float flashPoint) {
    this.flashPoint = flashPoint;
    return this;
  }

  /**
   * Lowest temperature at which a chemical can vaporize to form an ignitable mixture in air.  **Condition:** only applicable to specific hazardous goods according to the IMO IMDG Code. 
   * @return flashPoint
   */
  
  @Schema(name = "flashPoint", example = "42", description = "Lowest temperature at which a chemical can vaporize to form an ignitable mixture in air.  **Condition:** only applicable to specific hazardous goods according to the IMO IMDG Code. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flashPoint")
  public Float getFlashPoint() {
    return flashPoint;
  }

  public void setFlashPoint(Float flashPoint) {
    this.flashPoint = flashPoint;
  }

  public Limits transportControlTemperature(Float transportControlTemperature) {
    this.transportControlTemperature = transportControlTemperature;
    return this;
  }

  /**
   * Maximum temperature at which certain substance (such as organic peroxides and self-reactive and related substances) can be safely transported for a prolonged period. 
   * @return transportControlTemperature
   */
  
  @Schema(name = "transportControlTemperature", example = "24.1", description = "Maximum temperature at which certain substance (such as organic peroxides and self-reactive and related substances) can be safely transported for a prolonged period. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transportControlTemperature")
  public Float getTransportControlTemperature() {
    return transportControlTemperature;
  }

  public void setTransportControlTemperature(Float transportControlTemperature) {
    this.transportControlTemperature = transportControlTemperature;
  }

  public Limits transportEmergencyTemperature(Float transportEmergencyTemperature) {
    this.transportEmergencyTemperature = transportEmergencyTemperature;
    return this;
  }

  /**
   * Temperature at which emergency procedures shall be implemented 
   * @return transportEmergencyTemperature
   */
  
  @Schema(name = "transportEmergencyTemperature", example = "74.1", description = "Temperature at which emergency procedures shall be implemented ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transportEmergencyTemperature")
  public Float getTransportEmergencyTemperature() {
    return transportEmergencyTemperature;
  }

  public void setTransportEmergencyTemperature(Float transportEmergencyTemperature) {
    this.transportEmergencyTemperature = transportEmergencyTemperature;
  }

  public Limits SADT(Float SADT) {
    this.SADT = SADT;
    return this;
  }

  /**
   * Lowest temperature in which self-accelerating decomposition may occur in a substance 
   * @return SADT
   */
  
  @Schema(name = "SADT", example = "54.1", description = "Lowest temperature in which self-accelerating decomposition may occur in a substance ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SADT")
  public Float getSADT() {
    return SADT;
  }

  public void setSADT(Float SADT) {
    this.SADT = SADT;
  }

  public Limits SAPT(Float SAPT) {
    this.SAPT = SAPT;
    return this;
  }

  /**
   * Lowest temperature in which self-accelerating polymerization may occur in a substance 
   * @return SAPT
   */
  
  @Schema(name = "SAPT", example = "70", description = "Lowest temperature in which self-accelerating polymerization may occur in a substance ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SAPT")
  public Float getSAPT() {
    return SAPT;
  }

  public void setSAPT(Float SAPT) {
    this.SAPT = SAPT;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Limits limits = (Limits) o;
    return Objects.equals(this.temperatureUnit, limits.temperatureUnit) &&
        Objects.equals(this.flashPoint, limits.flashPoint) &&
        Objects.equals(this.transportControlTemperature, limits.transportControlTemperature) &&
        Objects.equals(this.transportEmergencyTemperature, limits.transportEmergencyTemperature) &&
        Objects.equals(this.SADT, limits.SADT) &&
        Objects.equals(this.SAPT, limits.SAPT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(temperatureUnit, flashPoint, transportControlTemperature, transportEmergencyTemperature, SADT, SAPT);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Limits {\n");
    sb.append("    temperatureUnit: ").append(toIndentedString(temperatureUnit)).append("\n");
    sb.append("    flashPoint: ").append(toIndentedString(flashPoint)).append("\n");
    sb.append("    transportControlTemperature: ").append(toIndentedString(transportControlTemperature)).append("\n");
    sb.append("    transportEmergencyTemperature: ").append(toIndentedString(transportEmergencyTemperature)).append("\n");
    sb.append("    SADT: ").append(toIndentedString(SADT)).append("\n");
    sb.append("    SAPT: ").append(toIndentedString(SAPT)).append("\n");
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

