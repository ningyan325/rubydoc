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
 * GeneralResponseResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-01-02T21:05:35.798Z[GMT]")public class GeneralResponseResult   {
  @JsonProperty("campaignId")
  private File campaignId = null;

  @JsonProperty("actionName")
  private File actionName = null;

  @JsonProperty("actionTime")
  private Date actionTime = null;

  @JsonProperty("actionBy")
  private File actionBy = null;

  @JsonProperty("result")
  private Object result = null;

  @JsonProperty("message")
  private File message = null;

  public GeneralResponseResult campaignId(File campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Get campaignId
   * @return campaignId
   **/
  @JsonProperty("campaignId")
  @Schema(description = "")
  public File getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(File campaignId) {
    this.campaignId = campaignId;
  }

  public GeneralResponseResult actionName(File actionName) {
    this.actionName = actionName;
    return this;
  }

  /**
   * Get actionName
   * @return actionName
   **/
  @JsonProperty("actionName")
  @Schema(description = "")
  public File getActionName() {
    return actionName;
  }

  public void setActionName(File actionName) {
    this.actionName = actionName;
  }

  public GeneralResponseResult actionTime(Date actionTime) {
    this.actionTime = actionTime;
    return this;
  }

  /**
   * Get actionTime
   * @return actionTime
   **/
  @JsonProperty("actionTime")
  @Schema(description = "")
  public Date getActionTime() {
    return actionTime;
  }

  public void setActionTime(Date actionTime) {
    this.actionTime = actionTime;
  }

  public GeneralResponseResult actionBy(File actionBy) {
    this.actionBy = actionBy;
    return this;
  }

  /**
   * Get actionBy
   * @return actionBy
   **/
  @JsonProperty("actionBy")
  @Schema(description = "")
  public File getActionBy() {
    return actionBy;
  }

  public void setActionBy(File actionBy) {
    this.actionBy = actionBy;
  }

  public GeneralResponseResult result(Object result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   **/
  @JsonProperty("result")
  @Schema(description = "")
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public GeneralResponseResult message(File message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @JsonProperty("message")
  @Schema(description = "")
  public File getMessage() {
    return message;
  }

  public void setMessage(File message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralResponseResult generalResponseResult = (GeneralResponseResult) o;
    return Objects.equals(this.campaignId, generalResponseResult.campaignId) &&
        Objects.equals(this.actionName, generalResponseResult.actionName) &&
        Objects.equals(this.actionTime, generalResponseResult.actionTime) &&
        Objects.equals(this.actionBy, generalResponseResult.actionBy) &&
        Objects.equals(this.result, generalResponseResult.result) &&
        Objects.equals(this.message, generalResponseResult.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, actionName, actionTime, actionBy, result, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralResponseResult {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    actionTime: ").append(toIndentedString(actionTime)).append("\n");
    sb.append("    actionBy: ").append(toIndentedString(actionBy)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
