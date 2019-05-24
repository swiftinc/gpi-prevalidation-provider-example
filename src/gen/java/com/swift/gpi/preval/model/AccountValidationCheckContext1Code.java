/*
 * Beneficiary account pre-validation for SDK consumers
 * Move your app forward with the account pre-validation API.
 *
 * OpenAPI spec version: 1.0.7-oas3-sdk
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.swift.gpi.preval.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AccountValidationCheckContext1Code
 */
public enum AccountValidationCheckContext1Code {
  BENR("BENR"),
    PAYM("PAYM"),
    RFPP("RFPP");

  private String value;

  AccountValidationCheckContext1Code(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AccountValidationCheckContext1Code fromValue(String text) {
    for (AccountValidationCheckContext1Code b : AccountValidationCheckContext1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
