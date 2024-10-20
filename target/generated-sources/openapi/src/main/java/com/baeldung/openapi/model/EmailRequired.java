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
 * &#x60;Email&#x60; is mandatory to provide 
 */

@Schema(name = "Email_required", description = "`Email` is mandatory to provide ")
@JsonTypeName("Email_required")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class EmailRequired {

  private String email;

  public EmailRequired() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmailRequired(String email) {
    this.email = email;
  }

  public EmailRequired email(String email) {
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
    EmailRequired emailRequired = (EmailRequired) o;
    return Objects.equals(this.email, emailRequired.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailRequired {\n");
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

