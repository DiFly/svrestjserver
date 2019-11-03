package org.difly.svrestjserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ResetPasswordTokenModel
 */
public class ResetPasswordTokenModel {
  @JsonProperty("token")
  private String token = null;

  @JsonProperty("password")
  private String password = null;

  public ResetPasswordTokenModel token(String token) {
    this.token = token;
    return this;
  }
}
