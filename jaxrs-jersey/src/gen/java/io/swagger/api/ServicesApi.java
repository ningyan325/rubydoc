package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ServicesApiService;
import io.swagger.api.factories.ServicesApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.math.BigDecimal;
import io.swagger.model.DocumentCenter;
import io.swagger.model.DocumentCollaborators;
import io.swagger.model.DocumentContent;
import java.io.File;
import io.swagger.model.GeneralResponseResult;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/services")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-01-02T19:40:11.927Z[GMT]")public class ServicesApi  {
   private final ServicesApiService delegate;

   public ServicesApi(@Context ServletConfig servletContext) {
      ServicesApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ServicesApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ServicesApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ServicesApiServiceFactory.getServicesApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/v1/documents")
    
    @Produces({ "application/json", "application/pdf" })
    @Operation(summary = "To get the PDF documents from a given campaign.", description = "", tags={ "Get Services" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = DocumentCenter.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request, Wrong query parameter(s)"),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized") })
    public Response createPDFDocument(
@Parameter(description = "ID of an user" ,required=true)@HeaderParam("user_id") File userId

,@Parameter(description = "ID of a campaign",required=true) @QueryParam("campaign_id") File campaignId
,@Parameter(description = "ID of a campaign") @QueryParam("document_id") File documentId
,@Parameter(description = "The data array holding specific versions, otherwise the call pickup the latest, [\"all\"] for all versions.") @QueryParam("versions") List<String> versions
,@Parameter(description = "The storage of saved document, default place is where the master copy saved.") @QueryParam("storage") File storage
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createPDFDocument(userId,campaignId,documentId,versions,storage,securityContext);
    }
    @POST
    @Path("/v1/documents")
    @Consumes({ "application/json", "text/plain" })
    @Produces({ "application/json" })
    @Operation(summary = "To create one PDF document.", description = "", tags={ "Upload Services" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = GeneralResponseResult.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request, request body and parameters etc."),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized") })
    public Response createPDFDocument_1(@Parameter(description = "The information body for generating the PDF document, all data attribute fields below are manditory beside of 'documentId'. When 'documentId' is not provided, the new id will be auto generated in system and response result will inclulde the 'documentId' attribute; When 'documentId' is matched (and other storage info is valid), then a new version document will be created;" ,required=true) DocumentContent body

,
@Parameter(description = "ID of an user" ,required=true)@HeaderParam("user_id") File userId

,@Parameter(description = "ID of a campaign",required=true) @PathParam("campaign_id") File campaignId
,@Parameter(description = "ID of a campaign document") @QueryParam("document_id") BigDecimal documentId
,@Parameter(description = "Boolean value is 'true' when a PDF for previewing only ; default is 'false' and the PDF will be directly saved.") @QueryParam("preview") Boolean preview
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createPDFDocument_1(body,userId,campaignId,documentId,preview,securityContext);
    }
    @GET
    @Path("/v1/documents/download")
    
    @Produces({ "application/pdf", "application/json" })
    @Operation(summary = "To download the PDF document(s) from the object storage to local.", description = "", tags={ "Get Services" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = File.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request. User ID must be an integer and larger than 0."),
        
        @ApiResponse(responseCode = "401", description = "Authorization information is missing or invalid."),
        
        @ApiResponse(responseCode = "404", description = "A user with the specified ID was not found."),
        
        @ApiResponse(responseCode = "5XX", description = "Unexpected error.") })
    public Response downloadFile1(
@Parameter(description = "ID of an user" ,required=true)@HeaderParam("user_id") File userId

,@Parameter(description = "ID of a campaign",required=true) @QueryParam("campaign_id") File campaignId
,@Parameter(description = "ID of a campaign document") @QueryParam("document_id") BigDecimal documentId
,@Parameter(description = "The data array holding specific versions, otherwise the call pickup the latest version, [\"all\"] for all versions.") @QueryParam("versions") List<String> versions
,@Parameter(description = "To generate a downloadable file, the format is as filename.extension (example J35463443-45634634.pdf); When it not be specified, one file will be auto generated by system.") @QueryParam("fileas") File fileas
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.downloadFile1(userId,campaignId,documentId,versions,fileas,securityContext);
    }
    @GET
    @Path("/v1/documents/export")
    
    @Produces({ "application/json" })
    @Operation(summary = "To export the PDF document(s) from the object storage to a destination, the default destination is 'box'. The enterprise level setup of destination is pre-configurated.", description = "", tags={ "Get Services" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK, successful operation.", content = @Content(schema = @Schema(implementation = GeneralResponseResult.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request. User ID must be an integer and larger than 0."),
        
        @ApiResponse(responseCode = "401", description = "Authorization information is missing or invalid."),
        
        @ApiResponse(responseCode = "404", description = "A user with the specified ID was not found."),
        
        @ApiResponse(responseCode = "5XX", description = "Unexpected error.") })
    public Response exportFile1(
@Parameter(description = "ID of an user" ,required=true)@HeaderParam("user_id") File userId

,@Parameter(description = "ID of a campaign",required=true) @QueryParam("campaign_id") File campaignId
,@Parameter(description = "ID of a campaign document") @QueryParam("document_id") BigDecimal documentId
,@Parameter(description = "the destination of PDF to be exported (default is box.com)") @QueryParam("destination") String destination
,@Parameter(description = "The data array holding specific versions, otherwise the call pickup the latest version, [\"all\"] for all versions.") @QueryParam("versions") List<String> versions
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.exportFile1(userId,campaignId,documentId,destination,versions,securityContext);
    }
    @POST
    @Path("/v1/documents/collaborate/{document_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "The action for having (add/remove) the document collaborators", description = "", tags={ "Collaborate Services" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = GeneralResponseResult.class))) })
    public Response uploadFile(@Parameter(description = "request body for setting up the document collaborators in json format" ,required=true) DocumentCollaborators body

,
@Parameter(description = "ID of an user" ,required=true)@HeaderParam("user_id") File userId

,@Parameter(description = "ID of pet to update",required=true) @QueryParam("campaign_id") File campaignId
,@Parameter(description = "ID of pet to update",required=true) @PathParam("document_id") BigDecimal documentId
,@Parameter(description = "The data array holding specific versions, otherwise the call pickup the latest, [\"all\"] for all versions.") @QueryParam("versions") List<String> versions
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.uploadFile(body,userId,campaignId,documentId,versions,securityContext);
    }
}
