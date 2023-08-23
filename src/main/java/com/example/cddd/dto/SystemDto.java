package com.example.cddd.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class SystemDto {
  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Long id;

  private String systemName;

  private boolean active;

  @JsonIgnore
  private List<SystemRequestDto> systemRequest;

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
   * @return systemName
   */
  public String getSystemName() {

    return this.systemName;
  }

  /**
   * @param systemName new value of getsystemName
   */
  public void setSystemName(String systemName) {

    this.systemName = systemName;
  }

  /**
   * @return active
   */
  public boolean isActive() {

    return this.active;
  }

  /**
   * @param active new value of getactive
   */
  public void setActive(boolean active) {

    this.active = active;
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

}
