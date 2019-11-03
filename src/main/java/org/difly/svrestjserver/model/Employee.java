package org.difly.svrestjserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Employee
 */
public class Employee {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("avatar")
  private String avatar = null;

  @JsonProperty("birthdate")
  private OffsetDateTime birthdate = null;

  @JsonProperty("jobTitle")
  private String jobTitle = null;

  @JsonProperty("workEmail")
  private String workEmail = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("skype")
  private String skype = null;

  @JsonProperty("workStartDate")
  private OffsetDateTime workStartDate = null;

  @JsonProperty("isActive")
  private Boolean isActive = null;

  @JsonProperty("workEndDate")
  private OffsetDateTime workEndDate = null;

  @JsonProperty("deleted")
  private Boolean deleted = null;

  @JsonProperty("transactions")
  private List<Transaction> transactions = null;

  @JsonProperty("vacations")
  private List<Vacation> vacations = null;

  @JsonProperty("approvedVacations")
  private List<Vacation> approvedVacations = null;

  @JsonProperty("employeeTeams")
  private List<EmployeeTeam> employeeTeams = null;

  @JsonProperty("leadedTeams")
  private List<Team> leadedTeams = null;

  public Employee id(UUID id) {
    this.id = id;
    return this;
  }
}
