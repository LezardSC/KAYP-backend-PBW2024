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
 * An indicator of whether destination charges are prepaid (&#x60;PRE&#x60;) or collect (&#x60;COL&#x60;). When prepaid, the charges are the responsibility of the shipper or the Invoice payer on behalf of the shipper (if provided). When collect, the charges are the responsibility of the consignee or the Invoice payer on behalf of the consignee (if provided). 
 */

@Schema(name = "DestinationChargesPaymentTerm", description = "An indicator of whether destination charges are prepaid (`PRE`) or collect (`COL`). When prepaid, the charges are the responsibility of the shipper or the Invoice payer on behalf of the shipper (if provided). When collect, the charges are the responsibility of the consignee or the Invoice payer on behalf of the consignee (if provided). ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class DestinationChargesPaymentTerm {

  /**
   * An indicator of whether the costs for inland transportation to the port, when applicable, are prepaid (`PRE`) or collect (`COL`).  - `PRE` (Prepaid) - `COL` (Collect) 
   */
  public enum HaulageChargesPaymentTermCodeEnum {
    PRE("PRE"),
    
    COL("COL");

    private String value;

    HaulageChargesPaymentTermCodeEnum(String value) {
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
    public static HaulageChargesPaymentTermCodeEnum fromValue(String value) {
      for (HaulageChargesPaymentTermCodeEnum b : HaulageChargesPaymentTermCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private HaulageChargesPaymentTermCodeEnum haulageChargesPaymentTermCode;

  /**
   * An indicator of whether the destination port charges are prepaid (`PRE`) or collect (`COL`).  - `PRE` (Prepaid) - `COL` (Collect) 
   */
  public enum PortChargesPaymentTermCodeEnum {
    PRE("PRE"),
    
    COL("COL");

    private String value;

    PortChargesPaymentTermCodeEnum(String value) {
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
    public static PortChargesPaymentTermCodeEnum fromValue(String value) {
      for (PortChargesPaymentTermCodeEnum b : PortChargesPaymentTermCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PortChargesPaymentTermCodeEnum portChargesPaymentTermCode;

  /**
   * An indicator of whether destination charges (excluding port and haulage) are prepaid (`PRE`) or collect (`COL`).  - `PRE` (Prepaid) - `COL` (Collect) 
   */
  public enum OtherChargesPaymentTermCodeEnum {
    PRE("PRE"),
    
    COL("COL");

    private String value;

    OtherChargesPaymentTermCodeEnum(String value) {
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
    public static OtherChargesPaymentTermCodeEnum fromValue(String value) {
      for (OtherChargesPaymentTermCodeEnum b : OtherChargesPaymentTermCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OtherChargesPaymentTermCodeEnum otherChargesPaymentTermCode;

  public DestinationChargesPaymentTerm haulageChargesPaymentTermCode(HaulageChargesPaymentTermCodeEnum haulageChargesPaymentTermCode) {
    this.haulageChargesPaymentTermCode = haulageChargesPaymentTermCode;
    return this;
  }

  /**
   * An indicator of whether the costs for inland transportation to the port, when applicable, are prepaid (`PRE`) or collect (`COL`).  - `PRE` (Prepaid) - `COL` (Collect) 
   * @return haulageChargesPaymentTermCode
   */
  
  @Schema(name = "haulageChargesPaymentTermCode", example = "PRE", description = "An indicator of whether the costs for inland transportation to the port, when applicable, are prepaid (`PRE`) or collect (`COL`).  - `PRE` (Prepaid) - `COL` (Collect) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("haulageChargesPaymentTermCode")
  public HaulageChargesPaymentTermCodeEnum getHaulageChargesPaymentTermCode() {
    return haulageChargesPaymentTermCode;
  }

  public void setHaulageChargesPaymentTermCode(HaulageChargesPaymentTermCodeEnum haulageChargesPaymentTermCode) {
    this.haulageChargesPaymentTermCode = haulageChargesPaymentTermCode;
  }

  public DestinationChargesPaymentTerm portChargesPaymentTermCode(PortChargesPaymentTermCodeEnum portChargesPaymentTermCode) {
    this.portChargesPaymentTermCode = portChargesPaymentTermCode;
    return this;
  }

  /**
   * An indicator of whether the destination port charges are prepaid (`PRE`) or collect (`COL`).  - `PRE` (Prepaid) - `COL` (Collect) 
   * @return portChargesPaymentTermCode
   */
  
  @Schema(name = "portChargesPaymentTermCode", example = "PRE", description = "An indicator of whether the destination port charges are prepaid (`PRE`) or collect (`COL`).  - `PRE` (Prepaid) - `COL` (Collect) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("portChargesPaymentTermCode")
  public PortChargesPaymentTermCodeEnum getPortChargesPaymentTermCode() {
    return portChargesPaymentTermCode;
  }

  public void setPortChargesPaymentTermCode(PortChargesPaymentTermCodeEnum portChargesPaymentTermCode) {
    this.portChargesPaymentTermCode = portChargesPaymentTermCode;
  }

  public DestinationChargesPaymentTerm otherChargesPaymentTermCode(OtherChargesPaymentTermCodeEnum otherChargesPaymentTermCode) {
    this.otherChargesPaymentTermCode = otherChargesPaymentTermCode;
    return this;
  }

  /**
   * An indicator of whether destination charges (excluding port and haulage) are prepaid (`PRE`) or collect (`COL`).  - `PRE` (Prepaid) - `COL` (Collect) 
   * @return otherChargesPaymentTermCode
   */
  
  @Schema(name = "otherChargesPaymentTermCode", example = "PRE", description = "An indicator of whether destination charges (excluding port and haulage) are prepaid (`PRE`) or collect (`COL`).  - `PRE` (Prepaid) - `COL` (Collect) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("otherChargesPaymentTermCode")
  public OtherChargesPaymentTermCodeEnum getOtherChargesPaymentTermCode() {
    return otherChargesPaymentTermCode;
  }

  public void setOtherChargesPaymentTermCode(OtherChargesPaymentTermCodeEnum otherChargesPaymentTermCode) {
    this.otherChargesPaymentTermCode = otherChargesPaymentTermCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinationChargesPaymentTerm destinationChargesPaymentTerm = (DestinationChargesPaymentTerm) o;
    return Objects.equals(this.haulageChargesPaymentTermCode, destinationChargesPaymentTerm.haulageChargesPaymentTermCode) &&
        Objects.equals(this.portChargesPaymentTermCode, destinationChargesPaymentTerm.portChargesPaymentTermCode) &&
        Objects.equals(this.otherChargesPaymentTermCode, destinationChargesPaymentTerm.otherChargesPaymentTermCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(haulageChargesPaymentTermCode, portChargesPaymentTermCode, otherChargesPaymentTermCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinationChargesPaymentTerm {\n");
    sb.append("    haulageChargesPaymentTermCode: ").append(toIndentedString(haulageChargesPaymentTermCode)).append("\n");
    sb.append("    portChargesPaymentTermCode: ").append(toIndentedString(portChargesPaymentTermCode)).append("\n");
    sb.append("    otherChargesPaymentTermCode: ").append(toIndentedString(otherChargesPaymentTermCode)).append("\n");
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

