package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.DangerousGoods;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object for outer packaging/overpack specification. Examples of overpacks are a number of packages stacked on to a pallet and secured by strapping or placed in a protective outer packaging such as a box or crate to form one unit for the convenience of handling and stowage during transport. 
 */

@Schema(name = "OuterPackaging", description = "Object for outer packaging/overpack specification. Examples of overpacks are a number of packages stacked on to a pallet and secured by strapping or placed in a protective outer packaging such as a box or crate to form one unit for the convenience of handling and stowage during transport. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class OuterPackaging {

  private String packageCode;

  private String imoPackagingCode;

  private Integer numberOfPackages;

  private String description;

  private String woodDeclaration;

  @Valid
  private List<@Valid DangerousGoods> dangerousGoods = new ArrayList<>();

  public OuterPackaging() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OuterPackaging(Integer numberOfPackages, String description) {
    this.numberOfPackages = numberOfPackages;
    this.description = description;
  }

  public OuterPackaging packageCode(String packageCode) {
    this.packageCode = packageCode;
    return this;
  }

  /**
   * A code identifying the outer packaging/overpack. `PackageCode` must follow the codes specified in [Recommendation N°21](https://unece.org/trade/uncefact/cl-recommendations)  **Condition:** only applicable to dangerous goods if the `IMO packaging code` is not available. 
   * @return packageCode
   */
  @Pattern(regexp = "^[A-Z0-9]{2}$") @Size(min = 2, max = 2) 
  @Schema(name = "packageCode", example = "5H", description = "A code identifying the outer packaging/overpack. `PackageCode` must follow the codes specified in [Recommendation N°21](https://unece.org/trade/uncefact/cl-recommendations)  **Condition:** only applicable to dangerous goods if the `IMO packaging code` is not available. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packageCode")
  public String getPackageCode() {
    return packageCode;
  }

  public void setPackageCode(String packageCode) {
    this.packageCode = packageCode;
  }

  public OuterPackaging imoPackagingCode(String imoPackagingCode) {
    this.imoPackagingCode = imoPackagingCode;
    return this;
  }

  /**
   * The code of the packaging as per IMO.  **Condition:** only applicable to dangerous goods if specified in the [IMO IMDG code](https://www.imo.org/en/publications/Pages/IMDG%20Code.aspx). If not available, the `packageCode` as per UN recommendation 21 should be used. 
   * @return imoPackagingCode
   */
  @Pattern(regexp = "^[A-Z0-9]{1,5}$") @Size(min = 1, max = 5) 
  @Schema(name = "imoPackagingCode", example = "1A2", description = "The code of the packaging as per IMO.  **Condition:** only applicable to dangerous goods if specified in the [IMO IMDG code](https://www.imo.org/en/publications/Pages/IMDG%20Code.aspx). If not available, the `packageCode` as per UN recommendation 21 should be used. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imoPackagingCode")
  public String getImoPackagingCode() {
    return imoPackagingCode;
  }

  public void setImoPackagingCode(String imoPackagingCode) {
    this.imoPackagingCode = imoPackagingCode;
  }

  public OuterPackaging numberOfPackages(Integer numberOfPackages) {
    this.numberOfPackages = numberOfPackages;
    return this;
  }

  /**
   * Specifies the number of outer packagings/overpacks associated with this `Cargo Item`. 
   * minimum: 1
   * maximum: 99999999
   * @return numberOfPackages
   */
  @NotNull @Min(1) @Max(99999999) 
  @Schema(name = "numberOfPackages", example = "18", description = "Specifies the number of outer packagings/overpacks associated with this `Cargo Item`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("numberOfPackages")
  public Integer getNumberOfPackages() {
    return numberOfPackages;
  }

  public void setNumberOfPackages(Integer numberOfPackages) {
    this.numberOfPackages = numberOfPackages;
  }

  public OuterPackaging description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the outer packaging/overpack. 
   * @return description
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "description", example = "Drum, steel", description = "Description of the outer packaging/overpack. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OuterPackaging woodDeclaration(String woodDeclaration) {
    this.woodDeclaration = woodDeclaration;
    return this;
  }

  /**
   * Property to clearly indicate if the products, packaging and any other items are made of wood. Possible values include: - `NOT_APPLICABLE` (if no wood or any other wood product such as packaging and supports are being shipped) - `NOT_TREATED_AND_NOT_CERTIFIED` (if the wood or wooden materials have not been treated nor fumigated and do not include a certificate) - `PROCESSED` (if the wood or wooden materials are entirely made of processed wood, such as plywood, particle board, sliver plates of wood and wood laminate sheets produced using glue, heat, pressure or a combination of these) - `TREATED_AND_CERTIFIED` (if the wood or wooden materials have been treated and/or fumigated and include a certificate) 
   * @return woodDeclaration
   */
  @Size(max = 30) 
  @Schema(name = "woodDeclaration", example = "TREATED_AND_CERTIFIED", description = "Property to clearly indicate if the products, packaging and any other items are made of wood. Possible values include: - `NOT_APPLICABLE` (if no wood or any other wood product such as packaging and supports are being shipped) - `NOT_TREATED_AND_NOT_CERTIFIED` (if the wood or wooden materials have not been treated nor fumigated and do not include a certificate) - `PROCESSED` (if the wood or wooden materials are entirely made of processed wood, such as plywood, particle board, sliver plates of wood and wood laminate sheets produced using glue, heat, pressure or a combination of these) - `TREATED_AND_CERTIFIED` (if the wood or wooden materials have been treated and/or fumigated and include a certificate) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("woodDeclaration")
  public String getWoodDeclaration() {
    return woodDeclaration;
  }

  public void setWoodDeclaration(String woodDeclaration) {
    this.woodDeclaration = woodDeclaration;
  }

  public OuterPackaging dangerousGoods(List<@Valid DangerousGoods> dangerousGoods) {
    this.dangerousGoods = dangerousGoods;
    return this;
  }

  public OuterPackaging addDangerousGoodsItem(DangerousGoods dangerousGoodsItem) {
    if (this.dangerousGoods == null) {
      this.dangerousGoods = new ArrayList<>();
    }
    this.dangerousGoods.add(dangerousGoodsItem);
    return this;
  }

  /**
   * A list of `Dangerous Goods` 
   * @return dangerousGoods
   */
  @Valid 
  @Schema(name = "dangerousGoods", description = "A list of `Dangerous Goods` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dangerousGoods")
  public List<@Valid DangerousGoods> getDangerousGoods() {
    return dangerousGoods;
  }

  public void setDangerousGoods(List<@Valid DangerousGoods> dangerousGoods) {
    this.dangerousGoods = dangerousGoods;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OuterPackaging outerPackaging = (OuterPackaging) o;
    return Objects.equals(this.packageCode, outerPackaging.packageCode) &&
        Objects.equals(this.imoPackagingCode, outerPackaging.imoPackagingCode) &&
        Objects.equals(this.numberOfPackages, outerPackaging.numberOfPackages) &&
        Objects.equals(this.description, outerPackaging.description) &&
        Objects.equals(this.woodDeclaration, outerPackaging.woodDeclaration) &&
        Objects.equals(this.dangerousGoods, outerPackaging.dangerousGoods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageCode, imoPackagingCode, numberOfPackages, description, woodDeclaration, dangerousGoods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OuterPackaging {\n");
    sb.append("    packageCode: ").append(toIndentedString(packageCode)).append("\n");
    sb.append("    imoPackagingCode: ").append(toIndentedString(imoPackagingCode)).append("\n");
    sb.append("    numberOfPackages: ").append(toIndentedString(numberOfPackages)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    woodDeclaration: ").append(toIndentedString(woodDeclaration)).append("\n");
    sb.append("    dangerousGoods: ").append(toIndentedString(dangerousGoods)).append("\n");
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

