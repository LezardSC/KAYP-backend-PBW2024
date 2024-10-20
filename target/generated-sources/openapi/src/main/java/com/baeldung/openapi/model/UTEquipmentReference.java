package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
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
 * To be used when referring to carrier owned containers (&#x60;isShipperOwned&#x60; is false). In this case it is only necessary to provide &#x60;equipmentReference&#x60; 
 */

@Schema(name = "UTEquipmentReference", description = "To be used when referring to carrier owned containers (`isShipperOwned` is false). In this case it is only necessary to provide `equipmentReference` ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class UTEquipmentReference implements UtilizedTransportEquipmentShipper {

  private Boolean isShipperOwned;

  private String equipmentReference;

  @Valid
  private List<@Size(max = 35)String> shippingMarks = new ArrayList<>();

  @Valid
  private List<@Valid Seal> seals = new ArrayList<>();

  @Valid
  private List<@Valid Reference> references = new ArrayList<>();

  @Valid
  private List<@Valid CustomsReference> customsReferences = new ArrayList<>();

  public UTEquipmentReference() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UTEquipmentReference(Boolean isShipperOwned, String equipmentReference) {
    this.isShipperOwned = isShipperOwned;
    this.equipmentReference = equipmentReference;
    this.seals = seals;
  }

  public UTEquipmentReference isShipperOwned(Boolean isShipperOwned) {
    this.isShipperOwned = isShipperOwned;
    return this;
  }

  /**
   * Indicates whether the container is shipper owned (SOC). 
   * @return isShipperOwned
   */
  @NotNull 
  @Schema(name = "isShipperOwned", example = "false", description = "Indicates whether the container is shipper owned (SOC). ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isShipperOwned")
  public Boolean getIsShipperOwned() {
    return isShipperOwned;
  }

  public void setIsShipperOwned(Boolean isShipperOwned) {
    this.isShipperOwned = isShipperOwned;
  }

  public UTEquipmentReference equipmentReference(String equipmentReference) {
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

  public UTEquipmentReference shippingMarks(List<@Size(max = 35)String> shippingMarks) {
    this.shippingMarks = shippingMarks;
    return this;
  }

  public UTEquipmentReference addShippingMarksItem(String shippingMarksItem) {
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

  public UTEquipmentReference seals(List<@Valid Seal> seals) {
    this.seals = seals;
    return this;
  }

  public UTEquipmentReference addSealsItem(Seal sealsItem) {
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

  public UTEquipmentReference references(List<@Valid Reference> references) {
    this.references = references;
    return this;
  }

  public UTEquipmentReference addReferencesItem(Reference referencesItem) {
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

  public UTEquipmentReference customsReferences(List<@Valid CustomsReference> customsReferences) {
    this.customsReferences = customsReferences;
    return this;
  }

  public UTEquipmentReference addCustomsReferencesItem(CustomsReference customsReferencesItem) {
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
    UTEquipmentReference utEquipmentReference = (UTEquipmentReference) o;
    return Objects.equals(this.isShipperOwned, utEquipmentReference.isShipperOwned) &&
        Objects.equals(this.equipmentReference, utEquipmentReference.equipmentReference) &&
        Objects.equals(this.shippingMarks, utEquipmentReference.shippingMarks) &&
        Objects.equals(this.seals, utEquipmentReference.seals) &&
        Objects.equals(this.references, utEquipmentReference.references) &&
        Objects.equals(this.customsReferences, utEquipmentReference.customsReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isShipperOwned, equipmentReference, shippingMarks, seals, references, customsReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UTEquipmentReference {\n");
    sb.append("    isShipperOwned: ").append(toIndentedString(isShipperOwned)).append("\n");
    sb.append("    equipmentReference: ").append(toIndentedString(equipmentReference)).append("\n");
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

