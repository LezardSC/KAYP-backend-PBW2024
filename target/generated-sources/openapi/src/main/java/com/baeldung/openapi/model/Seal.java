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
 * Addresses the seal-related information associated with the shipment equipment. A seal is put on a shipment equipment once it is loaded. This &#x60;Seal&#x60; is meant to stay on until the shipment equipment reaches its final destination. 
 */

@Schema(name = "Seal", description = "Addresses the seal-related information associated with the shipment equipment. A seal is put on a shipment equipment once it is loaded. This `Seal` is meant to stay on until the shipment equipment reaches its final destination. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class Seal {

  private String number;

  /**
   * The source of the seal, namely who has affixed the seal. - `CAR` (Carrier) - `SHI` (Shipper) - `VET` (Veterinary) - `CUS` (Customs)  **Condition:** Seal source may be required depending on the type of commodity being shipped. 
   */
  public enum SourceEnum {
    CAR("CAR"),
    
    SHI("SHI"),
    
    VET("VET"),
    
    CUS("CUS");

    private String value;

    SourceEnum(String value) {
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
    public static SourceEnum fromValue(String value) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SourceEnum source;

  public Seal() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Seal(String number) {
    this.number = number;
  }

  public Seal number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Identifies a seal affixed to the container.
   * @return number
   */
  @NotNull @Size(max = 15) 
  @Schema(name = "number", example = "VET123", description = "Identifies a seal affixed to the container.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Seal source(SourceEnum source) {
    this.source = source;
    return this;
  }

  /**
   * The source of the seal, namely who has affixed the seal. - `CAR` (Carrier) - `SHI` (Shipper) - `VET` (Veterinary) - `CUS` (Customs)  **Condition:** Seal source may be required depending on the type of commodity being shipped. 
   * @return source
   */
  
  @Schema(name = "source", example = "CUS", description = "The source of the seal, namely who has affixed the seal. - `CAR` (Carrier) - `SHI` (Shipper) - `VET` (Veterinary) - `CUS` (Customs)  **Condition:** Seal source may be required depending on the type of commodity being shipped. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Seal seal = (Seal) o;
    return Objects.equals(this.number, seal.number) &&
        Objects.equals(this.source, seal.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Seal {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

