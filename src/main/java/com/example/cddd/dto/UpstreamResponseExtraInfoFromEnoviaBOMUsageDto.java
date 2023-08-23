package com.example.cddd.dto;

import java.util.List;


/**
 * UpstreamResponseExtraInfoFromEnoviaBOMUsage Dto
 *
 * @author LNAVET
 *
 */
public class UpstreamResponseExtraInfoFromEnoviaBOMUsageDto  {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private String extraInfoFromEnoviaProductLineName;

  private String extraInfoFromEnoviaBOC;

  private List<UpstreamResponseExtraInfoFromEnoviaVOMDto> extraInfoFromEnoviaVOMList;

  /**
   * @return extraInfoFromEnoviaProductLineName
   */
  public String getExtraInfoFromEnoviaProductLineName() {

    return this.extraInfoFromEnoviaProductLineName;
  }

  /**
   * @param extraInfoFromEnoviaProductLineName new value of getextraInfoFromEnoviaProductLineName
   */
  public void setExtraInfoFromEnoviaProductLineName(String extraInfoFromEnoviaProductLineName) {

    this.extraInfoFromEnoviaProductLineName = extraInfoFromEnoviaProductLineName;
  }

  /**
   * @return extraInfoFromEnoviaBOC
   */
  public String getExtraInfoFromEnoviaBOC() {

    return this.extraInfoFromEnoviaBOC;
  }

  /**
   * @param extraInfoFromEnoviaBOC new value of getextraInfoFromEnoviaBOC
   */
  public void setExtraInfoFromEnoviaBOC(String extraInfoFromEnoviaBOC) {

    this.extraInfoFromEnoviaBOC = extraInfoFromEnoviaBOC;
  }

  /**
   * @return extraInfoFromEnoviaVOMList
   */
  public List<UpstreamResponseExtraInfoFromEnoviaVOMDto> getExtraInfoFromEnoviaVOMList() {

    return this.extraInfoFromEnoviaVOMList;
  }

  /**
   * @param extraInfoFromEnoviaVOMList new value of getextraInfoFromEnoviaVOMList
   */
  public void setExtraInfoFromEnoviaVOMList(
      List<UpstreamResponseExtraInfoFromEnoviaVOMDto> extraInfoFromEnoviaVOMList) {

    this.extraInfoFromEnoviaVOMList = extraInfoFromEnoviaVOMList;
  }

}
