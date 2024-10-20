package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.EmailRequired;
import com.baeldung.openapi.model.PhoneRequired;
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
 * The contact details of the person to contact. It is mandatory to provide either &#x60;phone&#x60; and/or &#x60;email&#x60; along with the &#x60;name&#x60;. 
 */

@Schema(name = "PartyContactDetail", description = "The contact details of the person to contact. It is mandatory to provide either `phone` and/or `email` along with the `name`. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class PartyContactDetail {

  private String name;

  private String phone;

  private String email;

  public PartyContactDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PartyContactDetail(String name, String phone, String email) {
    this.name = name;
    this.phone = phone;
    this.email = email;
  }

  public PartyContactDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the contact 
   * @return name
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 35) 
  @Schema(name = "name", example = "Henrik", description = "Name of the contact ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartyContactDetail phone(String phone) {
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

  public PartyContactDetail email(String email) {
    this.email = email;
    return this;
  }

  /**
   * `E-mail` address to be used 
   * @return email
   */
  @NotNull @Pattern(regexp = "^.+@\\S+$") @Size(max = 100) 
  @Schema(name = "email", example = "info@dcsa.org", description = "`E-mail` address to be used ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyContactDetail partyContactDetail = (PartyContactDetail) o;
    return Objects.equals(this.name, partyContactDetail.name) &&
        Objects.equals(this.phone, partyContactDetail.phone) &&
        Objects.equals(this.email, partyContactDetail.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phone, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyContactDetail {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

