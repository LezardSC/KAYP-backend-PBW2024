package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.IdentifyingCode;
import com.baeldung.openapi.model.PartyAddress;
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
 * The seller is the last known entity by whom the goods are sold or agreed to be sold to the buyer. If the goods are to be imported otherwise than in pursuance of a purchase, the details of the owner of the goods shall be provided. 
 */

@Schema(name = "Seller", description = "The seller is the last known entity by whom the goods are sold or agreed to be sold to the buyer. If the goods are to be imported otherwise than in pursuance of a purchase, the details of the owner of the goods shall be provided. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class Seller {

  private String partyName;

  private String typeOfPerson;

  private PartyAddress address;

  @Valid
  private List<@Valid IdentifyingCode> identifyingCodes = new ArrayList<>();

  @Valid
  private List<@Valid TaxLegalReference> taxLegalReferences = new ArrayList<>();

  public Seller() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Seller(String partyName) {
    this.partyName = partyName;
  }

  public Seller partyName(String partyName) {
    this.partyName = partyName;
    return this;
  }

  /**
   * Name of the party. 
   * @return partyName
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 70) 
  @Schema(name = "partyName", example = "IKEA Denmark", description = "Name of the party. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("partyName")
  public String getPartyName() {
    return partyName;
  }

  public void setPartyName(String partyName) {
    this.partyName = partyName;
  }

  public Seller typeOfPerson(String typeOfPerson) {
    this.typeOfPerson = typeOfPerson;
    return this;
  }

  /**
   * Can be one of the following values as per the Union Customs Code art. 5(4): - `NATURAL_PERSON` (A person that is an individual living human being) - `LEGAL_PERSON` (person (including a human being and public or private organizations) that can perform legal actions, such as own a property, sue and be sued) - `ASSOCIATION_OF_PERSONS` (Not a legal person, but recognised under Union or National law as having the capacity to perform legal acts) 
   * @return typeOfPerson
   */
  @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 50) 
  @Schema(name = "typeOfPerson", example = "NATURAL_PERSON", description = "Can be one of the following values as per the Union Customs Code art. 5(4): - `NATURAL_PERSON` (A person that is an individual living human being) - `LEGAL_PERSON` (person (including a human being and public or private organizations) that can perform legal actions, such as own a property, sue and be sued) - `ASSOCIATION_OF_PERSONS` (Not a legal person, but recognised under Union or National law as having the capacity to perform legal acts) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("typeOfPerson")
  public String getTypeOfPerson() {
    return typeOfPerson;
  }

  public void setTypeOfPerson(String typeOfPerson) {
    this.typeOfPerson = typeOfPerson;
  }

  public Seller address(PartyAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public PartyAddress getAddress() {
    return address;
  }

  public void setAddress(PartyAddress address) {
    this.address = address;
  }

  public Seller identifyingCodes(List<@Valid IdentifyingCode> identifyingCodes) {
    this.identifyingCodes = identifyingCodes;
    return this;
  }

  public Seller addIdentifyingCodesItem(IdentifyingCode identifyingCodesItem) {
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

  public Seller taxLegalReferences(List<@Valid TaxLegalReference> taxLegalReferences) {
    this.taxLegalReferences = taxLegalReferences;
    return this;
  }

  public Seller addTaxLegalReferencesItem(TaxLegalReference taxLegalReferencesItem) {
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
    Seller seller = (Seller) o;
    return Objects.equals(this.partyName, seller.partyName) &&
        Objects.equals(this.typeOfPerson, seller.typeOfPerson) &&
        Objects.equals(this.address, seller.address) &&
        Objects.equals(this.identifyingCodes, seller.identifyingCodes) &&
        Objects.equals(this.taxLegalReferences, seller.taxLegalReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyName, typeOfPerson, address, identifyingCodes, taxLegalReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Seller {\n");
    sb.append("    partyName: ").append(toIndentedString(partyName)).append("\n");
    sb.append("    typeOfPerson: ").append(toIndentedString(typeOfPerson)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

