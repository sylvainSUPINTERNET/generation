package com.example.cddd.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class PartNumberResponseBomUsageDto {
  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Long id;

  private String code;

  private String description;

  private String boc;

  private String productLineName;

  @JsonIgnore
  private PartNumberResponseDto partNumberResponse;

  private List<PartNumberResponseVomDto> partNumberResponseVom;

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
   * @return boc
   */
  public String getBoc() {

    return this.boc;
  }

  /**
   * @param boc new value of getboc
   */
  public void setBoc(String boc) {

    this.boc = boc;
  }

  /**
   * @return productLineName
   */
  public String getProductLineName() {

    return this.productLineName;
  }

  /**
   * @param productLineName new value of getproductLineName
   */
  public void setProductLineName(String productLineName) {

    this.productLineName = productLineName;
  }

  /**
   * @return partNumberResponse
   */
  public PartNumberResponseDto getPartNumberResponse() {

    return this.partNumberResponse;
  }

  /**
   * @param partNumberResponse new value of getpartNumberResponse
   */
  public void setPartNumberResponse(PartNumberResponseDto partNumberResponse) {

    this.partNumberResponse = partNumberResponse;
  }

  /**
   * @return partNumberResponseVom
   */
  public List<PartNumberResponseVomDto> getPartNumberResponseVom() {

    return this.partNumberResponseVom;
  }

  /**
   * @param partNumberResponseVom new value of getpartNumberResponseVom
   */
  public void setPartNumberResponseVom(List<PartNumberResponseVomDto> partNumberResponseVom) {

    this.partNumberResponseVom = partNumberResponseVom;
  }

}
