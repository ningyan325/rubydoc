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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import java.util.Date;
import javax.validation.constraints.*;

/**
 * BoxInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-01-11T22:40:34.154Z[GMT]")public class BoxInfo   {
  @JsonProperty("path")
  private File path = null;

  @JsonProperty("lastGenerated")
  private Date lastGenerated = null;

  @JsonProperty("generatedBy")
  private File generatedBy = null;

  public BoxInfo path(File path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   **/
  @JsonProperty("path")
  @Schema(required = true, description = "")
  @NotNull
  public File getPath() {
    return path;
  }

  public void setPath(File path) {
    this.path = path;
  }

  public BoxInfo lastGenerated(Date lastGenerated) {
    this.lastGenerated = lastGenerated;
    return this;
  }

  /**
   * Get lastGenerated
   * @return lastGenerated
   **/
  @JsonProperty("lastGenerated")
  @Schema(required = true, description = "")
  @NotNull
  public Date getLastGenerated() {
    return lastGenerated;
  }

  public void setLastGenerated(Date lastGenerated) {
    this.lastGenerated = lastGenerated;
  }

  public BoxInfo generatedBy(File generatedBy) {
    this.generatedBy = generatedBy;
    return this;
  }

  /**
   * Get generatedBy
   * @return generatedBy
   **/
  @JsonProperty("generatedBy")
  @Schema(required = true, description = "")
  @NotNull
  public File getGeneratedBy() {
    return generatedBy;
  }

  public void setGeneratedBy(File generatedBy) {
    this.generatedBy = generatedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxInfo boxInfo = (BoxInfo) o;
    return Objects.equals(this.path, boxInfo.path) &&
        Objects.equals(this.lastGenerated, boxInfo.lastGenerated) &&
        Objects.equals(this.generatedBy, boxInfo.generatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, lastGenerated, generatedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxInfo {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    lastGenerated: ").append(toIndentedString(lastGenerated)).append("\n");
    sb.append("    generatedBy: ").append(toIndentedString(generatedBy)).append("\n");
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
