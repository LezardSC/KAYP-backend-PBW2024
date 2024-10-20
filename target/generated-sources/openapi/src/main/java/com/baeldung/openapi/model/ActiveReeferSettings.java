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
 * The specifications for a Reefer equipment.  **Condition:** Only applicable when &#x60;isNonOperatingReefer&#x60; is set to &#x60;false&#x60; 
 */

@Schema(name = "ActiveReeferSettings", description = "The specifications for a Reefer equipment.  **Condition:** Only applicable when `isNonOperatingReefer` is set to `false` ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class ActiveReeferSettings {

  private Float temperatureSetpoint;

  /**
   * The unit for temperature in Celsius or Fahrenheit  - `CEL` (Celsius) - `FAH` (Fahrenheit)  **Condition:** Mandatory to provide if `temperatureSetpoint` is provided 
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

  private Float o2Setpoint;

  private Float co2Setpoint;

  private Float humiditySetpoint;

  private Float airExchangeSetpoint;

  /**
   * The unit for `airExchange` in metrics- or imperial- units per hour - `MQH` (Cubic metre per hour) - `FQH` (Cubic foot per hour)  **Condition:** Mandatory to provide if `airExchange` is provided 
   */
  public enum AirExchangeUnitEnum {
    MQH("MQH"),
    
    FQH("FQH");

    private String value;

    AirExchangeUnitEnum(String value) {
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
    public static AirExchangeUnitEnum fromValue(String value) {
      for (AirExchangeUnitEnum b : AirExchangeUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AirExchangeUnitEnum airExchangeUnit;

  private Boolean isVentilationOpen;

  private Boolean isDrainholesOpen;

  private Boolean isBulbMode;

  private Boolean isColdTreatmentRequired;

  private Boolean isControlledAtmosphereRequired;

  public ActiveReeferSettings temperatureSetpoint(Float temperatureSetpoint) {
    this.temperatureSetpoint = temperatureSetpoint;
    return this;
  }

  /**
   * Target value of the temperature for the Reefer based on the cargo requirement. 
   * @return temperatureSetpoint
   */
  
  @Schema(name = "temperatureSetpoint", example = "-15", description = "Target value of the temperature for the Reefer based on the cargo requirement. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temperatureSetpoint")
  public Float getTemperatureSetpoint() {
    return temperatureSetpoint;
  }

  public void setTemperatureSetpoint(Float temperatureSetpoint) {
    this.temperatureSetpoint = temperatureSetpoint;
  }

  public ActiveReeferSettings temperatureUnit(TemperatureUnitEnum temperatureUnit) {
    this.temperatureUnit = temperatureUnit;
    return this;
  }

  /**
   * The unit for temperature in Celsius or Fahrenheit  - `CEL` (Celsius) - `FAH` (Fahrenheit)  **Condition:** Mandatory to provide if `temperatureSetpoint` is provided 
   * @return temperatureUnit
   */
  
  @Schema(name = "temperatureUnit", example = "CEL", description = "The unit for temperature in Celsius or Fahrenheit  - `CEL` (Celsius) - `FAH` (Fahrenheit)  **Condition:** Mandatory to provide if `temperatureSetpoint` is provided ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temperatureUnit")
  public TemperatureUnitEnum getTemperatureUnit() {
    return temperatureUnit;
  }

  public void setTemperatureUnit(TemperatureUnitEnum temperatureUnit) {
    this.temperatureUnit = temperatureUnit;
  }

  public ActiveReeferSettings o2Setpoint(Float o2Setpoint) {
    this.o2Setpoint = o2Setpoint;
    return this;
  }

  /**
   * The percentage of the controlled atmosphere CO<sub>2</sub> target value 
   * minimum: 0
   * maximum: 100
   * @return o2Setpoint
   */
  @DecimalMin("0") @DecimalMax("100") 
  @Schema(name = "o2Setpoint", example = "25", description = "The percentage of the controlled atmosphere CO<sub>2</sub> target value ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("o2Setpoint")
  public Float getO2Setpoint() {
    return o2Setpoint;
  }

  public void setO2Setpoint(Float o2Setpoint) {
    this.o2Setpoint = o2Setpoint;
  }

  public ActiveReeferSettings co2Setpoint(Float co2Setpoint) {
    this.co2Setpoint = co2Setpoint;
    return this;
  }

  /**
   * The percentage of the controlled atmosphere CO<sub>2</sub> target value 
   * minimum: 0
   * maximum: 100
   * @return co2Setpoint
   */
  @DecimalMin("0") @DecimalMax("100") 
  @Schema(name = "co2Setpoint", example = "25", description = "The percentage of the controlled atmosphere CO<sub>2</sub> target value ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("co2Setpoint")
  public Float getCo2Setpoint() {
    return co2Setpoint;
  }

  public void setCo2Setpoint(Float co2Setpoint) {
    this.co2Setpoint = co2Setpoint;
  }

  public ActiveReeferSettings humiditySetpoint(Float humiditySetpoint) {
    this.humiditySetpoint = humiditySetpoint;
    return this;
  }

  /**
   * The percentage of the controlled atmosphere humidity target value 
   * minimum: 0
   * maximum: 100
   * @return humiditySetpoint
   */
  @DecimalMin("0") @DecimalMax("100") 
  @Schema(name = "humiditySetpoint", example = "95.6", description = "The percentage of the controlled atmosphere humidity target value ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("humiditySetpoint")
  public Float getHumiditySetpoint() {
    return humiditySetpoint;
  }

  public void setHumiditySetpoint(Float humiditySetpoint) {
    this.humiditySetpoint = humiditySetpoint;
  }

  public ActiveReeferSettings airExchangeSetpoint(Float airExchangeSetpoint) {
    this.airExchangeSetpoint = airExchangeSetpoint;
    return this;
  }

  /**
   * Target value for the air exchange rate which is the rate at which outdoor air replaces indoor air within a Reefer container 
   * minimum: 0
   * @return airExchangeSetpoint
   */
  @DecimalMin("0") 
  @Schema(name = "airExchangeSetpoint", example = "15.4", description = "Target value for the air exchange rate which is the rate at which outdoor air replaces indoor air within a Reefer container ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("airExchangeSetpoint")
  public Float getAirExchangeSetpoint() {
    return airExchangeSetpoint;
  }

  public void setAirExchangeSetpoint(Float airExchangeSetpoint) {
    this.airExchangeSetpoint = airExchangeSetpoint;
  }

  public ActiveReeferSettings airExchangeUnit(AirExchangeUnitEnum airExchangeUnit) {
    this.airExchangeUnit = airExchangeUnit;
    return this;
  }

  /**
   * The unit for `airExchange` in metrics- or imperial- units per hour - `MQH` (Cubic metre per hour) - `FQH` (Cubic foot per hour)  **Condition:** Mandatory to provide if `airExchange` is provided 
   * @return airExchangeUnit
   */
  
  @Schema(name = "airExchangeUnit", example = "MQH", description = "The unit for `airExchange` in metrics- or imperial- units per hour - `MQH` (Cubic metre per hour) - `FQH` (Cubic foot per hour)  **Condition:** Mandatory to provide if `airExchange` is provided ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("airExchangeUnit")
  public AirExchangeUnitEnum getAirExchangeUnit() {
    return airExchangeUnit;
  }

  public void setAirExchangeUnit(AirExchangeUnitEnum airExchangeUnit) {
    this.airExchangeUnit = airExchangeUnit;
  }

  public ActiveReeferSettings isVentilationOpen(Boolean isVentilationOpen) {
    this.isVentilationOpen = isVentilationOpen;
    return this;
  }

  /**
   * If `true` the ventilation orifice is `Open` - if `false` the ventilation orifice is `closed` 
   * @return isVentilationOpen
   */
  
  @Schema(name = "isVentilationOpen", example = "true", description = "If `true` the ventilation orifice is `Open` - if `false` the ventilation orifice is `closed` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isVentilationOpen")
  public Boolean getIsVentilationOpen() {
    return isVentilationOpen;
  }

  public void setIsVentilationOpen(Boolean isVentilationOpen) {
    this.isVentilationOpen = isVentilationOpen;
  }

  public ActiveReeferSettings isDrainholesOpen(Boolean isDrainholesOpen) {
    this.isDrainholesOpen = isDrainholesOpen;
    return this;
  }

  /**
   * Is drain holes open on the container 
   * @return isDrainholesOpen
   */
  
  @Schema(name = "isDrainholesOpen", example = "true", description = "Is drain holes open on the container ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDrainholesOpen")
  public Boolean getIsDrainholesOpen() {
    return isDrainholesOpen;
  }

  public void setIsDrainholesOpen(Boolean isDrainholesOpen) {
    this.isDrainholesOpen = isDrainholesOpen;
  }

  public ActiveReeferSettings isBulbMode(Boolean isBulbMode) {
    this.isBulbMode = isBulbMode;
    return this;
  }

  /**
   * Is special container setting for handling flower bulbs active 
   * @return isBulbMode
   */
  
  @Schema(name = "isBulbMode", example = "true", description = "Is special container setting for handling flower bulbs active ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBulbMode")
  public Boolean getIsBulbMode() {
    return isBulbMode;
  }

  public void setIsBulbMode(Boolean isBulbMode) {
    this.isBulbMode = isBulbMode;
  }

  public ActiveReeferSettings isColdTreatmentRequired(Boolean isColdTreatmentRequired) {
    this.isColdTreatmentRequired = isColdTreatmentRequired;
    return this;
  }

  /**
   * Indicator whether cargo requires cold treatment prior to loading at origin or during transit, but prior arrival at POD 
   * @return isColdTreatmentRequired
   */
  
  @Schema(name = "isColdTreatmentRequired", example = "true", description = "Indicator whether cargo requires cold treatment prior to loading at origin or during transit, but prior arrival at POD ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isColdTreatmentRequired")
  public Boolean getIsColdTreatmentRequired() {
    return isColdTreatmentRequired;
  }

  public void setIsColdTreatmentRequired(Boolean isColdTreatmentRequired) {
    this.isColdTreatmentRequired = isColdTreatmentRequired;
  }

  public ActiveReeferSettings isControlledAtmosphereRequired(Boolean isControlledAtmosphereRequired) {
    this.isControlledAtmosphereRequired = isControlledAtmosphereRequired;
    return this;
  }

  /**
   * Indicator of whether cargo requires Controlled Atmosphere. 
   * @return isControlledAtmosphereRequired
   */
  
  @Schema(name = "isControlledAtmosphereRequired", example = "true", description = "Indicator of whether cargo requires Controlled Atmosphere. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isControlledAtmosphereRequired")
  public Boolean getIsControlledAtmosphereRequired() {
    return isControlledAtmosphereRequired;
  }

  public void setIsControlledAtmosphereRequired(Boolean isControlledAtmosphereRequired) {
    this.isControlledAtmosphereRequired = isControlledAtmosphereRequired;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveReeferSettings activeReeferSettings = (ActiveReeferSettings) o;
    return Objects.equals(this.temperatureSetpoint, activeReeferSettings.temperatureSetpoint) &&
        Objects.equals(this.temperatureUnit, activeReeferSettings.temperatureUnit) &&
        Objects.equals(this.o2Setpoint, activeReeferSettings.o2Setpoint) &&
        Objects.equals(this.co2Setpoint, activeReeferSettings.co2Setpoint) &&
        Objects.equals(this.humiditySetpoint, activeReeferSettings.humiditySetpoint) &&
        Objects.equals(this.airExchangeSetpoint, activeReeferSettings.airExchangeSetpoint) &&
        Objects.equals(this.airExchangeUnit, activeReeferSettings.airExchangeUnit) &&
        Objects.equals(this.isVentilationOpen, activeReeferSettings.isVentilationOpen) &&
        Objects.equals(this.isDrainholesOpen, activeReeferSettings.isDrainholesOpen) &&
        Objects.equals(this.isBulbMode, activeReeferSettings.isBulbMode) &&
        Objects.equals(this.isColdTreatmentRequired, activeReeferSettings.isColdTreatmentRequired) &&
        Objects.equals(this.isControlledAtmosphereRequired, activeReeferSettings.isControlledAtmosphereRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(temperatureSetpoint, temperatureUnit, o2Setpoint, co2Setpoint, humiditySetpoint, airExchangeSetpoint, airExchangeUnit, isVentilationOpen, isDrainholesOpen, isBulbMode, isColdTreatmentRequired, isControlledAtmosphereRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveReeferSettings {\n");
    sb.append("    temperatureSetpoint: ").append(toIndentedString(temperatureSetpoint)).append("\n");
    sb.append("    temperatureUnit: ").append(toIndentedString(temperatureUnit)).append("\n");
    sb.append("    o2Setpoint: ").append(toIndentedString(o2Setpoint)).append("\n");
    sb.append("    co2Setpoint: ").append(toIndentedString(co2Setpoint)).append("\n");
    sb.append("    humiditySetpoint: ").append(toIndentedString(humiditySetpoint)).append("\n");
    sb.append("    airExchangeSetpoint: ").append(toIndentedString(airExchangeSetpoint)).append("\n");
    sb.append("    airExchangeUnit: ").append(toIndentedString(airExchangeUnit)).append("\n");
    sb.append("    isVentilationOpen: ").append(toIndentedString(isVentilationOpen)).append("\n");
    sb.append("    isDrainholesOpen: ").append(toIndentedString(isDrainholesOpen)).append("\n");
    sb.append("    isBulbMode: ").append(toIndentedString(isBulbMode)).append("\n");
    sb.append("    isColdTreatmentRequired: ").append(toIndentedString(isColdTreatmentRequired)).append("\n");
    sb.append("    isControlledAtmosphereRequired: ").append(toIndentedString(isControlledAtmosphereRequired)).append("\n");
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

