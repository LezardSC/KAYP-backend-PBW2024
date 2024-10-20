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
 * An object used to express a location using &#x60;latitude&#x60; and &#x60;longitude&#x60;. 
 */

@Schema(name = "GeoCoordinate", description = "An object used to express a location using `latitude` and `longitude`. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class GeoCoordinate {

  private String latitude;

  private String longitude;

  public GeoCoordinate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeoCoordinate(String latitude, String longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public GeoCoordinate latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Geographic coordinate that specifies the north–south position of a point on the Earth's surface.
   * @return latitude
   */
  @NotNull @Size(max = 10) 
  @Schema(name = "latitude", example = "48.8585500", description = "Geographic coordinate that specifies the north–south position of a point on the Earth's surface.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public GeoCoordinate longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Geographic coordinate that specifies the east–west position of a point on the Earth's surface.
   * @return longitude
   */
  @NotNull @Size(max = 11) 
  @Schema(name = "longitude", example = "2.294492036", description = "Geographic coordinate that specifies the east–west position of a point on the Earth's surface.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("longitude")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoCoordinate geoCoordinate = (GeoCoordinate) o;
    return Objects.equals(this.latitude, geoCoordinate.latitude) &&
        Objects.equals(this.longitude, geoCoordinate.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoCoordinate {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

