package com.example.cddd.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * UpstreamResponsePartNumber Dto
 *
 * @author LNAVET
 *
 */
@JsonInclude(Include.NON_EMPTY)
public class UpstreamResponsePartNumberDto {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private String partNumber;

  private String bomSystem;

  private String localPrimaryDesignation;

  private String localSecondaryDesignation;

  private String mappedEbomPartNumber;

  private String mappedCodepPartNumber;

  private String mappedEnoviaPartNumber;

  private String systemCreator;

  private String vehicleMappingCodepWithEbom;

  private String vehicleMappingCodepWithEnovia;

  private Boolean gcbFlapFromCodep;

  private UpstreamResponseExtraInfoFromEnoviaPartDto extraInfoFromEnoviaPartDto;

  private List<UpstreamResponseExtraInformationEnoviaPartDto> extraInformationEnoviaPartDto; // yes in swagger it's dto

  private List<UpstreamResponseBomUsagesDto> bomUsages;

  /**
   * @return partNumber
   */
  public String getPartNumber() {

    return this.partNumber;
  }

  /**
   * @param partNumber new value of getpartNumber
   */
  public void setPartNumber(String partNumber) {

    this.partNumber = partNumber;
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
   * @return localPrimaryDesignation
   */
  public String getLocalPrimaryDesignation() {

    return this.localPrimaryDesignation;
  }

  /**
   * @param localPrimaryDesignation new value of getlocalPrimaryDesignation
   */
  public void setLocalPrimaryDesignation(String localPrimaryDesignation) {

    this.localPrimaryDesignation = localPrimaryDesignation;
  }

  /**
   * @return localSecondaryDesignation
   */
  public String getLocalSecondaryDesignation() {

    return this.localSecondaryDesignation;
  }

  /**
   * @param localSecondaryDesignation new value of getlocalSecondaryDesignation
   */
  public void setLocalSecondaryDesignation(String localSecondaryDesignation) {

    this.localSecondaryDesignation = localSecondaryDesignation;
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
   * @return gcbFlapFromCodep
   */
  public Boolean getGcbFlapFromCodep() {

    return this.gcbFlapFromCodep;
  }

  /**
   * @param gcbFlapFromCodep new value of getgcbFlapFromCodep
   */
  public void setGcbFlapFromCodep(Boolean gcbFlapFromCodep) {

    this.gcbFlapFromCodep = gcbFlapFromCodep;
  }

  /**
   * @return extraInfoFromEnoviaPartDto
   */
  public UpstreamResponseExtraInfoFromEnoviaPartDto getExtraInfoFromEnoviaPartDto() {

    return this.extraInfoFromEnoviaPartDto;
  }

  /**
   * @param extraInfoFromEnoviaPartDto new value of getextraInfoFromEnoviaPartDto
   */
  public void setExtraInfoFromEnoviaPartDto(UpstreamResponseExtraInfoFromEnoviaPartDto extraInfoFromEnoviaPartDto) {

    this.extraInfoFromEnoviaPartDto = extraInfoFromEnoviaPartDto;
  }

  /**
   * @return extraInformationEnoviaPartDto
   */
  public List<UpstreamResponseExtraInformationEnoviaPartDto> getExtraInformationEnoviaPartDto() {

    return this.extraInformationEnoviaPartDto;
  }

  /**
   * @param extraInformationEnoviaPartDto new value of getextraInformationEnoviaPartDto
   */
  public void setExtraInformationEnoviaPartDto(
      List<UpstreamResponseExtraInformationEnoviaPartDto> extraInformationEnoviaPartDto) {

    this.extraInformationEnoviaPartDto = extraInformationEnoviaPartDto;
  }

  /**
   * @return bomUsages
   */
  public List<UpstreamResponseBomUsagesDto> getBomUsages() {

    return this.bomUsages;
  }

  /**
   * @param bomUsages new value of getbomUsages
   */
  public void setBomUsages(List<UpstreamResponseBomUsagesDto> bomUsages) {

    this.bomUsages = bomUsages;
  }

}
