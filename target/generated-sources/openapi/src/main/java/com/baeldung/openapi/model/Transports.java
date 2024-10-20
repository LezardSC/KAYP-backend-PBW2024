package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.OnwardInlandRouting;
import com.baeldung.openapi.model.PlaceOfDelivery;
import com.baeldung.openapi.model.PlaceOfReceipt;
import com.baeldung.openapi.model.PortOfDischarge;
import com.baeldung.openapi.model.PortOfLoading;
import com.baeldung.openapi.model.VesselVoyage;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Transports
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class Transports {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate plannedArrivalDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate plannedDepartureDate;

  private String preCarriageBy;

  private String onCarriageBy;

  private PlaceOfReceipt placeOfReceipt;

  private PortOfLoading portOfLoading;

  private PortOfDischarge portOfDischarge;

  private PlaceOfDelivery placeOfDelivery;

  private OnwardInlandRouting onwardInlandRouting;

  @Valid
  private List<@Valid VesselVoyage> vesselVoyages = new ArrayList<>();

  public Transports() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Transports(LocalDate plannedArrivalDate, LocalDate plannedDepartureDate, PortOfLoading portOfLoading, PortOfDischarge portOfDischarge, List<@Valid VesselVoyage> vesselVoyages) {
    this.plannedArrivalDate = plannedArrivalDate;
    this.plannedDepartureDate = plannedDepartureDate;
    this.portOfLoading = portOfLoading;
    this.portOfDischarge = portOfDischarge;
    this.vesselVoyages = vesselVoyages;
  }

  public Transports plannedArrivalDate(LocalDate plannedArrivalDate) {
    this.plannedArrivalDate = plannedArrivalDate;
    return this;
  }

  /**
   * The planned date of arrival. 
   * @return plannedArrivalDate
   */
  @NotNull @Valid 
  @Schema(name = "plannedArrivalDate", example = "Fri Jun 07 02:00:00 CEST 2024", description = "The planned date of arrival. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("plannedArrivalDate")
  public LocalDate getPlannedArrivalDate() {
    return plannedArrivalDate;
  }

  public void setPlannedArrivalDate(LocalDate plannedArrivalDate) {
    this.plannedArrivalDate = plannedArrivalDate;
  }

  public Transports plannedDepartureDate(LocalDate plannedDepartureDate) {
    this.plannedDepartureDate = plannedDepartureDate;
    return this;
  }

  /**
   * The planned date of departure. 
   * @return plannedDepartureDate
   */
  @NotNull @Valid 
  @Schema(name = "plannedDepartureDate", example = "Mon Jun 03 02:00:00 CEST 2024", description = "The planned date of departure. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("plannedDepartureDate")
  public LocalDate getPlannedDepartureDate() {
    return plannedDepartureDate;
  }

  public void setPlannedDepartureDate(LocalDate plannedDepartureDate) {
    this.plannedDepartureDate = plannedDepartureDate;
  }

  public Transports preCarriageBy(String preCarriageBy) {
    this.preCarriageBy = preCarriageBy;
    return this;
  }

  /**
   * Mode of transportation for pre-carriage when transport to the port of loading is organized by the carrier. If this attributes is populated, then a Place of Receipt must also be defined. The currently supported values include: - `VESSEL` (Vessel) - `RAIL` (Rail) - `TRUCK` (Truck) - `BARGE` (Barge) - `MULTIMODAL` (if multiple modes are used) 
   * @return preCarriageBy
   */
  @Size(max = 50) 
  @Schema(name = "preCarriageBy", example = "RAIL", description = "Mode of transportation for pre-carriage when transport to the port of loading is organized by the carrier. If this attributes is populated, then a Place of Receipt must also be defined. The currently supported values include: - `VESSEL` (Vessel) - `RAIL` (Rail) - `TRUCK` (Truck) - `BARGE` (Barge) - `MULTIMODAL` (if multiple modes are used) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preCarriageBy")
  public String getPreCarriageBy() {
    return preCarriageBy;
  }

  public void setPreCarriageBy(String preCarriageBy) {
    this.preCarriageBy = preCarriageBy;
  }

  public Transports onCarriageBy(String onCarriageBy) {
    this.onCarriageBy = onCarriageBy;
    return this;
  }

  /**
   * Mode of transportation for on-carriage when transport from the port of discharge is organized by the carrier. If this attributes is populated, then a Place of Delivery must also be defined. The currently supported values include: - `VESSEL` (Vessel) - `RAIL` (Rail) - `TRUCK` (Truck) - `BARGE` (Barge) - `MULTIMODAL` (if multiple modes are used) 
   * @return onCarriageBy
   */
  @Size(max = 50) 
  @Schema(name = "onCarriageBy", example = "TRUCK", description = "Mode of transportation for on-carriage when transport from the port of discharge is organized by the carrier. If this attributes is populated, then a Place of Delivery must also be defined. The currently supported values include: - `VESSEL` (Vessel) - `RAIL` (Rail) - `TRUCK` (Truck) - `BARGE` (Barge) - `MULTIMODAL` (if multiple modes are used) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("onCarriageBy")
  public String getOnCarriageBy() {
    return onCarriageBy;
  }

  public void setOnCarriageBy(String onCarriageBy) {
    this.onCarriageBy = onCarriageBy;
  }

  public Transports placeOfReceipt(PlaceOfReceipt placeOfReceipt) {
    this.placeOfReceipt = placeOfReceipt;
    return this;
  }

  /**
   * Get placeOfReceipt
   * @return placeOfReceipt
   */
  @Valid 
  @Schema(name = "placeOfReceipt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placeOfReceipt")
  public PlaceOfReceipt getPlaceOfReceipt() {
    return placeOfReceipt;
  }

  public void setPlaceOfReceipt(PlaceOfReceipt placeOfReceipt) {
    this.placeOfReceipt = placeOfReceipt;
  }

  public Transports portOfLoading(PortOfLoading portOfLoading) {
    this.portOfLoading = portOfLoading;
    return this;
  }

  /**
   * Get portOfLoading
   * @return portOfLoading
   */
  @NotNull @Valid 
  @Schema(name = "portOfLoading", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("portOfLoading")
  public PortOfLoading getPortOfLoading() {
    return portOfLoading;
  }

  public void setPortOfLoading(PortOfLoading portOfLoading) {
    this.portOfLoading = portOfLoading;
  }

  public Transports portOfDischarge(PortOfDischarge portOfDischarge) {
    this.portOfDischarge = portOfDischarge;
    return this;
  }

  /**
   * Get portOfDischarge
   * @return portOfDischarge
   */
  @NotNull @Valid 
  @Schema(name = "portOfDischarge", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("portOfDischarge")
  public PortOfDischarge getPortOfDischarge() {
    return portOfDischarge;
  }

  public void setPortOfDischarge(PortOfDischarge portOfDischarge) {
    this.portOfDischarge = portOfDischarge;
  }

  public Transports placeOfDelivery(PlaceOfDelivery placeOfDelivery) {
    this.placeOfDelivery = placeOfDelivery;
    return this;
  }

  /**
   * Get placeOfDelivery
   * @return placeOfDelivery
   */
  @Valid 
  @Schema(name = "placeOfDelivery", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placeOfDelivery")
  public PlaceOfDelivery getPlaceOfDelivery() {
    return placeOfDelivery;
  }

  public void setPlaceOfDelivery(PlaceOfDelivery placeOfDelivery) {
    this.placeOfDelivery = placeOfDelivery;
  }

  public Transports onwardInlandRouting(OnwardInlandRouting onwardInlandRouting) {
    this.onwardInlandRouting = onwardInlandRouting;
    return this;
  }

  /**
   * Get onwardInlandRouting
   * @return onwardInlandRouting
   */
  @Valid 
  @Schema(name = "onwardInlandRouting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("onwardInlandRouting")
  public OnwardInlandRouting getOnwardInlandRouting() {
    return onwardInlandRouting;
  }

  public void setOnwardInlandRouting(OnwardInlandRouting onwardInlandRouting) {
    this.onwardInlandRouting = onwardInlandRouting;
  }

  public Transports vesselVoyages(List<@Valid VesselVoyage> vesselVoyages) {
    this.vesselVoyages = vesselVoyages;
    return this;
  }

  public Transports addVesselVoyagesItem(VesselVoyage vesselVoyagesItem) {
    if (this.vesselVoyages == null) {
      this.vesselVoyages = new ArrayList<>();
    }
    this.vesselVoyages.add(vesselVoyagesItem);
    return this;
  }

  /**
   * Allow the possibility to include multiple vessels/voyages in the `Transport Document` (e.g. the first sea going vessel and the mother vessel). At least one is mandatory to provide. 
   * @return vesselVoyages
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "vesselVoyages", description = "Allow the possibility to include multiple vessels/voyages in the `Transport Document` (e.g. the first sea going vessel and the mother vessel). At least one is mandatory to provide. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vesselVoyages")
  public List<@Valid VesselVoyage> getVesselVoyages() {
    return vesselVoyages;
  }

  public void setVesselVoyages(List<@Valid VesselVoyage> vesselVoyages) {
    this.vesselVoyages = vesselVoyages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transports transports = (Transports) o;
    return Objects.equals(this.plannedArrivalDate, transports.plannedArrivalDate) &&
        Objects.equals(this.plannedDepartureDate, transports.plannedDepartureDate) &&
        Objects.equals(this.preCarriageBy, transports.preCarriageBy) &&
        Objects.equals(this.onCarriageBy, transports.onCarriageBy) &&
        Objects.equals(this.placeOfReceipt, transports.placeOfReceipt) &&
        Objects.equals(this.portOfLoading, transports.portOfLoading) &&
        Objects.equals(this.portOfDischarge, transports.portOfDischarge) &&
        Objects.equals(this.placeOfDelivery, transports.placeOfDelivery) &&
        Objects.equals(this.onwardInlandRouting, transports.onwardInlandRouting) &&
        Objects.equals(this.vesselVoyages, transports.vesselVoyages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plannedArrivalDate, plannedDepartureDate, preCarriageBy, onCarriageBy, placeOfReceipt, portOfLoading, portOfDischarge, placeOfDelivery, onwardInlandRouting, vesselVoyages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transports {\n");
    sb.append("    plannedArrivalDate: ").append(toIndentedString(plannedArrivalDate)).append("\n");
    sb.append("    plannedDepartureDate: ").append(toIndentedString(plannedDepartureDate)).append("\n");
    sb.append("    preCarriageBy: ").append(toIndentedString(preCarriageBy)).append("\n");
    sb.append("    onCarriageBy: ").append(toIndentedString(onCarriageBy)).append("\n");
    sb.append("    placeOfReceipt: ").append(toIndentedString(placeOfReceipt)).append("\n");
    sb.append("    portOfLoading: ").append(toIndentedString(portOfLoading)).append("\n");
    sb.append("    portOfDischarge: ").append(toIndentedString(portOfDischarge)).append("\n");
    sb.append("    placeOfDelivery: ").append(toIndentedString(placeOfDelivery)).append("\n");
    sb.append("    onwardInlandRouting: ").append(toIndentedString(onwardInlandRouting)).append("\n");
    sb.append("    vesselVoyages: ").append(toIndentedString(vesselVoyages)).append("\n");
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

