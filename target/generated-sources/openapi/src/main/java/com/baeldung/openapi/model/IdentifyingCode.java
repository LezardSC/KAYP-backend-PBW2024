package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
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
 * IdentifyingCode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class IdentifyingCode {

  private String codeListProvider;

  private String partyCode;

  private String codeListName;

  public IdentifyingCode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IdentifyingCode(String codeListProvider, String partyCode) {
    this.codeListProvider = codeListProvider;
    this.partyCode = partyCode;
  }

  public IdentifyingCode codeListProvider(String codeListProvider) {
    this.codeListProvider = codeListProvider;
    return this;
  }

  /**
   * A list of codes identifying a party. Possible values are: - `WAVE` (Wave) - `CARX` (CargoX) - `ESSD` (EssDOCS) - `IDT` (ICE Digital Trade) - `BOLE` (Bolero) - `EDOX` (EdoxOnline) - `IQAX` (IQAX) - `SECR` (Secro) - `TRGO` (TradeGO) - `ETEU` (eTEU) - `TRAC` (TRACE Original) - `BRIT` (BRITC eBL) - `GSBN` (Global Shipping Business Network) - `WISE` (WiseTech) - `GLEIF` (Global Legal Entity Identifier Foundation) - `W3C` (World Wide Web Consortium) - `DNB` (Dun and Bradstreet) - `FMC` (Federal Maritime Commission) - `DCSA` (Digital Container Shipping Association) - `EU` (European Union Member State Customs Authority) - `ZZZ` (Mutually defined) 
   * @return codeListProvider
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "codeListProvider", example = "W3C", description = "A list of codes identifying a party. Possible values are: - `WAVE` (Wave) - `CARX` (CargoX) - `ESSD` (EssDOCS) - `IDT` (ICE Digital Trade) - `BOLE` (Bolero) - `EDOX` (EdoxOnline) - `IQAX` (IQAX) - `SECR` (Secro) - `TRGO` (TradeGO) - `ETEU` (eTEU) - `TRAC` (TRACE Original) - `BRIT` (BRITC eBL) - `GSBN` (Global Shipping Business Network) - `WISE` (WiseTech) - `GLEIF` (Global Legal Entity Identifier Foundation) - `W3C` (World Wide Web Consortium) - `DNB` (Dun and Bradstreet) - `FMC` (Federal Maritime Commission) - `DCSA` (Digital Container Shipping Association) - `EU` (European Union Member State Customs Authority) - `ZZZ` (Mutually defined) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("codeListProvider")
  public String getCodeListProvider() {
    return codeListProvider;
  }

  public void setCodeListProvider(String codeListProvider) {
    this.codeListProvider = codeListProvider;
  }

  public IdentifyingCode partyCode(String partyCode) {
    this.partyCode = partyCode;
    return this;
  }

  /**
   * Code to identify the party as provided by the code list provider 
   * @return partyCode
   */
  @NotNull @Size(max = 150) 
  @Schema(name = "partyCode", example = "MSK", description = "Code to identify the party as provided by the code list provider ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("partyCode")
  public String getPartyCode() {
    return partyCode;
  }

  public void setPartyCode(String partyCode) {
    this.partyCode = partyCode;
  }

  public IdentifyingCode codeListName(String codeListName) {
    this.codeListName = codeListName;
    return this;
  }

  /**
   * The name of the code list, code generation mechanism or code authority for the `partyCode`. Example values could be: - `DID` (Decentralized Identifier) for `codeListProvider` `W3C` - `LEI` (Legal Entity Identifier) for `codeListProvider` `GLEIF` - `DUNS` (Data Universal Numbering System) for `codeListProvider` `DNB` - `EORI` (Economic Operators Registration and Identification) for codeListProvider `EU` 
   * @return codeListName
   */
  @Size(max = 100) 
  @Schema(name = "codeListName", example = "DID", description = "The name of the code list, code generation mechanism or code authority for the `partyCode`. Example values could be: - `DID` (Decentralized Identifier) for `codeListProvider` `W3C` - `LEI` (Legal Entity Identifier) for `codeListProvider` `GLEIF` - `DUNS` (Data Universal Numbering System) for `codeListProvider` `DNB` - `EORI` (Economic Operators Registration and Identification) for codeListProvider `EU` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("codeListName")
  public String getCodeListName() {
    return codeListName;
  }

  public void setCodeListName(String codeListName) {
    this.codeListName = codeListName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentifyingCode identifyingCode = (IdentifyingCode) o;
    return Objects.equals(this.codeListProvider, identifyingCode.codeListProvider) &&
        Objects.equals(this.partyCode, identifyingCode.partyCode) &&
        Objects.equals(this.codeListName, identifyingCode.codeListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeListProvider, partyCode, codeListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentifyingCode {\n");
    sb.append("    codeListProvider: ").append(toIndentedString(codeListProvider)).append("\n");
    sb.append("    partyCode: ").append(toIndentedString(partyCode)).append("\n");
    sb.append("    codeListName: ").append(toIndentedString(codeListName)).append("\n");
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

