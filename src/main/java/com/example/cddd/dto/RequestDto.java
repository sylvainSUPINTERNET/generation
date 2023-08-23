package com.example.cddd.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RequestDto {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Long id;

  private Date creationDate;

  private Date updateDate;

  private Date notifyDate;

  private String requestId;

  private String accessId;

  private String status;

  private String requesterSystem;

  private String requesterUid;

  private String changeNumber;

  private boolean callback;

  private String requestHash;

  private List<SystemRequestDto> systemRequest;

  private List<PartNumberDto> partNumber;

  private List<ErrorDto> error;

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
   * @return creationDate
   */
  public Date getCreationDate() {

    return this.creationDate;
  }

  /**
   * @param creationDate new value of getcreationDate
   */
  public void setCreationDate(Date creationDate) {

    this.creationDate = creationDate;
  }

  /**
   * @return updateDate
   */
  public Date getUpdateDate() {

    return this.updateDate;
  }

  /**
   * @param updateDate new value of getupdateDate
   */
  public void setUpdateDate(Date updateDate) {

    this.updateDate = updateDate;
  }

  /**
   * @return notifyDate
   */
  public Date getNotifyDate() {

    return this.notifyDate;
  }

  /**
   * @param notifyDate new value of getnotifyDate
   */
  public void setNotifyDate(Date notifyDate) {

    this.notifyDate = notifyDate;
  }

  /**
   * @return requestId
   */
  public String getRequestId() {

    return this.requestId;
  }

  /**
   * @param requestId new value of getrequestId
   */
  public void setRequestId(String requestId) {

    this.requestId = requestId;
  }

  /**
   * @return accessId
   */
  public String getAccessId() {

    return this.accessId;
  }

  /**
   * @param accessId new value of getaccessId
   */
  public void setAccessId(String accessId) {

    this.accessId = accessId;
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
   * @return requesterUid
   */
  public String getRequesterUid() {

    return this.requesterUid;
  }

  /**
   * @param requesterUid new value of getrequesterUid
   */
  public void setRequesterUid(String requesterUid) {

    this.requesterUid = requesterUid;
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
   * @return callback
   */
  public boolean isCallback() {

    return this.callback;
  }

  /**
   * @param callback new value of getcallback
   */
  public void setCallback(boolean callback) {

    this.callback = callback;
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
   * @return systemRequest
   */
  public List<SystemRequestDto> getSystemRequest() {

    return this.systemRequest;
  }

  /**
   * @param systemRequest new value of getsystemRequest
   */
  public void setSystemRequest(List<SystemRequestDto> systemRequest) {

    this.systemRequest = systemRequest;
  }

  /**
   * @return partNumber
   */
  public List<PartNumberDto> getPartNumber() {

    return this.partNumber;
  }

  /**
   * @param partNumber new value of getpartNumber
   */
  public void setPartNumber(List<PartNumberDto> partNumber) {

    this.partNumber = partNumber;
  }

  /**
   * @return error
   */
  public List<ErrorDto> getError() {

    return this.error;
  }

  /**
   * @param error new value of geterror
   */
  public void setError(List<ErrorDto> error) {

    this.error = error;
  }

}
