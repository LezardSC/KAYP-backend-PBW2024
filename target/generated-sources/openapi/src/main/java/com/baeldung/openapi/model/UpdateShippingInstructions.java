package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.AdvanceManifestFiling;
import com.baeldung.openapi.model.ConsignmentItemShipper;
import com.baeldung.openapi.model.CustomsReference;
import com.baeldung.openapi.model.DestinationChargesPaymentTerm;
import com.baeldung.openapi.model.DocumentParties;
import com.baeldung.openapi.model.HouseBillOfLading;
import com.baeldung.openapi.model.InvoicePayableAt;
import com.baeldung.openapi.model.OriginChargesPaymentTerm;
import com.baeldung.openapi.model.PartyContactDetail;
import com.baeldung.openapi.model.PlaceOfIssue;
import com.baeldung.openapi.model.Reference;
import com.baeldung.openapi.model.UtilizedTransportEquipmentShipper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * The &#x60;Shipping Instructions&#x60; to update. 
 */

@Schema(name = "UpdateShippingInstructions", description = "The `Shipping Instructions` to update. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class UpdateShippingInstructions {

  private String shippingInstructionsReference;

  /**
   * Specifies the type of the transport document - `BOL` (Bill of Lading) - `SWB` (Sea Waybill) 
   */
  public enum TransportDocumentTypeCodeEnum {
    BOL("BOL"),
    
    SWB("SWB");

    private String value;

    TransportDocumentTypeCodeEnum(String value) {
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
    public static TransportDocumentTypeCodeEnum fromValue(String value) {
      for (TransportDocumentTypeCodeEnum b : TransportDocumentTypeCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TransportDocumentTypeCodeEnum transportDocumentTypeCode;

  private Boolean isShippedOnBoardType;

  /**
   * An indicator of whether freight and ancillary fees for the main transport are prepaid (`PRE`) or collect (`COL`). When prepaid the charges are the responsibility of the shipper or the Invoice payer on behalf of the shipper (if provided). When collect, the charges are the responsibility of the consignee or the Invoice payer on behalf of the consignee (if provided).  - `PRE` (Prepaid) - `COL` (Collect) 
   */
  public enum FreightPaymentTermCodeEnum {
    PRE("PRE"),
    
    COL("COL");

    private String value;

    FreightPaymentTermCodeEnum(String value) {
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
    public static FreightPaymentTermCodeEnum fromValue(String value) {
      for (FreightPaymentTermCodeEnum b : FreightPaymentTermCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FreightPaymentTermCodeEnum freightPaymentTermCode;

  private OriginChargesPaymentTerm originChargesPaymentTerm;

  private DestinationChargesPaymentTerm destinationChargesPaymentTerm;

  private String methodOfPayment;

  private Boolean isElectronic;

  private Boolean isToOrder;

  private Integer numberOfCopiesWithCharges;

  private Integer numberOfCopiesWithoutCharges;

  private Integer numberOfOriginalsWithCharges;

  private Integer numberOfOriginalsWithoutCharges;

  @Valid
  private List<@Size(max = 35)String> displayedNameForPlaceOfReceipt = new ArrayList<>();

  @Valid
  private List<@Size(max = 35)String> displayedNameForPortOfLoad = new ArrayList<>();

  @Valid
  private List<@Size(max = 35)String> displayedNameForPortOfDischarge = new ArrayList<>();

  @Valid
  private List<@Size(max = 35)String> displayedNameForPlaceOfDelivery = new ArrayList<>();

  private PlaceOfIssue placeOfIssue;

  private InvoicePayableAt invoicePayableAt;

  @Valid
  private List<@Valid PartyContactDetail> partyContactDetails = new ArrayList<>();

  private Boolean isCarriersAgentAtDestinationRequired;

  private DocumentParties documentParties;

  @Valid
  private List<@Pattern(regexp = "^[A-Z]{2}$")@Size(min = 2, max = 2)String> routingOfConsignmentCountries = new ArrayList<>();

  @Valid
  private List<@Valid ConsignmentItemShipper> consignmentItems = new ArrayList<>();

  @Valid
  private List<@Valid UtilizedTransportEquipmentShipper> utilizedTransportEquipments = new ArrayList<>();

  @Valid
  private List<@Valid Reference> references = new ArrayList<>();

  @Valid
  private List<@Valid CustomsReference> customsReferences = new ArrayList<>();

  @Valid
  private List<@Valid AdvanceManifestFiling> advanceManifestFilings = new ArrayList<>();

  private Boolean isHBLIssued;

  @Valid
  private List<@Valid HouseBillOfLading> houseBillOfLadings = new ArrayList<>();

  @Valid
  private List<@Size(max = 100)String> requestedCarrierCertificates = new ArrayList<>();

  @Valid
  private List<@Size(max = 100)String> requestedCarrierClauses = new ArrayList<>();

  public UpdateShippingInstructions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateShippingInstructions(String shippingInstructionsReference, TransportDocumentTypeCodeEnum transportDocumentTypeCode, Boolean isShippedOnBoardType, FreightPaymentTermCodeEnum freightPaymentTermCode, Boolean isElectronic, Boolean isToOrder, List<@Valid PartyContactDetail> partyContactDetails, DocumentParties documentParties, List<@Valid ConsignmentItemShipper> consignmentItems, List<@Valid UtilizedTransportEquipmentShipper> utilizedTransportEquipments) {
    this.shippingInstructionsReference = shippingInstructionsReference;
    this.transportDocumentTypeCode = transportDocumentTypeCode;
    this.isShippedOnBoardType = isShippedOnBoardType;
    this.freightPaymentTermCode = freightPaymentTermCode;
    this.isElectronic = isElectronic;
    this.isToOrder = isToOrder;
    this.partyContactDetails = partyContactDetails;
    this.documentParties = documentParties;
    this.consignmentItems = consignmentItems;
    this.utilizedTransportEquipments = utilizedTransportEquipments;
  }

  public UpdateShippingInstructions shippingInstructionsReference(String shippingInstructionsReference) {
    this.shippingInstructionsReference = shippingInstructionsReference;
    return this;
  }

  /**
   * The identifier for a `Shipping Instructions` provided by the carrier for system purposes. 
   * @return shippingInstructionsReference
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 100) 
  @Schema(name = "shippingInstructionsReference", example = "e0559d83-00e2-438e-afd9-fdd610c1a008", description = "The identifier for a `Shipping Instructions` provided by the carrier for system purposes. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("shippingInstructionsReference")
  public String getShippingInstructionsReference() {
    return shippingInstructionsReference;
  }

  public void setShippingInstructionsReference(String shippingInstructionsReference) {
    this.shippingInstructionsReference = shippingInstructionsReference;
  }

  public UpdateShippingInstructions transportDocumentTypeCode(TransportDocumentTypeCodeEnum transportDocumentTypeCode) {
    this.transportDocumentTypeCode = transportDocumentTypeCode;
    return this;
  }

  /**
   * Specifies the type of the transport document - `BOL` (Bill of Lading) - `SWB` (Sea Waybill) 
   * @return transportDocumentTypeCode
   */
  @NotNull 
  @Schema(name = "transportDocumentTypeCode", example = "SWB", description = "Specifies the type of the transport document - `BOL` (Bill of Lading) - `SWB` (Sea Waybill) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transportDocumentTypeCode")
  public TransportDocumentTypeCodeEnum getTransportDocumentTypeCode() {
    return transportDocumentTypeCode;
  }

  public void setTransportDocumentTypeCode(TransportDocumentTypeCodeEnum transportDocumentTypeCode) {
    this.transportDocumentTypeCode = transportDocumentTypeCode;
  }

  public UpdateShippingInstructions isShippedOnBoardType(Boolean isShippedOnBoardType) {
    this.isShippedOnBoardType = isShippedOnBoardType;
    return this;
  }

  /**
   * Specifies whether the Transport Document is a received for shipment, or shipped on board. 
   * @return isShippedOnBoardType
   */
  @NotNull 
  @Schema(name = "isShippedOnBoardType", example = "true", description = "Specifies whether the Transport Document is a received for shipment, or shipped on board. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isShippedOnBoardType")
  public Boolean getIsShippedOnBoardType() {
    return isShippedOnBoardType;
  }

  public void setIsShippedOnBoardType(Boolean isShippedOnBoardType) {
    this.isShippedOnBoardType = isShippedOnBoardType;
  }

  public UpdateShippingInstructions freightPaymentTermCode(FreightPaymentTermCodeEnum freightPaymentTermCode) {
    this.freightPaymentTermCode = freightPaymentTermCode;
    return this;
  }

  /**
   * An indicator of whether freight and ancillary fees for the main transport are prepaid (`PRE`) or collect (`COL`). When prepaid the charges are the responsibility of the shipper or the Invoice payer on behalf of the shipper (if provided). When collect, the charges are the responsibility of the consignee or the Invoice payer on behalf of the consignee (if provided).  - `PRE` (Prepaid) - `COL` (Collect) 
   * @return freightPaymentTermCode
   */
  @NotNull 
  @Schema(name = "freightPaymentTermCode", example = "PRE", description = "An indicator of whether freight and ancillary fees for the main transport are prepaid (`PRE`) or collect (`COL`). When prepaid the charges are the responsibility of the shipper or the Invoice payer on behalf of the shipper (if provided). When collect, the charges are the responsibility of the consignee or the Invoice payer on behalf of the consignee (if provided).  - `PRE` (Prepaid) - `COL` (Collect) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("freightPaymentTermCode")
  public FreightPaymentTermCodeEnum getFreightPaymentTermCode() {
    return freightPaymentTermCode;
  }

  public void setFreightPaymentTermCode(FreightPaymentTermCodeEnum freightPaymentTermCode) {
    this.freightPaymentTermCode = freightPaymentTermCode;
  }

  public UpdateShippingInstructions originChargesPaymentTerm(OriginChargesPaymentTerm originChargesPaymentTerm) {
    this.originChargesPaymentTerm = originChargesPaymentTerm;
    return this;
  }

  /**
   * Get originChargesPaymentTerm
   * @return originChargesPaymentTerm
   */
  @Valid 
  @Schema(name = "originChargesPaymentTerm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("originChargesPaymentTerm")
  public OriginChargesPaymentTerm getOriginChargesPaymentTerm() {
    return originChargesPaymentTerm;
  }

  public void setOriginChargesPaymentTerm(OriginChargesPaymentTerm originChargesPaymentTerm) {
    this.originChargesPaymentTerm = originChargesPaymentTerm;
  }

  public UpdateShippingInstructions destinationChargesPaymentTerm(DestinationChargesPaymentTerm destinationChargesPaymentTerm) {
    this.destinationChargesPaymentTerm = destinationChargesPaymentTerm;
    return this;
  }

  /**
   * Get destinationChargesPaymentTerm
   * @return destinationChargesPaymentTerm
   */
  @Valid 
  @Schema(name = "destinationChargesPaymentTerm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destinationChargesPaymentTerm")
  public DestinationChargesPaymentTerm getDestinationChargesPaymentTerm() {
    return destinationChargesPaymentTerm;
  }

  public void setDestinationChargesPaymentTerm(DestinationChargesPaymentTerm destinationChargesPaymentTerm) {
    this.destinationChargesPaymentTerm = destinationChargesPaymentTerm;
  }

  public UpdateShippingInstructions methodOfPayment(String methodOfPayment) {
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

  public UpdateShippingInstructions isElectronic(Boolean isElectronic) {
    this.isElectronic = isElectronic;
    return this;
  }

  /**
   * An indicator whether the transport document is electronically transferred. 
   * @return isElectronic
   */
  @NotNull 
  @Schema(name = "isElectronic", example = "true", description = "An indicator whether the transport document is electronically transferred. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isElectronic")
  public Boolean getIsElectronic() {
    return isElectronic;
  }

  public void setIsElectronic(Boolean isElectronic) {
    this.isElectronic = isElectronic;
  }

  public UpdateShippingInstructions isToOrder(Boolean isToOrder) {
    this.isToOrder = isToOrder;
    return this;
  }

  /**
   * Indicates whether the B/L is issued `to order` or not. If `true`, the B/L is considered negotiable and an Endorsee party can be defined in the Document parties. If no Endorsee is defined, the B/L is blank endorsed. If `false`, the B/L is considered non-negotiable (also referred to as `straight`).  `isToOrder` must be `false` if `transportDocumentTypeCode='SWB'` (Sea Waybill). 
   * @return isToOrder
   */
  @NotNull 
  @Schema(name = "isToOrder", example = "false", description = "Indicates whether the B/L is issued `to order` or not. If `true`, the B/L is considered negotiable and an Endorsee party can be defined in the Document parties. If no Endorsee is defined, the B/L is blank endorsed. If `false`, the B/L is considered non-negotiable (also referred to as `straight`).  `isToOrder` must be `false` if `transportDocumentTypeCode='SWB'` (Sea Waybill). ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isToOrder")
  public Boolean getIsToOrder() {
    return isToOrder;
  }

  public void setIsToOrder(Boolean isToOrder) {
    this.isToOrder = isToOrder;
  }

  public UpdateShippingInstructions numberOfCopiesWithCharges(Integer numberOfCopiesWithCharges) {
    this.numberOfCopiesWithCharges = numberOfCopiesWithCharges;
    return this;
  }

  /**
   * The requested number of copies of the `Transport Document` to be issued by the carrier including charges.  **Conditions:** The following table defines the conditions for the `numberOfCopiesWithCharges` property: | Transport Document Type Code | Is Electronic | Meaning | |-------|:-------:|-------| |`BOL`|`false`|How many paper copies of the Original BL to be issued by the carrier with charges| |`BOL`|`true`|Not applicable, there are no copies| |`SWB`|`false`|Indicates that charges should be included in the `SWB` (pdf or other formats)| |`SWB`|`true`|Indicates that charges should be included in the electronic `SWB`| 
   * minimum: 0
   * @return numberOfCopiesWithCharges
   */
  @Min(0) 
  @Schema(name = "numberOfCopiesWithCharges", example = "2", description = "The requested number of copies of the `Transport Document` to be issued by the carrier including charges.  **Conditions:** The following table defines the conditions for the `numberOfCopiesWithCharges` property: | Transport Document Type Code | Is Electronic | Meaning | |-------|:-------:|-------| |`BOL`|`false`|How many paper copies of the Original BL to be issued by the carrier with charges| |`BOL`|`true`|Not applicable, there are no copies| |`SWB`|`false`|Indicates that charges should be included in the `SWB` (pdf or other formats)| |`SWB`|`true`|Indicates that charges should be included in the electronic `SWB`| ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfCopiesWithCharges")
  public Integer getNumberOfCopiesWithCharges() {
    return numberOfCopiesWithCharges;
  }

  public void setNumberOfCopiesWithCharges(Integer numberOfCopiesWithCharges) {
    this.numberOfCopiesWithCharges = numberOfCopiesWithCharges;
  }

  public UpdateShippingInstructions numberOfCopiesWithoutCharges(Integer numberOfCopiesWithoutCharges) {
    this.numberOfCopiesWithoutCharges = numberOfCopiesWithoutCharges;
    return this;
  }

  /**
   * The requested number of copies of the `Transport Document` to be issued by the carrier **NOT** including charges.  **Conditions:** The following table defines the conditions for the `numberOfCopiesWithoutCharges` property: | Transport Document Type Code | Is Electronic | Meaning | |-------|:-------:|-------| |`BOL`|`false`|How many paper copies of the Original BL to be issued by the carrier without charges| |`BOL`|`true`|Not applicable, there are no copies| |`SWB`|`false`|Indicates that charges should NOT be included in the `SWB` (pdf or other formats)| |`SWB`|`true`|Indicates that charges NOT should be included in the electronic `SWB`| 
   * minimum: 0
   * @return numberOfCopiesWithoutCharges
   */
  @Min(0) 
  @Schema(name = "numberOfCopiesWithoutCharges", example = "2", description = "The requested number of copies of the `Transport Document` to be issued by the carrier **NOT** including charges.  **Conditions:** The following table defines the conditions for the `numberOfCopiesWithoutCharges` property: | Transport Document Type Code | Is Electronic | Meaning | |-------|:-------:|-------| |`BOL`|`false`|How many paper copies of the Original BL to be issued by the carrier without charges| |`BOL`|`true`|Not applicable, there are no copies| |`SWB`|`false`|Indicates that charges should NOT be included in the `SWB` (pdf or other formats)| |`SWB`|`true`|Indicates that charges NOT should be included in the electronic `SWB`| ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfCopiesWithoutCharges")
  public Integer getNumberOfCopiesWithoutCharges() {
    return numberOfCopiesWithoutCharges;
  }

  public void setNumberOfCopiesWithoutCharges(Integer numberOfCopiesWithoutCharges) {
    this.numberOfCopiesWithoutCharges = numberOfCopiesWithoutCharges;
  }

  public UpdateShippingInstructions numberOfOriginalsWithCharges(Integer numberOfOriginalsWithCharges) {
    this.numberOfOriginalsWithCharges = numberOfOriginalsWithCharges;
    return this;
  }

  /**
   * Number of originals of the Bill of Lading that has been requested by the customer with charges.          **Condition:** Only applicable if `transportDocumentType` = `BOL` (Bill of Lading). If `isElectronic = 'True'`, accepted value is `1` (one) or `0` (zero) 
   * minimum: 0
   * @return numberOfOriginalsWithCharges
   */
  @Min(0) 
  @Schema(name = "numberOfOriginalsWithCharges", example = "1", description = "Number of originals of the Bill of Lading that has been requested by the customer with charges.          **Condition:** Only applicable if `transportDocumentType` = `BOL` (Bill of Lading). If `isElectronic = 'True'`, accepted value is `1` (one) or `0` (zero) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfOriginalsWithCharges")
  public Integer getNumberOfOriginalsWithCharges() {
    return numberOfOriginalsWithCharges;
  }

  public void setNumberOfOriginalsWithCharges(Integer numberOfOriginalsWithCharges) {
    this.numberOfOriginalsWithCharges = numberOfOriginalsWithCharges;
  }

  public UpdateShippingInstructions numberOfOriginalsWithoutCharges(Integer numberOfOriginalsWithoutCharges) {
    this.numberOfOriginalsWithoutCharges = numberOfOriginalsWithoutCharges;
    return this;
  }

  /**
   * Number of originals of the Bill of Lading that has been requested by the customer without charges.          **Condition:** Only applicable if `transportDocumentType` = `BOL` (Bill of Lading). If `isElectronic = 'True'`, accepted value is `1` (one) or `0` (zero) 
   * minimum: 0
   * @return numberOfOriginalsWithoutCharges
   */
  @Min(0) 
  @Schema(name = "numberOfOriginalsWithoutCharges", example = "1", description = "Number of originals of the Bill of Lading that has been requested by the customer without charges.          **Condition:** Only applicable if `transportDocumentType` = `BOL` (Bill of Lading). If `isElectronic = 'True'`, accepted value is `1` (one) or `0` (zero) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfOriginalsWithoutCharges")
  public Integer getNumberOfOriginalsWithoutCharges() {
    return numberOfOriginalsWithoutCharges;
  }

  public void setNumberOfOriginalsWithoutCharges(Integer numberOfOriginalsWithoutCharges) {
    this.numberOfOriginalsWithoutCharges = numberOfOriginalsWithoutCharges;
  }

  public UpdateShippingInstructions displayedNameForPlaceOfReceipt(List<@Size(max = 35)String> displayedNameForPlaceOfReceipt) {
    this.displayedNameForPlaceOfReceipt = displayedNameForPlaceOfReceipt;
    return this;
  }

  public UpdateShippingInstructions addDisplayedNameForPlaceOfReceiptItem(String displayedNameForPlaceOfReceiptItem) {
    if (this.displayedNameForPlaceOfReceipt == null) {
      this.displayedNameForPlaceOfReceipt = new ArrayList<>();
    }
    this.displayedNameForPlaceOfReceipt.add(displayedNameForPlaceOfReceiptItem);
    return this;
  }

  /**
   * The name to be used in order to specify how the `Place of Receipt` should be displayed on the transport document to match the name and/or address provided on the letter of credit. 
   * @return displayedNameForPlaceOfReceipt
   */
  @Size(max = 5) 
  @Schema(name = "displayedNameForPlaceOfReceipt", description = "The name to be used in order to specify how the `Place of Receipt` should be displayed on the transport document to match the name and/or address provided on the letter of credit. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayedNameForPlaceOfReceipt")
  public List<@Size(max = 35)String> getDisplayedNameForPlaceOfReceipt() {
    return displayedNameForPlaceOfReceipt;
  }

  public void setDisplayedNameForPlaceOfReceipt(List<@Size(max = 35)String> displayedNameForPlaceOfReceipt) {
    this.displayedNameForPlaceOfReceipt = displayedNameForPlaceOfReceipt;
  }

  public UpdateShippingInstructions displayedNameForPortOfLoad(List<@Size(max = 35)String> displayedNameForPortOfLoad) {
    this.displayedNameForPortOfLoad = displayedNameForPortOfLoad;
    return this;
  }

  public UpdateShippingInstructions addDisplayedNameForPortOfLoadItem(String displayedNameForPortOfLoadItem) {
    if (this.displayedNameForPortOfLoad == null) {
      this.displayedNameForPortOfLoad = new ArrayList<>();
    }
    this.displayedNameForPortOfLoad.add(displayedNameForPortOfLoadItem);
    return this;
  }

  /**
   * The name to be used in order to specify how the `Port of Load` should be displayed on the transport document to match the name and/or address provided on the letter of credit. 
   * @return displayedNameForPortOfLoad
   */
  @Size(max = 5) 
  @Schema(name = "displayedNameForPortOfLoad", description = "The name to be used in order to specify how the `Port of Load` should be displayed on the transport document to match the name and/or address provided on the letter of credit. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayedNameForPortOfLoad")
  public List<@Size(max = 35)String> getDisplayedNameForPortOfLoad() {
    return displayedNameForPortOfLoad;
  }

  public void setDisplayedNameForPortOfLoad(List<@Size(max = 35)String> displayedNameForPortOfLoad) {
    this.displayedNameForPortOfLoad = displayedNameForPortOfLoad;
  }

  public UpdateShippingInstructions displayedNameForPortOfDischarge(List<@Size(max = 35)String> displayedNameForPortOfDischarge) {
    this.displayedNameForPortOfDischarge = displayedNameForPortOfDischarge;
    return this;
  }

  public UpdateShippingInstructions addDisplayedNameForPortOfDischargeItem(String displayedNameForPortOfDischargeItem) {
    if (this.displayedNameForPortOfDischarge == null) {
      this.displayedNameForPortOfDischarge = new ArrayList<>();
    }
    this.displayedNameForPortOfDischarge.add(displayedNameForPortOfDischargeItem);
    return this;
  }

  /**
   * The name to be used in order to specify how the `Port of Discharge` should be displayed on the transport document to match the name and/or address provided on the letter of credit. 
   * @return displayedNameForPortOfDischarge
   */
  @Size(max = 5) 
  @Schema(name = "displayedNameForPortOfDischarge", description = "The name to be used in order to specify how the `Port of Discharge` should be displayed on the transport document to match the name and/or address provided on the letter of credit. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayedNameForPortOfDischarge")
  public List<@Size(max = 35)String> getDisplayedNameForPortOfDischarge() {
    return displayedNameForPortOfDischarge;
  }

  public void setDisplayedNameForPortOfDischarge(List<@Size(max = 35)String> displayedNameForPortOfDischarge) {
    this.displayedNameForPortOfDischarge = displayedNameForPortOfDischarge;
  }

  public UpdateShippingInstructions displayedNameForPlaceOfDelivery(List<@Size(max = 35)String> displayedNameForPlaceOfDelivery) {
    this.displayedNameForPlaceOfDelivery = displayedNameForPlaceOfDelivery;
    return this;
  }

  public UpdateShippingInstructions addDisplayedNameForPlaceOfDeliveryItem(String displayedNameForPlaceOfDeliveryItem) {
    if (this.displayedNameForPlaceOfDelivery == null) {
      this.displayedNameForPlaceOfDelivery = new ArrayList<>();
    }
    this.displayedNameForPlaceOfDelivery.add(displayedNameForPlaceOfDeliveryItem);
    return this;
  }

  /**
   * The name to be used in order to specify how the `Place of Delivery` should be displayed on the transport document to match the name and/or address provided on the letter of credit. 
   * @return displayedNameForPlaceOfDelivery
   */
  @Size(max = 5) 
  @Schema(name = "displayedNameForPlaceOfDelivery", description = "The name to be used in order to specify how the `Place of Delivery` should be displayed on the transport document to match the name and/or address provided on the letter of credit. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayedNameForPlaceOfDelivery")
  public List<@Size(max = 35)String> getDisplayedNameForPlaceOfDelivery() {
    return displayedNameForPlaceOfDelivery;
  }

  public void setDisplayedNameForPlaceOfDelivery(List<@Size(max = 35)String> displayedNameForPlaceOfDelivery) {
    this.displayedNameForPlaceOfDelivery = displayedNameForPlaceOfDelivery;
  }

  public UpdateShippingInstructions placeOfIssue(PlaceOfIssue placeOfIssue) {
    this.placeOfIssue = placeOfIssue;
    return this;
  }

  /**
   * Get placeOfIssue
   * @return placeOfIssue
   */
  @Valid 
  @Schema(name = "placeOfIssue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placeOfIssue")
  public PlaceOfIssue getPlaceOfIssue() {
    return placeOfIssue;
  }

  public void setPlaceOfIssue(PlaceOfIssue placeOfIssue) {
    this.placeOfIssue = placeOfIssue;
  }

  public UpdateShippingInstructions invoicePayableAt(InvoicePayableAt invoicePayableAt) {
    this.invoicePayableAt = invoicePayableAt;
    return this;
  }

  /**
   * Get invoicePayableAt
   * @return invoicePayableAt
   */
  @Valid 
  @Schema(name = "invoicePayableAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoicePayableAt")
  public InvoicePayableAt getInvoicePayableAt() {
    return invoicePayableAt;
  }

  public void setInvoicePayableAt(InvoicePayableAt invoicePayableAt) {
    this.invoicePayableAt = invoicePayableAt;
  }

  public UpdateShippingInstructions partyContactDetails(List<@Valid PartyContactDetail> partyContactDetails) {
    this.partyContactDetails = partyContactDetails;
    return this;
  }

  public UpdateShippingInstructions addPartyContactDetailsItem(PartyContactDetail partyContactDetailsItem) {
    if (this.partyContactDetails == null) {
      this.partyContactDetails = new ArrayList<>();
    }
    this.partyContactDetails.add(partyContactDetailsItem);
    return this;
  }

  /**
   * The contact details of the person(s) to contact in relation to the **Transport Document** (changes, notifications etc.)  
   * @return partyContactDetails
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "partyContactDetails", description = "The contact details of the person(s) to contact in relation to the **Transport Document** (changes, notifications etc.)  ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("partyContactDetails")
  public List<@Valid PartyContactDetail> getPartyContactDetails() {
    return partyContactDetails;
  }

  public void setPartyContactDetails(List<@Valid PartyContactDetail> partyContactDetails) {
    this.partyContactDetails = partyContactDetails;
  }

  public UpdateShippingInstructions isCarriersAgentAtDestinationRequired(Boolean isCarriersAgentAtDestinationRequired) {
    this.isCarriersAgentAtDestinationRequired = isCarriersAgentAtDestinationRequired;
    return this;
  }

  /**
   * Indicates whether the Carrier's agent at destination name, address and contact details should be included in the `Transport Document`. 
   * @return isCarriersAgentAtDestinationRequired
   */
  
  @Schema(name = "isCarriersAgentAtDestinationRequired", example = "false", description = "Indicates whether the Carrier's agent at destination name, address and contact details should be included in the `Transport Document`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isCarriersAgentAtDestinationRequired")
  public Boolean getIsCarriersAgentAtDestinationRequired() {
    return isCarriersAgentAtDestinationRequired;
  }

  public void setIsCarriersAgentAtDestinationRequired(Boolean isCarriersAgentAtDestinationRequired) {
    this.isCarriersAgentAtDestinationRequired = isCarriersAgentAtDestinationRequired;
  }

  public UpdateShippingInstructions documentParties(DocumentParties documentParties) {
    this.documentParties = documentParties;
    return this;
  }

  /**
   * Get documentParties
   * @return documentParties
   */
  @NotNull @Valid 
  @Schema(name = "documentParties", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("documentParties")
  public DocumentParties getDocumentParties() {
    return documentParties;
  }

  public void setDocumentParties(DocumentParties documentParties) {
    this.documentParties = documentParties;
  }

  public UpdateShippingInstructions routingOfConsignmentCountries(List<@Pattern(regexp = "^[A-Z]{2}$")@Size(min = 2, max = 2)String> routingOfConsignmentCountries) {
    this.routingOfConsignmentCountries = routingOfConsignmentCountries;
    return this;
  }

  public UpdateShippingInstructions addRoutingOfConsignmentCountriesItem(String routingOfConsignmentCountriesItem) {
    if (this.routingOfConsignmentCountries == null) {
      this.routingOfConsignmentCountries = new ArrayList<>();
    }
    this.routingOfConsignmentCountries.add(routingOfConsignmentCountriesItem);
    return this;
  }

  /**
   * A list of countries the goods will be routed through from origin to destination defined by the 2 characters country code using [ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#iso:pub:PUB500001:en) 
   * @return routingOfConsignmentCountries
   */
  
  @Schema(name = "routingOfConsignmentCountries", description = "A list of countries the goods will be routed through from origin to destination defined by the 2 characters country code using [ISO 3166-1 alpha-2](https://www.iso.org/obp/ui/#iso:pub:PUB500001:en) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("routingOfConsignmentCountries")
  public List<@Pattern(regexp = "^[A-Z]{2}$")@Size(min = 2, max = 2)String> getRoutingOfConsignmentCountries() {
    return routingOfConsignmentCountries;
  }

  public void setRoutingOfConsignmentCountries(List<@Pattern(regexp = "^[A-Z]{2}$")@Size(min = 2, max = 2)String> routingOfConsignmentCountries) {
    this.routingOfConsignmentCountries = routingOfConsignmentCountries;
  }

  public UpdateShippingInstructions consignmentItems(List<@Valid ConsignmentItemShipper> consignmentItems) {
    this.consignmentItems = consignmentItems;
    return this;
  }

  public UpdateShippingInstructions addConsignmentItemsItem(ConsignmentItemShipper consignmentItemsItem) {
    if (this.consignmentItems == null) {
      this.consignmentItems = new ArrayList<>();
    }
    this.consignmentItems.add(consignmentItemsItem);
    return this;
  }

  /**
   * A list of `ConsignmentItems` 
   * @return consignmentItems
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "consignmentItems", description = "A list of `ConsignmentItems` ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("consignmentItems")
  public List<@Valid ConsignmentItemShipper> getConsignmentItems() {
    return consignmentItems;
  }

  public void setConsignmentItems(List<@Valid ConsignmentItemShipper> consignmentItems) {
    this.consignmentItems = consignmentItems;
  }

  public UpdateShippingInstructions utilizedTransportEquipments(List<@Valid UtilizedTransportEquipmentShipper> utilizedTransportEquipments) {
    this.utilizedTransportEquipments = utilizedTransportEquipments;
    return this;
  }

  public UpdateShippingInstructions addUtilizedTransportEquipmentsItem(UtilizedTransportEquipmentShipper utilizedTransportEquipmentsItem) {
    if (this.utilizedTransportEquipments == null) {
      this.utilizedTransportEquipments = new ArrayList<>();
    }
    this.utilizedTransportEquipments.add(utilizedTransportEquipmentsItem);
    return this;
  }

  /**
   * A list of `Utilized Transport Equipments` describing the equipment being used. 
   * @return utilizedTransportEquipments
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "utilizedTransportEquipments", description = "A list of `Utilized Transport Equipments` describing the equipment being used. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("utilizedTransportEquipments")
  public List<@Valid UtilizedTransportEquipmentShipper> getUtilizedTransportEquipments() {
    return utilizedTransportEquipments;
  }

  public void setUtilizedTransportEquipments(List<@Valid UtilizedTransportEquipmentShipper> utilizedTransportEquipments) {
    this.utilizedTransportEquipments = utilizedTransportEquipments;
  }

  public UpdateShippingInstructions references(List<@Valid Reference> references) {
    this.references = references;
    return this;
  }

  public UpdateShippingInstructions addReferencesItem(Reference referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * A list of `References` 
   * @return references
   */
  @Valid 
  @Schema(name = "references", description = "A list of `References` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("references")
  public List<@Valid Reference> getReferences() {
    return references;
  }

  public void setReferences(List<@Valid Reference> references) {
    this.references = references;
  }

  public UpdateShippingInstructions customsReferences(List<@Valid CustomsReference> customsReferences) {
    this.customsReferences = customsReferences;
    return this;
  }

  public UpdateShippingInstructions addCustomsReferencesItem(CustomsReference customsReferencesItem) {
    if (this.customsReferences == null) {
      this.customsReferences = new ArrayList<>();
    }
    this.customsReferences.add(customsReferencesItem);
    return this;
  }

  /**
   * A list of `Customs references` 
   * @return customsReferences
   */
  @Valid 
  @Schema(name = "customsReferences", description = "A list of `Customs references` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customsReferences")
  public List<@Valid CustomsReference> getCustomsReferences() {
    return customsReferences;
  }

  public void setCustomsReferences(List<@Valid CustomsReference> customsReferences) {
    this.customsReferences = customsReferences;
  }

  public UpdateShippingInstructions advanceManifestFilings(List<@Valid AdvanceManifestFiling> advanceManifestFilings) {
    this.advanceManifestFilings = advanceManifestFilings;
    return this;
  }

  public UpdateShippingInstructions addAdvanceManifestFilingsItem(AdvanceManifestFiling advanceManifestFilingsItem) {
    if (this.advanceManifestFilings == null) {
      this.advanceManifestFilings = new ArrayList<>();
    }
    this.advanceManifestFilings.add(advanceManifestFilingsItem);
    return this;
  }

  /**
   * A list of `Advance Manifest Filings` specified by the Shipper to indicate whom is to do the Filing 
   * @return advanceManifestFilings
   */
  @Valid 
  @Schema(name = "advanceManifestFilings", description = "A list of `Advance Manifest Filings` specified by the Shipper to indicate whom is to do the Filing ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("advanceManifestFilings")
  public List<@Valid AdvanceManifestFiling> getAdvanceManifestFilings() {
    return advanceManifestFilings;
  }

  public void setAdvanceManifestFilings(List<@Valid AdvanceManifestFiling> advanceManifestFilings) {
    this.advanceManifestFilings = advanceManifestFilings;
  }

  public UpdateShippingInstructions isHBLIssued(Boolean isHBLIssued) {
    this.isHBLIssued = isHBLIssued;
    return this;
  }

  /**
   * Indicates whether one or more `House Bill of Lading(s)` have been issued. This property is used by the carrier to identify which `ENS` filing type must be submitted (`F10` or `F11`, `F12` or `F13`) to comply with `ICS2` customs regulations 
   * @return isHBLIssued
   */
  
  @Schema(name = "isHBLIssued", example = "true", description = "Indicates whether one or more `House Bill of Lading(s)` have been issued. This property is used by the carrier to identify which `ENS` filing type must be submitted (`F10` or `F11`, `F12` or `F13`) to comply with `ICS2` customs regulations ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isHBLIssued")
  public Boolean getIsHBLIssued() {
    return isHBLIssued;
  }

  public void setIsHBLIssued(Boolean isHBLIssued) {
    this.isHBLIssued = isHBLIssued;
  }

  public UpdateShippingInstructions houseBillOfLadings(List<@Valid HouseBillOfLading> houseBillOfLadings) {
    this.houseBillOfLadings = houseBillOfLadings;
    return this;
  }

  public UpdateShippingInstructions addHouseBillOfLadingsItem(HouseBillOfLading houseBillOfLadingsItem) {
    if (this.houseBillOfLadings == null) {
      this.houseBillOfLadings = new ArrayList<>();
    }
    this.houseBillOfLadings.add(houseBillOfLadingsItem);
    return this;
  }

  /**
   * A list of `House Bill of Ladings` specified by the Shipper. 
   * @return houseBillOfLadings
   */
  @Valid 
  @Schema(name = "houseBillOfLadings", description = "A list of `House Bill of Ladings` specified by the Shipper. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("houseBillOfLadings")
  public List<@Valid HouseBillOfLading> getHouseBillOfLadings() {
    return houseBillOfLadings;
  }

  public void setHouseBillOfLadings(List<@Valid HouseBillOfLading> houseBillOfLadings) {
    this.houseBillOfLadings = houseBillOfLadings;
  }

  public UpdateShippingInstructions requestedCarrierCertificates(List<@Size(max = 100)String> requestedCarrierCertificates) {
    this.requestedCarrierCertificates = requestedCarrierCertificates;
    return this;
  }

  public UpdateShippingInstructions addRequestedCarrierCertificatesItem(String requestedCarrierCertificatesItem) {
    if (this.requestedCarrierCertificates == null) {
      this.requestedCarrierCertificates = new ArrayList<>();
    }
    this.requestedCarrierCertificates.add(requestedCarrierCertificatesItem);
    return this;
  }

  /**
   * Certificate(s) requested by the Shipper for the Carrier to include as part of the shipment documentation pack 
   * @return requestedCarrierCertificates
   */
  
  @Schema(name = "requestedCarrierCertificates", description = "Certificate(s) requested by the Shipper for the Carrier to include as part of the shipment documentation pack ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedCarrierCertificates")
  public List<@Size(max = 100)String> getRequestedCarrierCertificates() {
    return requestedCarrierCertificates;
  }

  public void setRequestedCarrierCertificates(List<@Size(max = 100)String> requestedCarrierCertificates) {
    this.requestedCarrierCertificates = requestedCarrierCertificates;
  }

  public UpdateShippingInstructions requestedCarrierClauses(List<@Size(max = 100)String> requestedCarrierClauses) {
    this.requestedCarrierClauses = requestedCarrierClauses;
    return this;
  }

  public UpdateShippingInstructions addRequestedCarrierClausesItem(String requestedCarrierClausesItem) {
    if (this.requestedCarrierClauses == null) {
      this.requestedCarrierClauses = new ArrayList<>();
    }
    this.requestedCarrierClauses.add(requestedCarrierClausesItem);
    return this;
  }

  /**
   * Clauses requested by the Shipper for the Carrier to include in the `Transport Document` `Carrier clauses` 
   * @return requestedCarrierClauses
   */
  
  @Schema(name = "requestedCarrierClauses", description = "Clauses requested by the Shipper for the Carrier to include in the `Transport Document` `Carrier clauses` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedCarrierClauses")
  public List<@Size(max = 100)String> getRequestedCarrierClauses() {
    return requestedCarrierClauses;
  }

  public void setRequestedCarrierClauses(List<@Size(max = 100)String> requestedCarrierClauses) {
    this.requestedCarrierClauses = requestedCarrierClauses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateShippingInstructions updateShippingInstructions = (UpdateShippingInstructions) o;
    return Objects.equals(this.shippingInstructionsReference, updateShippingInstructions.shippingInstructionsReference) &&
        Objects.equals(this.transportDocumentTypeCode, updateShippingInstructions.transportDocumentTypeCode) &&
        Objects.equals(this.isShippedOnBoardType, updateShippingInstructions.isShippedOnBoardType) &&
        Objects.equals(this.freightPaymentTermCode, updateShippingInstructions.freightPaymentTermCode) &&
        Objects.equals(this.originChargesPaymentTerm, updateShippingInstructions.originChargesPaymentTerm) &&
        Objects.equals(this.destinationChargesPaymentTerm, updateShippingInstructions.destinationChargesPaymentTerm) &&
        Objects.equals(this.methodOfPayment, updateShippingInstructions.methodOfPayment) &&
        Objects.equals(this.isElectronic, updateShippingInstructions.isElectronic) &&
        Objects.equals(this.isToOrder, updateShippingInstructions.isToOrder) &&
        Objects.equals(this.numberOfCopiesWithCharges, updateShippingInstructions.numberOfCopiesWithCharges) &&
        Objects.equals(this.numberOfCopiesWithoutCharges, updateShippingInstructions.numberOfCopiesWithoutCharges) &&
        Objects.equals(this.numberOfOriginalsWithCharges, updateShippingInstructions.numberOfOriginalsWithCharges) &&
        Objects.equals(this.numberOfOriginalsWithoutCharges, updateShippingInstructions.numberOfOriginalsWithoutCharges) &&
        Objects.equals(this.displayedNameForPlaceOfReceipt, updateShippingInstructions.displayedNameForPlaceOfReceipt) &&
        Objects.equals(this.displayedNameForPortOfLoad, updateShippingInstructions.displayedNameForPortOfLoad) &&
        Objects.equals(this.displayedNameForPortOfDischarge, updateShippingInstructions.displayedNameForPortOfDischarge) &&
        Objects.equals(this.displayedNameForPlaceOfDelivery, updateShippingInstructions.displayedNameForPlaceOfDelivery) &&
        Objects.equals(this.placeOfIssue, updateShippingInstructions.placeOfIssue) &&
        Objects.equals(this.invoicePayableAt, updateShippingInstructions.invoicePayableAt) &&
        Objects.equals(this.partyContactDetails, updateShippingInstructions.partyContactDetails) &&
        Objects.equals(this.isCarriersAgentAtDestinationRequired, updateShippingInstructions.isCarriersAgentAtDestinationRequired) &&
        Objects.equals(this.documentParties, updateShippingInstructions.documentParties) &&
        Objects.equals(this.routingOfConsignmentCountries, updateShippingInstructions.routingOfConsignmentCountries) &&
        Objects.equals(this.consignmentItems, updateShippingInstructions.consignmentItems) &&
        Objects.equals(this.utilizedTransportEquipments, updateShippingInstructions.utilizedTransportEquipments) &&
        Objects.equals(this.references, updateShippingInstructions.references) &&
        Objects.equals(this.customsReferences, updateShippingInstructions.customsReferences) &&
        Objects.equals(this.advanceManifestFilings, updateShippingInstructions.advanceManifestFilings) &&
        Objects.equals(this.isHBLIssued, updateShippingInstructions.isHBLIssued) &&
        Objects.equals(this.houseBillOfLadings, updateShippingInstructions.houseBillOfLadings) &&
        Objects.equals(this.requestedCarrierCertificates, updateShippingInstructions.requestedCarrierCertificates) &&
        Objects.equals(this.requestedCarrierClauses, updateShippingInstructions.requestedCarrierClauses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingInstructionsReference, transportDocumentTypeCode, isShippedOnBoardType, freightPaymentTermCode, originChargesPaymentTerm, destinationChargesPaymentTerm, methodOfPayment, isElectronic, isToOrder, numberOfCopiesWithCharges, numberOfCopiesWithoutCharges, numberOfOriginalsWithCharges, numberOfOriginalsWithoutCharges, displayedNameForPlaceOfReceipt, displayedNameForPortOfLoad, displayedNameForPortOfDischarge, displayedNameForPlaceOfDelivery, placeOfIssue, invoicePayableAt, partyContactDetails, isCarriersAgentAtDestinationRequired, documentParties, routingOfConsignmentCountries, consignmentItems, utilizedTransportEquipments, references, customsReferences, advanceManifestFilings, isHBLIssued, houseBillOfLadings, requestedCarrierCertificates, requestedCarrierClauses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateShippingInstructions {\n");
    sb.append("    shippingInstructionsReference: ").append(toIndentedString(shippingInstructionsReference)).append("\n");
    sb.append("    transportDocumentTypeCode: ").append(toIndentedString(transportDocumentTypeCode)).append("\n");
    sb.append("    isShippedOnBoardType: ").append(toIndentedString(isShippedOnBoardType)).append("\n");
    sb.append("    freightPaymentTermCode: ").append(toIndentedString(freightPaymentTermCode)).append("\n");
    sb.append("    originChargesPaymentTerm: ").append(toIndentedString(originChargesPaymentTerm)).append("\n");
    sb.append("    destinationChargesPaymentTerm: ").append(toIndentedString(destinationChargesPaymentTerm)).append("\n");
    sb.append("    methodOfPayment: ").append(toIndentedString(methodOfPayment)).append("\n");
    sb.append("    isElectronic: ").append(toIndentedString(isElectronic)).append("\n");
    sb.append("    isToOrder: ").append(toIndentedString(isToOrder)).append("\n");
    sb.append("    numberOfCopiesWithCharges: ").append(toIndentedString(numberOfCopiesWithCharges)).append("\n");
    sb.append("    numberOfCopiesWithoutCharges: ").append(toIndentedString(numberOfCopiesWithoutCharges)).append("\n");
    sb.append("    numberOfOriginalsWithCharges: ").append(toIndentedString(numberOfOriginalsWithCharges)).append("\n");
    sb.append("    numberOfOriginalsWithoutCharges: ").append(toIndentedString(numberOfOriginalsWithoutCharges)).append("\n");
    sb.append("    displayedNameForPlaceOfReceipt: ").append(toIndentedString(displayedNameForPlaceOfReceipt)).append("\n");
    sb.append("    displayedNameForPortOfLoad: ").append(toIndentedString(displayedNameForPortOfLoad)).append("\n");
    sb.append("    displayedNameForPortOfDischarge: ").append(toIndentedString(displayedNameForPortOfDischarge)).append("\n");
    sb.append("    displayedNameForPlaceOfDelivery: ").append(toIndentedString(displayedNameForPlaceOfDelivery)).append("\n");
    sb.append("    placeOfIssue: ").append(toIndentedString(placeOfIssue)).append("\n");
    sb.append("    invoicePayableAt: ").append(toIndentedString(invoicePayableAt)).append("\n");
    sb.append("    partyContactDetails: ").append(toIndentedString(partyContactDetails)).append("\n");
    sb.append("    isCarriersAgentAtDestinationRequired: ").append(toIndentedString(isCarriersAgentAtDestinationRequired)).append("\n");
    sb.append("    documentParties: ").append(toIndentedString(documentParties)).append("\n");
    sb.append("    routingOfConsignmentCountries: ").append(toIndentedString(routingOfConsignmentCountries)).append("\n");
    sb.append("    consignmentItems: ").append(toIndentedString(consignmentItems)).append("\n");
    sb.append("    utilizedTransportEquipments: ").append(toIndentedString(utilizedTransportEquipments)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    customsReferences: ").append(toIndentedString(customsReferences)).append("\n");
    sb.append("    advanceManifestFilings: ").append(toIndentedString(advanceManifestFilings)).append("\n");
    sb.append("    isHBLIssued: ").append(toIndentedString(isHBLIssued)).append("\n");
    sb.append("    houseBillOfLadings: ").append(toIndentedString(houseBillOfLadings)).append("\n");
    sb.append("    requestedCarrierCertificates: ").append(toIndentedString(requestedCarrierCertificates)).append("\n");
    sb.append("    requestedCarrierClauses: ").append(toIndentedString(requestedCarrierClauses)).append("\n");
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

