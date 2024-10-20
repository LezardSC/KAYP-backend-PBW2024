package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.TareWeight;
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
 * Used for storing cargo in/on during transport. The equipment size/type is defined by the ISO 6346 code. The most common equipment size/type is 20&#39;/40&#39;/45&#39; DRY Freight Container, but several different versions exist. 
 */

@Schema(name = "RequiredEquipment", description = "Used for storing cargo in/on during transport. The equipment size/type is defined by the ISO 6346 code. The most common equipment size/type is 20'/40'/45' DRY Freight Container, but several different versions exist. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class RequiredEquipment {

  private String equipmentReference;

  private String isOEquipmentCode;

  private TareWeight tareWeight;

  public RequiredEquipment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RequiredEquipment(String equipmentReference, String isOEquipmentCode, TareWeight tareWeight) {
    this.equipmentReference = equipmentReference;
    this.isOEquipmentCode = isOEquipmentCode;
    this.tareWeight = tareWeight;
  }

  public RequiredEquipment equipmentReference(String equipmentReference) {
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

  public RequiredEquipment isOEquipmentCode(String isOEquipmentCode) {
    this.isOEquipmentCode = isOEquipmentCode;
    return this;
  }

  /**
   * Unique code for the different equipment size and type used to transport commodities. The code can refer to either the ISO size type (e.g. 22G1) or the ISO type group (e.g. 22GP) following the [ISO 6346](https://www.iso.org/standard/83558.html) standard. 
   * @return isOEquipmentCode
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 4) 
  @Schema(name = "ISOEquipmentCode", example = "22G1", description = "Unique code for the different equipment size and type used to transport commodities. The code can refer to either the ISO size type (e.g. 22G1) or the ISO type group (e.g. 22GP) following the [ISO 6346](https://www.iso.org/standard/83558.html) standard. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ISOEquipmentCode")
  public String getIsOEquipmentCode() {
    return isOEquipmentCode;
  }

  public void setIsOEquipmentCode(String isOEquipmentCode) {
    this.isOEquipmentCode = isOEquipmentCode;
  }

  public RequiredEquipment tareWeight(TareWeight tareWeight) {
    this.tareWeight = tareWeight;
    return this;
  }

  /**
   * Get tareWeight
   * @return tareWeight
   */
  @NotNull @Valid 
  @Schema(name = "tareWeight", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tareWeight")
  public TareWeight getTareWeight() {
    return tareWeight;
  }

  public void setTareWeight(TareWeight tareWeight) {
    this.tareWeight = tareWeight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequiredEquipment requiredEquipment = (RequiredEquipment) o;
    return Objects.equals(this.equipmentReference, requiredEquipment.equipmentReference) &&
        Objects.equals(this.isOEquipmentCode, requiredEquipment.isOEquipmentCode) &&
        Objects.equals(this.tareWeight, requiredEquipment.tareWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equipmentReference, isOEquipmentCode, tareWeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequiredEquipment {\n");
    sb.append("    equipmentReference: ").append(toIndentedString(equipmentReference)).append("\n");
    sb.append("    isOEquipmentCode: ").append(toIndentedString(isOEquipmentCode)).append("\n");
    sb.append("    tareWeight: ").append(toIndentedString(tareWeight)).append("\n");
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

