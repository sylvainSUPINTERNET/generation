package com.example.cddd.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * WhereUsedPartNumberResponseVom dto
 *
 * @author E568645
 */
@JsonInclude(Include.NON_EMPTY)
public class PartNumberResponseVomDto {
  /**
  *
  */
  private static final long serialVersionUID = 1L;

  private Long id;

  private String name;

  private String plantName;

  private String description;

  @JsonIgnore
  private PartNumberResponseBomUsageDto partNumberResponseBomUsage;

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
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of getname
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return plantName
   */
  public String getPlantName() {

    return this.plantName;
  }

  /**
   * @param plantName new value of getplantName
   */
  public void setPlantName(String plantName) {

    this.plantName = plantName;
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
   * @return partNumberResponseBomUsage
   */
  public PartNumberResponseBomUsageDto getPartNumberResponseBomUsage() {

    return this.partNumberResponseBomUsage;
  }

  /**
   * @param partNumberResponseBomUsage new value of getpartNumberResponseBomUsage
   */
  public void setPartNumberResponseBomUsage(PartNumberResponseBomUsageDto partNumberResponseBomUsage) {

    this.partNumberResponseBomUsage = partNumberResponseBomUsage;
  }

}