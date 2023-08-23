package com.example.cddd.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PartNumberDto
 */
@JsonInclude(Include.NON_EMPTY)
public class PartNumberDto {

  /**
  *
  */
  private static final long serialVersionUID = 1L;

  private Long id;

  /**
   * ex: 98414295VT
   */
  private String partNumber;

  /**
   * ex: CODEP
   */
  @JsonProperty("BOMSystem")
  private String bomSystem;

  private List<PartNumberResponseDto> partNumberResponse;

  @JsonIgnore
  private RequestDto request;

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

}
