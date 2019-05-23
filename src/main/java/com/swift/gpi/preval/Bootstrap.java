package com.swift.gpi.preval;

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
        version = "1.0.7-oas3-sdk", 
        description = "Move your app forward with the account pre-validation API.",
        termsOfService = "",
        contact = @Contact(email = ""),
        license = @License(
            name = "API Restricted License",
            url = "https://www.swift.com/file/56776/download?token&#x3D;8w8DC4eF"
        )
    )
)
public class Bootstrap {
}
