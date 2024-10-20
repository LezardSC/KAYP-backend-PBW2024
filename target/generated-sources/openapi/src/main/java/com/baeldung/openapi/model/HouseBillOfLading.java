package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.DocumentParties2;
import com.baeldung.openapi.model.PlaceOfAcceptance;
import com.baeldung.openapi.model.PlaceOfFinalDelivery;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A legal contract between the Ocean Transport Intermediary (OTI), such as a Non-Vessel Operating Common Carrier (NVOCC) or a freight forwarder, and the shipper that acknowledges the receipt of goods and outlines the terms of shipment. 
 */

@Schema(name = "HouseBillOfLading", description = "A legal contract between the Ocean Transport Intermediary (OTI), such as a Non-Vessel Operating Common Carrier (NVOCC) or a freight forwarder, and the shipper that acknowledges the receipt of goods and outlines the terms of shipment. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class HouseBillOfLading {

  private String houseBillOfLadingReference;

  private Boolean isToOrder;

  private PlaceOfAcceptance placeOfAcceptance;

  private PlaceOfFinalDelivery placeOfFinalDelivery;

  private String methodOfPayment;

  private DocumentParties2 documentParties;

  public HouseBillOfLading() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HouseBillOfLading(String houseBillOfLadingReference) {
    this.houseBillOfLadingReference = houseBillOfLadingReference;
  }

  public HouseBillOfLading houseBillOfLadingReference(String houseBillOfLadingReference) {
    this.houseBillOfLadingReference = houseBillOfLadingReference;
    return this;
  }

  /**
   * A unique number allocated by the Ocean Transport Intermediary (OTI) to the `House Bill of Lading`. 
   * @return houseBillOfLadingReference
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 20) 
  @Schema(name = "houseBillOfLadingReference", example = "HBOL001", description = "A unique number allocated by the Ocean Transport Intermediary (OTI) to the `House Bill of Lading`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("houseBillOfLadingReference")
  public String getHouseBillOfLadingReference() {
    return houseBillOfLadingReference;
  }

  public void setHouseBillOfLadingReference(String houseBillOfLadingReference) {
    this.houseBillOfLadingReference = houseBillOfLadingReference;
  }

  public HouseBillOfLading isToOrder(Boolean isToOrder) {
    this.isToOrder = isToOrder;
    return this;
  }

  /**
   * Indicates whether the `House Bill of Lading` (HBL) is issued `to order` or not. If `true`, `Notify party` at `HBL` level is mandatory 
   * @return isToOrder
   */
  
  @Schema(name = "isToOrder", example = "false", description = "Indicates whether the `House Bill of Lading` (HBL) is issued `to order` or not. If `true`, `Notify party` at `HBL` level is mandatory ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isToOrder")
  public Boolean getIsToOrder() {
    return isToOrder;
  }

  public void setIsToOrder(Boolean isToOrder) {
    this.isToOrder = isToOrder;
  }

  public HouseBillOfLading placeOfAcceptance(PlaceOfAcceptance placeOfAcceptance) {
    this.placeOfAcceptance = placeOfAcceptance;
    return this;
  }

  /**
   * Get placeOfAcceptance
   * @return placeOfAcceptance
   */
  @Valid 
  @Schema(name = "placeOfAcceptance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placeOfAcceptance")
  public PlaceOfAcceptance getPlaceOfAcceptance() {
    return placeOfAcceptance;
  }

  public void setPlaceOfAcceptance(PlaceOfAcceptance placeOfAcceptance) {
    this.placeOfAcceptance = placeOfAcceptance;
  }

  public HouseBillOfLading placeOfFinalDelivery(PlaceOfFinalDelivery placeOfFinalDelivery) {
    this.placeOfFinalDelivery = placeOfFinalDelivery;
    return this;
  }

  /**
   * Get placeOfFinalDelivery
   * @return placeOfFinalDelivery
   */
  @Valid 
  @Schema(name = "placeOfFinalDelivery", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placeOfFinalDelivery")
  public PlaceOfFinalDelivery getPlaceOfFinalDelivery() {
    return placeOfFinalDelivery;
  }

  public void setPlaceOfFinalDelivery(PlaceOfFinalDelivery placeOfFinalDelivery) {
    this.placeOfFinalDelivery = placeOfFinalDelivery;
  }

  public HouseBillOfLading methodOfPayment(String methodOfPayment) {
    this.methodOfPayment = methodOfPayment;
    return this;
  }

  /**
   * Method used for the payment of prepaid charges. It can be one of the following values:  - `A` (Cash) - `B` (Credit Card) - `C` (Cheque) - `D` (Other) - `H` (Electronic funds transfer) - `Y` (Account holder with carrier) - `Z` (Not prepaid) 
   * @return methodOfPayment
   */
  @Size(max = 1) 
  @Schema(name = "methodOfPayment", example = "A", description = "Method used for the payment of prepaid charges. It can be one of the following values:  - `A` (Cash) - `B` (Credit Card) - `C` (Cheque) - `D` (Other) - `H` (Electronic funds transfer) - `Y` (Account holder with carrier) - `Z` (Not prepaid) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("methodOfPayment")
  public String getMethodOfPayment() {
    return methodOfPayment;
  }

  public void setMethodOfPayment(String methodOfPayment) {
    this.methodOfPayment = methodOfPayment;
  }

  public HouseBillOfLading documentParties(DocumentParties2 documentParties) {
    this.documentParties = documentParties;
    return this;
  }

  /**
   * Get documentParties
   * @return documentParties
   */
  @Valid 
  @Schema(name = "documentParties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentParties")
  public DocumentParties2 getDocumentParties() {
    return documentParties;
  }

  public void setDocumentParties(DocumentParties2 documentParties) {
    this.documentParties = documentParties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HouseBillOfLading houseBillOfLading = (HouseBillOfLading) o;
    return Objects.equals(this.houseBillOfLadingReference, houseBillOfLading.houseBillOfLadingReference) &&
        Objects.equals(this.isToOrder, houseBillOfLading.isToOrder) &&
        Objects.equals(this.placeOfAcceptance, houseBillOfLading.placeOfAcceptance) &&
        Objects.equals(this.placeOfFinalDelivery, houseBillOfLading.placeOfFinalDelivery) &&
        Objects.equals(this.methodOfPayment, houseBillOfLading.methodOfPayment) &&
        Objects.equals(this.documentParties, houseBillOfLading.documentParties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(houseBillOfLadingReference, isToOrder, placeOfAcceptance, placeOfFinalDelivery, methodOfPayment, documentParties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HouseBillOfLading {\n");
    sb.append("    houseBillOfLadingReference: ").append(toIndentedString(houseBillOfLadingReference)).append("\n");
    sb.append("    isToOrder: ").append(toIndentedString(isToOrder)).append("\n");
    sb.append("    placeOfAcceptance: ").append(toIndentedString(placeOfAcceptance)).append("\n");
    sb.append("    placeOfFinalDelivery: ").append(toIndentedString(placeOfFinalDelivery)).append("\n");
    sb.append("    methodOfPayment: ").append(toIndentedString(methodOfPayment)).append("\n");
    sb.append("    documentParties: ").append(toIndentedString(documentParties)).append("\n");
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

