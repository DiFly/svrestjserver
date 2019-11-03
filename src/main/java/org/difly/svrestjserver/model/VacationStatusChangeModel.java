package org.difly.svrestjserver.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * VacationStatusChangeModel
 */
public class VacationStatusChangeModel {
  @JsonProperty("approverComment")
  private String approverComment = null;

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

  }
  @JsonProperty("status")
  private StatusEnum status = null;

  public VacationStatusChangeModel approverComment(String approverComment) {
    this.approverComment = approverComment;
    return this;
  }
}
