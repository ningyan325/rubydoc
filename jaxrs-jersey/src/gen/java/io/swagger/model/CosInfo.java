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
 * CosInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-01-04T19:13:47.171Z[GMT]")public class CosInfo   {
  @JsonProperty("path")
  private File path = null;

  @JsonProperty("lastGenerated")
  private Date lastGenerated = null;

  @JsonProperty("generatedBy")
  private File generatedBy = null;

  @JsonProperty("version")
  private File version = null;

  public CosInfo path(File path) {
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

  public CosInfo lastGenerated(Date lastGenerated) {
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

  public CosInfo generatedBy(File generatedBy) {
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

  public CosInfo version(File version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @JsonProperty("version")
  @Schema(required = true, description = "")
  @NotNull
  public File getVersion() {
    return version;
  }

  public void setVersion(File version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosInfo cosInfo = (CosInfo) o;
    return Objects.equals(this.path, cosInfo.path) &&
        Objects.equals(this.lastGenerated, cosInfo.lastGenerated) &&
        Objects.equals(this.generatedBy, cosInfo.generatedBy) &&
        Objects.equals(this.version, cosInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, lastGenerated, generatedBy, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosInfo {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    lastGenerated: ").append(toIndentedString(lastGenerated)).append("\n");
    sb.append("    generatedBy: ").append(toIndentedString(generatedBy)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
