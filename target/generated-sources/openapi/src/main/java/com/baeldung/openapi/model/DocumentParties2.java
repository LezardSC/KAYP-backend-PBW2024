package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.Buyer;
import com.baeldung.openapi.model.ConsigneeHBL;
import com.baeldung.openapi.model.NotifyPartyHBL;
import com.baeldung.openapi.model.OtherDocumentPartyHBL;
import com.baeldung.openapi.model.Seller;
import com.baeldung.openapi.model.ShipperHBL;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * All &#x60;Parties&#x60; with associated roles for this &#x60;House Bill of Lading&#x60;. 
 */

@Schema(name = "Document_Parties_2", description = "All `Parties` with associated roles for this `House Bill of Lading`. ")
@JsonTypeName("Document_Parties_2")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class DocumentParties2 {

  private ShipperHBL shipper;

  private ConsigneeHBL consignee;

  private NotifyPartyHBL notifyParty;

  private Seller seller;

  private Buyer buyer;

  @Valid
  private List<@Valid OtherDocumentPartyHBL> other = new ArrayList<>();

  public DocumentParties2 shipper(ShipperHBL shipper) {
    this.shipper = shipper;
    return this;
  }

  /**
   * Get shipper
   * @return shipper
   */
  @Valid 
  @Schema(name = "shipper", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipper")
  public ShipperHBL getShipper() {
    return shipper;
  }

  public void setShipper(ShipperHBL shipper) {
    this.shipper = shipper;
  }

  public DocumentParties2 consignee(ConsigneeHBL consignee) {
    this.consignee = consignee;
    return this;
  }

  /**
   * Get consignee
   * @return consignee
   */
  @Valid 
  @Schema(name = "consignee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("consignee")
  public ConsigneeHBL getConsignee() {
    return consignee;
  }

  public void setConsignee(ConsigneeHBL consignee) {
    this.consignee = consignee;
  }

  public DocumentParties2 notifyParty(NotifyPartyHBL notifyParty) {
    this.notifyParty = notifyParty;
    return this;
  }

  /**
   * Get notifyParty
   * @return notifyParty
   */
  @Valid 
  @Schema(name = "notifyParty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifyParty")
  public NotifyPartyHBL getNotifyParty() {
    return notifyParty;
  }

  public void setNotifyParty(NotifyPartyHBL notifyParty) {
    this.notifyParty = notifyParty;
  }

  public DocumentParties2 seller(Seller seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Get seller
   * @return seller
   */
  @Valid 
  @Schema(name = "seller", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seller")
  public Seller getSeller() {
    return seller;
  }

  public void setSeller(Seller seller) {
    this.seller = seller;
  }

  public DocumentParties2 buyer(Buyer buyer) {
    this.buyer = buyer;
    return this;
  }

  /**
   * Get buyer
   * @return buyer
   */
  @Valid 
  @Schema(name = "buyer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buyer")
  public Buyer getBuyer() {
    return buyer;
  }

  public void setBuyer(Buyer buyer) {
    this.buyer = buyer;
  }

  public DocumentParties2 other(List<@Valid OtherDocumentPartyHBL> other) {
    this.other = other;
    return this;
  }

  public DocumentParties2 addOtherItem(OtherDocumentPartyHBL otherItem) {
    if (this.other == null) {
      this.other = new ArrayList<>();
    }
    this.other.add(otherItem);
    return this;
  }

  /**
   * A list of document parties that can be optionally provided in the `Shipping Instructions` and `Transport Document`.
   * @return other
   */
  @Valid 
  @Schema(name = "other", description = "A list of document parties that can be optionally provided in the `Shipping Instructions` and `Transport Document`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("other")
  public List<@Valid OtherDocumentPartyHBL> getOther() {
    return other;
  }

  public void setOther(List<@Valid OtherDocumentPartyHBL> other) {
    this.other = other;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentParties2 documentParties2 = (DocumentParties2) o;
    return Objects.equals(this.shipper, documentParties2.shipper) &&
        Objects.equals(this.consignee, documentParties2.consignee) &&
        Objects.equals(this.notifyParty, documentParties2.notifyParty) &&
        Objects.equals(this.seller, documentParties2.seller) &&
        Objects.equals(this.buyer, documentParties2.buyer) &&
        Objects.equals(this.other, documentParties2.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipper, consignee, notifyParty, seller, buyer, other);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentParties2 {\n");
    sb.append("    shipper: ").append(toIndentedString(shipper)).append("\n");
    sb.append("    consignee: ").append(toIndentedString(consignee)).append("\n");
    sb.append("    notifyParty: ").append(toIndentedString(notifyParty)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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

