package org.difly.svrestjserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

/**
 * Transaction
 */
public class Transaction {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("employeeId")
  private UUID employeeId = null;

  @JsonProperty("change")
  private Integer change = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("employee")
  private Employee employee = null;

  public Transaction id(UUID id) {
    this.id = id;
    return this;
  }

}
