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
 * FreeText
 */

@JsonTypeName("Free_text")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class FreeText implements InvoicePayableAt1 {

  private String freeText;

  public FreeText() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FreeText(String freeText) {
    this.freeText = freeText;
  }

  public FreeText freeText(String freeText) {
    this.freeText = freeText;
    return this;
  }

  /**
   * The name of the location where payment will be rendered by the customer. 
   * @return freeText
   */
  @NotNull @Size(max = 35) 
  @Schema(name = "freeText", example = "DCSA Headquarters", description = "The name of the location where payment will be rendered by the customer. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("freeText")
  public String getFreeText() {
    return freeText;
  }

  public void setFreeText(String freeText) {
    this.freeText = freeText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeText freeText = (FreeText) o;
    return Objects.equals(this.freeText, freeText.freeText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeText {\n");
    sb.append("    freeText: ").append(toIndentedString(freeText)).append("\n");
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

