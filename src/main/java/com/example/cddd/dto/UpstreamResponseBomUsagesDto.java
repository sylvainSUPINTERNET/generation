
package com.example.cddd.dto;

/**
 * UpstreamResponseBomUsages Dto
 *
 * @author LNAVET
 *
 */
public class UpstreamResponseBomUsagesDto {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private String code;

  private String description;

  private UpstreamResponseExtraInfoFromEnoviaBOMUsageDto extraInfoFromEnoviaBOMUsage;

  /**
   * @return code
   */
  public String getCode() {

    return this.code;
  }

  /**
   * @param code new value of getcode
   */
  public void setCode(String code) {

    this.code = code;
  }

  /**
   * @return description
   */
  public String getDescription() {

    return this.description;
  }

  /**
   * @param description new value of getdescription
   */
  public void setDescription(String description) {

    this.description = description;
  }

  /**
   * @return extraInfoFromEnoviaBOMUsage
   */
  public UpstreamResponseExtraInfoFromEnoviaBOMUsageDto getExtraInfoFromEnoviaBOMUsage() {

    return this.extraInfoFromEnoviaBOMUsage;
  }

  /**
   * @param extraInfoFromEnoviaBOMUsage new value of getextraInfoFromEnoviaBOMUsage
   */
  public void setExtraInfoFromEnoviaBOMUsage(
      UpstreamResponseExtraInfoFromEnoviaBOMUsageDto extraInfoFromEnoviaBOMUsage) {

    this.extraInfoFromEnoviaBOMUsage = extraInfoFromEnoviaBOMUsage;
  }

}
