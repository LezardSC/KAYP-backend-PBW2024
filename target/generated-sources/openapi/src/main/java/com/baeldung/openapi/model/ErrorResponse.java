package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.DetailedError;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
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
 * Unexpected error
 */

@Schema(name = "ErrorResponse", description = "Unexpected error")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class ErrorResponse {

  /**
   * The HTTP method used to make the request e.g. `GET`, `POST`, etc 
   */
  public enum HttpMethodEnum {
    GET("GET"),
    
    HEAD("HEAD"),
    
    POST("POST"),
    
    PUT("PUT"),
    
    DELETE("DELETE"),
    
    OPTION("OPTION"),
    
    PATCH("PATCH");

    private String value;

    HttpMethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HttpMethodEnum fromValue(String value) {
      for (HttpMethodEnum b : HttpMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private HttpMethodEnum httpMethod;

  private String requestUri;

  private Integer statusCode;

  private String statusCodeText;

  private String statusCodeMessage;

  private String providerCorrelationReference;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime errorDateTime;

  @Valid
  private List<@Valid DetailedError> errors = new ArrayList<>();

  public ErrorResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorResponse(HttpMethodEnum httpMethod, String requestUri, Integer statusCode, String statusCodeText, OffsetDateTime errorDateTime, List<@Valid DetailedError> errors) {
    this.httpMethod = httpMethod;
    this.requestUri = requestUri;
    this.statusCode = statusCode;
    this.statusCodeText = statusCodeText;
    this.errorDateTime = errorDateTime;
    this.errors = errors;
  }

  public ErrorResponse httpMethod(HttpMethodEnum httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

  /**
   * The HTTP method used to make the request e.g. `GET`, `POST`, etc 
   * @return httpMethod
   */
  @NotNull 
  @Schema(name = "httpMethod", example = "POST", description = "The HTTP method used to make the request e.g. `GET`, `POST`, etc ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("httpMethod")
  public HttpMethodEnum getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(HttpMethodEnum httpMethod) {
    this.httpMethod = httpMethod;
  }

  public ErrorResponse requestUri(String requestUri) {
    this.requestUri = requestUri;
    return this;
  }

  /**
   * The URI that was requested. 
   * @return requestUri
   */
  @NotNull 
  @Schema(name = "requestUri", example = "/v1/events", description = "The URI that was requested. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestUri")
  public String getRequestUri() {
    return requestUri;
  }

  public void setRequestUri(String requestUri) {
    this.requestUri = requestUri;
  }

  public ErrorResponse statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The HTTP status code returned. 
   * @return statusCode
   */
  @NotNull 
  @Schema(name = "statusCode", example = "400", description = "The HTTP status code returned. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("statusCode")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public ErrorResponse statusCodeText(String statusCodeText) {
    this.statusCodeText = statusCodeText;
    return this;
  }

  /**
   * A standard short description corresponding to the HTTP status code. 
   * @return statusCodeText
   */
  @NotNull @Size(max = 50) 
  @Schema(name = "statusCodeText", example = "Bad Request", description = "A standard short description corresponding to the HTTP status code. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("statusCodeText")
  public String getStatusCodeText() {
    return statusCodeText;
  }

  public void setStatusCodeText(String statusCodeText) {
    this.statusCodeText = statusCodeText;
  }

  public ErrorResponse statusCodeMessage(String statusCodeMessage) {
    this.statusCodeMessage = statusCodeMessage;
    return this;
  }

  /**
   * A long description corresponding to the HTTP status code with additional information. 
   * @return statusCodeMessage
   */
  @Size(max = 200) 
  @Schema(name = "statusCodeMessage", example = "The supplied data could not be accepted", description = "A long description corresponding to the HTTP status code with additional information. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusCodeMessage")
  public String getStatusCodeMessage() {
    return statusCodeMessage;
  }

  public void setStatusCodeMessage(String statusCodeMessage) {
    this.statusCodeMessage = statusCodeMessage;
  }

  public ErrorResponse providerCorrelationReference(String providerCorrelationReference) {
    this.providerCorrelationReference = providerCorrelationReference;
    return this;
  }

  /**
   * A unique identifier to the HTTP request within the scope of the API provider. 
   * @return providerCorrelationReference
   */
  @Size(max = 100) 
  @Schema(name = "providerCorrelationReference", example = "4426d965-0dd8-4005-8c63-dc68b01c4962", description = "A unique identifier to the HTTP request within the scope of the API provider. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("providerCorrelationReference")
  public String getProviderCorrelationReference() {
    return providerCorrelationReference;
  }

  public void setProviderCorrelationReference(String providerCorrelationReference) {
    this.providerCorrelationReference = providerCorrelationReference;
  }

  public ErrorResponse errorDateTime(OffsetDateTime errorDateTime) {
    this.errorDateTime = errorDateTime;
    return this;
  }

  /**
   * The DateTime corresponding to the error occurring. Must be formatted using [ISO 8601](https://www.iso.org/iso-8601-date-and-time-format.html) format. 
   * @return errorDateTime
   */
  @NotNull @Valid 
  @Schema(name = "errorDateTime", example = "2024-09-04T09:41Z", description = "The DateTime corresponding to the error occurring. Must be formatted using [ISO 8601](https://www.iso.org/iso-8601-date-and-time-format.html) format. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errorDateTime")
  public OffsetDateTime getErrorDateTime() {
    return errorDateTime;
  }

  public void setErrorDateTime(OffsetDateTime errorDateTime) {
    this.errorDateTime = errorDateTime;
  }

  public ErrorResponse errors(List<@Valid DetailedError> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorResponse addErrorsItem(DetailedError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * An array of errors providing more detail about the root cause. 
   * @return errors
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "errors", description = "An array of errors providing more detail about the root cause. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errors")
  public List<@Valid DetailedError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid DetailedError> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.httpMethod, errorResponse.httpMethod) &&
        Objects.equals(this.requestUri, errorResponse.requestUri) &&
        Objects.equals(this.statusCode, errorResponse.statusCode) &&
        Objects.equals(this.statusCodeText, errorResponse.statusCodeText) &&
        Objects.equals(this.statusCodeMessage, errorResponse.statusCodeMessage) &&
        Objects.equals(this.providerCorrelationReference, errorResponse.providerCorrelationReference) &&
        Objects.equals(this.errorDateTime, errorResponse.errorDateTime) &&
        Objects.equals(this.errors, errorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpMethod, requestUri, statusCode, statusCodeText, statusCodeMessage, providerCorrelationReference, errorDateTime, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    requestUri: ").append(toIndentedString(requestUri)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusCodeText: ").append(toIndentedString(statusCodeText)).append("\n");
    sb.append("    statusCodeMessage: ").append(toIndentedString(statusCodeMessage)).append("\n");
    sb.append("    providerCorrelationReference: ").append(toIndentedString(providerCorrelationReference)).append("\n");
    sb.append("    errorDateTime: ").append(toIndentedString(errorDateTime)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

