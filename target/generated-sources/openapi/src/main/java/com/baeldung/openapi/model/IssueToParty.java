package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.IdentifyingCode;
import com.baeldung.openapi.model.TaxLegalReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * The party to whom the electronic Bill of Lading (eBL) must be issued.  **Condition:** Mandatory for eBL (Is Electronic &#x3D; TRUE). 
 */

@Schema(name = "IssueToParty", description = "The party to whom the electronic Bill of Lading (eBL) must be issued.  **Condition:** Mandatory for eBL (Is Electronic = TRUE). ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class IssueToParty {

  private String partyName;

  private String sendToPlatform;

  @Valid
  private List<@Valid IdentifyingCode> identifyingCodes = new ArrayList<>();

  @Valid
  private List<@Valid TaxLegalReference> taxLegalReferences = new ArrayList<>();

  public IssueToParty() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueToParty(String partyName, String sendToPlatform) {
    this.partyName = partyName;
    this.sendToPlatform = sendToPlatform;
  }

  public IssueToParty partyName(String partyName) {
    this.partyName = partyName;
    return this;
  }

  /**
   * Name of the party. 
   * @return partyName
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 70) 
  @Schema(name = "partyName", example = "Globeteam", description = "Name of the party. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("partyName")
  public String getPartyName() {
    return partyName;
  }

  public void setPartyName(String partyName) {
    this.partyName = partyName;
  }

  public IssueToParty sendToPlatform(String sendToPlatform) {
    this.sendToPlatform = sendToPlatform;
    return this;
  }

  /**
   * The EBL platform of the transaction party.  The value **MUST** be one of: - `WAVE` (Wave) - `CARX` (CargoX) - `ESSD` (EssDOCS) - `IDT` (ICE Digital Trade) - `BOLE` (Bolero) - `EDOX` (EdoxOnline) - `IQAX` (IQAX) - `SECR` (Secro) - `TRGO` (TradeGO) - `ETEU` (eTEU) - `TRAC` (TRACE Original) - `BRIT` (BRITC eBL) 
   * @return sendToPlatform
   */
  @NotNull @Pattern(regexp = "^\\S+$") @Size(max = 4) 
  @Schema(name = "sendToPlatform", example = "BOLE", description = "The EBL platform of the transaction party.  The value **MUST** be one of: - `WAVE` (Wave) - `CARX` (CargoX) - `ESSD` (EssDOCS) - `IDT` (ICE Digital Trade) - `BOLE` (Bolero) - `EDOX` (EdoxOnline) - `IQAX` (IQAX) - `SECR` (Secro) - `TRGO` (TradeGO) - `ETEU` (eTEU) - `TRAC` (TRACE Original) - `BRIT` (BRITC eBL) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sendToPlatform")
  public String getSendToPlatform() {
    return sendToPlatform;
  }

  public void setSendToPlatform(String sendToPlatform) {
    this.sendToPlatform = sendToPlatform;
  }

  public IssueToParty identifyingCodes(List<@Valid IdentifyingCode> identifyingCodes) {
    this.identifyingCodes = identifyingCodes;
    return this;
  }

  public IssueToParty addIdentifyingCodesItem(IdentifyingCode identifyingCodesItem) {
    if (this.identifyingCodes == null) {
      this.identifyingCodes = new ArrayList<>();
    }
    this.identifyingCodes.add(identifyingCodesItem);
    return this;
  }

  /**
   * Get identifyingCodes
   * @return identifyingCodes
   */
  @Valid 
  @Schema(name = "identifyingCodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identifyingCodes")
  public List<@Valid IdentifyingCode> getIdentifyingCodes() {
    return identifyingCodes;
  }

  public void setIdentifyingCodes(List<@Valid IdentifyingCode> identifyingCodes) {
    this.identifyingCodes = identifyingCodes;
  }

  public IssueToParty taxLegalReferences(List<@Valid TaxLegalReference> taxLegalReferences) {
    this.taxLegalReferences = taxLegalReferences;
    return this;
  }

  public IssueToParty addTaxLegalReferencesItem(TaxLegalReference taxLegalReferencesItem) {
    if (this.taxLegalReferences == null) {
      this.taxLegalReferences = new ArrayList<>();
    }
    this.taxLegalReferences.add(taxLegalReferencesItem);
    return this;
  }

  /**
   * A list of `Tax References` for a `Party` 
   * @return taxLegalReferences
   */
  @Valid 
  @Schema(name = "taxLegalReferences", description = "A list of `Tax References` for a `Party` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxLegalReferences")
  public List<@Valid TaxLegalReference> getTaxLegalReferences() {
    return taxLegalReferences;
  }

  public void setTaxLegalReferences(List<@Valid TaxLegalReference> taxLegalReferences) {
    this.taxLegalReferences = taxLegalReferences;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueToParty issueToParty = (IssueToParty) o;
    return Objects.equals(this.partyName, issueToParty.partyName) &&
        Objects.equals(this.sendToPlatform, issueToParty.sendToPlatform) &&
        Objects.equals(this.identifyingCodes, issueToParty.identifyingCodes) &&
        Objects.equals(this.taxLegalReferences, issueToParty.taxLegalReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyName, sendToPlatform, identifyingCodes, taxLegalReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueToParty {\n");
    sb.append("    partyName: ").append(toIndentedString(partyName)).append("\n");
    sb.append("    sendToPlatform: ").append(toIndentedString(sendToPlatform)).append("\n");
    sb.append("    identifyingCodes: ").append(toIndentedString(identifyingCodes)).append("\n");
    sb.append("    taxLegalReferences: ").append(toIndentedString(taxLegalReferences)).append("\n");
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

