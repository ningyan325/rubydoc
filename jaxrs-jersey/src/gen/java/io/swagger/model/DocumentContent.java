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
import io.swagger.model.Document;
import io.swagger.model.DocumentContentAttributes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * DocumentContent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-01-02T19:35:10.306Z[GMT]")public class DocumentContent   {
  @JsonProperty("document")
  private Document document = null;

  @JsonProperty("attributes")
  private List<DocumentContentAttributes> attributes = null;

  public DocumentContent document(Document document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
   **/
  @JsonProperty("document")
  @Schema(description = "")
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public DocumentContent attributes(List<DocumentContentAttributes> attributes) {
    this.attributes = attributes;
    return this;
  }

  public DocumentContent addAttributesItem(DocumentContentAttributes attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<DocumentContentAttributes>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   **/
  @JsonProperty("attributes")
  @Schema(description = "")
  public List<DocumentContentAttributes> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<DocumentContentAttributes> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentContent documentContent = (DocumentContent) o;
    return Objects.equals(this.document, documentContent.document) &&
        Objects.equals(this.attributes, documentContent.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentContent {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
