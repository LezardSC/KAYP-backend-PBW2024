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
 * Feedback that can be provided includes, but is not limited to: - unsupported properties - changed values - removed properties - general information 
 */

@Schema(name = "Feedback", description = "Feedback that can be provided includes, but is not limited to: - unsupported properties - changed values - removed properties - general information ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class Feedback {

  private String severity;

  private String code;

  private String message;

  private String jsonPath;

  private String property;

  public Feedback() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Feedback(String severity, String code, String message) {
    this.severity = severity;
    this.code = code;
    this.message = message;
  }

  public Feedback severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * The severity of the feedback. Possible values are: - `INFO` (Information - \"Your reefer container will use renewable energy\", \"This earlier / premium service is available\") - `WARN` (Warning - \"I'm going to replace\" / \"Ignore this value\" / \"Use another value instead\") - `ERROR` (Error - \"This must be changed!\") 
   * @return severity
   */
  @NotNull @Size(max = 50) 
  @Schema(name = "severity", example = "WARN", description = "The severity of the feedback. Possible values are: - `INFO` (Information - \"Your reefer container will use renewable energy\", \"This earlier / premium service is available\") - `WARN` (Warning - \"I'm going to replace\" / \"Ignore this value\" / \"Use another value instead\") - `ERROR` (Error - \"This must be changed!\") ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("severity")
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public Feedback code(String code) {
    this.code = code;
    return this;
  }

  /**
   * A code used to describe the feedback. Possible values are: - `INFORMATIONAL_MESSAGE` (INFO - to be used when providing extra information)  - `PROPERTY_WILL_BE_IGNORED` (WARN - to be used for unsupported properties/values) - `PROPERTY_VALUE_MUST_CHANGE` (ERROR - to be used when a wrong property/value is provided) - `PROPERTY_VALUE_HAS_BEEN_CHANGED` (WARN - when something has been auto-updated without consumer intervention) - `PROPERTY_VALUE_MAY_CHANGE` (WARN - when something is likely to change in the future) - `PROPERTY_HAS_BEEN_DELETED` (WARN - when something has been auto-deleted without consumer intervention) 
   * @return code
   */
  @NotNull @Size(max = 50) 
  @Schema(name = "code", example = "PROPERTY_WILL_BE_IGNORED", description = "A code used to describe the feedback. Possible values are: - `INFORMATIONAL_MESSAGE` (INFO - to be used when providing extra information)  - `PROPERTY_WILL_BE_IGNORED` (WARN - to be used for unsupported properties/values) - `PROPERTY_VALUE_MUST_CHANGE` (ERROR - to be used when a wrong property/value is provided) - `PROPERTY_VALUE_HAS_BEEN_CHANGED` (WARN - when something has been auto-updated without consumer intervention) - `PROPERTY_VALUE_MAY_CHANGE` (WARN - when something is likely to change in the future) - `PROPERTY_HAS_BEEN_DELETED` (WARN - when something has been auto-deleted without consumer intervention) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Feedback message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A description with additional information. 
   * @return message
   */
  @NotNull @Size(max = 5000) 
  @Schema(name = "message", example = "Spaces not allowed in facility code", description = "A description with additional information. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Feedback jsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
    return this;
  }

  /**
   * A path to the property, formatted according to [JSONpath](https://github.com/json-path/JsonPath). 
   * @return jsonPath
   */
  @Size(max = 500) 
  @Schema(name = "jsonPath", example = "$.location.facilityCode", description = "A path to the property, formatted according to [JSONpath](https://github.com/json-path/JsonPath). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jsonPath")
  public String getJsonPath() {
    return jsonPath;
  }

  public void setJsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
  }

  public Feedback property(String property) {
    this.property = property;
    return this;
  }

  /**
   * The name of the property causing the error/warning. 
   * @return property
   */
  @Size(max = 100) 
  @Schema(name = "property", example = "facilityCode", description = "The name of the property causing the error/warning. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feedback feedback = (Feedback) o;
    return Objects.equals(this.severity, feedback.severity) &&
        Objects.equals(this.code, feedback.code) &&
        Objects.equals(this.message, feedback.message) &&
        Objects.equals(this.jsonPath, feedback.jsonPath) &&
        Objects.equals(this.property, feedback.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, code, message, jsonPath, property);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feedback {\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    jsonPath: ").append(toIndentedString(jsonPath)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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

