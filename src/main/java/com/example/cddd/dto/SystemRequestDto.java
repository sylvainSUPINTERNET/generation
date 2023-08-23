package com.example.cddd.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_EMPTY)
public class SystemRequestDto {
  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Long id;

  private Date creationDate;

  private Date responseDate;

  private String status;

  private SystemDto system;

  @JsonIgnore
  private RequestDto request;

  @JsonIgnore
  private List<PartNumberResponseDto> partNumberResponse;

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
   * @return responseDate
   */
  public Date getResponseDate() {

    return this.responseDate;
  }

  /**
   * @param responseDate new value of getresponseDate
   */
  public void setResponseDate(Date responseDate) {

    this.responseDate = responseDate;
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
   * @return system
   */
  public SystemDto getSystem() {

    return this.system;
  }

  /**
   * @param system new value of getsystem
   */
  public void setSystem(SystemDto system) {

    this.system = system;
  }

  /**
   * @return request
   */
  public RequestDto getRequest() {

    return this.request;
  }

  /**
   * @param request new value of getrequest
   */
  public void setRequest(RequestDto request) {

    this.request = request;
  }

  /**
   * @return partNumberResponse
   */
  public List<PartNumberResponseDto> getPartNumberResponse() {

    return this.partNumberResponse;
  }

  /**
   * @param partNumberResponse new value of getpartNumberResponse
   */
  public void setPartNumberResponse(List<PartNumberResponseDto> partNumberResponse) {

    this.partNumberResponse = partNumberResponse;
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
