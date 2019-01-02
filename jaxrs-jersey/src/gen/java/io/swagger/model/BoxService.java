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
import javax.validation.constraints.*;

/**
 * BoxService
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-01-02T19:35:10.306Z[GMT]")public class BoxService   {
  @JsonProperty("assigned")
  private Boolean assigned = null;

  @JsonProperty("account")
  private File account = null;

  @JsonProperty("initialBy")
  private File initialBy = null;

  @JsonProperty("initialTime")
  private String initialTime = null;

  @JsonProperty("rootFolder")
  private File rootFolder = null;

  public BoxService assigned(Boolean assigned) {
    this.assigned = assigned;
    return this;
  }

  /**
   * Get assigned
   * @return assigned
   **/
  @JsonProperty("assigned")
  @Schema(required = true, description = "")
  @NotNull
  public Boolean isisAssigned() {
    return assigned;
  }

  public void setAssigned(Boolean assigned) {
    this.assigned = assigned;
  }

  public BoxService account(File account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   **/
  @JsonProperty("account")
  @Schema(required = true, description = "")
  @NotNull
  public File getAccount() {
    return account;
  }

  public void setAccount(File account) {
    this.account = account;
  }

  public BoxService initialBy(File initialBy) {
    this.initialBy = initialBy;
    return this;
  }

  /**
   * Get initialBy
   * @return initialBy
   **/
  @JsonProperty("initialBy")
  @Schema(description = "")
  public File getInitialBy() {
    return initialBy;
  }

  public void setInitialBy(File initialBy) {
    this.initialBy = initialBy;
  }

  public BoxService initialTime(String initialTime) {
    this.initialTime = initialTime;
    return this;
  }

  /**
   * Get initialTime
   * @return initialTime
   **/
  @JsonProperty("initialTime")
  @Schema(example = "2017-07-21T17:32:28Z", description = "")
  public String getInitialTime() {
    return initialTime;
  }

  public void setInitialTime(String initialTime) {
    this.initialTime = initialTime;
  }

  public BoxService rootFolder(File rootFolder) {
    this.rootFolder = rootFolder;
    return this;
  }

  /**
   * Get rootFolder
   * @return rootFolder
   **/
  @JsonProperty("rootFolder")
  @Schema(required = true, description = "")
  @NotNull
  public File getRootFolder() {
    return rootFolder;
  }

  public void setRootFolder(File rootFolder) {
    this.rootFolder = rootFolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxService boxService = (BoxService) o;
    return Objects.equals(this.assigned, boxService.assigned) &&
        Objects.equals(this.account, boxService.account) &&
        Objects.equals(this.initialBy, boxService.initialBy) &&
        Objects.equals(this.initialTime, boxService.initialTime) &&
        Objects.equals(this.rootFolder, boxService.rootFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assigned, account, initialBy, initialTime, rootFolder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxService {\n");
    
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    initialBy: ").append(toIndentedString(initialBy)).append("\n");
    sb.append("    initialTime: ").append(toIndentedString(initialTime)).append("\n");
    sb.append("    rootFolder: ").append(toIndentedString(rootFolder)).append("\n");
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