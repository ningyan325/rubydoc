/*
 * Ruby Documenting API
 * The Ruby is a nickname of marketing project in IBM, and Ruby Documenting API is a set of RESTful interface/specification that helping development team to build the IBM marketing Ruby Application.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: nyan@us.ibm.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.model;

import java.util.Objects;
import io.swagger.model.Document;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Documents
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-01-04T19:31:15.060Z[GMT]")public class Documents extends ArrayList<Document>  {

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
    sb.append("class Documents {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
