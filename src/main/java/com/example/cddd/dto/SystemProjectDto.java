package com.example.cddd.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Crt Vehicle
 */
@JsonInclude(Include.NON_EMPTY)
public class SystemProjectDto {
  /**
  *
  */
  private static final long serialVersionUID = 1L;

  /**
   * Id of the crt (Sequence nunber)
   */
  private Long id;

  /**
   * Column system_name
   */
  private String systemName;

  /**
   * Column active
   */
  private boolean active;

  /**
   * System project mapping
   */
  private List<SystemProjectMappingDto> systemProjetMappings;

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
   * @return systemProjetMappings
   */
  public List<SystemProjectMappingDto> getSystemProjetMappings() {

    return this.systemProjetMappings;
  }

  /**
   * @param systemProjetMappings new value of getsystemProjetMappings
   */
  public void setSystemProjetMappings(List<SystemProjectMappingDto> systemProjetMappings) {

    this.systemProjetMappings = systemProjetMappings;
  }

}
