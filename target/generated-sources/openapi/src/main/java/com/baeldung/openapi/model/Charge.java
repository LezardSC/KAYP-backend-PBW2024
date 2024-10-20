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
 * Addresses the monetary value of freight and other service charges for a &#x60;Booking&#x60;. 
 */

@Schema(name = "Charge", description = "Addresses the monetary value of freight and other service charges for a `Booking`. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class Charge {

  private String chargeName;

  private Float currencyAmount;

  private String currencyCode;

  /**
   * An indicator of whether a charge is prepaid (PRE) or collect (COL). When prepaid, the charge is the responsibility of the shipper or the Invoice payer on behalf of the shipper (if provided). When collect, the charge is the responsibility of the consignee or the Invoice payer on behalf of the consignee (if provided).  - `PRE` (Prepaid) - `COL` (Collect) 
   */
  public enum PaymentTermCodeEnum {
    PRE("PRE"),
    
    COL("COL");

    private String value;

    PaymentTermCodeEnum(String value) {
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
    public static PaymentTermCodeEnum fromValue(String value) {
      for (PaymentTermCodeEnum b : PaymentTermCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PaymentTermCodeEnum paymentTermCode;

  private String calculationBasis;

  private Float unitPrice;

  private Float quantity;

  public Charge() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Charge(String chargeName, Float currencyAmount, String currencyCode, PaymentTermCodeEnum paymentTermCode, String calculationBasis, Float unitPrice, Float quantity) {
    this.chargeName = chargeName;
    this.currencyAmount = currencyAmount;
    this.currencyCode = currencyCode;
    this.paymentTermCode = paymentTermCode;
    this.calculationBasis = calculationBasis;
    this.unitPrice = unitPrice;
    this.quantity = quantity;
  }

  public Charge chargeName(String chargeName) {
    this.chargeName = chargeName;
    return this;
  }

  /**
   * Free text field describing the charge to apply 
   * @return chargeName
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 50) 
  @Schema(name = "chargeName", example = "Documentation fee - Destination", description = "Free text field describing the charge to apply ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("chargeName")
  public String getChargeName() {
    return chargeName;
  }

  public void setChargeName(String chargeName) {
    this.chargeName = chargeName;
  }

  public Charge currencyAmount(Float currencyAmount) {
    this.currencyAmount = currencyAmount;
    return this;
  }

  /**
   * The monetary value of all freight and other service charges for a transport document, with a maximum of 2-digit decimals. 
   * minimum: 0
   * @return currencyAmount
   */
  @NotNull @DecimalMin("0") 
  @Schema(name = "currencyAmount", example = "1012.12", description = "The monetary value of all freight and other service charges for a transport document, with a maximum of 2-digit decimals. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currencyAmount")
  public Float getCurrencyAmount() {
    return currencyAmount;
  }

  public void setCurrencyAmount(Float currencyAmount) {
    this.currencyAmount = currencyAmount;
  }

  public Charge currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency for the charge, using a 3-character code ([ISO 4217](https://www.iso.org/iso-4217-currency-codes.html)). 
   * @return currencyCode
   */
  @NotNull @Pattern(regexp = "^[A-Z]{3}$") @Size(min = 3, max = 3) 
  @Schema(name = "currencyCode", example = "DKK", description = "The currency for the charge, using a 3-character code ([ISO 4217](https://www.iso.org/iso-4217-currency-codes.html)). ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Charge paymentTermCode(PaymentTermCodeEnum paymentTermCode) {
    this.paymentTermCode = paymentTermCode;
    return this;
  }

  /**
   * An indicator of whether a charge is prepaid (PRE) or collect (COL). When prepaid, the charge is the responsibility of the shipper or the Invoice payer on behalf of the shipper (if provided). When collect, the charge is the responsibility of the consignee or the Invoice payer on behalf of the consignee (if provided).  - `PRE` (Prepaid) - `COL` (Collect) 
   * @return paymentTermCode
   */
  @NotNull 
  @Schema(name = "paymentTermCode", example = "PRE", description = "An indicator of whether a charge is prepaid (PRE) or collect (COL). When prepaid, the charge is the responsibility of the shipper or the Invoice payer on behalf of the shipper (if provided). When collect, the charge is the responsibility of the consignee or the Invoice payer on behalf of the consignee (if provided).  - `PRE` (Prepaid) - `COL` (Collect) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paymentTermCode")
  public PaymentTermCodeEnum getPaymentTermCode() {
    return paymentTermCode;
  }

  public void setPaymentTermCode(PaymentTermCodeEnum paymentTermCode) {
    this.paymentTermCode = paymentTermCode;
  }

  public Charge calculationBasis(String calculationBasis) {
    this.calculationBasis = calculationBasis;
    return this;
  }

  /**
   * The code specifying the measure unit used for the corresponding unit price for this cost, such as per day, per ton, per square metre. 
   * @return calculationBasis
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 50) 
  @Schema(name = "calculationBasis", example = "Per day", description = "The code specifying the measure unit used for the corresponding unit price for this cost, such as per day, per ton, per square metre. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("calculationBasis")
  public String getCalculationBasis() {
    return calculationBasis;
  }

  public void setCalculationBasis(String calculationBasis) {
    this.calculationBasis = calculationBasis;
  }

  public Charge unitPrice(Float unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * The unit price of this charge item in the currency of the charge. 
   * minimum: 0
   * @return unitPrice
   */
  @NotNull @DecimalMin("0") 
  @Schema(name = "unitPrice", example = "3456.6", description = "The unit price of this charge item in the currency of the charge. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("unitPrice")
  public Float getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Float unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Charge quantity(Float quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The amount of unit for this charge item. 
   * minimum: 0
   * @return quantity
   */
  @NotNull @DecimalMin("0") 
  @Schema(name = "quantity", example = "34.4", description = "The amount of unit for this charge item. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quantity")
  public Float getQuantity() {
    return quantity;
  }

  public void setQuantity(Float quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Charge charge = (Charge) o;
    return Objects.equals(this.chargeName, charge.chargeName) &&
        Objects.equals(this.currencyAmount, charge.currencyAmount) &&
        Objects.equals(this.currencyCode, charge.currencyCode) &&
        Objects.equals(this.paymentTermCode, charge.paymentTermCode) &&
        Objects.equals(this.calculationBasis, charge.calculationBasis) &&
        Objects.equals(this.unitPrice, charge.unitPrice) &&
        Objects.equals(this.quantity, charge.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeName, currencyAmount, currencyCode, paymentTermCode, calculationBasis, unitPrice, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    sb.append("    chargeName: ").append(toIndentedString(chargeName)).append("\n");
    sb.append("    currencyAmount: ").append(toIndentedString(currencyAmount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    paymentTermCode: ").append(toIndentedString(paymentTermCode)).append("\n");
    sb.append("    calculationBasis: ").append(toIndentedString(calculationBasis)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

