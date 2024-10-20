package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &#x60;Phone&#x60; is mandatory to provide 
 */

@Schema(name = "Phone_required", description = "`Phone` is mandatory to provide ")
@JsonTypeName("Phone_required")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class PhoneRequired {

  private String phone;

  public PhoneRequired() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PhoneRequired(String phone) {
    this.phone = phone;
  }

  public PhoneRequired phone(String phone) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneRequired phoneRequired = (PhoneRequired) o;
    return Objects.equals(this.phone, phoneRequired.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneRequired {\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

