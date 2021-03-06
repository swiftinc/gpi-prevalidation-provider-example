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
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;

/**
 * Specifies the external organisation identification scheme name code in the format of character string with a maximum length of 4 characters.  The list of valid codes is an external code list published separately.  External code sets can be downloaded from www.iso20022.org.
 */
@Schema(description = "Specifies the external organisation identification scheme name code in the format of character string with a maximum length of 4 characters.  The list of valid codes is an external code list published separately.  External code sets can be downloaded from www.iso20022.org.")
public class ExternalOrganisationIdentification1Code   {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalOrganisationIdentification1Code {\n");
    
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
