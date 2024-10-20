package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.Feedback;
import com.baeldung.openapi.model.ShippingInstructions;
import com.baeldung.openapi.model.UpdatedShippingInstructions;
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
 * &#x60;Shipping Instructions&#x60; specific properties for the &#x60;Notification&#x60; 
 */

@Schema(name = "Data", description = "`Shipping Instructions` specific properties for the `Notification` ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class Data {

  private String shippingInstructionsStatus;

  private String updatedShippingInstructionsStatus;

  private String shippingInstructionsReference;

  private String transportDocumentReference;

  @Valid
  private List<@Valid Feedback> feedbacks = new ArrayList<>();

  private ShippingInstructions shippingInstructions;

  private UpdatedShippingInstructions updatedShippingInstructions;

  public Data() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Data(String shippingInstructionsStatus) {
    this.shippingInstructionsStatus = shippingInstructionsStatus;
  }

  public Data shippingInstructionsStatus(String shippingInstructionsStatus) {
    this.shippingInstructionsStatus = shippingInstructionsStatus;
    return this;
  }

  /**
   * The status of the `Shipping Instructions`. Possible values are:  - `RECEIVED` (Shipping Instructions has been received) - `PENDING_UPDATE` (An update is required to the Shipping Instructions) - `COMPLETED` (The Shipping Instructions can no longer be modified - the related Transport Document has been surrendered for delivery) 
   * @return shippingInstructionsStatus
   */
  @NotNull @Size(max = 50) 
  @Schema(name = "shippingInstructionsStatus", example = "RECEIVED", description = "The status of the `Shipping Instructions`. Possible values are:  - `RECEIVED` (Shipping Instructions has been received) - `PENDING_UPDATE` (An update is required to the Shipping Instructions) - `COMPLETED` (The Shipping Instructions can no longer be modified - the related Transport Document has been surrendered for delivery) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("shippingInstructionsStatus")
  public String getShippingInstructionsStatus() {
    return shippingInstructionsStatus;
  }

  public void setShippingInstructionsStatus(String shippingInstructionsStatus) {
    this.shippingInstructionsStatus = shippingInstructionsStatus;
  }

  public Data updatedShippingInstructionsStatus(String updatedShippingInstructionsStatus) {
    this.updatedShippingInstructionsStatus = updatedShippingInstructionsStatus;
    return this;
  }

  /**
   * The status of latest update to the `Shipping Instructions`. If no update has been requested - then this property is empty. Possible values are:  - `UPDATE_RECEIVED` (An update to a Shipping Instructions has been received and is awaiting to be processed) - `UPDATE_CONFIRMED` (Update is confirmed) - `UPDATE_CANCELLED` (An update to a Shipping Instructions is discontinued by consumer) - `UPDATE_DECLINED` (An update to a Shipping Instructions is discontinued by provider) 
   * @return updatedShippingInstructionsStatus
   */
  @Size(max = 50) 
  @Schema(name = "updatedShippingInstructionsStatus", example = "UPDATE_RECEIVED", description = "The status of latest update to the `Shipping Instructions`. If no update has been requested - then this property is empty. Possible values are:  - `UPDATE_RECEIVED` (An update to a Shipping Instructions has been received and is awaiting to be processed) - `UPDATE_CONFIRMED` (Update is confirmed) - `UPDATE_CANCELLED` (An update to a Shipping Instructions is discontinued by consumer) - `UPDATE_DECLINED` (An update to a Shipping Instructions is discontinued by provider) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedShippingInstructionsStatus")
  public String getUpdatedShippingInstructionsStatus() {
    return updatedShippingInstructionsStatus;
  }

  public void setUpdatedShippingInstructionsStatus(String updatedShippingInstructionsStatus) {
    this.updatedShippingInstructionsStatus = updatedShippingInstructionsStatus;
  }

  public Data shippingInstructionsReference(String shippingInstructionsReference) {
    this.shippingInstructionsReference = shippingInstructionsReference;
    return this;
  }

  /**
   * The identifier for a `Shipping Instructions` provided by the carrier for system purposes.  **Condition:** `shippingInstructionsReference` and/or `transportDocumentReference` is required to provide 
   * @return shippingInstructionsReference
   */
  @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 100) 
  @Schema(name = "shippingInstructionsReference", example = "e0559d83-00e2-438e-afd9-fdd610c1a008", description = "The identifier for a `Shipping Instructions` provided by the carrier for system purposes.  **Condition:** `shippingInstructionsReference` and/or `transportDocumentReference` is required to provide ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingInstructionsReference")
  public String getShippingInstructionsReference() {
    return shippingInstructionsReference;
  }

  public void setShippingInstructionsReference(String shippingInstructionsReference) {
    this.shippingInstructionsReference = shippingInstructionsReference;
  }

  public Data transportDocumentReference(String transportDocumentReference) {
    this.transportDocumentReference = transportDocumentReference;
    return this;
  }

  /**
   * A unique number allocated by the shipping line to the transport document and the main number used for the tracking of the status of the shipment.  **Condition:** `shippingInstructionsReference` and/or `transportDocumentReference` is required to provide 
   * @return transportDocumentReference
   */
  @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 20) 
  @Schema(name = "transportDocumentReference", example = "HHL71800000", description = "A unique number allocated by the shipping line to the transport document and the main number used for the tracking of the status of the shipment.  **Condition:** `shippingInstructionsReference` and/or `transportDocumentReference` is required to provide ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transportDocumentReference")
  public String getTransportDocumentReference() {
    return transportDocumentReference;
  }

  public void setTransportDocumentReference(String transportDocumentReference) {
    this.transportDocumentReference = transportDocumentReference;
  }

  public Data feedbacks(List<@Valid Feedback> feedbacks) {
    this.feedbacks = feedbacks;
    return this;
  }

  public Data addFeedbacksItem(Feedback feedbacksItem) {
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

  public Data shippingInstructions(ShippingInstructions shippingInstructions) {
    this.shippingInstructions = shippingInstructions;
    return this;
  }

  /**
   * Get shippingInstructions
   * @return shippingInstructions
   */
  @Valid 
  @Schema(name = "shippingInstructions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingInstructions")
  public ShippingInstructions getShippingInstructions() {
    return shippingInstructions;
  }

  public void setShippingInstructions(ShippingInstructions shippingInstructions) {
    this.shippingInstructions = shippingInstructions;
  }

  public Data updatedShippingInstructions(UpdatedShippingInstructions updatedShippingInstructions) {
    this.updatedShippingInstructions = updatedShippingInstructions;
    return this;
  }

  /**
   * Get updatedShippingInstructions
   * @return updatedShippingInstructions
   */
  @Valid 
  @Schema(name = "updatedShippingInstructions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedShippingInstructions")
  public UpdatedShippingInstructions getUpdatedShippingInstructions() {
    return updatedShippingInstructions;
  }

  public void setUpdatedShippingInstructions(UpdatedShippingInstructions updatedShippingInstructions) {
    this.updatedShippingInstructions = updatedShippingInstructions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Data data = (Data) o;
    return Objects.equals(this.shippingInstructionsStatus, data.shippingInstructionsStatus) &&
        Objects.equals(this.updatedShippingInstructionsStatus, data.updatedShippingInstructionsStatus) &&
        Objects.equals(this.shippingInstructionsReference, data.shippingInstructionsReference) &&
        Objects.equals(this.transportDocumentReference, data.transportDocumentReference) &&
        Objects.equals(this.feedbacks, data.feedbacks) &&
        Objects.equals(this.shippingInstructions, data.shippingInstructions) &&
        Objects.equals(this.updatedShippingInstructions, data.updatedShippingInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingInstructionsStatus, updatedShippingInstructionsStatus, shippingInstructionsReference, transportDocumentReference, feedbacks, shippingInstructions, updatedShippingInstructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data {\n");
    sb.append("    shippingInstructionsStatus: ").append(toIndentedString(shippingInstructionsStatus)).append("\n");
    sb.append("    updatedShippingInstructionsStatus: ").append(toIndentedString(updatedShippingInstructionsStatus)).append("\n");
    sb.append("    shippingInstructionsReference: ").append(toIndentedString(shippingInstructionsReference)).append("\n");
    sb.append("    transportDocumentReference: ").append(toIndentedString(transportDocumentReference)).append("\n");
    sb.append("    feedbacks: ").append(toIndentedString(feedbacks)).append("\n");
    sb.append("    shippingInstructions: ").append(toIndentedString(shippingInstructions)).append("\n");
    sb.append("    updatedShippingInstructions: ").append(toIndentedString(updatedShippingInstructions)).append("\n");
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

