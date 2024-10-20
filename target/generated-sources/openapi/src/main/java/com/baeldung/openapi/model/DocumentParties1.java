package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.CarriersAgentAtDestination;
import com.baeldung.openapi.model.Consignee;
import com.baeldung.openapi.model.Endorsee;
import com.baeldung.openapi.model.IssuingParty;
import com.baeldung.openapi.model.NotifyParty;
import com.baeldung.openapi.model.OtherDocumentParty;
import com.baeldung.openapi.model.Shipper;
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
 * All &#x60;Parties&#x60; with associated roles. 
 */

@Schema(name = "Document_Parties_1", description = "All `Parties` with associated roles. ")
@JsonTypeName("Document_Parties_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class DocumentParties1 {

  private Shipper shipper;

  private Consignee consignee;

  private Endorsee endorsee;

  private IssuingParty issuingParty;

  private CarriersAgentAtDestination carriersAgentAtDestination;

  @Valid
  private List<@Valid NotifyParty> notifyParties = new ArrayList<>();

  @Valid
  private List<@Valid OtherDocumentParty> other = new ArrayList<>();

  public DocumentParties1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DocumentParties1(Shipper shipper, IssuingParty issuingParty) {
    this.shipper = shipper;
    this.issuingParty = issuingParty;
  }

  public DocumentParties1 shipper(Shipper shipper) {
    this.shipper = shipper;
    return this;
  }

  /**
   * Get shipper
   * @return shipper
   */
  @NotNull @Valid 
  @Schema(name = "shipper", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("shipper")
  public Shipper getShipper() {
    return shipper;
  }

  public void setShipper(Shipper shipper) {
    this.shipper = shipper;
  }

  public DocumentParties1 consignee(Consignee consignee) {
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
  public Consignee getConsignee() {
    return consignee;
  }

  public void setConsignee(Consignee consignee) {
    this.consignee = consignee;
  }

  public DocumentParties1 endorsee(Endorsee endorsee) {
    this.endorsee = endorsee;
    return this;
  }

  /**
   * Get endorsee
   * @return endorsee
   */
  @Valid 
  @Schema(name = "endorsee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endorsee")
  public Endorsee getEndorsee() {
    return endorsee;
  }

  public void setEndorsee(Endorsee endorsee) {
    this.endorsee = endorsee;
  }

  public DocumentParties1 issuingParty(IssuingParty issuingParty) {
    this.issuingParty = issuingParty;
    return this;
  }

  /**
   * Get issuingParty
   * @return issuingParty
   */
  @NotNull @Valid 
  @Schema(name = "issuingParty", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issuingParty")
  public IssuingParty getIssuingParty() {
    return issuingParty;
  }

  public void setIssuingParty(IssuingParty issuingParty) {
    this.issuingParty = issuingParty;
  }

  public DocumentParties1 carriersAgentAtDestination(CarriersAgentAtDestination carriersAgentAtDestination) {
    this.carriersAgentAtDestination = carriersAgentAtDestination;
    return this;
  }

  /**
   * Get carriersAgentAtDestination
   * @return carriersAgentAtDestination
   */
  @Valid 
  @Schema(name = "carriersAgentAtDestination", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carriersAgentAtDestination")
  public CarriersAgentAtDestination getCarriersAgentAtDestination() {
    return carriersAgentAtDestination;
  }

  public void setCarriersAgentAtDestination(CarriersAgentAtDestination carriersAgentAtDestination) {
    this.carriersAgentAtDestination = carriersAgentAtDestination;
  }

  public DocumentParties1 notifyParties(List<@Valid NotifyParty> notifyParties) {
    this.notifyParties = notifyParties;
    return this;
  }

  public DocumentParties1 addNotifyPartiesItem(NotifyParty notifyPartiesItem) {
    if (this.notifyParties == null) {
      this.notifyParties = new ArrayList<>();
    }
    this.notifyParties.add(notifyPartiesItem);
    return this;
  }

  /**
   * List of up to 3 `Notify Parties`. The first item in the list is the **First Notify Party** (`N1`), the second item is the **Second Notify Party** (`N2`) and the last item is the **Other Notify Party** (`NI`).  **Condition:** Mandatory for To Order BLs, `isToOrder=true` 
   * @return notifyParties
   */
  @Valid @Size(max = 3) 
  @Schema(name = "notifyParties", description = "List of up to 3 `Notify Parties`. The first item in the list is the **First Notify Party** (`N1`), the second item is the **Second Notify Party** (`N2`) and the last item is the **Other Notify Party** (`NI`).  **Condition:** Mandatory for To Order BLs, `isToOrder=true` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifyParties")
  public List<@Valid NotifyParty> getNotifyParties() {
    return notifyParties;
  }

  public void setNotifyParties(List<@Valid NotifyParty> notifyParties) {
    this.notifyParties = notifyParties;
  }

  public DocumentParties1 other(List<@Valid OtherDocumentParty> other) {
    this.other = other;
    return this;
  }

  public DocumentParties1 addOtherItem(OtherDocumentParty otherItem) {
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
  public List<@Valid OtherDocumentParty> getOther() {
    return other;
  }

  public void setOther(List<@Valid OtherDocumentParty> other) {
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
    DocumentParties1 documentParties1 = (DocumentParties1) o;
    return Objects.equals(this.shipper, documentParties1.shipper) &&
        Objects.equals(this.consignee, documentParties1.consignee) &&
        Objects.equals(this.endorsee, documentParties1.endorsee) &&
        Objects.equals(this.issuingParty, documentParties1.issuingParty) &&
        Objects.equals(this.carriersAgentAtDestination, documentParties1.carriersAgentAtDestination) &&
        Objects.equals(this.notifyParties, documentParties1.notifyParties) &&
        Objects.equals(this.other, documentParties1.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipper, consignee, endorsee, issuingParty, carriersAgentAtDestination, notifyParties, other);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentParties1 {\n");
    sb.append("    shipper: ").append(toIndentedString(shipper)).append("\n");
    sb.append("    consignee: ").append(toIndentedString(consignee)).append("\n");
    sb.append("    endorsee: ").append(toIndentedString(endorsee)).append("\n");
    sb.append("    issuingParty: ").append(toIndentedString(issuingParty)).append("\n");
    sb.append("    carriersAgentAtDestination: ").append(toIndentedString(carriersAgentAtDestination)).append("\n");
    sb.append("    notifyParties: ").append(toIndentedString(notifyParties)).append("\n");
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

