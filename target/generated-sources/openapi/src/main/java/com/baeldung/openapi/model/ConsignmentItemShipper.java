package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.CargoItemShipper;
import com.baeldung.openapi.model.CustomsReference;
import com.baeldung.openapi.model.NationalCommodityCode;
import com.baeldung.openapi.model.Reference;
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
 * Defines a list of &#x60;CargoItems&#x60; belonging together and the associated &#x60;Booking&#x60;. A &#x60;ConsignmentItem&#x60; can be split across multiple containers (&#x60;UtilizedTransportEquipment&#x60;) by referencing multiple &#x60;CargoItems&#x60; 
 */

@Schema(name = "ConsignmentItemShipper", description = "Defines a list of `CargoItems` belonging together and the associated `Booking`. A `ConsignmentItem` can be split across multiple containers (`UtilizedTransportEquipment`) by referencing multiple `CargoItems` ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class ConsignmentItemShipper {

  private String carrierBookingReference;

  private String commoditySubreference;

  @Valid
  private List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 35)String> descriptionOfGoods = new ArrayList<>();

  @Valid
  private List<@Pattern(regexp = "^\\d{6,10}$")@Size(min = 6, max = 10)String> hsCodes = new ArrayList<>();

  @Valid
  private List<@Valid NationalCommodityCode> nationalCommodityCodes = new ArrayList<>();

  @Valid
  private List<@Size(max = 35)String> shippingMarks = new ArrayList<>();

  @Valid
  private List<@Valid CargoItemShipper> cargoItems = new ArrayList<>();

  @Valid
  private List<@Valid Reference> references = new ArrayList<>();

  @Valid
  private List<@Valid CustomsReference> customsReferences = new ArrayList<>();

  public ConsignmentItemShipper() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConsignmentItemShipper(String carrierBookingReference, List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 35)String> descriptionOfGoods, List<@Pattern(regexp = "^\\d{6,10}$")@Size(min = 6, max = 10)String> hsCodes, List<@Valid CargoItemShipper> cargoItems) {
    this.carrierBookingReference = carrierBookingReference;
    this.descriptionOfGoods = descriptionOfGoods;
    this.hsCodes = hsCodes;
    this.cargoItems = cargoItems;
  }

  public ConsignmentItemShipper carrierBookingReference(String carrierBookingReference) {
    this.carrierBookingReference = carrierBookingReference;
    return this;
  }

  /**
   * The associated booking number provided by the carrier for this `Consignment Item`.  When multiple `carrierBookingReferences` are used then the bookings referred to must all contain the same: - transportPlan - shipmentLocations - receiptTypeAtOrigin - deliveryTypeAtDestination - cargoMovementTypeAtOrigin - cargoMovementTypeAtDestination - serviceContractReference - termsAndConditions - Place of B/L Issue (if provided) 
   * @return carrierBookingReference
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 35) 
  @Schema(name = "carrierBookingReference", example = "ABC709951", description = "The associated booking number provided by the carrier for this `Consignment Item`.  When multiple `carrierBookingReferences` are used then the bookings referred to must all contain the same: - transportPlan - shipmentLocations - receiptTypeAtOrigin - deliveryTypeAtDestination - cargoMovementTypeAtOrigin - cargoMovementTypeAtDestination - serviceContractReference - termsAndConditions - Place of B/L Issue (if provided) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("carrierBookingReference")
  public String getCarrierBookingReference() {
    return carrierBookingReference;
  }

  public void setCarrierBookingReference(String carrierBookingReference) {
    this.carrierBookingReference = carrierBookingReference;
  }

  public ConsignmentItemShipper commoditySubreference(String commoditySubreference) {
    this.commoditySubreference = commoditySubreference;
    return this;
  }

  /**
   * A unique reference to the commodity object assigned by the carrier in the booking confirmation. The reference must be provided by the shipper as part of the `Shipping Instructions` for the carrier to link this consignment item to the commodity. A commodity reference is only unique in the context of a booking. 
   * @return commoditySubreference
   */
  @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 100) 
  @Schema(name = "commoditySubreference", example = "COM-001", description = "A unique reference to the commodity object assigned by the carrier in the booking confirmation. The reference must be provided by the shipper as part of the `Shipping Instructions` for the carrier to link this consignment item to the commodity. A commodity reference is only unique in the context of a booking. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commoditySubreference")
  public String getCommoditySubreference() {
    return commoditySubreference;
  }

  public void setCommoditySubreference(String commoditySubreference) {
    this.commoditySubreference = commoditySubreference;
  }

  public ConsignmentItemShipper descriptionOfGoods(List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 35)String> descriptionOfGoods) {
    this.descriptionOfGoods = descriptionOfGoods;
    return this;
  }

  public ConsignmentItemShipper addDescriptionOfGoodsItem(String descriptionOfGoodsItem) {
    if (this.descriptionOfGoods == null) {
      this.descriptionOfGoods = new ArrayList<>();
    }
    this.descriptionOfGoods.add(descriptionOfGoodsItem);
    return this;
  }

  /**
   * An array of lines accurately and properly describing the cargo being shipped in the container(s) as provided by the shipper. 
   * @return descriptionOfGoods
   */
  @NotNull @Size(max = 150) 
  @Schema(name = "descriptionOfGoods", description = "An array of lines accurately and properly describing the cargo being shipped in the container(s) as provided by the shipper. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("descriptionOfGoods")
  public List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 35)String> getDescriptionOfGoods() {
    return descriptionOfGoods;
  }

  public void setDescriptionOfGoods(List<@Pattern(regexp = "^\\S(?:.*\\S)?$")@Size(max = 35)String> descriptionOfGoods) {
    this.descriptionOfGoods = descriptionOfGoods;
  }

  public ConsignmentItemShipper hsCodes(List<@Pattern(regexp = "^\\d{6,10}$")@Size(min = 6, max = 10)String> hsCodes) {
    this.hsCodes = hsCodes;
    return this;
  }

  public ConsignmentItemShipper addHsCodesItem(String hsCodesItem) {
    if (this.hsCodes == null) {
      this.hsCodes = new ArrayList<>();
    }
    this.hsCodes.add(hsCodesItem);
    return this;
  }

  /**
   * A list of `HS Codes` that apply to this `consignmentItem` 
   * @return hsCodes
   */
  @NotNull @Size(min = 1) 
  @Schema(name = "HSCodes", description = "A list of `HS Codes` that apply to this `consignmentItem` ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("HSCodes")
  public List<@Pattern(regexp = "^\\d{6,10}$")@Size(min = 6, max = 10)String> getHsCodes() {
    return hsCodes;
  }

  public void setHsCodes(List<@Pattern(regexp = "^\\d{6,10}$")@Size(min = 6, max = 10)String> hsCodes) {
    this.hsCodes = hsCodes;
  }

  public ConsignmentItemShipper nationalCommodityCodes(List<@Valid NationalCommodityCode> nationalCommodityCodes) {
    this.nationalCommodityCodes = nationalCommodityCodes;
    return this;
  }

  public ConsignmentItemShipper addNationalCommodityCodesItem(NationalCommodityCode nationalCommodityCodesItem) {
    if (this.nationalCommodityCodes == null) {
      this.nationalCommodityCodes = new ArrayList<>();
    }
    this.nationalCommodityCodes.add(nationalCommodityCodesItem);
    return this;
  }

  /**
   * A list of `National Commodity Codes` that apply to this `commodity` 
   * @return nationalCommodityCodes
   */
  @Valid 
  @Schema(name = "nationalCommodityCodes", description = "A list of `National Commodity Codes` that apply to this `commodity` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nationalCommodityCodes")
  public List<@Valid NationalCommodityCode> getNationalCommodityCodes() {
    return nationalCommodityCodes;
  }

  public void setNationalCommodityCodes(List<@Valid NationalCommodityCode> nationalCommodityCodes) {
    this.nationalCommodityCodes = nationalCommodityCodes;
  }

  public ConsignmentItemShipper shippingMarks(List<@Size(max = 35)String> shippingMarks) {
    this.shippingMarks = shippingMarks;
    return this;
  }

  public ConsignmentItemShipper addShippingMarksItem(String shippingMarksItem) {
    if (this.shippingMarks == null) {
      this.shippingMarks = new ArrayList<>();
    }
    this.shippingMarks.add(shippingMarksItem);
    return this;
  }

  /**
   * A list of the `ShippingMarks` applicable to this `consignmentItem` 
   * @return shippingMarks
   */
  @Size(max = 50) 
  @Schema(name = "shippingMarks", description = "A list of the `ShippingMarks` applicable to this `consignmentItem` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingMarks")
  public List<@Size(max = 35)String> getShippingMarks() {
    return shippingMarks;
  }

  public void setShippingMarks(List<@Size(max = 35)String> shippingMarks) {
    this.shippingMarks = shippingMarks;
  }

  public ConsignmentItemShipper cargoItems(List<@Valid CargoItemShipper> cargoItems) {
    this.cargoItems = cargoItems;
    return this;
  }

  public ConsignmentItemShipper addCargoItemsItem(CargoItemShipper cargoItemsItem) {
    if (this.cargoItems == null) {
      this.cargoItems = new ArrayList<>();
    }
    this.cargoItems.add(cargoItemsItem);
    return this;
  }

  /**
   * A list of all `cargoItems` 
   * @return cargoItems
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "cargoItems", description = "A list of all `cargoItems` ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cargoItems")
  public List<@Valid CargoItemShipper> getCargoItems() {
    return cargoItems;
  }

  public void setCargoItems(List<@Valid CargoItemShipper> cargoItems) {
    this.cargoItems = cargoItems;
  }

  public ConsignmentItemShipper references(List<@Valid Reference> references) {
    this.references = references;
    return this;
  }

  public ConsignmentItemShipper addReferencesItem(Reference referencesItem) {
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

  public ConsignmentItemShipper customsReferences(List<@Valid CustomsReference> customsReferences) {
    this.customsReferences = customsReferences;
    return this;
  }

  public ConsignmentItemShipper addCustomsReferencesItem(CustomsReference customsReferencesItem) {
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
    ConsignmentItemShipper consignmentItemShipper = (ConsignmentItemShipper) o;
    return Objects.equals(this.carrierBookingReference, consignmentItemShipper.carrierBookingReference) &&
        Objects.equals(this.commoditySubreference, consignmentItemShipper.commoditySubreference) &&
        Objects.equals(this.descriptionOfGoods, consignmentItemShipper.descriptionOfGoods) &&
        Objects.equals(this.hsCodes, consignmentItemShipper.hsCodes) &&
        Objects.equals(this.nationalCommodityCodes, consignmentItemShipper.nationalCommodityCodes) &&
        Objects.equals(this.shippingMarks, consignmentItemShipper.shippingMarks) &&
        Objects.equals(this.cargoItems, consignmentItemShipper.cargoItems) &&
        Objects.equals(this.references, consignmentItemShipper.references) &&
        Objects.equals(this.customsReferences, consignmentItemShipper.customsReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierBookingReference, commoditySubreference, descriptionOfGoods, hsCodes, nationalCommodityCodes, shippingMarks, cargoItems, references, customsReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsignmentItemShipper {\n");
    sb.append("    carrierBookingReference: ").append(toIndentedString(carrierBookingReference)).append("\n");
    sb.append("    commoditySubreference: ").append(toIndentedString(commoditySubreference)).append("\n");
    sb.append("    descriptionOfGoods: ").append(toIndentedString(descriptionOfGoods)).append("\n");
    sb.append("    hsCodes: ").append(toIndentedString(hsCodes)).append("\n");
    sb.append("    nationalCommodityCodes: ").append(toIndentedString(nationalCommodityCodes)).append("\n");
    sb.append("    shippingMarks: ").append(toIndentedString(shippingMarks)).append("\n");
    sb.append("    cargoItems: ").append(toIndentedString(cargoItems)).append("\n");
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

