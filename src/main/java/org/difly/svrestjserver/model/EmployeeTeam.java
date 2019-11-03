package org.difly.svrestjserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

/**
 * EmployeeTeam
 */

public class EmployeeTeam {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("employeeId")
  private UUID employeeId = null;

  @JsonProperty("teamId")
  private UUID teamId = null;

  @JsonProperty("employee")
  private Employee employee = null;

  @JsonProperty("team")
  private Team team = null;

  public EmployeeTeam id(UUID id) {
    this.id = id;
    return this;
  }
}
