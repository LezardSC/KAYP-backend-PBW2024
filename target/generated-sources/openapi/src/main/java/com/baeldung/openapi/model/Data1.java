package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.Feedback;
import com.baeldung.openapi.model.TransportDocument;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * &#x60;Transport Document&#x60; specific properties for the &#x60;Notification&#x60; 
 */

@Schema(name = "Data_1", description = "`Transport Document` specific properties for the `Notification` ")
@JsonTypeName("Data_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class Data1 {

  private String transportDocumentStatus;

  private String shippingInstructionsReference;

  private String transportDocumentReference;

  @Valid
  private List<@Valid Feedback> feedbacks = new ArrayList<>();

  private TransportDocument transportDocument;

  public Data1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Data1(String transportDocumentStatus, String transportDocumentReference) {
    this.transportDocumentStatus = transportDocumentStatus;
    this.transportDocumentReference = transportDocumentReference;
  }

  public Data1 transportDocumentStatus(String transportDocumentStatus) {
    this.transportDocumentStatus = transportDocumentStatus;
    return this;
  }

  /**
   * The status of the `Transport Document`. Possible values are:  - `DRAFT` (Transport Document is Drafted) - `APPROVED` (Transport Document has been Approved by consumer) - `ISSUED` (Transport Document has been Issued by provider) - `PENDING_SURRENDER_FOR_AMENDMENT` (Transport Document is Pending for Surrender for an Amendment) - `SURRENDER_FOR_AMENDMENT` (Transport Document Surrendered for an Amendment) - `VOID` (the Transport Document has been Voided) - `PENDING_SURRENDER_FOR_DELIVERY` (Transport Document pending surrender for Delivery) - `SURRENDER_FOR_DELIVERY` (Transport Document surrendered for Delivery) 
   * @return transportDocumentStatus
   */
  @NotNull @Size(max = 50) 
  @Schema(name = "transportDocumentStatus", example = "DRAFT", description = "The status of the `Transport Document`. Possible values are:  - `DRAFT` (Transport Document is Drafted) - `APPROVED` (Transport Document has been Approved by consumer) - `ISSUED` (Transport Document has been Issued by provider) - `PENDING_SURRENDER_FOR_AMENDMENT` (Transport Document is Pending for Surrender for an Amendment) - `SURRENDER_FOR_AMENDMENT` (Transport Document Surrendered for an Amendment) - `VOID` (the Transport Document has been Voided) - `PENDING_SURRENDER_FOR_DELIVERY` (Transport Document pending surrender for Delivery) - `SURRENDER_FOR_DELIVERY` (Transport Document surrendered for Delivery) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transportDocumentStatus")
  public String getTransportDocumentStatus() {
    return transportDocumentStatus;
  }

  public void setTransportDocumentStatus(String transportDocumentStatus) {
    this.transportDocumentStatus = transportDocumentStatus;
  }

  public Data1 shippingInstructionsReference(String shippingInstructionsReference) {
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

  public Data1 transportDocumentReference(String transportDocumentReference) {
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

  public Data1 feedbacks(List<@Valid Feedback> feedbacks) {
    this.feedbacks = feedbacks;
    return this;
  }

  public Data1 addFeedbacksItem(Feedback feedbacksItem) {
    if (this.feedbacks == null) {
      this.feedbacks = new ArrayList<>();
    }
    this.feedbacks.add(feedbacksItem);
    return this;
  }

  /**
   * Feedback that can be provided includes, but is not limited to: - unsupported properties - changed values - removed properties - general information 
   * @return feedbacks
   */
  @Valid 
  @Schema(name = "feedbacks", description = "Feedback that can be provided includes, but is not limited to: - unsupported properties - changed values - removed properties - general information ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feedbacks")
  public List<@Valid Feedback> getFeedbacks() {
    return feedbacks;
  }

  public void setFeedbacks(List<@Valid Feedback> feedbacks) {
    this.feedbacks = feedbacks;
  }

  public Data1 transportDocument(TransportDocument transportDocument) {
    this.transportDocument = transportDocument;
    return this;
  }

  /**
   * Get transportDocument
   * @return transportDocument
   */
  @Valid 
  @Schema(name = "transportDocument", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transportDocument")
  public TransportDocument getTransportDocument() {
    return transportDocument;
  }

  public void setTransportDocument(TransportDocument transportDocument) {
    this.transportDocument = transportDocument;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Data1 data1 = (Data1) o;
    return Objects.equals(this.transportDocumentStatus, data1.transportDocumentStatus) &&
        Objects.equals(this.shippingInstructionsReference, data1.shippingInstructionsReference) &&
        Objects.equals(this.transportDocumentReference, data1.transportDocumentReference) &&
        Objects.equals(this.feedbacks, data1.feedbacks) &&
        Objects.equals(this.transportDocument, data1.transportDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transportDocumentStatus, shippingInstructionsReference, transportDocumentReference, feedbacks, transportDocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data1 {\n");
    sb.append("    transportDocumentStatus: ").append(toIndentedString(transportDocumentStatus)).append("\n");
    sb.append("    shippingInstructionsReference: ").append(toIndentedString(shippingInstructionsReference)).append("\n");
    sb.append("    transportDocumentReference: ").append(toIndentedString(transportDocumentReference)).append("\n");
    sb.append("    feedbacks: ").append(toIndentedString(feedbacks)).append("\n");
    sb.append("    transportDocument: ").append(toIndentedString(transportDocument)).append("\n");
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

