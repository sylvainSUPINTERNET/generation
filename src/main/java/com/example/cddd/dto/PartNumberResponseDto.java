package com.example.cddd.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class PartNumberResponseDto {
  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Long id;

  private String primaryDesignation;

  private String secondaryDesignation;

  private String mappedEbomPartNumber;

  private String mappedCodepPartNumber;

  private String mappedEnoviaPartNumber;

  private String systemCreator;

  private String vehicleMappingCodepWithEbom;

  private String vehicleMappingCodepWithEnovia;

  private Boolean gcbFlagFromCodep;

  private String bomSystem;

  private String indexPsa;

  private String partType;

  private String partName;

  private String partRevision;

  private String decoupagePsa;

  private String productNature;

  private String launchProjectName;

  private String pdefFromPrea;

  private String preaFromPdef;

  private Boolean pdefBomAssembly;

  private Boolean pdefBomComponent;

  private String requestHash;

  @JsonIgnore
  private PartNumberDto partNumber;

  private SystemRequestDto systemRequest;

  private List<PartNumberResponseBomUsageDto> partNumberResponseBomUsage;

  /**
   * @return id
   */
  public Long getId() {

    return this.id;
  }

  /**
   * @param id new value of getid
   */
  public void setId(Long id) {

    this.id = id;
  }

  /**
   * @return primaryDesignation
   */
  public String getPrimaryDesignation() {

    return this.primaryDesignation;
  }

  /**
   * @param primaryDesignation new value of getprimaryDesignation
   */
  public void setPrimaryDesignation(String primaryDesignation) {

    this.primaryDesignation = primaryDesignation;
  }

  /**
   * @return secondaryDesignation
   */
  public String getSecondaryDesignation() {

    return this.secondaryDesignation;
  }

  /**
   * @param secondaryDesignation new value of getsecondaryDesignation
   */
  public void setSecondaryDesignation(String secondaryDesignation) {

    this.secondaryDesignation = secondaryDesignation;
  }

  /**
   * @return mappedEbomPartNumber
   */
  public String getMappedEbomPartNumber() {

    return this.mappedEbomPartNumber;
  }

  /**
   * @param mappedEbomPartNumber new value of getmappedEbomPartNumber
   */
  public void setMappedEbomPartNumber(String mappedEbomPartNumber) {

    this.mappedEbomPartNumber = mappedEbomPartNumber;
  }

  /**
   * @return mappedCodepPartNumber
   */
  public String getMappedCodepPartNumber() {

    return this.mappedCodepPartNumber;
  }

  /**
   * @param mappedCodepPartNumber new value of getmappedCodepPartNumber
   */
  public void setMappedCodepPartNumber(String mappedCodepPartNumber) {

    this.mappedCodepPartNumber = mappedCodepPartNumber;
  }

  /**
   * @return mappedEnoviaPartNumber
   */
  public String getMappedEnoviaPartNumber() {

    return this.mappedEnoviaPartNumber;
  }

  /**
   * @param mappedEnoviaPartNumber new value of getmappedEnoviaPartNumber
   */
  public void setMappedEnoviaPartNumber(String mappedEnoviaPartNumber) {

    this.mappedEnoviaPartNumber = mappedEnoviaPartNumber;
  }

  /**
   * @return systemCreator
   */
  public String getSystemCreator() {

    return this.systemCreator;
  }

  /**
   * @param systemCreator new value of getsystemCreator
   */
  public void setSystemCreator(String systemCreator) {

    this.systemCreator = systemCreator;
  }

  /**
   * @return vehicleMappingCodepWithEbom
   */
  public String getVehicleMappingCodepWithEbom() {

    return this.vehicleMappingCodepWithEbom;
  }

  /**
   * @param vehicleMappingCodepWithEbom new value of getvehicleMappingCodepWithEbom
   */
  public void setVehicleMappingCodepWithEbom(String vehicleMappingCodepWithEbom) {

    this.vehicleMappingCodepWithEbom = vehicleMappingCodepWithEbom;
  }

  /**
   * @return vehicleMappingCodepWithEnovia
   */
  public String getVehicleMappingCodepWithEnovia() {

    return this.vehicleMappingCodepWithEnovia;
  }

  /**
   * @param vehicleMappingCodepWithEnovia new value of getvehicleMappingCodepWithEnovia
   */
  public void setVehicleMappingCodepWithEnovia(String vehicleMappingCodepWithEnovia) {

    this.vehicleMappingCodepWithEnovia = vehicleMappingCodepWithEnovia;
  }

  /**
   * @return gcbFlagFromCodep
   */
  public Boolean getGcbFlagFromCodep() {

    return this.gcbFlagFromCodep;
  }

  /**
   * @param gcbFlagFromCodep new value of getgcbFlagFromCodep
   */
  public void setGcbFlagFromCodep(Boolean gcbFlagFromCodep) {

    this.gcbFlagFromCodep = gcbFlagFromCodep;
  }

  /**
   * @return bomSystem
   */
  public String getBomSystem() {

    return this.bomSystem;
  }

  /**
   * @param bomSystem new value of getbomSystem
   */
  public void setBomSystem(String bomSystem) {

    this.bomSystem = bomSystem;
  }

  /**
   * @return indexPsa
   */
  public String getIndexPsa() {

    return this.indexPsa;
  }

  /**
   * @param indexPsa new value of getindexPsa
   */
  public void setIndexPsa(String indexPsa) {

    this.indexPsa = indexPsa;
  }

  /**
   * @return partType
   */
  public String getPartType() {

    return this.partType;
  }

  /**
   * @param partType new value of getpartType
   */
  public void setPartType(String partType) {

    this.partType = partType;
  }

  /**
   * @return partName
   */
  public String getPartName() {

    return this.partName;
  }

  /**
   * @param partName new value of getpartName
   */
  public void setPartName(String partName) {

    this.partName = partName;
  }

  /**
   * @return partRevision
   */
  public String getPartRevision() {

    return this.partRevision;
  }

  /**
   * @param partRevision new value of getpartRevision
   */
  public void setPartRevision(String partRevision) {

    this.partRevision = partRevision;
  }

  /**
   * @return decoupagePsa
   */
  public String getDecoupagePsa() {

    return this.decoupagePsa;
  }

  /**
   * @param decoupagePsa new value of getdecoupagePsa
   */
  public void setDecoupagePsa(String decoupagePsa) {

    this.decoupagePsa = decoupagePsa;
  }

  /**
   * @return productNature
   */
  public String getProductNature() {

    return this.productNature;
  }

  /**
   * @param productNature new value of getproductNature
   */
  public void setProductNature(String productNature) {

    this.productNature = productNature;
  }

  /**
   * @return launchProjectName
   */
  public String getLaunchProjectName() {

    return this.launchProjectName;
  }

  /**
   * @param launchProjectName new value of getlaunchProjectName
   */
  public void setLaunchProjectName(String launchProjectName) {

    this.launchProjectName = launchProjectName;
  }

  /**
   * @return pdefFromPrea
   */
  public String getPdefFromPrea() {

    return this.pdefFromPrea;
  }

  /**
   * @param pdefFromPrea new value of getpdefFromPrea
   */
  public void setPdefFromPrea(String pdefFromPrea) {

    this.pdefFromPrea = pdefFromPrea;
  }

  /**
   * @return preaFromPdef
   */
  public String getPreaFromPdef() {

    return this.preaFromPdef;
  }

  /**
   * @param preaFromPdef new value of getpreaFromPdef
   */
  public void setPreaFromPdef(String preaFromPdef) {

    this.preaFromPdef = preaFromPdef;
  }

  /**
   * @return pdefBomAssembly
   */
  public Boolean getPdefBomAssembly() {

    return this.pdefBomAssembly;
  }

  /**
   * @param pdefBomAssembly new value of getpdefBomAssembly
   */
  public void setPdefBomAssembly(Boolean pdefBomAssembly) {

    this.pdefBomAssembly = pdefBomAssembly;
  }

  /**
   * @return pdefBomComponent
   */
  public Boolean getPdefBomComponent() {

    return this.pdefBomComponent;
  }

  /**
   * @param pdefBomComponent new value of getpdefBomComponent
   */
  public void setPdefBomComponent(Boolean pdefBomComponent) {

    this.pdefBomComponent = pdefBomComponent;
  }

  /**
   * @return requestHash
   */
  public String getRequestHash() {

    return this.requestHash;
  }

  /**
   * @param requestHash new value of getrequestHash
   */
  public void setRequestHash(String requestHash) {

    this.requestHash = requestHash;
  }

  /**
   * @return partNumber
   */
  public PartNumberDto getPartNumber() {

    return this.partNumber;
  }

  /**
   * @param partNumber new value of getpartNumber
   */
  public void setPartNumber(PartNumberDto partNumber) {

    this.partNumber = partNumber;
  }

  /**
   * @return systemRequest
   */
  public SystemRequestDto getSystemRequest() {

    return this.systemRequest;
  }

  /**
   * @param systemRequest new value of getsystemRequest
   */
  public void setSystemRequest(SystemRequestDto systemRequest) {

    this.systemRequest = systemRequest;
  }

  /**
   * @return partNumberResponseBomUsage
   */
  public List<PartNumberResponseBomUsageDto> getPartNumberResponseBomUsage() {

    return this.partNumberResponseBomUsage;
  }

  /**
   * @param partNumberResponseBomUsage new value of getpartNumberResponseBomUsage
   */
  public void setPartNumberResponseBomUsage(List<PartNumberResponseBomUsageDto> partNumberResponseBomUsage) {

    this.partNumberResponseBomUsage = partNumberResponseBomUsage;
  }

}
