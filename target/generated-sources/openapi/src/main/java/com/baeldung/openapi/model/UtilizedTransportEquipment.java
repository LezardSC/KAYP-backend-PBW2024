package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.ActiveReeferSettings;
import com.baeldung.openapi.model.CustomsReference;
import com.baeldung.openapi.model.Equipment;
import com.baeldung.openapi.model.Reference;
import com.baeldung.openapi.model.Seal;
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
 * Specifies the container (&#x60;equipment&#x60;), the total &#x60;weight&#x60;, total &#x60;volume&#x60;, possible &#x60;ActiveReeferSettings&#x60;, &#x60;seals&#x60; and &#x60;references&#x60; 
 */

@Schema(name = "UtilizedTransportEquipment", description = "Specifies the container (`equipment`), the total `weight`, total `volume`, possible `ActiveReeferSettings`, `seals` and `references` ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class UtilizedTransportEquipment {

  private Equipment equipment;

  private Boolean isShipperOwned;

  private Boolean isNonOperatingReefer;

  private ActiveReeferSettings activeReeferSettings;

  @Valid
  private List<@Size(max = 35)String> shippingMarks = new ArrayList<>();

  @Valid
  private List<@Valid Seal> seals = new ArrayList<>();

  @Valid
  private List<@Valid Reference> references = new ArrayList<>();

  @Valid
  private List<@Valid CustomsReference> customsReferences = new ArrayList<>();

  public UtilizedTransportEquipment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UtilizedTransportEquipment(Equipment equipment, Boolean isShipperOwned, List<@Valid Seal> seals) {
    this.equipment = equipment;
    this.isShipperOwned = isShipperOwned;
    this.seals = seals;
  }

  public UtilizedTransportEquipment equipment(Equipment equipment) {
    this.equipment = equipment;
    return this;
  }

  /**
   * Get equipment
   * @return equipment
   */
  @NotNull @Valid 
  @Schema(name = "equipment", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("equipment")
  public Equipment getEquipment() {
    return equipment;
  }

  public void setEquipment(Equipment equipment) {
    this.equipment = equipment;
  }

  public UtilizedTransportEquipment isShipperOwned(Boolean isShipperOwned) {
    this.isShipperOwned = isShipperOwned;
    return this;
  }

  /**
   * Indicates whether the container is shipper owned (SOC). 
   * @return isShipperOwned
   */
  @NotNull 
  @Schema(name = "isShipperOwned", example = "true", description = "Indicates whether the container is shipper owned (SOC). ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isShipperOwned")
  public Boolean getIsShipperOwned() {
    return isShipperOwned;
  }

  public void setIsShipperOwned(Boolean isShipperOwned) {
    this.isShipperOwned = isShipperOwned;
  }

  public UtilizedTransportEquipment isNonOperatingReefer(Boolean isNonOperatingReefer) {
    this.isNonOperatingReefer = isNonOperatingReefer;
    return this;
  }

  /**
   * If the equipment is a Reefer Container then setting this attribute will indicate that the container should be treated as a `DRY` container.  **Condition:** Only applicable if `ISOEquipmentCode` shows a Reefer type. 
   * @return isNonOperatingReefer
   */
  
  @Schema(name = "isNonOperatingReefer", example = "false", description = "If the equipment is a Reefer Container then setting this attribute will indicate that the container should be treated as a `DRY` container.  **Condition:** Only applicable if `ISOEquipmentCode` shows a Reefer type. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isNonOperatingReefer")
  public Boolean getIsNonOperatingReefer() {
    return isNonOperatingReefer;
  }

  public void setIsNonOperatingReefer(Boolean isNonOperatingReefer) {
    this.isNonOperatingReefer = isNonOperatingReefer;
  }

  public UtilizedTransportEquipment activeReeferSettings(ActiveReeferSettings activeReeferSettings) {
    this.activeReeferSettings = activeReeferSettings;
    return this;
  }

  /**
   * Get activeReeferSettings
   * @return activeReeferSettings
   */
  @Valid 
  @Schema(name = "activeReeferSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activeReeferSettings")
  public ActiveReeferSettings getActiveReeferSettings() {
    return activeReeferSettings;
  }

  public void setActiveReeferSettings(ActiveReeferSettings activeReeferSettings) {
    this.activeReeferSettings = activeReeferSettings;
  }

  public UtilizedTransportEquipment shippingMarks(List<@Size(max = 35)String> shippingMarks) {
    this.shippingMarks = shippingMarks;
    return this;
  }

  public UtilizedTransportEquipment addShippingMarksItem(String shippingMarksItem) {
    if (this.shippingMarks == null) {
      this.shippingMarks = new ArrayList<>();
    }
    this.shippingMarks.add(shippingMarksItem);
    return this;
  }

  /**
   * A list of the `ShippingMarks` applicable to this `UtilizedTransportEquipment` 
   * @return shippingMarks
   */
  @Size(max = 50) 
  @Schema(name = "shippingMarks", description = "A list of the `ShippingMarks` applicable to this `UtilizedTransportEquipment` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingMarks")
  public List<@Size(max = 35)String> getShippingMarks() {
    return shippingMarks;
  }

  public void setShippingMarks(List<@Size(max = 35)String> shippingMarks) {
    this.shippingMarks = shippingMarks;
  }

  public UtilizedTransportEquipment seals(List<@Valid Seal> seals) {
    this.seals = seals;
    return this;
  }

  public UtilizedTransportEquipment addSealsItem(Seal sealsItem) {
    if (this.seals == null) {
      this.seals = new ArrayList<>();
    }
    this.seals.add(sealsItem);
    return this;
  }

  /**
   * A list of `Seals` 
   * @return seals
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "seals", description = "A list of `Seals` ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("seals")
  public List<@Valid Seal> getSeals() {
    return seals;
  }

  public void setSeals(List<@Valid Seal> seals) {
    this.seals = seals;
  }

  public UtilizedTransportEquipment references(List<@Valid Reference> references) {
    this.references = references;
    return this;
  }

  public UtilizedTransportEquipment addReferencesItem(Reference referencesItem) {
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

  public UtilizedTransportEquipment customsReferences(List<@Valid CustomsReference> customsReferences) {
    this.customsReferences = customsReferences;
    return this;
  }

  public UtilizedTransportEquipment addCustomsReferencesItem(CustomsReference customsReferencesItem) {
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
    UtilizedTransportEquipment utilizedTransportEquipment = (UtilizedTransportEquipment) o;
    return Objects.equals(this.equipment, utilizedTransportEquipment.equipment) &&
        Objects.equals(this.isShipperOwned, utilizedTransportEquipment.isShipperOwned) &&
        Objects.equals(this.isNonOperatingReefer, utilizedTransportEquipment.isNonOperatingReefer) &&
        Objects.equals(this.activeReeferSettings, utilizedTransportEquipment.activeReeferSettings) &&
        Objects.equals(this.shippingMarks, utilizedTransportEquipment.shippingMarks) &&
        Objects.equals(this.seals, utilizedTransportEquipment.seals) &&
        Objects.equals(this.references, utilizedTransportEquipment.references) &&
        Objects.equals(this.customsReferences, utilizedTransportEquipment.customsReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equipment, isShipperOwned, isNonOperatingReefer, activeReeferSettings, shippingMarks, seals, references, customsReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilizedTransportEquipment {\n");
    sb.append("    equipment: ").append(toIndentedString(equipment)).append("\n");
    sb.append("    isShipperOwned: ").append(toIndentedString(isShipperOwned)).append("\n");
    sb.append("    isNonOperatingReefer: ").append(toIndentedString(isNonOperatingReefer)).append("\n");
    sb.append("    activeReeferSettings: ").append(toIndentedString(activeReeferSettings)).append("\n");
    sb.append("    shippingMarks: ").append(toIndentedString(shippingMarks)).append("\n");
    sb.append("    seals: ").append(toIndentedString(seals)).append("\n");
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

