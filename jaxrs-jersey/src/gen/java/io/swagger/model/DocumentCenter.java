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
import io.swagger.model.BoxService;
import io.swagger.model.Documents;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import javax.validation.constraints.*;

/**
 * DocumentCenter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-01-02T19:35:10.306Z[GMT]")public class DocumentCenter   {
  @JsonProperty("campaignId")
  private File campaignId = null;

  @JsonProperty("name")
  private File name = null;

  @JsonProperty("status")
  private File status = null;

  @JsonProperty("title")
  private File title = null;

  @JsonProperty("box")
  private BoxService box = null;

  @JsonProperty("documents")
  private Documents documents = null;

  public DocumentCenter campaignId(File campaignId) {
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

  public DocumentCenter name(File name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @JsonProperty("name")
  @Schema(description = "")
  public File getName() {
    return name;
  }

  public void setName(File name) {
    this.name = name;
  }

  public DocumentCenter status(File status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @JsonProperty("status")
  @Schema(description = "")
  public File getStatus() {
    return status;
  }

  public void setStatus(File status) {
    this.status = status;
  }

  public DocumentCenter title(File title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @JsonProperty("title")
  @Schema(description = "")
  public File getTitle() {
    return title;
  }

  public void setTitle(File title) {
    this.title = title;
  }

  public DocumentCenter box(BoxService box) {
    this.box = box;
    return this;
  }

  /**
   * Get box
   * @return box
   **/
  @JsonProperty("box")
  @Schema(description = "")
  public BoxService getBox() {
    return box;
  }

  public void setBox(BoxService box) {
    this.box = box;
  }

  public DocumentCenter documents(Documents documents) {
    this.documents = documents;
    return this;
  }

  /**
   * Get documents
   * @return documents
   **/
  @JsonProperty("documents")
  @Schema(description = "")
  public Documents getDocuments() {
    return documents;
  }

  public void setDocuments(Documents documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCenter documentCenter = (DocumentCenter) o;
    return Objects.equals(this.campaignId, documentCenter.campaignId) &&
        Objects.equals(this.name, documentCenter.name) &&
        Objects.equals(this.status, documentCenter.status) &&
        Objects.equals(this.title, documentCenter.title) &&
        Objects.equals(this.box, documentCenter.box) &&
        Objects.equals(this.documents, documentCenter.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, name, status, title, box, documents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCenter {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    box: ").append(toIndentedString(box)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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
