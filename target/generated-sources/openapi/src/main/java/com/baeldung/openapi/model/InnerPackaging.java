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
 * Object for inner packaging specification 
 */

@Schema(name = "InnerPackaging", description = "Object for inner packaging specification ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class InnerPackaging {

  private Integer quantity;

  private String material;

  private String description;

  public InnerPackaging() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InnerPackaging(Integer quantity, String material, String description) {
    this.quantity = quantity;
    this.material = material;
    this.description = description;
  }

  public InnerPackaging quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Count of `Inner Packagings` of the referenced `Dangerous Goods`. 
   * @return quantity
   */
  @NotNull 
  @Schema(name = "quantity", example = "20", description = "Count of `Inner Packagings` of the referenced `Dangerous Goods`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public InnerPackaging material(String material) {
    this.material = material;
    return this;
  }

  /**
   * The `material` used for the `Inner Packaging` of the referenced `Dangerous Goods`. 
   * @return material
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "material", example = "Plastic", description = "The `material` used for the `Inner Packaging` of the referenced `Dangerous Goods`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("material")
  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public InnerPackaging description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the packaging. 
   * @return description
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "description", example = "Woven plastic water resistant Bag", description = "Description of the packaging. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnerPackaging innerPackaging = (InnerPackaging) o;
    return Objects.equals(this.quantity, innerPackaging.quantity) &&
        Objects.equals(this.material, innerPackaging.material) &&
        Objects.equals(this.description, innerPackaging.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, material, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InnerPackaging {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    material: ").append(toIndentedString(material)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

