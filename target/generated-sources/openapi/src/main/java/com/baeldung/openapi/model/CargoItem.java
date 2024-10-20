package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.CargoGrossVolume;
import com.baeldung.openapi.model.CargoGrossWeight;
import com.baeldung.openapi.model.CargoNetVolume;
import com.baeldung.openapi.model.CargoNetWeight;
import com.baeldung.openapi.model.CustomsReference;
import com.baeldung.openapi.model.NationalCommodityCode;
import com.baeldung.openapi.model.OuterPackaging;
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
 * A &#x60;cargoItem&#x60; is the smallest unit used by stuffing. A &#x60;cargoItem&#x60; cannot be split across containers. 
 */

@Schema(name = "CargoItem", description = "A `cargoItem` is the smallest unit used by stuffing. A `cargoItem` cannot be split across containers. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class CargoItem {

  private String equipmentReference;

  private CargoGrossWeight cargoGrossWeight;

  private CargoGrossVolume cargoGrossVolume;

  private CargoNetWeight cargoNetWeight;

  private CargoNetVolume cargoNetVolume;

  private OuterPackaging outerPackaging;

  @Valid
  private List<@Valid NationalCommodityCode> nationalCommodityCodes = new ArrayList<>();

  @Valid
  private List<@Valid CustomsReference> customsReferences = new ArrayList<>();

  public CargoItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CargoItem(String equipmentReference, CargoGrossWeight cargoGrossWeight, OuterPackaging outerPackaging) {
    this.equipmentReference = equipmentReference;
    this.cargoGrossWeight = cargoGrossWeight;
    this.outerPackaging = outerPackaging;
  }

  public CargoItem equipmentReference(String equipmentReference) {
    this.equipmentReference = equipmentReference;
    return this;
  }

  /**
   * The unique identifier for the equipment, which should follow the BIC ISO Container Identification Number where possible. According to [ISO 6346](https://www.iso.org/standard/83558.html), a container identification code consists of a 4-letter prefix and a 7-digit number (composed of a 3-letter owner code, a category identifier, a serial number, and a check-digit).  If a container does not comply with [ISO 6346](https://www.iso.org/standard/83558.html), it is suggested to follow [Recommendation #2: Containers with non-ISO identification](https://smdg.org/documents/smdg-recommendations) from SMDG. 
   * @return equipmentReference
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 11) 
  @Schema(name = "equipmentReference", example = "APZU4812090", description = "The unique identifier for the equipment, which should follow the BIC ISO Container Identification Number where possible. According to [ISO 6346](https://www.iso.org/standard/83558.html), a container identification code consists of a 4-letter prefix and a 7-digit number (composed of a 3-letter owner code, a category identifier, a serial number, and a check-digit).  If a container does not comply with [ISO 6346](https://www.iso.org/standard/83558.html), it is suggested to follow [Recommendation #2: Containers with non-ISO identification](https://smdg.org/documents/smdg-recommendations) from SMDG. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("equipmentReference")
  public String getEquipmentReference() {
    return equipmentReference;
  }

  public void setEquipmentReference(String equipmentReference) {
    this.equipmentReference = equipmentReference;
  }

  public CargoItem cargoGrossWeight(CargoGrossWeight cargoGrossWeight) {
    this.cargoGrossWeight = cargoGrossWeight;
    return this;
  }

  /**
   * Get cargoGrossWeight
   * @return cargoGrossWeight
   */
  @NotNull @Valid 
  @Schema(name = "cargoGrossWeight", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cargoGrossWeight")
  public CargoGrossWeight getCargoGrossWeight() {
    return cargoGrossWeight;
  }

  public void setCargoGrossWeight(CargoGrossWeight cargoGrossWeight) {
    this.cargoGrossWeight = cargoGrossWeight;
  }

  public CargoItem cargoGrossVolume(CargoGrossVolume cargoGrossVolume) {
    this.cargoGrossVolume = cargoGrossVolume;
    return this;
  }

  /**
   * Get cargoGrossVolume
   * @return cargoGrossVolume
   */
  @Valid 
  @Schema(name = "cargoGrossVolume", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cargoGrossVolume")
  public CargoGrossVolume getCargoGrossVolume() {
    return cargoGrossVolume;
  }

  public void setCargoGrossVolume(CargoGrossVolume cargoGrossVolume) {
    this.cargoGrossVolume = cargoGrossVolume;
  }

  public CargoItem cargoNetWeight(CargoNetWeight cargoNetWeight) {
    this.cargoNetWeight = cargoNetWeight;
    return this;
  }

  /**
   * Get cargoNetWeight
   * @return cargoNetWeight
   */
  @Valid 
  @Schema(name = "cargoNetWeight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cargoNetWeight")
  public CargoNetWeight getCargoNetWeight() {
    return cargoNetWeight;
  }

  public void setCargoNetWeight(CargoNetWeight cargoNetWeight) {
    this.cargoNetWeight = cargoNetWeight;
  }

  public CargoItem cargoNetVolume(CargoNetVolume cargoNetVolume) {
    this.cargoNetVolume = cargoNetVolume;
    return this;
  }

  /**
   * Get cargoNetVolume
   * @return cargoNetVolume
   */
  @Valid 
  @Schema(name = "cargoNetVolume", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cargoNetVolume")
  public CargoNetVolume getCargoNetVolume() {
    return cargoNetVolume;
  }

  public void setCargoNetVolume(CargoNetVolume cargoNetVolume) {
    this.cargoNetVolume = cargoNetVolume;
  }

  public CargoItem outerPackaging(OuterPackaging outerPackaging) {
    this.outerPackaging = outerPackaging;
    return this;
  }

  /**
   * Get outerPackaging
   * @return outerPackaging
   */
  @NotNull @Valid 
  @Schema(name = "outerPackaging", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("outerPackaging")
  public OuterPackaging getOuterPackaging() {
    return outerPackaging;
  }

  public void setOuterPackaging(OuterPackaging outerPackaging) {
    this.outerPackaging = outerPackaging;
  }

  public CargoItem nationalCommodityCodes(List<@Valid NationalCommodityCode> nationalCommodityCodes) {
    this.nationalCommodityCodes = nationalCommodityCodes;
    return this;
  }

  public CargoItem addNationalCommodityCodesItem(NationalCommodityCode nationalCommodityCodesItem) {
    if (this.nationalCommodityCodes == null) {
      this.nationalCommodityCodes = new ArrayList<>();
    }
    this.nationalCommodityCodes.add(nationalCommodityCodesItem);
    return this;
  }

  /**
   * A list of `National Commodity Codes` that apply to this `cargoItem` 
   * @return nationalCommodityCodes
   */
  @Valid 
  @Schema(name = "nationalCommodityCodes", description = "A list of `National Commodity Codes` that apply to this `cargoItem` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nationalCommodityCodes")
  public List<@Valid NationalCommodityCode> getNationalCommodityCodes() {
    return nationalCommodityCodes;
  }

  public void setNationalCommodityCodes(List<@Valid NationalCommodityCode> nationalCommodityCodes) {
    this.nationalCommodityCodes = nationalCommodityCodes;
  }

  public CargoItem customsReferences(List<@Valid CustomsReference> customsReferences) {
    this.customsReferences = customsReferences;
    return this;
  }

  public CargoItem addCustomsReferencesItem(CustomsReference customsReferencesItem) {
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
    CargoItem cargoItem = (CargoItem) o;
    return Objects.equals(this.equipmentReference, cargoItem.equipmentReference) &&
        Objects.equals(this.cargoGrossWeight, cargoItem.cargoGrossWeight) &&
        Objects.equals(this.cargoGrossVolume, cargoItem.cargoGrossVolume) &&
        Objects.equals(this.cargoNetWeight, cargoItem.cargoNetWeight) &&
        Objects.equals(this.cargoNetVolume, cargoItem.cargoNetVolume) &&
        Objects.equals(this.outerPackaging, cargoItem.outerPackaging) &&
        Objects.equals(this.nationalCommodityCodes, cargoItem.nationalCommodityCodes) &&
        Objects.equals(this.customsReferences, cargoItem.customsReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equipmentReference, cargoGrossWeight, cargoGrossVolume, cargoNetWeight, cargoNetVolume, outerPackaging, nationalCommodityCodes, customsReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargoItem {\n");
    sb.append("    equipmentReference: ").append(toIndentedString(equipmentReference)).append("\n");
    sb.append("    cargoGrossWeight: ").append(toIndentedString(cargoGrossWeight)).append("\n");
    sb.append("    cargoGrossVolume: ").append(toIndentedString(cargoGrossVolume)).append("\n");
    sb.append("    cargoNetWeight: ").append(toIndentedString(cargoNetWeight)).append("\n");
    sb.append("    cargoNetVolume: ").append(toIndentedString(cargoNetVolume)).append("\n");
    sb.append("    outerPackaging: ").append(toIndentedString(outerPackaging)).append("\n");
    sb.append("    nationalCommodityCodes: ").append(toIndentedString(nationalCommodityCodes)).append("\n");
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

