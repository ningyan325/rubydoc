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
import io.swagger.model.Collaborator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * DocumentCollaborators
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-01-02T19:40:11.927Z[GMT]")public class DocumentCollaborators   {
  @JsonProperty("documentId")
  private File documentId = null;

  @JsonProperty("collaborators")
  private List<Collaborator> collaborators = null;

  public DocumentCollaborators documentId(File documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Get documentId
   * @return documentId
   **/
  @JsonProperty("documentId")
  @Schema(description = "")
  public File getDocumentId() {
    return documentId;
  }

  public void setDocumentId(File documentId) {
    this.documentId = documentId;
  }

  public DocumentCollaborators collaborators(List<Collaborator> collaborators) {
    this.collaborators = collaborators;
    return this;
  }

  public DocumentCollaborators addCollaboratorsItem(Collaborator collaboratorsItem) {
    if (this.collaborators == null) {
      this.collaborators = new ArrayList<Collaborator>();
    }
    this.collaborators.add(collaboratorsItem);
    return this;
  }

  /**
   * Get collaborators
   * @return collaborators
   **/
  @JsonProperty("collaborators")
  @Schema(description = "")
  public List<Collaborator> getCollaborators() {
    return collaborators;
  }

  public void setCollaborators(List<Collaborator> collaborators) {
    this.collaborators = collaborators;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCollaborators documentCollaborators = (DocumentCollaborators) o;
    return Objects.equals(this.documentId, documentCollaborators.documentId) &&
        Objects.equals(this.collaborators, documentCollaborators.collaborators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, collaborators);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCollaborators {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    collaborators: ").append(toIndentedString(collaborators)).append("\n");
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
