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
 * A detailed description of what has caused the error. 
 */

@Schema(name = "DetailedError", description = "A detailed description of what has caused the error. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class DetailedError {

  private Integer errorCode;

  private String property;

  private String value;

  private String jsonPath;

  private String errorCodeText;

  private String errorCodeMessage;

  public DetailedError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DetailedError(String errorCodeText, String errorCodeMessage) {
    this.errorCodeText = errorCodeText;
    this.errorCodeMessage = errorCodeMessage;
  }

  public DetailedError errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * The detailed error code returned.    - `7000-7999` Technical error codes   - `8000-8999` Functional error codes   - `9000-9999` API provider-specific error codes              [Error codes as specified by DCSA](https://developer.dcsa.org/standard-error-codes). 
   * minimum: 7000
   * maximum: 9999
   * @return errorCode
   */
  @Min(7000) @Max(9999) 
  @Schema(name = "errorCode", example = "7003", description = "The detailed error code returned.    - `7000-7999` Technical error codes   - `8000-8999` Functional error codes   - `9000-9999` API provider-specific error codes              [Error codes as specified by DCSA](https://developer.dcsa.org/standard-error-codes). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public DetailedError property(String property) {
    this.property = property;
    return this;
  }

  /**
   * The name of the property causing the error. 
   * @return property
   */
  @Size(max = 100) 
  @Schema(name = "property", example = "facilityCode", description = "The name of the property causing the error. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public DetailedError value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the property causing the error serialised as a string exactly as in the original request. 
   * @return value
   */
  @Size(max = 500) 
  @Schema(name = "value", example = "SG SIN WHS", description = "The value of the property causing the error serialised as a string exactly as in the original request. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public DetailedError jsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
    return this;
  }

  /**
   * A path to the property causing the error, formatted according to [JSONpath](https://github.com/json-path/JsonPath). 
   * @return jsonPath
   */
  @Size(max = 500) 
  @Schema(name = "jsonPath", example = "$.location.facilityCode", description = "A path to the property causing the error, formatted according to [JSONpath](https://github.com/json-path/JsonPath). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jsonPath")
  public String getJsonPath() {
    return jsonPath;
  }

  public void setJsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
  }

  public DetailedError errorCodeText(String errorCodeText) {
    this.errorCodeText = errorCodeText;
    return this;
  }

  /**
   * A standard short description corresponding to the `errorCode`. 
   * @return errorCodeText
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "errorCodeText", example = "invalidData", description = "A standard short description corresponding to the `errorCode`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errorCodeText")
  public String getErrorCodeText() {
    return errorCodeText;
  }

  public void setErrorCodeText(String errorCodeText) {
    this.errorCodeText = errorCodeText;
  }

  public DetailedError errorCodeMessage(String errorCodeMessage) {
    this.errorCodeMessage = errorCodeMessage;
    return this;
  }

  /**
   * A long description corresponding to the `errorCode` with additional information. 
   * @return errorCodeMessage
   */
  @NotNull @Size(max = 5000) 
  @Schema(name = "errorCodeMessage", example = "Spaces not allowed in facility code", description = "A long description corresponding to the `errorCode` with additional information. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errorCodeMessage")
  public String getErrorCodeMessage() {
    return errorCodeMessage;
  }

  public void setErrorCodeMessage(String errorCodeMessage) {
    this.errorCodeMessage = errorCodeMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedError detailedError = (DetailedError) o;
    return Objects.equals(this.errorCode, detailedError.errorCode) &&
        Objects.equals(this.property, detailedError.property) &&
        Objects.equals(this.value, detailedError.value) &&
        Objects.equals(this.jsonPath, detailedError.jsonPath) &&
        Objects.equals(this.errorCodeText, detailedError.errorCodeText) &&
        Objects.equals(this.errorCodeMessage, detailedError.errorCodeMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, property, value, jsonPath, errorCodeText, errorCodeMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedError {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    jsonPath: ").append(toIndentedString(jsonPath)).append("\n");
    sb.append("    errorCodeText: ").append(toIndentedString(errorCodeText)).append("\n");
    sb.append("    errorCodeMessage: ").append(toIndentedString(errorCodeMessage)).append("\n");
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

