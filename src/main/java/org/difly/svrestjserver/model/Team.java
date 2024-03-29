package org.difly.svrestjserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;

/**
 * Team
 */
public class Team {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("teamLeadId")
  private UUID teamLeadId = null;

  @JsonProperty("deleted")
  private Boolean deleted = null;

  @JsonProperty("employeeTeams")
  private List<EmployeeTeam> employeeTeams = null;

  @JsonProperty("teamLead")
  private Employee teamLead = null;

  public Team id(UUID id) {
    this.id = id;
    return this;
  }
}
