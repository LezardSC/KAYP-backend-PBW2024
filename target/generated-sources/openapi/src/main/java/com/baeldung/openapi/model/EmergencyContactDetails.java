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
 * 24 hr emergency contact details 
 */

@Schema(name = "EmergencyContactDetails", description = "24 hr emergency contact details ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class EmergencyContactDetails {

  private String contact;

  private String provider;

  private String phone;

  private String referenceNumber;

  public EmergencyContactDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmergencyContactDetails(String contact, String phone) {
    this.contact = contact;
    this.phone = phone;
  }

  public EmergencyContactDetails contact(String contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Name of the Contact person during an emergency. 
   * @return contact
   */
  @NotNull @Size(max = 255) 
  @Schema(name = "contact", example = "Henrik Larsen", description = "Name of the Contact person during an emergency. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contact")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public EmergencyContactDetails provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Name of the third party vendor providing emergency support 
   * @return provider
   */
  @Size(max = 255) 
  @Schema(name = "provider", example = "GlobeTeam", description = "Name of the third party vendor providing emergency support ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public EmergencyContactDetails phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number for the contact 
   * @return phone
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 30) 
  @Schema(name = "phone", example = "+45 70262970", description = "Phone number for the contact ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public EmergencyContactDetails referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * Contract reference for the emergency support provided by an external third party vendor. 
   * @return referenceNumber
   */
  @Size(max = 255) 
  @Schema(name = "referenceNumber", example = "12234", description = "Contract reference for the emergency support provided by an external third party vendor. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referenceNumber")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmergencyContactDetails emergencyContactDetails = (EmergencyContactDetails) o;
    return Objects.equals(this.contact, emergencyContactDetails.contact) &&
        Objects.equals(this.provider, emergencyContactDetails.provider) &&
        Objects.equals(this.phone, emergencyContactDetails.phone) &&
        Objects.equals(this.referenceNumber, emergencyContactDetails.referenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, provider, phone, referenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmergencyContactDetails {\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
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

