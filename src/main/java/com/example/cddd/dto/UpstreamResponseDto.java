package com.example.cddd.dto;


import java.util.List;


/**
 * UpstreamResponse Dto
 *
 * @author LNAVET
 *
 */
public class UpstreamResponseDto  {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private String reqId;

  private String localSystem;

  private String status;

  private List<String> errorMessageList;

  private List<UpstreamResponsePartNumberDto> partNumberList;

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
   * @return localSystem
   */
  public String getLocalSystem() {

    return this.localSystem;
  }

  /**
   * @param localSystem new value of getlocalSystem
   */
  public void setLocalSystem(String localSystem) {

    this.localSystem = localSystem;
  }

  /**
   * @return status
   */
  public String getStatus() {

    return this.status;
  }

  /**
   * @param status new value of getstatus
   */
  public void setStatus(String status) {

    this.status = status;
  }

  /**
   * @return errorMessageList
   */
  public List<String> getErrorMessageList() {

    return this.errorMessageList;
  }

  /**
   * @param errorMessageList new value of geterrorMessageList
   */
  public void setErrorMessageList(List<String> errorMessageList) {

    this.errorMessageList = errorMessageList;
  }

  /**
   * @return partNumberList
   */
  public List<UpstreamResponsePartNumberDto> getPartNumberList() {

    return this.partNumberList;
  }

  /**
   * @param partNumberList new value of getpartNumberList
   */
  public void setPartNumberList(List<UpstreamResponsePartNumberDto> partNumberList) {

    this.partNumberList = partNumberList;
  }

}
