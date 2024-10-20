package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.Charge;
import com.baeldung.openapi.model.ConsignmentItem;
import com.baeldung.openapi.model.CustomsReference;
import com.baeldung.openapi.model.DocumentParties1;
import com.baeldung.openapi.model.InvoicePayableAt1;
import com.baeldung.openapi.model.PartyContactDetail;
import com.baeldung.openapi.model.PlaceOfIssue;
import com.baeldung.openapi.model.Reference;
import com.baeldung.openapi.model.Transports;
import com.baeldung.openapi.model.UtilizedTransportEquipment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This property contains the transportDocument in case the subscriber is subscribing to the &#x60;Full State Transfer&#x60; of the Transport Document.  In case the subscriber does not subscribe to the &#x60;Full State Transfer&#x60; of the Transport Document then the content in this property can be ignored. 
 */

@Schema(name = "Transport_Document", description = "This property contains the transportDocument in case the subscriber is subscribing to the `Full State Transfer` of the Transport Document.  In case the subscriber does not subscribe to the `Full State Transfer` of the Transport Document then the content in this property can be ignored. ")
@JsonTypeName("Transport_Document")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class TransportDocument {

  private String transportDocumentReference;

  private String shippingInstructionsReference;

  private String transportDocumentStatus;

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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate shippedOnBoardDate;

  private String displayedShippedOnBoardReceivedForShipment;

  private String termsAndConditions;

  /**
   * Indicates the type of service offered at `Origin`. The options are: - `CY` (Container yard (incl. rail ramp)) - `SD` (Store Door) - `CFS` (Container Freight Station) 
   */
  public enum ReceiptTypeAtOriginEnum {
    CY("CY"),
    
    SD("SD"),
    
    CFS("CFS");

    private String value;

    ReceiptTypeAtOriginEnum(String value) {
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
    public static ReceiptTypeAtOriginEnum fromValue(String value) {
      for (ReceiptTypeAtOriginEnum b : ReceiptTypeAtOriginEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ReceiptTypeAtOriginEnum receiptTypeAtOrigin;

  /**
   * Indicates the type of service offered at `Destination`. The options are:  - `CY` (Container yard (incl. rail ramp)) - `SD` (Store Door) - `CFS` (Container Freight Station) 
   */
  public enum DeliveryTypeAtDestinationEnum {
    CY("CY"),
    
    SD("SD"),
    
    CFS("CFS");

    private String value;

    DeliveryTypeAtDestinationEnum(String value) {
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
    public static DeliveryTypeAtDestinationEnum fromValue(String value) {
      for (DeliveryTypeAtDestinationEnum b : DeliveryTypeAtDestinationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DeliveryTypeAtDestinationEnum deliveryTypeAtDestination;

  private String cargoMovementTypeAtOrigin;

  private String cargoMovementTypeAtDestination;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate issueDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate receivedForShipmentDate;

  private String serviceContractReference;

  private String contractQuotationReference;

  private Float declaredValue;

  private String declaredValueCurrency;

  private String carrierCode;

  /**
   * The code list provider for the `carrierCode`. Possible values are: - `SMDG` (Ship Message Design Group) - `NMFTA` (National Motor Freight Traffic Association) 
   */
  public enum CarrierCodeListProviderEnum {
    SMDG("SMDG"),
    
    NMFTA("NMFTA");

    private String value;

    CarrierCodeListProviderEnum(String value) {
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
    public static CarrierCodeListProviderEnum fromValue(String value) {
      for (CarrierCodeListProviderEnum b : CarrierCodeListProviderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CarrierCodeListProviderEnum carrierCodeListProvider;

  @Valid
  private List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 20000)String> carrierClauses = new ArrayList<>();

  private Integer numberOfRiderPages;

  private Transports transports;

  @Valid
  private List<@Valid Charge> charges = new ArrayList<>();

  private PlaceOfIssue placeOfIssue;

  private InvoicePayableAt1 invoicePayableAt;

  @Valid
  private List<@Valid PartyContactDetail> partyContactDetails = new ArrayList<>();

  private DocumentParties1 documentParties;

  @Valid
  private List<@Pattern(regexp = "^[A-Z]{2}$")@Size(min = 2, max = 2)String> routingOfConsignmentCountries = new ArrayList<>();

  @Valid
  private List<@Valid ConsignmentItem> consignmentItems = new ArrayList<>();

  @Valid
  private List<@Valid UtilizedTransportEquipment> utilizedTransportEquipments = new ArrayList<>();

  @Valid
  private List<@Valid Reference> references = new ArrayList<>();

  @Valid
  private List<@Valid CustomsReference> customsReferences = new ArrayList<>();

  public TransportDocument() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TransportDocument(String transportDocumentReference, String transportDocumentStatus, TransportDocumentTypeCodeEnum transportDocumentTypeCode, Boolean isShippedOnBoardType, Boolean isElectronic, Boolean isToOrder, String termsAndConditions, ReceiptTypeAtOriginEnum receiptTypeAtOrigin, DeliveryTypeAtDestinationEnum deliveryTypeAtDestination, String cargoMovementTypeAtOrigin, String cargoMovementTypeAtDestination, String carrierCode, CarrierCodeListProviderEnum carrierCodeListProvider, Transports transports, InvoicePayableAt1 invoicePayableAt, List<@Valid PartyContactDetail> partyContactDetails, DocumentParties1 documentParties, List<@Valid ConsignmentItem> consignmentItems, List<@Valid UtilizedTransportEquipment> utilizedTransportEquipments) {
    this.transportDocumentReference = transportDocumentReference;
    this.transportDocumentStatus = transportDocumentStatus;
    this.transportDocumentTypeCode = transportDocumentTypeCode;
    this.isShippedOnBoardType = isShippedOnBoardType;
    this.isElectronic = isElectronic;
    this.isToOrder = isToOrder;
    this.termsAndConditions = termsAndConditions;
    this.receiptTypeAtOrigin = receiptTypeAtOrigin;
    this.deliveryTypeAtDestination = deliveryTypeAtDestination;
    this.cargoMovementTypeAtOrigin = cargoMovementTypeAtOrigin;
    this.cargoMovementTypeAtDestination = cargoMovementTypeAtDestination;
    this.carrierCode = carrierCode;
    this.carrierCodeListProvider = carrierCodeListProvider;
    this.transports = transports;
    this.invoicePayableAt = invoicePayableAt;
    this.partyContactDetails = partyContactDetails;
    this.documentParties = documentParties;
    this.consignmentItems = consignmentItems;
    this.utilizedTransportEquipments = utilizedTransportEquipments;
  }

  public TransportDocument transportDocumentReference(String transportDocumentReference) {
    this.transportDocumentReference = transportDocumentReference;
    return this;
  }

  /**
   * A unique number allocated by the shipping line to the transport document and the main number used for the tracking of the status of the shipment. 
   * @return transportDocumentReference
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 20) 
  @Schema(name = "transportDocumentReference", example = "HHL71800000", description = "A unique number allocated by the shipping line to the transport document and the main number used for the tracking of the status of the shipment. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transportDocumentReference")
  public String getTransportDocumentReference() {
    return transportDocumentReference;
  }

  public void setTransportDocumentReference(String transportDocumentReference) {
    this.transportDocumentReference = transportDocumentReference;
  }

  public TransportDocument shippingInstructionsReference(String shippingInstructionsReference) {
    this.shippingInstructionsReference = shippingInstructionsReference;
    return this;
  }

  /**
   * The identifier for a `Shipping Instructions` provided by the carrier for system purposes. 
   * @return shippingInstructionsReference
   */
  @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 100) 
  @Schema(name = "shippingInstructionsReference", example = "e0559d83-00e2-438e-afd9-fdd610c1a008", description = "The identifier for a `Shipping Instructions` provided by the carrier for system purposes. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingInstructionsReference")
  public String getShippingInstructionsReference() {
    return shippingInstructionsReference;
  }

  public void setShippingInstructionsReference(String shippingInstructionsReference) {
    this.shippingInstructionsReference = shippingInstructionsReference;
  }

  public TransportDocument transportDocumentStatus(String transportDocumentStatus) {
    this.transportDocumentStatus = transportDocumentStatus;
    return this;
  }

  /**
   * The status of the `Transport Document`. Possible values are: - DRAFT - APPROVED - ISSUED - PENDING_SURRENDER_FOR_AMENDMENT - SURRENDERED_FOR_AMENDMENT - PENDING_SURRENDER_FOR_DELIVERY - SURRENDERED_FOR_DELIVERY - VOIDED 
   * @return transportDocumentStatus
   */
  @NotNull @Size(max = 50) 
  @Schema(name = "transportDocumentStatus", example = "DRAFT", description = "The status of the `Transport Document`. Possible values are: - DRAFT - APPROVED - ISSUED - PENDING_SURRENDER_FOR_AMENDMENT - SURRENDERED_FOR_AMENDMENT - PENDING_SURRENDER_FOR_DELIVERY - SURRENDERED_FOR_DELIVERY - VOIDED ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transportDocumentStatus")
  public String getTransportDocumentStatus() {
    return transportDocumentStatus;
  }

  public void setTransportDocumentStatus(String transportDocumentStatus) {
    this.transportDocumentStatus = transportDocumentStatus;
  }

  public TransportDocument transportDocumentTypeCode(TransportDocumentTypeCodeEnum transportDocumentTypeCode) {
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

  public TransportDocument isShippedOnBoardType(Boolean isShippedOnBoardType) {
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

  public TransportDocument freightPaymentTermCode(FreightPaymentTermCodeEnum freightPaymentTermCode) {
    this.freightPaymentTermCode = freightPaymentTermCode;
    return this;
  }

  /**
   * An indicator of whether freight and ancillary fees for the main transport are prepaid (`PRE`) or collect (`COL`). When prepaid the charges are the responsibility of the shipper or the Invoice payer on behalf of the shipper (if provided). When collect, the charges are the responsibility of the consignee or the Invoice payer on behalf of the consignee (if provided).  - `PRE` (Prepaid) - `COL` (Collect) 
   * @return freightPaymentTermCode
   */
  
  @Schema(name = "freightPaymentTermCode", example = "PRE", description = "An indicator of whether freight and ancillary fees for the main transport are prepaid (`PRE`) or collect (`COL`). When prepaid the charges are the responsibility of the shipper or the Invoice payer on behalf of the shipper (if provided). When collect, the charges are the responsibility of the consignee or the Invoice payer on behalf of the consignee (if provided).  - `PRE` (Prepaid) - `COL` (Collect) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("freightPaymentTermCode")
  public FreightPaymentTermCodeEnum getFreightPaymentTermCode() {
    return freightPaymentTermCode;
  }

  public void setFreightPaymentTermCode(FreightPaymentTermCodeEnum freightPaymentTermCode) {
    this.freightPaymentTermCode = freightPaymentTermCode;
  }

  public TransportDocument isElectronic(Boolean isElectronic) {
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

  public TransportDocument isToOrder(Boolean isToOrder) {
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

  public TransportDocument numberOfCopiesWithCharges(Integer numberOfCopiesWithCharges) {
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

  public TransportDocument numberOfCopiesWithoutCharges(Integer numberOfCopiesWithoutCharges) {
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

  public TransportDocument numberOfOriginalsWithCharges(Integer numberOfOriginalsWithCharges) {
    this.numberOfOriginalsWithCharges = numberOfOriginalsWithCharges;
    return this;
  }

  /**
   * Number of originals of the Bill of Lading that has been requested by the customer with charges.  **Condition:** Only applicable if `transportDocumentType` = `BOL` (Bill of Lading). If `isElectronic = 'True'`, accepted value is `1` (one) or `0` (zero) 
   * minimum: 0
   * @return numberOfOriginalsWithCharges
   */
  @Min(0) 
  @Schema(name = "numberOfOriginalsWithCharges", example = "1", description = "Number of originals of the Bill of Lading that has been requested by the customer with charges.  **Condition:** Only applicable if `transportDocumentType` = `BOL` (Bill of Lading). If `isElectronic = 'True'`, accepted value is `1` (one) or `0` (zero) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfOriginalsWithCharges")
  public Integer getNumberOfOriginalsWithCharges() {
    return numberOfOriginalsWithCharges;
  }

  public void setNumberOfOriginalsWithCharges(Integer numberOfOriginalsWithCharges) {
    this.numberOfOriginalsWithCharges = numberOfOriginalsWithCharges;
  }

  public TransportDocument numberOfOriginalsWithoutCharges(Integer numberOfOriginalsWithoutCharges) {
    this.numberOfOriginalsWithoutCharges = numberOfOriginalsWithoutCharges;
    return this;
  }

  /**
   * Number of originals of the Bill of Lading that has been requested by the customer without charges.  **Condition:** Only applicable if `transportDocumentType` = `BOL` (Bill of Lading). If `isElectronic = 'True'`, accepted value is `1` (one) or `0` (zero) 
   * minimum: 0
   * @return numberOfOriginalsWithoutCharges
   */
  @Min(0) 
  @Schema(name = "numberOfOriginalsWithoutCharges", example = "1", description = "Number of originals of the Bill of Lading that has been requested by the customer without charges.  **Condition:** Only applicable if `transportDocumentType` = `BOL` (Bill of Lading). If `isElectronic = 'True'`, accepted value is `1` (one) or `0` (zero) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfOriginalsWithoutCharges")
  public Integer getNumberOfOriginalsWithoutCharges() {
    return numberOfOriginalsWithoutCharges;
  }

  public void setNumberOfOriginalsWithoutCharges(Integer numberOfOriginalsWithoutCharges) {
    this.numberOfOriginalsWithoutCharges = numberOfOriginalsWithoutCharges;
  }

  public TransportDocument displayedNameForPlaceOfReceipt(List<@Size(max = 35)String> displayedNameForPlaceOfReceipt) {
    this.displayedNameForPlaceOfReceipt = displayedNameForPlaceOfReceipt;
    return this;
  }

  public TransportDocument addDisplayedNameForPlaceOfReceiptItem(String displayedNameForPlaceOfReceiptItem) {
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

  public TransportDocument displayedNameForPortOfLoad(List<@Size(max = 35)String> displayedNameForPortOfLoad) {
    this.displayedNameForPortOfLoad = displayedNameForPortOfLoad;
    return this;
  }

  public TransportDocument addDisplayedNameForPortOfLoadItem(String displayedNameForPortOfLoadItem) {
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

  public TransportDocument displayedNameForPortOfDischarge(List<@Size(max = 35)String> displayedNameForPortOfDischarge) {
    this.displayedNameForPortOfDischarge = displayedNameForPortOfDischarge;
    return this;
  }

  public TransportDocument addDisplayedNameForPortOfDischargeItem(String displayedNameForPortOfDischargeItem) {
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

  public TransportDocument displayedNameForPlaceOfDelivery(List<@Size(max = 35)String> displayedNameForPlaceOfDelivery) {
    this.displayedNameForPlaceOfDelivery = displayedNameForPlaceOfDelivery;
    return this;
  }

  public TransportDocument addDisplayedNameForPlaceOfDeliveryItem(String displayedNameForPlaceOfDeliveryItem) {
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

  public TransportDocument shippedOnBoardDate(LocalDate shippedOnBoardDate) {
    this.shippedOnBoardDate = shippedOnBoardDate;
    return this;
  }

  /**
   * Date when the last container that is linked to the transport document is physically loaded onboard the vessel indicated on the transport document.  When provided on a transport document, the transportDocument is a `Shipped On Board` B/L.  Exactly one of `shippedOnBoard` and `receiveForShipmentDate` must be provided on an issued B/L. 
   * @return shippedOnBoardDate
   */
  @Valid 
  @Schema(name = "shippedOnBoardDate", example = "Sat Dec 12 01:00:00 CET 2020", description = "Date when the last container that is linked to the transport document is physically loaded onboard the vessel indicated on the transport document.  When provided on a transport document, the transportDocument is a `Shipped On Board` B/L.  Exactly one of `shippedOnBoard` and `receiveForShipmentDate` must be provided on an issued B/L. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippedOnBoardDate")
  public LocalDate getShippedOnBoardDate() {
    return shippedOnBoardDate;
  }

  public void setShippedOnBoardDate(LocalDate shippedOnBoardDate) {
    this.shippedOnBoardDate = shippedOnBoardDate;
  }

  public TransportDocument displayedShippedOnBoardReceivedForShipment(String displayedShippedOnBoardReceivedForShipment) {
    this.displayedShippedOnBoardReceivedForShipment = displayedShippedOnBoardReceivedForShipment;
    return this;
  }

  /**
   * The text to be displayed on the `Transport Document` as evidence that the goods have been received for shipment or shipped on board. 
   * @return displayedShippedOnBoardReceivedForShipment
   */
  @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 250) 
  @Schema(name = "displayedShippedOnBoardReceivedForShipment", example = "Received for Shipment CMA CGM CONCORDE 28-Jul-2022 CMA CGM Agences France SAS As agents for the Carrier", description = "The text to be displayed on the `Transport Document` as evidence that the goods have been received for shipment or shipped on board. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayedShippedOnBoardReceivedForShipment")
  public String getDisplayedShippedOnBoardReceivedForShipment() {
    return displayedShippedOnBoardReceivedForShipment;
  }

  public void setDisplayedShippedOnBoardReceivedForShipment(String displayedShippedOnBoardReceivedForShipment) {
    this.displayedShippedOnBoardReceivedForShipment = displayedShippedOnBoardReceivedForShipment;
  }

  public TransportDocument termsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

  /**
   * Carrier terms and conditions of transport. 
   * @return termsAndConditions
   */
  @NotNull @Size(max = 50000) 
  @Schema(name = "termsAndConditions", example = "Any reference in...", description = "Carrier terms and conditions of transport. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("termsAndConditions")
  public String getTermsAndConditions() {
    return termsAndConditions;
  }

  public void setTermsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  public TransportDocument receiptTypeAtOrigin(ReceiptTypeAtOriginEnum receiptTypeAtOrigin) {
    this.receiptTypeAtOrigin = receiptTypeAtOrigin;
    return this;
  }

  /**
   * Indicates the type of service offered at `Origin`. The options are: - `CY` (Container yard (incl. rail ramp)) - `SD` (Store Door) - `CFS` (Container Freight Station) 
   * @return receiptTypeAtOrigin
   */
  @NotNull @Size(max = 3) 
  @Schema(name = "receiptTypeAtOrigin", example = "CY", description = "Indicates the type of service offered at `Origin`. The options are: - `CY` (Container yard (incl. rail ramp)) - `SD` (Store Door) - `CFS` (Container Freight Station) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("receiptTypeAtOrigin")
  public ReceiptTypeAtOriginEnum getReceiptTypeAtOrigin() {
    return receiptTypeAtOrigin;
  }

  public void setReceiptTypeAtOrigin(ReceiptTypeAtOriginEnum receiptTypeAtOrigin) {
    this.receiptTypeAtOrigin = receiptTypeAtOrigin;
  }

  public TransportDocument deliveryTypeAtDestination(DeliveryTypeAtDestinationEnum deliveryTypeAtDestination) {
    this.deliveryTypeAtDestination = deliveryTypeAtDestination;
    return this;
  }

  /**
   * Indicates the type of service offered at `Destination`. The options are:  - `CY` (Container yard (incl. rail ramp)) - `SD` (Store Door) - `CFS` (Container Freight Station) 
   * @return deliveryTypeAtDestination
   */
  @NotNull @Size(max = 3) 
  @Schema(name = "deliveryTypeAtDestination", example = "CY", description = "Indicates the type of service offered at `Destination`. The options are:  - `CY` (Container yard (incl. rail ramp)) - `SD` (Store Door) - `CFS` (Container Freight Station) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deliveryTypeAtDestination")
  public DeliveryTypeAtDestinationEnum getDeliveryTypeAtDestination() {
    return deliveryTypeAtDestination;
  }

  public void setDeliveryTypeAtDestination(DeliveryTypeAtDestinationEnum deliveryTypeAtDestination) {
    this.deliveryTypeAtDestination = deliveryTypeAtDestination;
  }

  public TransportDocument cargoMovementTypeAtOrigin(String cargoMovementTypeAtOrigin) {
    this.cargoMovementTypeAtOrigin = cargoMovementTypeAtOrigin;
    return this;
  }

  /**
   * Refers to the shipment term at the **loading** of the cargo into the container. Possible values are:  - `FCL` (Full Container Load) - `LCL` (Less than Container Load) 
   * @return cargoMovementTypeAtOrigin
   */
  @NotNull @Size(max = 3) 
  @Schema(name = "cargoMovementTypeAtOrigin", example = "FCL", description = "Refers to the shipment term at the **loading** of the cargo into the container. Possible values are:  - `FCL` (Full Container Load) - `LCL` (Less than Container Load) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cargoMovementTypeAtOrigin")
  public String getCargoMovementTypeAtOrigin() {
    return cargoMovementTypeAtOrigin;
  }

  public void setCargoMovementTypeAtOrigin(String cargoMovementTypeAtOrigin) {
    this.cargoMovementTypeAtOrigin = cargoMovementTypeAtOrigin;
  }

  public TransportDocument cargoMovementTypeAtDestination(String cargoMovementTypeAtDestination) {
    this.cargoMovementTypeAtDestination = cargoMovementTypeAtDestination;
    return this;
  }

  /**
   * Refers to the shipment term at the **unloading** of the cargo out of the container. Possible values are:  - `FCL` (Full Container Load) - `LCL` (Less than Container Load) 
   * @return cargoMovementTypeAtDestination
   */
  @NotNull @Size(max = 3) 
  @Schema(name = "cargoMovementTypeAtDestination", example = "FCL", description = "Refers to the shipment term at the **unloading** of the cargo out of the container. Possible values are:  - `FCL` (Full Container Load) - `LCL` (Less than Container Load) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cargoMovementTypeAtDestination")
  public String getCargoMovementTypeAtDestination() {
    return cargoMovementTypeAtDestination;
  }

  public void setCargoMovementTypeAtDestination(String cargoMovementTypeAtDestination) {
    this.cargoMovementTypeAtDestination = cargoMovementTypeAtDestination;
  }

  public TransportDocument issueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  /**
   * Local date when the transport document has been issued.  Can be omitted on draft transport documents, but must be provided when the document has been issued. 
   * @return issueDate
   */
  @Valid 
  @Schema(name = "issueDate", example = "Sat Dec 12 01:00:00 CET 2020", description = "Local date when the transport document has been issued.  Can be omitted on draft transport documents, but must be provided when the document has been issued. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueDate")
  public LocalDate getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
  }

  public TransportDocument receivedForShipmentDate(LocalDate receivedForShipmentDate) {
    this.receivedForShipmentDate = receivedForShipmentDate;
    return this;
  }

  /**
   * Date when the last container linked to the transport document is physically in the terminal (customers cleared against the intended vessel).  When provided on a transport document, the transportDocument is a `Received For Shipment` B/L.  Exactly one of `shippedOnBoard` and `receiveForShipmentDate` must be provided on an issued B/L. 
   * @return receivedForShipmentDate
   */
  @Valid 
  @Schema(name = "receivedForShipmentDate", example = "Sat Dec 12 01:00:00 CET 2020", description = "Date when the last container linked to the transport document is physically in the terminal (customers cleared against the intended vessel).  When provided on a transport document, the transportDocument is a `Received For Shipment` B/L.  Exactly one of `shippedOnBoard` and `receiveForShipmentDate` must be provided on an issued B/L. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("receivedForShipmentDate")
  public LocalDate getReceivedForShipmentDate() {
    return receivedForShipmentDate;
  }

  public void setReceivedForShipmentDate(LocalDate receivedForShipmentDate) {
    this.receivedForShipmentDate = receivedForShipmentDate;
  }

  public TransportDocument serviceContractReference(String serviceContractReference) {
    this.serviceContractReference = serviceContractReference;
    return this;
  }

  /**
   * Reference number for agreement between shipper and carrier, which optionally includes a certain minimum quantity commitment (usually referred as “MQC”) of cargo that the shipper commits to over a fixed period, and the carrier commits to a certain rate or rate schedule. 
   * @return serviceContractReference
   */
  @Size(max = 30) 
  @Schema(name = "serviceContractReference", example = "HHL51800000", description = "Reference number for agreement between shipper and carrier, which optionally includes a certain minimum quantity commitment (usually referred as “MQC”) of cargo that the shipper commits to over a fixed period, and the carrier commits to a certain rate or rate schedule. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceContractReference")
  public String getServiceContractReference() {
    return serviceContractReference;
  }

  public void setServiceContractReference(String serviceContractReference) {
    this.serviceContractReference = serviceContractReference;
  }

  public TransportDocument contractQuotationReference(String contractQuotationReference) {
    this.contractQuotationReference = contractQuotationReference;
    return this;
  }

  /**
   * Information provided by the shipper to identify whether pricing for the shipment has been agreed via a contract or a quotation reference. 
   * @return contractQuotationReference
   */
  @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 35) 
  @Schema(name = "contractQuotationReference", example = "HHL1401", description = "Information provided by the shipper to identify whether pricing for the shipment has been agreed via a contract or a quotation reference. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contractQuotationReference")
  public String getContractQuotationReference() {
    return contractQuotationReference;
  }

  public void setContractQuotationReference(String contractQuotationReference) {
    this.contractQuotationReference = contractQuotationReference;
  }

  public TransportDocument declaredValue(Float declaredValue) {
    this.declaredValue = declaredValue;
    return this;
  }

  /**
   * The value of the cargo that the shipper declares in order to avoid the carrier's limitation of liability and \"Ad Valorem\" freight, i.e., freight which is calculated based on the value of the goods declared by the shipper.  **Condition:** Included in the transport document upon customer request. If customers want the value to show, evidence is required, and customers need to approve additional insurance fee charge from the carrier (very exceptional). 
   * minimum: 0
   * @return declaredValue
   */
  @DecimalMin("0") 
  @Schema(name = "declaredValue", example = "1231.1", description = "The value of the cargo that the shipper declares in order to avoid the carrier's limitation of liability and \"Ad Valorem\" freight, i.e., freight which is calculated based on the value of the goods declared by the shipper.  **Condition:** Included in the transport document upon customer request. If customers want the value to show, evidence is required, and customers need to approve additional insurance fee charge from the carrier (very exceptional). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("declaredValue")
  public Float getDeclaredValue() {
    return declaredValue;
  }

  public void setDeclaredValue(Float declaredValue) {
    this.declaredValue = declaredValue;
  }

  public TransportDocument declaredValueCurrency(String declaredValueCurrency) {
    this.declaredValueCurrency = declaredValueCurrency;
    return this;
  }

  /**
   * The currency used for the declared value, using the 3-character code defined by [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html). 
   * @return declaredValueCurrency
   */
  @Pattern(regexp = "^[A-Z]{3}$") @Size(min = 3, max = 3) 
  @Schema(name = "declaredValueCurrency", example = "DKK", description = "The currency used for the declared value, using the 3-character code defined by [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("declaredValueCurrency")
  public String getDeclaredValueCurrency() {
    return declaredValueCurrency;
  }

  public void setDeclaredValueCurrency(String declaredValueCurrency) {
    this.declaredValueCurrency = declaredValueCurrency;
  }

  public TransportDocument carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

  /**
   * The `SCAC` code (provided by [NMFTA](https://nmfta.org/scac/)) or `SMDG` code (provided by [SMDG](https://smdg.org/documents/smdg-code-lists/smdg-liner-code-list/)) of the issuing carrier of the `Transport Document`. `carrierCodeListProvider` defines which list the `carrierCode` is based upon. 
   * @return carrierCode
   */
  @NotNull @Pattern(regexp = "^\\S+$") @Size(max = 4) 
  @Schema(name = "carrierCode", example = "MMCU", description = "The `SCAC` code (provided by [NMFTA](https://nmfta.org/scac/)) or `SMDG` code (provided by [SMDG](https://smdg.org/documents/smdg-code-lists/smdg-liner-code-list/)) of the issuing carrier of the `Transport Document`. `carrierCodeListProvider` defines which list the `carrierCode` is based upon. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("carrierCode")
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }

  public TransportDocument carrierCodeListProvider(CarrierCodeListProviderEnum carrierCodeListProvider) {
    this.carrierCodeListProvider = carrierCodeListProvider;
    return this;
  }

  /**
   * The code list provider for the `carrierCode`. Possible values are: - `SMDG` (Ship Message Design Group) - `NMFTA` (National Motor Freight Traffic Association) 
   * @return carrierCodeListProvider
   */
  @NotNull 
  @Schema(name = "carrierCodeListProvider", example = "NMFTA", description = "The code list provider for the `carrierCode`. Possible values are: - `SMDG` (Ship Message Design Group) - `NMFTA` (National Motor Freight Traffic Association) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("carrierCodeListProvider")
  public CarrierCodeListProviderEnum getCarrierCodeListProvider() {
    return carrierCodeListProvider;
  }

  public void setCarrierCodeListProvider(CarrierCodeListProviderEnum carrierCodeListProvider) {
    this.carrierCodeListProvider = carrierCodeListProvider;
  }

  public TransportDocument carrierClauses(List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 20000)String> carrierClauses) {
    this.carrierClauses = carrierClauses;
    return this;
  }

  public TransportDocument addCarrierClausesItem(String carrierClausesItem) {
    if (this.carrierClauses == null) {
      this.carrierClauses = new ArrayList<>();
    }
    this.carrierClauses.add(carrierClausesItem);
    return this;
  }

  /**
   * Additional clauses for a specific shipment added by the carrier to the Bill of Lading, subject to local rules / guidelines or certain mandatory information required to be shared with the customer. 
   * @return carrierClauses
   */
  
  @Schema(name = "carrierClauses", description = "Additional clauses for a specific shipment added by the carrier to the Bill of Lading, subject to local rules / guidelines or certain mandatory information required to be shared with the customer. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carrierClauses")
  public List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 20000)String> getCarrierClauses() {
    return carrierClauses;
  }

  public void setCarrierClauses(List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 20000)String> carrierClauses) {
    this.carrierClauses = carrierClauses;
  }

  public TransportDocument numberOfRiderPages(Integer numberOfRiderPages) {
    this.numberOfRiderPages = numberOfRiderPages;
    return this;
  }

  /**
   * The number of additional pages required to contain the goods description on a transport document. Only applicable for physical transport documents. 
   * minimum: 0
   * @return numberOfRiderPages
   */
  @Min(0) 
  @Schema(name = "numberOfRiderPages", example = "2", description = "The number of additional pages required to contain the goods description on a transport document. Only applicable for physical transport documents. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfRiderPages")
  public Integer getNumberOfRiderPages() {
    return numberOfRiderPages;
  }

  public void setNumberOfRiderPages(Integer numberOfRiderPages) {
    this.numberOfRiderPages = numberOfRiderPages;
  }

  public TransportDocument transports(Transports transports) {
    this.transports = transports;
    return this;
  }

  /**
   * Get transports
   * @return transports
   */
  @NotNull @Valid 
  @Schema(name = "transports", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transports")
  public Transports getTransports() {
    return transports;
  }

  public void setTransports(Transports transports) {
    this.transports = transports;
  }

  public TransportDocument charges(List<@Valid Charge> charges) {
    this.charges = charges;
    return this;
  }

  public TransportDocument addChargesItem(Charge chargesItem) {
    if (this.charges == null) {
      this.charges = new ArrayList<>();
    }
    this.charges.add(chargesItem);
    return this;
  }

  /**
   * A list of `Charges` 
   * @return charges
   */
  @Valid 
  @Schema(name = "charges", description = "A list of `Charges` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("charges")
  public List<@Valid Charge> getCharges() {
    return charges;
  }

  public void setCharges(List<@Valid Charge> charges) {
    this.charges = charges;
  }

  public TransportDocument placeOfIssue(PlaceOfIssue placeOfIssue) {
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

  public TransportDocument invoicePayableAt(InvoicePayableAt1 invoicePayableAt) {
    this.invoicePayableAt = invoicePayableAt;
    return this;
  }

  /**
   * Get invoicePayableAt
   * @return invoicePayableAt
   */
  @NotNull @Valid 
  @Schema(name = "invoicePayableAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("invoicePayableAt")
  public InvoicePayableAt1 getInvoicePayableAt() {
    return invoicePayableAt;
  }

  public void setInvoicePayableAt(InvoicePayableAt1 invoicePayableAt) {
    this.invoicePayableAt = invoicePayableAt;
  }

  public TransportDocument partyContactDetails(List<@Valid PartyContactDetail> partyContactDetails) {
    this.partyContactDetails = partyContactDetails;
    return this;
  }

  public TransportDocument addPartyContactDetailsItem(PartyContactDetail partyContactDetailsItem) {
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

  public TransportDocument documentParties(DocumentParties1 documentParties) {
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
  public DocumentParties1 getDocumentParties() {
    return documentParties;
  }

  public void setDocumentParties(DocumentParties1 documentParties) {
    this.documentParties = documentParties;
  }

  public TransportDocument routingOfConsignmentCountries(List<@Pattern(regexp = "^[A-Z]{2}$")@Size(min = 2, max = 2)String> routingOfConsignmentCountries) {
    this.routingOfConsignmentCountries = routingOfConsignmentCountries;
    return this;
  }

  public TransportDocument addRoutingOfConsignmentCountriesItem(String routingOfConsignmentCountriesItem) {
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

  public TransportDocument consignmentItems(List<@Valid ConsignmentItem> consignmentItems) {
    this.consignmentItems = consignmentItems;
    return this;
  }

  public TransportDocument addConsignmentItemsItem(ConsignmentItem consignmentItemsItem) {
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
  public List<@Valid ConsignmentItem> getConsignmentItems() {
    return consignmentItems;
  }

  public void setConsignmentItems(List<@Valid ConsignmentItem> consignmentItems) {
    this.consignmentItems = consignmentItems;
  }

  public TransportDocument utilizedTransportEquipments(List<@Valid UtilizedTransportEquipment> utilizedTransportEquipments) {
    this.utilizedTransportEquipments = utilizedTransportEquipments;
    return this;
  }

  public TransportDocument addUtilizedTransportEquipmentsItem(UtilizedTransportEquipment utilizedTransportEquipmentsItem) {
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
  public List<@Valid UtilizedTransportEquipment> getUtilizedTransportEquipments() {
    return utilizedTransportEquipments;
  }

  public void setUtilizedTransportEquipments(List<@Valid UtilizedTransportEquipment> utilizedTransportEquipments) {
    this.utilizedTransportEquipments = utilizedTransportEquipments;
  }

  public TransportDocument references(List<@Valid Reference> references) {
    this.references = references;
    return this;
  }

  public TransportDocument addReferencesItem(Reference referencesItem) {
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

  public TransportDocument customsReferences(List<@Valid CustomsReference> customsReferences) {
    this.customsReferences = customsReferences;
    return this;
  }

  public TransportDocument addCustomsReferencesItem(CustomsReference customsReferencesItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportDocument transportDocument = (TransportDocument) o;
    return Objects.equals(this.transportDocumentReference, transportDocument.transportDocumentReference) &&
        Objects.equals(this.shippingInstructionsReference, transportDocument.shippingInstructionsReference) &&
        Objects.equals(this.transportDocumentStatus, transportDocument.transportDocumentStatus) &&
        Objects.equals(this.transportDocumentTypeCode, transportDocument.transportDocumentTypeCode) &&
        Objects.equals(this.isShippedOnBoardType, transportDocument.isShippedOnBoardType) &&
        Objects.equals(this.freightPaymentTermCode, transportDocument.freightPaymentTermCode) &&
        Objects.equals(this.isElectronic, transportDocument.isElectronic) &&
        Objects.equals(this.isToOrder, transportDocument.isToOrder) &&
        Objects.equals(this.numberOfCopiesWithCharges, transportDocument.numberOfCopiesWithCharges) &&
        Objects.equals(this.numberOfCopiesWithoutCharges, transportDocument.numberOfCopiesWithoutCharges) &&
        Objects.equals(this.numberOfOriginalsWithCharges, transportDocument.numberOfOriginalsWithCharges) &&
        Objects.equals(this.numberOfOriginalsWithoutCharges, transportDocument.numberOfOriginalsWithoutCharges) &&
        Objects.equals(this.displayedNameForPlaceOfReceipt, transportDocument.displayedNameForPlaceOfReceipt) &&
        Objects.equals(this.displayedNameForPortOfLoad, transportDocument.displayedNameForPortOfLoad) &&
        Objects.equals(this.displayedNameForPortOfDischarge, transportDocument.displayedNameForPortOfDischarge) &&
        Objects.equals(this.displayedNameForPlaceOfDelivery, transportDocument.displayedNameForPlaceOfDelivery) &&
        Objects.equals(this.shippedOnBoardDate, transportDocument.shippedOnBoardDate) &&
        Objects.equals(this.displayedShippedOnBoardReceivedForShipment, transportDocument.displayedShippedOnBoardReceivedForShipment) &&
        Objects.equals(this.termsAndConditions, transportDocument.termsAndConditions) &&
        Objects.equals(this.receiptTypeAtOrigin, transportDocument.receiptTypeAtOrigin) &&
        Objects.equals(this.deliveryTypeAtDestination, transportDocument.deliveryTypeAtDestination) &&
        Objects.equals(this.cargoMovementTypeAtOrigin, transportDocument.cargoMovementTypeAtOrigin) &&
        Objects.equals(this.cargoMovementTypeAtDestination, transportDocument.cargoMovementTypeAtDestination) &&
        Objects.equals(this.issueDate, transportDocument.issueDate) &&
        Objects.equals(this.receivedForShipmentDate, transportDocument.receivedForShipmentDate) &&
        Objects.equals(this.serviceContractReference, transportDocument.serviceContractReference) &&
        Objects.equals(this.contractQuotationReference, transportDocument.contractQuotationReference) &&
        Objects.equals(this.declaredValue, transportDocument.declaredValue) &&
        Objects.equals(this.declaredValueCurrency, transportDocument.declaredValueCurrency) &&
        Objects.equals(this.carrierCode, transportDocument.carrierCode) &&
        Objects.equals(this.carrierCodeListProvider, transportDocument.carrierCodeListProvider) &&
        Objects.equals(this.carrierClauses, transportDocument.carrierClauses) &&
        Objects.equals(this.numberOfRiderPages, transportDocument.numberOfRiderPages) &&
        Objects.equals(this.transports, transportDocument.transports) &&
        Objects.equals(this.charges, transportDocument.charges) &&
        Objects.equals(this.placeOfIssue, transportDocument.placeOfIssue) &&
        Objects.equals(this.invoicePayableAt, transportDocument.invoicePayableAt) &&
        Objects.equals(this.partyContactDetails, transportDocument.partyContactDetails) &&
        Objects.equals(this.documentParties, transportDocument.documentParties) &&
        Objects.equals(this.routingOfConsignmentCountries, transportDocument.routingOfConsignmentCountries) &&
        Objects.equals(this.consignmentItems, transportDocument.consignmentItems) &&
        Objects.equals(this.utilizedTransportEquipments, transportDocument.utilizedTransportEquipments) &&
        Objects.equals(this.references, transportDocument.references) &&
        Objects.equals(this.customsReferences, transportDocument.customsReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transportDocumentReference, shippingInstructionsReference, transportDocumentStatus, transportDocumentTypeCode, isShippedOnBoardType, freightPaymentTermCode, isElectronic, isToOrder, numberOfCopiesWithCharges, numberOfCopiesWithoutCharges, numberOfOriginalsWithCharges, numberOfOriginalsWithoutCharges, displayedNameForPlaceOfReceipt, displayedNameForPortOfLoad, displayedNameForPortOfDischarge, displayedNameForPlaceOfDelivery, shippedOnBoardDate, displayedShippedOnBoardReceivedForShipment, termsAndConditions, receiptTypeAtOrigin, deliveryTypeAtDestination, cargoMovementTypeAtOrigin, cargoMovementTypeAtDestination, issueDate, receivedForShipmentDate, serviceContractReference, contractQuotationReference, declaredValue, declaredValueCurrency, carrierCode, carrierCodeListProvider, carrierClauses, numberOfRiderPages, transports, charges, placeOfIssue, invoicePayableAt, partyContactDetails, documentParties, routingOfConsignmentCountries, consignmentItems, utilizedTransportEquipments, references, customsReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportDocument {\n");
    sb.append("    transportDocumentReference: ").append(toIndentedString(transportDocumentReference)).append("\n");
    sb.append("    shippingInstructionsReference: ").append(toIndentedString(shippingInstructionsReference)).append("\n");
    sb.append("    transportDocumentStatus: ").append(toIndentedString(transportDocumentStatus)).append("\n");
    sb.append("    transportDocumentTypeCode: ").append(toIndentedString(transportDocumentTypeCode)).append("\n");
    sb.append("    isShippedOnBoardType: ").append(toIndentedString(isShippedOnBoardType)).append("\n");
    sb.append("    freightPaymentTermCode: ").append(toIndentedString(freightPaymentTermCode)).append("\n");
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
    sb.append("    shippedOnBoardDate: ").append(toIndentedString(shippedOnBoardDate)).append("\n");
    sb.append("    displayedShippedOnBoardReceivedForShipment: ").append(toIndentedString(displayedShippedOnBoardReceivedForShipment)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("    receiptTypeAtOrigin: ").append(toIndentedString(receiptTypeAtOrigin)).append("\n");
    sb.append("    deliveryTypeAtDestination: ").append(toIndentedString(deliveryTypeAtDestination)).append("\n");
    sb.append("    cargoMovementTypeAtOrigin: ").append(toIndentedString(cargoMovementTypeAtOrigin)).append("\n");
    sb.append("    cargoMovementTypeAtDestination: ").append(toIndentedString(cargoMovementTypeAtDestination)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    receivedForShipmentDate: ").append(toIndentedString(receivedForShipmentDate)).append("\n");
    sb.append("    serviceContractReference: ").append(toIndentedString(serviceContractReference)).append("\n");
    sb.append("    contractQuotationReference: ").append(toIndentedString(contractQuotationReference)).append("\n");
    sb.append("    declaredValue: ").append(toIndentedString(declaredValue)).append("\n");
    sb.append("    declaredValueCurrency: ").append(toIndentedString(declaredValueCurrency)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    carrierCodeListProvider: ").append(toIndentedString(carrierCodeListProvider)).append("\n");
    sb.append("    carrierClauses: ").append(toIndentedString(carrierClauses)).append("\n");
    sb.append("    numberOfRiderPages: ").append(toIndentedString(numberOfRiderPages)).append("\n");
    sb.append("    transports: ").append(toIndentedString(transports)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    placeOfIssue: ").append(toIndentedString(placeOfIssue)).append("\n");
    sb.append("    invoicePayableAt: ").append(toIndentedString(invoicePayableAt)).append("\n");
    sb.append("    partyContactDetails: ").append(toIndentedString(partyContactDetails)).append("\n");
    sb.append("    documentParties: ").append(toIndentedString(documentParties)).append("\n");
    sb.append("    routingOfConsignmentCountries: ").append(toIndentedString(routingOfConsignmentCountries)).append("\n");
    sb.append("    consignmentItems: ").append(toIndentedString(consignmentItems)).append("\n");
    sb.append("    utilizedTransportEquipments: ").append(toIndentedString(utilizedTransportEquipments)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    customsReferences: ").append(toIndentedString(customsReferences)).append("\n");
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

