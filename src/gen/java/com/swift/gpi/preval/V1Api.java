package com.swift.gpi.preval;

import com.swift.gpi.preval.model.*;
import com.swift.gpi.preval.V1ApiService;
import com.swift.gpi.preval.factories.V1ApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import com.swift.gpi.preval.model.AccountVerificationRequest;
import com.swift.gpi.preval.model.AccountVerificationResponse1;
import com.swift.gpi.preval.model.ErrorCodeConsumer;
import com.swift.gpi.preval.model.ErrorCodeProducer;

import java.util.Map;
import java.util.List;
import com.swift.gpi.preval.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/v1")


public class V1Api  {
   private final V1ApiService delegate;

   public V1Api(@Context ServletConfig servletContext) {
      V1ApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("V1Api.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (V1ApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = V1ApiServiceFactory.getV1Api();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/accounts/verification")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Verify that a beneficiary account could be able to receive incoming funds.", description = "The service verifies that an account exists at the beneficiary bank and is capable of receiving incoming funds. This usually implies that the account is open, properly identified by the given number and, depending on the jurisdiction and market practices in use where the account is held, that the creditor name matches the name of the account holder. The service provider does not take liability for the response and does not provide any guarantee on the outcome of an actual transaction being sent to this account. The information provided is meant to be as accurate as possible at the time that the request was processed. The requester must pass the creditor name and the service provider can use this information as part of the verification or not.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Verify account" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Get account details response.", content = @Content(schema = @Schema(implementation = AccountVerificationResponse1.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request.", content = @Content(schema = @Schema(implementation = ErrorCodeConsumer.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized.", content = @Content(schema = @Schema(implementation = ErrorCodeConsumer.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found.", content = @Content(schema = @Schema(implementation = ErrorCodeConsumer.class))),
        
        @ApiResponse(responseCode = "429", description = "Too many requests.", content = @Content(schema = @Schema(implementation = ErrorCodeConsumer.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content(schema = @Schema(implementation = ErrorCodeProducer.class))),
        
        @ApiResponse(responseCode = "502", description = "Bad gateway.", content = @Content(schema = @Schema(implementation = ErrorCodeProducer.class))),
        
        @ApiResponse(responseCode = "503", description = "Service unavailable.", content = @Content(schema = @Schema(implementation = ErrorCodeProducer.class))),
        
        @ApiResponse(responseCode = "504", description = "Gateway timeout.", content = @Content(schema = @Schema(implementation = ErrorCodeProducer.class))) })
    public Response verifyAccount(@Parameter(description = "Verify account details request." ,required=true) AccountVerificationRequest body

,
@Parameter(description = "Describe the BIC for SWIFT to route the request. Providers get the value and consumers are not required to fill it in." ,required=true)@HeaderParam("x-bic") String xBic

,
@Parameter(description = "Describe the Distinguished Name (DN) of the consumer. Providers get the value and consumers are not required to fill it in." )@HeaderParam("SubjectDN") String subjectDN

,
@Parameter(description = "Describe the BIC of the consumer. Providers get the value and consumers are not required to fill it in." )@HeaderParam("Institution") String institution

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.verifyAccount(body,xBic,subjectDN,institution,securityContext);
    }
}
