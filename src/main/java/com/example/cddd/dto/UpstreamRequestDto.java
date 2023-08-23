package com.example.cddd.dto;

import java.util.List;


/**
 * UpstreamRequest Dto
 *
 * @author LNAVET
 *
 */
public class UpstreamRequestDto {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private String reqId;

  private String requesterSystem;

  private String changeNumber;

  private List<PartNumberDto> partNumberList;

  /**
   * @return reqId
   */
  public String getReqId() {

    return this.reqId;
  }

  /**
   * @param reqId new value of getreqId
   */
  public void setReqId(String reqId) {

    this.reqId = reqId;
  }

  /**
   * @return requesterSystem
   */
  public String getRequesterSystem() {

    return this.requesterSystem;
  }

  /**
   * @param requesterSystem new value of getrequesterSystem
   */
  public void setRequesterSystem(String requesterSystem) {

    this.requesterSystem = requesterSystem;
  }

  /**
   * @return changeNumber
   */
  public String getChangeNumber() {

    return this.changeNumber;
  }

  /**
   * @param changeNumber new value of getchangeNumber
   */
  public void setChangeNumber(String changeNumber) {

    this.changeNumber = changeNumber;
  }

  /**
   * @return partNumberList
   */
  public List<PartNumberDto> getPartNumberList() {

    return this.partNumberList;
  }

  /**
   * @param partNumberList new value of getpartNumberList
   */
  public void setPartNumberList(List<PartNumberDto> partNumberList) {

    this.partNumberList = partNumberList;
  }

}
