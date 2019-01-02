package io.swagger.api;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
    info = @Info(
        title = "Swagger Server", 
        version = "1.0.0", 
        description = "The Ruby is a nickname of marketing project in IBM, and Ruby Documenting API is a set of RESTful interface/specification that helping development team to build the IBM marketing Ruby Application.",
        termsOfService = "",
        contact = @Contact(email = "nyan@us.ibm.com"),
        license = @License(
            name = "IBM.COM",
            url = "https://www.ibm.com/legal/us/en/"
        )
    )
)
public class Bootstrap {
}
