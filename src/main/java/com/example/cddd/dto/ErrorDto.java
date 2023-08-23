package com.example.cddd.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class ErrorDto {
  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Long id;

  private String message;

  @JsonIgnore
  private RequestDto whereUsedRequest;

  @JsonIgnore
  private SystemRequestDto whereUsedSystemRequest;

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
   * @return message
   */
  public String getMessage() {

    return this.message;
  }

  /**
   * @param message new value of getmessage
   */
  public void setMessage(String message) {

    this.message = message;
  }

  /**
   * @return whereUsedRequest
   */
  public RequestDto getWhereUsedRequest() {

    return this.whereUsedRequest;
  }

  /**
   * @param whereUsedRequest new value of getwhereUsedRequest
   */
  public void setWhereUsedRequest(RequestDto whereUsedRequest) {

    this.whereUsedRequest = whereUsedRequest;
  }

  /**
   * @return whereUsedSystemRequest
   */
  public SystemRequestDto getWhereUsedSystemRequest() {

    return this.whereUsedSystemRequest;
  }

  /**
   * @param whereUsedSystemRequest new value of getwhereUsedSystemRequest
   */
  public void setWhereUsedSystemRequest(SystemRequestDto whereUsedSystemRequest) {

    this.whereUsedSystemRequest = whereUsedSystemRequest;
  }

}
