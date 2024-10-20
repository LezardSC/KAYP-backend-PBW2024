package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.IdentifyingCode;
import com.baeldung.openapi.model.PartyAddress;
import com.baeldung.openapi.model.PartyContactDetail;
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
 * The party to which goods are consigned in the &#x60;Master Bill of Lading&#x60;.  **Condition:** Mandatory for non-negotiable BL (&#x60;isToOrder&#x3D;false&#x60;) 
 */

@Schema(name = "Consignee", description = "The party to which goods are consigned in the `Master Bill of Lading`.  **Condition:** Mandatory for non-negotiable BL (`isToOrder=false`) ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class Consignee {

  private String partyName;

  private String typeOfPerson;

  private PartyAddress address;

  @Valid
  private List<@Size(max = 35)String> displayedAddress = new ArrayList<>();

  @Valid
  private List<@Valid IdentifyingCode> identifyingCodes = new ArrayList<>();

  @Valid
  private List<@Valid TaxLegalReference> taxLegalReferences = new ArrayList<>();

  @Valid
  private List<@Valid PartyContactDetail> partyContactDetails = new ArrayList<>();

  private String reference;

  @Valid
  private List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 35)String> purchaseOrderReferences = new ArrayList<>();

  public Consignee() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Consignee(String partyName) {
    this.partyName = partyName;
  }

  public Consignee partyName(String partyName) {
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

  public Consignee typeOfPerson(String typeOfPerson) {
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

  public Consignee address(PartyAddress address) {
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

  public Consignee displayedAddress(List<@Size(max = 35)String> displayedAddress) {
    this.displayedAddress = displayedAddress;
    return this;
  }

  public Consignee addDisplayedAddressItem(String displayedAddressItem) {
    if (this.displayedAddress == null) {
      this.displayedAddress = new ArrayList<>();
    }
    this.displayedAddress.add(displayedAddressItem);
    return this;
  }

  /**
   * The address of the party to be displayed on the `Transport Document`. The displayed address may be used to match the address provided in the `Letter of Credit`.  **Conditions:** if provided   - the displayed address must be included in the Transport Document.   - for physical BL (`isElectronic=false`), it is only allowed to provide max 2 lines of 35 characters   - for electronic BL (`isElectronic=true`), the limit is 6 lines of 35 characters 
   * @return displayedAddress
   */
  @Size(max = 6) 
  @Schema(name = "displayedAddress", description = "The address of the party to be displayed on the `Transport Document`. The displayed address may be used to match the address provided in the `Letter of Credit`.  **Conditions:** if provided   - the displayed address must be included in the Transport Document.   - for physical BL (`isElectronic=false`), it is only allowed to provide max 2 lines of 35 characters   - for electronic BL (`isElectronic=true`), the limit is 6 lines of 35 characters ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayedAddress")
  public List<@Size(max = 35)String> getDisplayedAddress() {
    return displayedAddress;
  }

  public void setDisplayedAddress(List<@Size(max = 35)String> displayedAddress) {
    this.displayedAddress = displayedAddress;
  }

  public Consignee identifyingCodes(List<@Valid IdentifyingCode> identifyingCodes) {
    this.identifyingCodes = identifyingCodes;
    return this;
  }

  public Consignee addIdentifyingCodesItem(IdentifyingCode identifyingCodesItem) {
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

  public Consignee taxLegalReferences(List<@Valid TaxLegalReference> taxLegalReferences) {
    this.taxLegalReferences = taxLegalReferences;
    return this;
  }

  public Consignee addTaxLegalReferencesItem(TaxLegalReference taxLegalReferencesItem) {
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

  public Consignee partyContactDetails(List<@Valid PartyContactDetail> partyContactDetails) {
    this.partyContactDetails = partyContactDetails;
    return this;
  }

  public Consignee addPartyContactDetailsItem(PartyContactDetail partyContactDetailsItem) {
    if (this.partyContactDetails == null) {
      this.partyContactDetails = new ArrayList<>();
    }
    this.partyContactDetails.add(partyContactDetailsItem);
    return this;
  }

  /**
   * A list of contact details 
   * @return partyContactDetails
   */
  @Valid 
  @Schema(name = "partyContactDetails", description = "A list of contact details ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partyContactDetails")
  public List<@Valid PartyContactDetail> getPartyContactDetails() {
    return partyContactDetails;
  }

  public void setPartyContactDetails(List<@Valid PartyContactDetail> partyContactDetails) {
    this.partyContactDetails = partyContactDetails;
  }

  public Consignee reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * A reference linked to the `Consignee`. 
   * @return reference
   */
  @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 35) 
  @Schema(name = "reference", example = "HHL007", description = "A reference linked to the `Consignee`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Consignee purchaseOrderReferences(List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 35)String> purchaseOrderReferences) {
    this.purchaseOrderReferences = purchaseOrderReferences;
    return this;
  }

  public Consignee addPurchaseOrderReferencesItem(String purchaseOrderReferencesItem) {
    if (this.purchaseOrderReferences == null) {
      this.purchaseOrderReferences = new ArrayList<>();
    }
    this.purchaseOrderReferences.add(purchaseOrderReferencesItem);
    return this;
  }

  /**
   * A list of `Purchase Order Reference`s linked to the `Consignee`. 
   * @return purchaseOrderReferences
   */
  
  @Schema(name = "purchaseOrderReferences", description = "A list of `Purchase Order Reference`s linked to the `Consignee`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchaseOrderReferences")
  public List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 35)String> getPurchaseOrderReferences() {
    return purchaseOrderReferences;
  }

  public void setPurchaseOrderReferences(List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 35)String> purchaseOrderReferences) {
    this.purchaseOrderReferences = purchaseOrderReferences;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consignee consignee = (Consignee) o;
    return Objects.equals(this.partyName, consignee.partyName) &&
        Objects.equals(this.typeOfPerson, consignee.typeOfPerson) &&
        Objects.equals(this.address, consignee.address) &&
        Objects.equals(this.displayedAddress, consignee.displayedAddress) &&
        Objects.equals(this.identifyingCodes, consignee.identifyingCodes) &&
        Objects.equals(this.taxLegalReferences, consignee.taxLegalReferences) &&
        Objects.equals(this.partyContactDetails, consignee.partyContactDetails) &&
        Objects.equals(this.reference, consignee.reference) &&
        Objects.equals(this.purchaseOrderReferences, consignee.purchaseOrderReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyName, typeOfPerson, address, displayedAddress, identifyingCodes, taxLegalReferences, partyContactDetails, reference, purchaseOrderReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consignee {\n");
    sb.append("    partyName: ").append(toIndentedString(partyName)).append("\n");
    sb.append("    typeOfPerson: ").append(toIndentedString(typeOfPerson)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    displayedAddress: ").append(toIndentedString(displayedAddress)).append("\n");
    sb.append("    identifyingCodes: ").append(toIndentedString(identifyingCodes)).append("\n");
    sb.append("    taxLegalReferences: ").append(toIndentedString(taxLegalReferences)).append("\n");
    sb.append("    partyContactDetails: ").append(toIndentedString(partyContactDetails)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    purchaseOrderReferences: ").append(toIndentedString(purchaseOrderReferences)).append("\n");
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

