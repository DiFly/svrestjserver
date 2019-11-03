package org.difly.svrestjserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * ResetPasswordModel
 */
public class ResetPasswordModel {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  public ResetPasswordModel email(String email) {
    this.email = email;
    return this;
  }
}
