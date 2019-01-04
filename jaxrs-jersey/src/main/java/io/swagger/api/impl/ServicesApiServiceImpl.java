package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-01-04T19:28:48.456Z[GMT]")public class ServicesApiServiceImpl extends ServicesApiService {
    @Override
    public Response collaborateOnDoc(DocumentCollaborators body, File userId,  @NotNull File campaignId, BigDecimal documentId,  List<String> versions, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createPDFDocument(File userId,  @NotNull File campaignId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createPDFDocument_1(DocumentContent body, File userId, File campaignId,  BigDecimal documentId,  Boolean preview, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createPDFDocument_2(File userId,  @NotNull File campaignId, File documentId,  List<String> versions,  File storage, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response downloadFile1(File userId,  @NotNull File campaignId,  BigDecimal documentId,  List<String> versions,  File fileas, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response exportFile1(File userId,  @NotNull File campaignId,  BigDecimal documentId,  String destination,  List<String> versions, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
