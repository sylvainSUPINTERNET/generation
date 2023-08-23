package com.example.cddd.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class SystemProjectMappingDto {
  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Long id;

  private String code;

  private String description;

  private String correlation;

  private SystemDto system;

  @JsonIgnore
  private SystemProjectDto systemProject;

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
   * @return correlation
   */
  public String getCorrelation() {

    return this.correlation;
  }

  /**
   * @param correlation new value of getcorrelation
   */
  public void setCorrelation(String correlation) {

    this.correlation = correlation;
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
   * @return systemProject
   */
  public SystemProjectDto getSystemProject() {

    return this.systemProject;
  }

  /**
   * @param systemProject new value of getsystemProject
   */
  public void setSystemProject(SystemProjectDto systemProject) {

    this.systemProject = systemProject;
  }

}
