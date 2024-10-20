package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.Party;
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
 * A list of document parties that can be optionally provided in the &#x60;Shipping Instructions&#x60; and &#x60;Transport Document&#x60;. 
 */

@Schema(name = "OtherDocumentParty", description = "A list of document parties that can be optionally provided in the `Shipping Instructions` and `Transport Document`. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class OtherDocumentParty {

  private Party party;

  private String partyFunction;

  public OtherDocumentParty() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OtherDocumentParty(Party party, String partyFunction) {
    this.party = party;
    this.partyFunction = partyFunction;
  }

  public OtherDocumentParty party(Party party) {
    this.party = party;
    return this;
  }

  /**
   * Get party
   * @return party
   */
  @NotNull @Valid 
  @Schema(name = "party", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("party")
  public Party getParty() {
    return party;
  }

  public void setParty(Party party) {
    this.party = party;
  }

  public OtherDocumentParty partyFunction(String partyFunction) {
    this.partyFunction = partyFunction;
    return this;
  }

  /**
   * Specifies the role of the party in a given context. Possible values are:  - `SCO` (Service Contract Owner) - `DDR` (Consignor's freight forwarder) - `DDS` (Consignee's freight forwarder) - `COW` (Invoice payer on behalf of the consignor (shipper)) - `COX` (Invoice payer on behalf of the consignee) - `CSR` (Consolidator) - `MFR` (Manufacturer) - `WHK` (Warehouse Keeper) 
   * @return partyFunction
   */
  @NotNull @Size(max = 3) 
  @Schema(name = "partyFunction", example = "DDS", description = "Specifies the role of the party in a given context. Possible values are:  - `SCO` (Service Contract Owner) - `DDR` (Consignor's freight forwarder) - `DDS` (Consignee's freight forwarder) - `COW` (Invoice payer on behalf of the consignor (shipper)) - `COX` (Invoice payer on behalf of the consignee) - `CSR` (Consolidator) - `MFR` (Manufacturer) - `WHK` (Warehouse Keeper) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("partyFunction")
  public String getPartyFunction() {
    return partyFunction;
  }

  public void setPartyFunction(String partyFunction) {
    this.partyFunction = partyFunction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherDocumentParty otherDocumentParty = (OtherDocumentParty) o;
    return Objects.equals(this.party, otherDocumentParty.party) &&
        Objects.equals(this.partyFunction, otherDocumentParty.partyFunction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(party, partyFunction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherDocumentParty {\n");
    sb.append("    party: ").append(toIndentedString(party)).append("\n");
    sb.append("    partyFunction: ").append(toIndentedString(partyFunction)).append("\n");
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

