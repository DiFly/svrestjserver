package org.difly.svrestjserver.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * VacationModel
 */
public class VacationModel {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("employeeId")
  private UUID employeeId = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("approverComment")
  private String approverComment = null;

  @JsonProperty("approverId")
  private UUID approverId = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    StatusEnum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("statusChangeDate")
  private OffsetDateTime statusChangeDate = null;

  @JsonProperty("createDateTime")
  private OffsetDateTime createDateTime = null;

  @JsonProperty("deleted")
  private Boolean deleted = null;

  @JsonProperty("employee")
  private EmployeeModel employee = null;

  @JsonProperty("approver")
  private EmployeeModel approver = null;

  public VacationModel id(UUID id) {
    this.id = id;
    return this;
  }
}
