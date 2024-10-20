package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.RequiredEquipment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
 * To be used for SoC (Shipper owned Containers). If &#x60;isShipperOwned&#x60; is true then the equipment used needs to be specified 
 */

@Schema(name = "UTEquipment", description = "To be used for SoC (Shipper owned Containers). If `isShipperOwned` is true then the equipment used needs to be specified ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class UTEquipment implements UtilizedTransportEquipmentShipper {

  private Boolean isShipperOwned;

  private RequiredEquipment equipment;

  @Valid
  private List<@Size(max = 35)String> shippingMarks = new ArrayList<>();

  @Valid
  private List<@Valid Seal> seals = new ArrayList<>();

  @Valid
  private List<@Valid Reference> references = new ArrayList<>();

  @Valid
  private List<@Valid CustomsReference> customsReferences = new ArrayList<>();

  public UTEquipment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UTEquipment(Boolean isShipperOwned, RequiredEquipment equipment) {
    this.isShipperOwned = isShipperOwned;
    this.equipment = equipment;
    this.seals = seals;
  }

  public UTEquipment isShipperOwned(Boolean isShipperOwned) {
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

  public UTEquipment equipment(RequiredEquipment equipment) {
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
  public RequiredEquipment getEquipment() {
    return equipment;
  }

  public void setEquipment(RequiredEquipment equipment) {
    this.equipment = equipment;
  }

  public UTEquipment shippingMarks(List<@Size(max = 35)String> shippingMarks) {
    this.shippingMarks = shippingMarks;
    return this;
  }

  public UTEquipment addShippingMarksItem(String shippingMarksItem) {
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

  public UTEquipment seals(List<@Valid Seal> seals) {
    this.seals = seals;
    return this;
  }

  public UTEquipment addSealsItem(Seal sealsItem) {
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

  public UTEquipment references(List<@Valid Reference> references) {
    this.references = references;
    return this;
  }

  public UTEquipment addReferencesItem(Reference referencesItem) {
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

  public UTEquipment customsReferences(List<@Valid CustomsReference> customsReferences) {
    this.customsReferences = customsReferences;
    return this;
  }

  public UTEquipment addCustomsReferencesItem(CustomsReference customsReferencesItem) {
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
    UTEquipment utEquipment = (UTEquipment) o;
    return Objects.equals(this.isShipperOwned, utEquipment.isShipperOwned) &&
        Objects.equals(this.equipment, utEquipment.equipment) &&
        Objects.equals(this.shippingMarks, utEquipment.shippingMarks) &&
        Objects.equals(this.seals, utEquipment.seals) &&
        Objects.equals(this.references, utEquipment.references) &&
        Objects.equals(this.customsReferences, utEquipment.customsReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isShipperOwned, equipment, shippingMarks, seals, references, customsReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UTEquipment {\n");
    sb.append("    isShipperOwned: ").append(toIndentedString(isShipperOwned)).append("\n");
    sb.append("    equipment: ").append(toIndentedString(equipment)).append("\n");
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

