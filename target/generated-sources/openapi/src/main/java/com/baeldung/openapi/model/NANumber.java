package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
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
 * NANumber
 */

@JsonTypeName("NA_Number")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class NANumber implements DangerousGoods {

  private String naNumber;

  private String codedVariantList;

  private String properShippingName;

  private String technicalName;

  private String imoClass;

  private String subsidiaryRisk1;

  private String subsidiaryRisk2;

  private Boolean isMarinePollutant;

  private Integer packingGroup;

  private Boolean isLimitedQuantity;

  private Boolean isExceptedQuantity;

  private Boolean isSalvagePackings;

  private Boolean isEmptyUncleanedResidue;

  private Boolean isWaste;

  private Boolean isHot;

  private Boolean isCompetentAuthorityApprovalRequired;

  private String competentAuthorityApproval;

  @Valid
  private List<@Size(max = 2)String> segregationGroups = new ArrayList<>();

  @Valid
  private List<@Valid InnerPackaging> innerPackagings = new ArrayList<>();

  private EmergencyContactDetails emergencyContactDetails;

  private String emSNumber;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate endOfHoldingTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime fumigationDateTime;

  private Boolean isReportableQuantity;

  private String inhalationZone;

  private Object grossWeight;

  private Object netWeight;

  private Object netExplosiveContent;

  private Object netVolume;

  private Limits limits;

  public NANumber() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NANumber(String naNumber) {
    this.naNumber = naNumber;
    this.properShippingName = properShippingName;
    this.imoClass = imoClass;
  }

  public NANumber naNumber(String naNumber) {
    this.naNumber = naNumber;
    return this;
  }

  /**
   * Four-digit number that is assigned to dangerous, hazardous, and harmful substances by the United States Department of Transportation. 
   * @return naNumber
   */
  @NotNull @Pattern(regexp = "^\\d{4}$") @Size(min = 4, max = 4) 
  @Schema(name = "naNumber", example = "9037", description = "Four-digit number that is assigned to dangerous, hazardous, and harmful substances by the United States Department of Transportation. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("naNumber")
  public String getNaNumber() {
    return naNumber;
  }

  public void setNaNumber(String naNumber) {
    this.naNumber = naNumber;
  }

  public NANumber codedVariantList(String codedVariantList) {
    this.codedVariantList = codedVariantList;
    return this;
  }

  /**
   * Four-character code supplied by Exis Technologies that assists to remove ambiguities when identifying a variant within a single UN number or NA number that may occur when two companies exchange DG information.  Character | Valid Characters | Description :--------:|------------------|------------ 1| 0, 1, 2, 3|The packing group. Code 0 indicates there is no packing group 2|0 to 9 and A to Z|A sequence letter for the PSN, or 0 if there were no alternative PSNs 3 and 4|0 to 9 and A to Z|Two sequence letters for other information, for the cases where the variant is required because of different in subrisks, packing instruction etc. 
   * @return codedVariantList
   */
  @Pattern(regexp = "^[0-3][0-9A-Z]{3}$") @Size(min = 4, max = 4) 
  @Schema(name = "codedVariantList", example = "2200", description = "Four-character code supplied by Exis Technologies that assists to remove ambiguities when identifying a variant within a single UN number or NA number that may occur when two companies exchange DG information.  Character | Valid Characters | Description :--------:|------------------|------------ 1| 0, 1, 2, 3|The packing group. Code 0 indicates there is no packing group 2|0 to 9 and A to Z|A sequence letter for the PSN, or 0 if there were no alternative PSNs 3 and 4|0 to 9 and A to Z|Two sequence letters for other information, for the cases where the variant is required because of different in subrisks, packing instruction etc. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("codedVariantList")
  public String getCodedVariantList() {
    return codedVariantList;
  }

  public void setCodedVariantList(String codedVariantList) {
    this.codedVariantList = codedVariantList;
  }

  public NANumber properShippingName(String properShippingName) {
    this.properShippingName = properShippingName;
    return this;
  }

  /**
   * The proper shipping name for goods under IMDG Code, or the product name for goods under IBC Code and IGC Code, or the bulk cargo shipping name for goods under IMSBC Code, or the name of oil for goods under Annex I to the MARPOL Convention. 
   * @return properShippingName
   */
  @NotNull @Size(max = 250) 
  @Schema(name = "properShippingName", example = "Chromium Trioxide, anhydrous", description = "The proper shipping name for goods under IMDG Code, or the product name for goods under IBC Code and IGC Code, or the bulk cargo shipping name for goods under IMSBC Code, or the name of oil for goods under Annex I to the MARPOL Convention. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("properShippingName")
  public String getProperShippingName() {
    return properShippingName;
  }

  public void setProperShippingName(String properShippingName) {
    this.properShippingName = properShippingName;
  }

  public NANumber technicalName(String technicalName) {
    this.technicalName = technicalName;
    return this;
  }

  /**
   * The recognized chemical or biological name or other name currently used for the referenced dangerous goods as described in chapter 3.1.2.8 of the IMDG Code. 
   * @return technicalName
   */
  @Size(max = 250) 
  @Schema(name = "technicalName", example = "xylene and benzene", description = "The recognized chemical or biological name or other name currently used for the referenced dangerous goods as described in chapter 3.1.2.8 of the IMDG Code. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("technicalName")
  public String getTechnicalName() {
    return technicalName;
  }

  public void setTechnicalName(String technicalName) {
    this.technicalName = technicalName;
  }

  public NANumber imoClass(String imoClass) {
    this.imoClass = imoClass;
    return this;
  }

  /**
   * The hazard class code of the referenced dangerous goods according to the specified regulation. Examples of possible values are:  - `1.1A` (Substances and articles which have a mass explosion hazard) - `1.6N` (Extremely insensitive articles which do not have a mass explosion hazard) - `2.1` (Flammable gases) - `8` (Corrosive substances) 
   * @return imoClass
   */
  @NotNull @Size(max = 4) 
  @Schema(name = "imoClass", example = "1.4S", description = "The hazard class code of the referenced dangerous goods according to the specified regulation. Examples of possible values are:  - `1.1A` (Substances and articles which have a mass explosion hazard) - `1.6N` (Extremely insensitive articles which do not have a mass explosion hazard) - `2.1` (Flammable gases) - `8` (Corrosive substances) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("imoClass")
  public String getImoClass() {
    return imoClass;
  }

  public void setImoClass(String imoClass) {
    this.imoClass = imoClass;
  }

  public NANumber subsidiaryRisk1(String subsidiaryRisk1) {
    this.subsidiaryRisk1 = subsidiaryRisk1;
    return this;
  }

  /**
   * Any risk in addition to the class of the referenced dangerous goods according to the IMO IMDG Code. 
   * @return subsidiaryRisk1
   */
  @Pattern(regexp = "^[0-9](\\.[0-9])?$") @Size(min = 1, max = 3) 
  @Schema(name = "subsidiaryRisk1", example = "1.2", description = "Any risk in addition to the class of the referenced dangerous goods according to the IMO IMDG Code. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subsidiaryRisk1")
  public String getSubsidiaryRisk1() {
    return subsidiaryRisk1;
  }

  public void setSubsidiaryRisk1(String subsidiaryRisk1) {
    this.subsidiaryRisk1 = subsidiaryRisk1;
  }

  public NANumber subsidiaryRisk2(String subsidiaryRisk2) {
    this.subsidiaryRisk2 = subsidiaryRisk2;
    return this;
  }

  /**
   * Any risk in addition to the class of the referenced dangerous goods according to the IMO IMDG Code. 
   * @return subsidiaryRisk2
   */
  @Pattern(regexp = "^[0-9](\\.[0-9])?$") @Size(min = 1, max = 3) 
  @Schema(name = "subsidiaryRisk2", example = "1.2", description = "Any risk in addition to the class of the referenced dangerous goods according to the IMO IMDG Code. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subsidiaryRisk2")
  public String getSubsidiaryRisk2() {
    return subsidiaryRisk2;
  }

  public void setSubsidiaryRisk2(String subsidiaryRisk2) {
    this.subsidiaryRisk2 = subsidiaryRisk2;
  }

  public NANumber isMarinePollutant(Boolean isMarinePollutant) {
    this.isMarinePollutant = isMarinePollutant;
    return this;
  }

  /**
   * Indicates if the goods belong to the classification of Marine Pollutant. 
   * @return isMarinePollutant
   */
  
  @Schema(name = "isMarinePollutant", example = "false", description = "Indicates if the goods belong to the classification of Marine Pollutant. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isMarinePollutant")
  public Boolean getIsMarinePollutant() {
    return isMarinePollutant;
  }

  public void setIsMarinePollutant(Boolean isMarinePollutant) {
    this.isMarinePollutant = isMarinePollutant;
  }

  public NANumber packingGroup(Integer packingGroup) {
    this.packingGroup = packingGroup;
    return this;
  }

  /**
   * The packing group according to the UN Recommendations on the Transport of Dangerous Goods and IMO IMDG Code. 
   * minimum: 1
   * maximum: 3
   * @return packingGroup
   */
  @Min(1) @Max(3) 
  @Schema(name = "packingGroup", example = "3", description = "The packing group according to the UN Recommendations on the Transport of Dangerous Goods and IMO IMDG Code. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packingGroup")
  public Integer getPackingGroup() {
    return packingGroup;
  }

  public void setPackingGroup(Integer packingGroup) {
    this.packingGroup = packingGroup;
  }

  public NANumber isLimitedQuantity(Boolean isLimitedQuantity) {
    this.isLimitedQuantity = isLimitedQuantity;
    return this;
  }

  /**
   * Indicates if the dangerous goods can be transported as limited quantity in accordance with Chapter 3.4 of the IMO IMDG Code. 
   * @return isLimitedQuantity
   */
  
  @Schema(name = "isLimitedQuantity", example = "false", description = "Indicates if the dangerous goods can be transported as limited quantity in accordance with Chapter 3.4 of the IMO IMDG Code. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isLimitedQuantity")
  public Boolean getIsLimitedQuantity() {
    return isLimitedQuantity;
  }

  public void setIsLimitedQuantity(Boolean isLimitedQuantity) {
    this.isLimitedQuantity = isLimitedQuantity;
  }

  public NANumber isExceptedQuantity(Boolean isExceptedQuantity) {
    this.isExceptedQuantity = isExceptedQuantity;
    return this;
  }

  /**
   * Indicates if the dangerous goods can be transported as excepted quantity in accordance with Chapter 3.5 of the IMO IMDG Code. 
   * @return isExceptedQuantity
   */
  
  @Schema(name = "isExceptedQuantity", example = "false", description = "Indicates if the dangerous goods can be transported as excepted quantity in accordance with Chapter 3.5 of the IMO IMDG Code. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isExceptedQuantity")
  public Boolean getIsExceptedQuantity() {
    return isExceptedQuantity;
  }

  public void setIsExceptedQuantity(Boolean isExceptedQuantity) {
    this.isExceptedQuantity = isExceptedQuantity;
  }

  public NANumber isSalvagePackings(Boolean isSalvagePackings) {
    this.isSalvagePackings = isSalvagePackings;
    return this;
  }

  /**
   * Indicates if the cargo has special packaging for the transport, recovery or disposal of damaged, defective, leaking or nonconforming hazardous materials packages, or hazardous materials that have spilled or leaked. 
   * @return isSalvagePackings
   */
  
  @Schema(name = "isSalvagePackings", example = "false", description = "Indicates if the cargo has special packaging for the transport, recovery or disposal of damaged, defective, leaking or nonconforming hazardous materials packages, or hazardous materials that have spilled or leaked. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isSalvagePackings")
  public Boolean getIsSalvagePackings() {
    return isSalvagePackings;
  }

  public void setIsSalvagePackings(Boolean isSalvagePackings) {
    this.isSalvagePackings = isSalvagePackings;
  }

  public NANumber isEmptyUncleanedResidue(Boolean isEmptyUncleanedResidue) {
    this.isEmptyUncleanedResidue = isEmptyUncleanedResidue;
    return this;
  }

  /**
   * Indicates if the cargo is residue. 
   * @return isEmptyUncleanedResidue
   */
  
  @Schema(name = "isEmptyUncleanedResidue", example = "false", description = "Indicates if the cargo is residue. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isEmptyUncleanedResidue")
  public Boolean getIsEmptyUncleanedResidue() {
    return isEmptyUncleanedResidue;
  }

  public void setIsEmptyUncleanedResidue(Boolean isEmptyUncleanedResidue) {
    this.isEmptyUncleanedResidue = isEmptyUncleanedResidue;
  }

  public NANumber isWaste(Boolean isWaste) {
    this.isWaste = isWaste;
    return this;
  }

  /**
   * Indicates if waste is being shipped 
   * @return isWaste
   */
  
  @Schema(name = "isWaste", example = "false", description = "Indicates if waste is being shipped ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isWaste")
  public Boolean getIsWaste() {
    return isWaste;
  }

  public void setIsWaste(Boolean isWaste) {
    this.isWaste = isWaste;
  }

  public NANumber isHot(Boolean isHot) {
    this.isHot = isHot;
    return this;
  }

  /**
   * Indicates if high temperature cargo is shipped. 
   * @return isHot
   */
  
  @Schema(name = "isHot", example = "false", description = "Indicates if high temperature cargo is shipped. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isHot")
  public Boolean getIsHot() {
    return isHot;
  }

  public void setIsHot(Boolean isHot) {
    this.isHot = isHot;
  }

  public NANumber isCompetentAuthorityApprovalRequired(Boolean isCompetentAuthorityApprovalRequired) {
    this.isCompetentAuthorityApprovalRequired = isCompetentAuthorityApprovalRequired;
    return this;
  }

  /**
   * Indicates if the cargo require approval from authorities 
   * @return isCompetentAuthorityApprovalRequired
   */
  
  @Schema(name = "isCompetentAuthorityApprovalRequired", example = "false", description = "Indicates if the cargo require approval from authorities ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isCompetentAuthorityApprovalRequired")
  public Boolean getIsCompetentAuthorityApprovalRequired() {
    return isCompetentAuthorityApprovalRequired;
  }

  public void setIsCompetentAuthorityApprovalRequired(Boolean isCompetentAuthorityApprovalRequired) {
    this.isCompetentAuthorityApprovalRequired = isCompetentAuthorityApprovalRequired;
  }

  public NANumber competentAuthorityApproval(String competentAuthorityApproval) {
    this.competentAuthorityApproval = competentAuthorityApproval;
    return this;
  }

  /**
   * Name and reference number of the competent authority providing the approval. 
   * @return competentAuthorityApproval
   */
  @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 70) 
  @Schema(name = "competentAuthorityApproval", example = "{Name and reference...}", description = "Name and reference number of the competent authority providing the approval. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("competentAuthorityApproval")
  public String getCompetentAuthorityApproval() {
    return competentAuthorityApproval;
  }

  public void setCompetentAuthorityApproval(String competentAuthorityApproval) {
    this.competentAuthorityApproval = competentAuthorityApproval;
  }

  public NANumber segregationGroups(List<@Size(max = 2)String> segregationGroups) {
    this.segregationGroups = segregationGroups;
    return this;
  }

  public NANumber addSegregationGroupsItem(String segregationGroupsItem) {
    if (this.segregationGroups == null) {
      this.segregationGroups = new ArrayList<>();
    }
    this.segregationGroups.add(segregationGroupsItem);
    return this;
  }

  /**
   * List of the segregation groups applicable to specific hazardous goods according to the IMO IMDG Code.  **Condition:** only applicable to specific hazardous goods. 
   * @return segregationGroups
   */
  
  @Schema(name = "segregationGroups", description = "List of the segregation groups applicable to specific hazardous goods according to the IMO IMDG Code.  **Condition:** only applicable to specific hazardous goods. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("segregationGroups")
  public List<@Size(max = 2)String> getSegregationGroups() {
    return segregationGroups;
  }

  public void setSegregationGroups(List<@Size(max = 2)String> segregationGroups) {
    this.segregationGroups = segregationGroups;
  }

  public NANumber innerPackagings(List<@Valid InnerPackaging> innerPackagings) {
    this.innerPackagings = innerPackagings;
    return this;
  }

  public NANumber addInnerPackagingsItem(InnerPackaging innerPackagingsItem) {
    if (this.innerPackagings == null) {
      this.innerPackagings = new ArrayList<>();
    }
    this.innerPackagings.add(innerPackagingsItem);
    return this;
  }

  /**
   * A list of `Inner Packings` contained inside this `outer packaging/overpack`. 
   * @return innerPackagings
   */
  @Valid 
  @Schema(name = "innerPackagings", description = "A list of `Inner Packings` contained inside this `outer packaging/overpack`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("innerPackagings")
  public List<@Valid InnerPackaging> getInnerPackagings() {
    return innerPackagings;
  }

  public void setInnerPackagings(List<@Valid InnerPackaging> innerPackagings) {
    this.innerPackagings = innerPackagings;
  }

  public NANumber emergencyContactDetails(EmergencyContactDetails emergencyContactDetails) {
    this.emergencyContactDetails = emergencyContactDetails;
    return this;
  }

  /**
   * Get emergencyContactDetails
   * @return emergencyContactDetails
   */
  @Valid 
  @Schema(name = "emergencyContactDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emergencyContactDetails")
  public EmergencyContactDetails getEmergencyContactDetails() {
    return emergencyContactDetails;
  }

  public void setEmergencyContactDetails(EmergencyContactDetails emergencyContactDetails) {
    this.emergencyContactDetails = emergencyContactDetails;
  }

  public NANumber emSNumber(String emSNumber) {
    this.emSNumber = emSNumber;
    return this;
  }

  /**
   * The emergency schedule identified in the IMO EmS Guide – Emergency Response Procedures for Ships Carrying Dangerous Goods. Comprises 2 values; 1 for spillage and 1 for fire. Possible values spillage: S-A to S-Z. Possible values fire: F-A to F-Z. 
   * @return emSNumber
   */
  @Size(max = 7) 
  @Schema(name = "EMSNumber", example = "F-A S-Q", description = "The emergency schedule identified in the IMO EmS Guide – Emergency Response Procedures for Ships Carrying Dangerous Goods. Comprises 2 values; 1 for spillage and 1 for fire. Possible values spillage: S-A to S-Z. Possible values fire: F-A to F-Z. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EMSNumber")
  public String getEmSNumber() {
    return emSNumber;
  }

  public void setEmSNumber(String emSNumber) {
    this.emSNumber = emSNumber;
  }

  public NANumber endOfHoldingTime(LocalDate endOfHoldingTime) {
    this.endOfHoldingTime = endOfHoldingTime;
    return this;
  }

  /**
   * Date by when the refrigerated liquid needs to be delivered. 
   * @return endOfHoldingTime
   */
  @Valid 
  @Schema(name = "endOfHoldingTime", example = "Fri Sep 03 02:00:00 CEST 2021", description = "Date by when the refrigerated liquid needs to be delivered. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endOfHoldingTime")
  public LocalDate getEndOfHoldingTime() {
    return endOfHoldingTime;
  }

  public void setEndOfHoldingTime(LocalDate endOfHoldingTime) {
    this.endOfHoldingTime = endOfHoldingTime;
  }

  public NANumber fumigationDateTime(OffsetDateTime fumigationDateTime) {
    this.fumigationDateTime = fumigationDateTime;
    return this;
  }

  /**
   * Date & time when the container was fumigated 
   * @return fumigationDateTime
   */
  @Valid 
  @Schema(name = "fumigationDateTime", example = "2024-09-04T09:41Z", description = "Date & time when the container was fumigated ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fumigationDateTime")
  public OffsetDateTime getFumigationDateTime() {
    return fumigationDateTime;
  }

  public void setFumigationDateTime(OffsetDateTime fumigationDateTime) {
    this.fumigationDateTime = fumigationDateTime;
  }

  public NANumber isReportableQuantity(Boolean isReportableQuantity) {
    this.isReportableQuantity = isReportableQuantity;
    return this;
  }

  /**
   * Indicates if a container of hazardous material is at the reportable quantity level. If `true`, a report to the relevant authority must be made in case of spill. 
   * @return isReportableQuantity
   */
  
  @Schema(name = "isReportableQuantity", example = "false", description = "Indicates if a container of hazardous material is at the reportable quantity level. If `true`, a report to the relevant authority must be made in case of spill. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isReportableQuantity")
  public Boolean getIsReportableQuantity() {
    return isReportableQuantity;
  }

  public void setIsReportableQuantity(Boolean isReportableQuantity) {
    this.isReportableQuantity = isReportableQuantity;
  }

  public NANumber inhalationZone(String inhalationZone) {
    this.inhalationZone = inhalationZone;
    return this;
  }

  /**
   * The zone classification of the toxicity of the inhalant. Possible values are:  - `A` (Hazard Zone A) can be assigned to specific gases and liquids - `B` (Hazard Zone B) can be assigned to specific gases and liquids - `C` (Hazard Zone C) can **only** be assigned to specific gases - `D` (Hazard Zone D) can **only** be assigned to specific gases 
   * @return inhalationZone
   */
  @Size(min = 1, max = 1) 
  @Schema(name = "inhalationZone", example = "A", description = "The zone classification of the toxicity of the inhalant. Possible values are:  - `A` (Hazard Zone A) can be assigned to specific gases and liquids - `B` (Hazard Zone B) can be assigned to specific gases and liquids - `C` (Hazard Zone C) can **only** be assigned to specific gases - `D` (Hazard Zone D) can **only** be assigned to specific gases ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inhalationZone")
  public String getInhalationZone() {
    return inhalationZone;
  }

  public void setInhalationZone(String inhalationZone) {
    this.inhalationZone = inhalationZone;
  }

  public NANumber grossWeight(Object grossWeight) {
    this.grossWeight = grossWeight;
    return this;
  }

  /**
   * Total weight of the goods carried, including packaging. 
   * @return grossWeight
   */
  
  @Schema(name = "grossWeight", description = "Total weight of the goods carried, including packaging. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("grossWeight")
  public Object getGrossWeight() {
    return grossWeight;
  }

  public void setGrossWeight(Object grossWeight) {
    this.grossWeight = grossWeight;
  }

  public NANumber netWeight(Object netWeight) {
    this.netWeight = netWeight;
    return this;
  }

  /**
   * Total weight of the goods carried, excluding packaging. 
   * @return netWeight
   */
  
  @Schema(name = "netWeight", description = "Total weight of the goods carried, excluding packaging. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("netWeight")
  public Object getNetWeight() {
    return netWeight;
  }

  public void setNetWeight(Object netWeight) {
    this.netWeight = netWeight;
  }

  public NANumber netExplosiveContent(Object netExplosiveContent) {
    this.netExplosiveContent = netExplosiveContent;
    return this;
  }

  /**
   * The total weight of the explosive substances, without the packaging’s, casings, etc. 
   * @return netExplosiveContent
   */
  
  @Schema(name = "netExplosiveContent", description = "The total weight of the explosive substances, without the packaging’s, casings, etc. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("netExplosiveContent")
  public Object getNetExplosiveContent() {
    return netExplosiveContent;
  }

  public void setNetExplosiveContent(Object netExplosiveContent) {
    this.netExplosiveContent = netExplosiveContent;
  }

  public NANumber netVolume(Object netVolume) {
    this.netVolume = netVolume;
    return this;
  }

  /**
   * The volume of the referenced dangerous goods.  **Condition:** only applicable to liquids and gas. 
   * @return netVolume
   */
  
  @Schema(name = "netVolume", description = "The volume of the referenced dangerous goods.  **Condition:** only applicable to liquids and gas. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("netVolume")
  public Object getNetVolume() {
    return netVolume;
  }

  public void setNetVolume(Object netVolume) {
    this.netVolume = netVolume;
  }

  public NANumber limits(Limits limits) {
    this.limits = limits;
    return this;
  }

  /**
   * Get limits
   * @return limits
   */
  @Valid 
  @Schema(name = "limits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limits")
  public Limits getLimits() {
    return limits;
  }

  public void setLimits(Limits limits) {
    this.limits = limits;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NANumber naNumber = (NANumber) o;
    return Objects.equals(this.naNumber, naNumber.naNumber) &&
        Objects.equals(this.codedVariantList, naNumber.codedVariantList) &&
        Objects.equals(this.properShippingName, naNumber.properShippingName) &&
        Objects.equals(this.technicalName, naNumber.technicalName) &&
        Objects.equals(this.imoClass, naNumber.imoClass) &&
        Objects.equals(this.subsidiaryRisk1, naNumber.subsidiaryRisk1) &&
        Objects.equals(this.subsidiaryRisk2, naNumber.subsidiaryRisk2) &&
        Objects.equals(this.isMarinePollutant, naNumber.isMarinePollutant) &&
        Objects.equals(this.packingGroup, naNumber.packingGroup) &&
        Objects.equals(this.isLimitedQuantity, naNumber.isLimitedQuantity) &&
        Objects.equals(this.isExceptedQuantity, naNumber.isExceptedQuantity) &&
        Objects.equals(this.isSalvagePackings, naNumber.isSalvagePackings) &&
        Objects.equals(this.isEmptyUncleanedResidue, naNumber.isEmptyUncleanedResidue) &&
        Objects.equals(this.isWaste, naNumber.isWaste) &&
        Objects.equals(this.isHot, naNumber.isHot) &&
        Objects.equals(this.isCompetentAuthorityApprovalRequired, naNumber.isCompetentAuthorityApprovalRequired) &&
        Objects.equals(this.competentAuthorityApproval, naNumber.competentAuthorityApproval) &&
        Objects.equals(this.segregationGroups, naNumber.segregationGroups) &&
        Objects.equals(this.innerPackagings, naNumber.innerPackagings) &&
        Objects.equals(this.emergencyContactDetails, naNumber.emergencyContactDetails) &&
        Objects.equals(this.emSNumber, naNumber.emSNumber) &&
        Objects.equals(this.endOfHoldingTime, naNumber.endOfHoldingTime) &&
        Objects.equals(this.fumigationDateTime, naNumber.fumigationDateTime) &&
        Objects.equals(this.isReportableQuantity, naNumber.isReportableQuantity) &&
        Objects.equals(this.inhalationZone, naNumber.inhalationZone) &&
        Objects.equals(this.grossWeight, naNumber.grossWeight) &&
        Objects.equals(this.netWeight, naNumber.netWeight) &&
        Objects.equals(this.netExplosiveContent, naNumber.netExplosiveContent) &&
        Objects.equals(this.netVolume, naNumber.netVolume) &&
        Objects.equals(this.limits, naNumber.limits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(naNumber, codedVariantList, properShippingName, technicalName, imoClass, subsidiaryRisk1, subsidiaryRisk2, isMarinePollutant, packingGroup, isLimitedQuantity, isExceptedQuantity, isSalvagePackings, isEmptyUncleanedResidue, isWaste, isHot, isCompetentAuthorityApprovalRequired, competentAuthorityApproval, segregationGroups, innerPackagings, emergencyContactDetails, emSNumber, endOfHoldingTime, fumigationDateTime, isReportableQuantity, inhalationZone, grossWeight, netWeight, netExplosiveContent, netVolume, limits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NANumber {\n");
    sb.append("    naNumber: ").append(toIndentedString(naNumber)).append("\n");
    sb.append("    codedVariantList: ").append(toIndentedString(codedVariantList)).append("\n");
    sb.append("    properShippingName: ").append(toIndentedString(properShippingName)).append("\n");
    sb.append("    technicalName: ").append(toIndentedString(technicalName)).append("\n");
    sb.append("    imoClass: ").append(toIndentedString(imoClass)).append("\n");
    sb.append("    subsidiaryRisk1: ").append(toIndentedString(subsidiaryRisk1)).append("\n");
    sb.append("    subsidiaryRisk2: ").append(toIndentedString(subsidiaryRisk2)).append("\n");
    sb.append("    isMarinePollutant: ").append(toIndentedString(isMarinePollutant)).append("\n");
    sb.append("    packingGroup: ").append(toIndentedString(packingGroup)).append("\n");
    sb.append("    isLimitedQuantity: ").append(toIndentedString(isLimitedQuantity)).append("\n");
    sb.append("    isExceptedQuantity: ").append(toIndentedString(isExceptedQuantity)).append("\n");
    sb.append("    isSalvagePackings: ").append(toIndentedString(isSalvagePackings)).append("\n");
    sb.append("    isEmptyUncleanedResidue: ").append(toIndentedString(isEmptyUncleanedResidue)).append("\n");
    sb.append("    isWaste: ").append(toIndentedString(isWaste)).append("\n");
    sb.append("    isHot: ").append(toIndentedString(isHot)).append("\n");
    sb.append("    isCompetentAuthorityApprovalRequired: ").append(toIndentedString(isCompetentAuthorityApprovalRequired)).append("\n");
    sb.append("    competentAuthorityApproval: ").append(toIndentedString(competentAuthorityApproval)).append("\n");
    sb.append("    segregationGroups: ").append(toIndentedString(segregationGroups)).append("\n");
    sb.append("    innerPackagings: ").append(toIndentedString(innerPackagings)).append("\n");
    sb.append("    emergencyContactDetails: ").append(toIndentedString(emergencyContactDetails)).append("\n");
    sb.append("    emSNumber: ").append(toIndentedString(emSNumber)).append("\n");
    sb.append("    endOfHoldingTime: ").append(toIndentedString(endOfHoldingTime)).append("\n");
    sb.append("    fumigationDateTime: ").append(toIndentedString(fumigationDateTime)).append("\n");
    sb.append("    isReportableQuantity: ").append(toIndentedString(isReportableQuantity)).append("\n");
    sb.append("    inhalationZone: ").append(toIndentedString(inhalationZone)).append("\n");
    sb.append("    grossWeight: ").append(toIndentedString(grossWeight)).append("\n");
    sb.append("    netWeight: ").append(toIndentedString(netWeight)).append("\n");
    sb.append("    netExplosiveContent: ").append(toIndentedString(netExplosiveContent)).append("\n");
    sb.append("    netVolume: ").append(toIndentedString(netVolume)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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

