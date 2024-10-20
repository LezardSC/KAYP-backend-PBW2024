package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
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
 * Vessel and export voyage
 */

@Schema(name = "VesselVoyage", description = "Vessel and export voyage")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class VesselVoyage {

  private String vesselName;

  private String carrierExportVoyageNumber;

  private String universalExportVoyageReference;

  public VesselVoyage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VesselVoyage(String vesselName, String carrierExportVoyageNumber) {
    this.vesselName = vesselName;
    this.carrierExportVoyageNumber = carrierExportVoyageNumber;
  }

  public VesselVoyage vesselName(String vesselName) {
    this.vesselName = vesselName;
    return this;
  }

  /**
   * The name of the first sea going Vessel on board which the cargo is loaded or intended to be loaded 
   * @return vesselName
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 50) 
  @Schema(name = "vesselName", example = "King of the Seas", description = "The name of the first sea going Vessel on board which the cargo is loaded or intended to be loaded ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vesselName")
  public String getVesselName() {
    return vesselName;
  }

  public void setVesselName(String vesselName) {
    this.vesselName = vesselName;
  }

  public VesselVoyage carrierExportVoyageNumber(String carrierExportVoyageNumber) {
    this.carrierExportVoyageNumber = carrierExportVoyageNumber;
    return this;
  }

  /**
   * The identifier of an export voyage. The carrier-specific identifier of the export Voyage. 
   * @return carrierExportVoyageNumber
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 50) 
  @Schema(name = "carrierExportVoyageNumber", example = "2103S", description = "The identifier of an export voyage. The carrier-specific identifier of the export Voyage. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("carrierExportVoyageNumber")
  public String getCarrierExportVoyageNumber() {
    return carrierExportVoyageNumber;
  }

  public void setCarrierExportVoyageNumber(String carrierExportVoyageNumber) {
    this.carrierExportVoyageNumber = carrierExportVoyageNumber;
  }

  public VesselVoyage universalExportVoyageReference(String universalExportVoyageReference) {
    this.universalExportVoyageReference = universalExportVoyageReference;
    return this;
  }

  /**
   * A global unique voyage reference for the export Voyage, as per DCSA standard, agreed by VSA partners for the voyage. The voyage reference must match the regular expression pattern: `\\d{2}[0-9A-Z]{2}[NEWSR]` - `2 digits` for the year - `2 alphanumeric characters` for the sequence number of the voyage - `1 character` for the direction/haul (`N`orth, `E`ast, `W`est, `S`outh or `R`oundtrip). 
   * @return universalExportVoyageReference
   */
  @Pattern(regexp = "^\\d{2}[0-9A-Z]{2}[NEWSR]$") @Size(min = 5, max = 5) 
  @Schema(name = "universalExportVoyageReference", example = "2103N", description = "A global unique voyage reference for the export Voyage, as per DCSA standard, agreed by VSA partners for the voyage. The voyage reference must match the regular expression pattern: `\\d{2}[0-9A-Z]{2}[NEWSR]` - `2 digits` for the year - `2 alphanumeric characters` for the sequence number of the voyage - `1 character` for the direction/haul (`N`orth, `E`ast, `W`est, `S`outh or `R`oundtrip). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("universalExportVoyageReference")
  public String getUniversalExportVoyageReference() {
    return universalExportVoyageReference;
  }

  public void setUniversalExportVoyageReference(String universalExportVoyageReference) {
    this.universalExportVoyageReference = universalExportVoyageReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VesselVoyage vesselVoyage = (VesselVoyage) o;
    return Objects.equals(this.vesselName, vesselVoyage.vesselName) &&
        Objects.equals(this.carrierExportVoyageNumber, vesselVoyage.carrierExportVoyageNumber) &&
        Objects.equals(this.universalExportVoyageReference, vesselVoyage.universalExportVoyageReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vesselName, carrierExportVoyageNumber, universalExportVoyageReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VesselVoyage {\n");
    sb.append("    vesselName: ").append(toIndentedString(vesselName)).append("\n");
    sb.append("    carrierExportVoyageNumber: ").append(toIndentedString(carrierExportVoyageNumber)).append("\n");
    sb.append("    universalExportVoyageReference: ").append(toIndentedString(universalExportVoyageReference)).append("\n");
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

