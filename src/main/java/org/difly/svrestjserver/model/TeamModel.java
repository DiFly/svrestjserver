package org.difly.svrestjserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;

/**
 * TeamModel
 */
public class TeamModel {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("teamLeadId")
  private UUID teamLeadId = null;

  @JsonProperty("deleted")
  private Boolean deleted = null;

  @JsonProperty("teamLeadName")
  private String teamLeadName = null;

  @JsonProperty("employeeCount")
  private Integer employeeCount = null;

  @JsonProperty("employees")
  private List<EmployeeModel> employees = null;

  public TeamModel id(UUID id) {
    this.id = id;
    return this;
  }
}
