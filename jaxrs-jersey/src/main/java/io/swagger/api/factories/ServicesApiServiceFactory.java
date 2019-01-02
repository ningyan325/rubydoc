package io.swagger.api.factories;

import io.swagger.api.ServicesApiService;
import io.swagger.api.impl.ServicesApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-01-02T19:40:11.927Z[GMT]")public class ServicesApiServiceFactory {
    private final static ServicesApiService service = new ServicesApiServiceImpl();

    public static ServicesApiService getServicesApi() {
        return service;
    }
}
