package com.swift.gpi.preval.impl;

import com.swift.gpi.preval.*;
import com.swift.gpi.preval.model.*;

import com.swift.gpi.preval.model.AccountVerificationRequest;
import com.swift.gpi.preval.model.AccountVerificationResponse1;
import com.swift.gpi.preval.model.ErrorCodeConsumer;
import com.swift.gpi.preval.model.ErrorCodeProducer;

import java.util.Map;
import java.util.List;
import com.swift.gpi.preval.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
public class V1ApiServiceImpl extends V1ApiService {
    @Override
    public Response verifyAccount(AccountVerificationRequest body, String xBic, String subjectDN, String institution, SecurityContext securityContext) throws NotFoundException {
        
        Response.ResponseBuilder resp = null;

        // Set correlation_identifier for response returning 200
        String correlationIdentifier = body.getCorrelationIdentifier();
        AccountVerificationResponse1 response_success = new AccountVerificationResponse1();
        response_success.setCorrelationIdentifier(correlationIdentifier);

        ErrorCodeProducer response_error = new ErrorCodeProducer();

        switch(correlationIdentifier) {
            case "SCENARIO1-CORRID-001":
                    ValidationCheckReponse1 scenario1_corrid001_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario1_corrid001_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("PASS"));
                    // Set response -> creditor_account_match
                    scenario1_corrid001_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("MTCH"));
                    // Set response -> creditor_name_match
                    scenario1_corrid001_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_address_match
                    scenario1_corrid001_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario1_corrid001_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario1_corrid001_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO1-CORRID-002":
                    ValidationCheckReponse1 scenario1_corrid002_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario1_corrid002_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("FAIL"));
                    // Set response -> creditor_account_match
                    scenario1_corrid002_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("NMTC"));
                    // Set response -> creditor_name_match
                    scenario1_corrid002_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_address_match
                    scenario1_corrid002_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario1_corrid002_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario1_corrid002_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO1-CORRID-003":
                    ValidationCheckReponse1 scenario1_corrid003_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario1_corrid003_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("PASS"));
                    // Set response -> creditor_account_match
                    scenario1_corrid003_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("MTCH"));
                    // Set response -> creditor_name_match
                    scenario1_corrid003_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_address_match
                    scenario1_corrid003_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario1_corrid003_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario1_corrid003_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO1-CORRID-004":
                    ValidationCheckReponse1 scenario1_corrid004_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario1_corrid004_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("FAIL"));
                    // Set response -> creditor_account_match
                    scenario1_corrid004_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("NMTC"));
                    // Set response -> creditor_name_match
                    scenario1_corrid004_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_address_match
                    scenario1_corrid004_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario1_corrid004_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario1_corrid004_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO1-CORRID-005":
                    ValidationCheckReponse1 scenario1_corrid005_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario1_corrid005_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("FAIL"));
                    // Set response -> creditor_account_match
                    scenario1_corrid005_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("NMTC"));
                    // Set response -> creditor_name_match
                    scenario1_corrid005_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_address_match
                    scenario1_corrid005_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario1_corrid005_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario1_corrid005_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO1-CORRID-006":
                    ValidationCheckReponse1 scenario1_corrid006_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario1_corrid006_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("PASS"));
                    // Set response -> creditor_account_match
                    scenario1_corrid006_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("MTCH"));
                    // Set response -> creditor_name_match
                    scenario1_corrid006_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_address_match
                    scenario1_corrid006_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario1_corrid006_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario1_corrid006_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO2-CORRID-001":
                    ValidationCheckReponse1 scenario2_corrid001_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario2_corrid001_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("PASS"));
                    // Set response -> creditor_account_match
                    scenario2_corrid001_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("MTCH"));
                    // Set response -> creditor_name_match
                    scenario2_corrid001_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("MTCH"));
                    // Set response -> creditor_address_match
                    scenario2_corrid001_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario2_corrid001_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario2_corrid001_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO2-CORRID-002":
                    ValidationCheckReponse1 scenario2_corrid002_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario2_corrid002_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("FAIL"));
                    // Set response -> creditor_account_match
                    scenario2_corrid002_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("NMTC"));
                    // Set response -> creditor_name_match
                    scenario2_corrid002_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_address_match
                    scenario2_corrid002_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario2_corrid002_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario2_corrid002_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO2-CORRID-003":
                    ValidationCheckReponse1 scenario2_corrid003_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario2_corrid003_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("PASS"));
                    // Set response -> creditor_account_match
                    scenario2_corrid003_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("MTCH"));
                    // Set response -> creditor_name_match
                    scenario2_corrid003_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("MTCH"));
                    // Set response -> creditor_address_match
                    scenario2_corrid003_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario2_corrid003_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario2_corrid003_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO2-CORRID-004":
                    ValidationCheckReponse1 scenario2_corrid004_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario2_corrid004_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("FAIL"));
                    // Set response -> creditor_account_match
                    scenario2_corrid004_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("NMTC"));
                    // Set response -> creditor_name_match
                    scenario2_corrid004_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_address_match
                    scenario2_corrid004_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario2_corrid004_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario2_corrid004_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO2-CORRID-005":
                    ValidationCheckReponse1 scenario2_corrid005_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario2_corrid005_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("FAIL"));
                    // Set response -> creditor_account_match
                    scenario2_corrid005_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("NMTC"));
                    // Set response -> creditor_name_match
                    scenario2_corrid005_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_address_match
                    scenario2_corrid005_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario2_corrid005_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario2_corrid005_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO2-CORRID-006":
                    ValidationCheckReponse1 scenario2_corrid006_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario2_corrid006_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("PASS"));
                    // Set response -> creditor_account_match
                    scenario2_corrid006_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("MTCH"));
                    // Set response -> creditor_name_match
                    scenario2_corrid006_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_address_match
                    scenario2_corrid006_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario2_corrid006_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario2_corrid006_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO3-CORRID-001":
                    ValidationCheckReponse1 scenario3_corrid001_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario3_corrid001_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("PASS"));
                    // Set response -> creditor_account_match
                    scenario3_corrid001_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("MTCH"));
                    // Set response -> creditor_name_match
                    scenario3_corrid001_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("MTCH"));
                    // Set response -> creditor_address_match
                    scenario3_corrid001_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario3_corrid001_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario3_corrid001_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO3-CORRID-002":
                    ValidationCheckReponse1 scenario3_corrid002_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario3_corrid002_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("FAIL"));
                    // Set response -> creditor_account_match
                    scenario3_corrid002_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("NMTC"));
                    // Set response -> creditor_name_match
                    scenario3_corrid002_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOTC"));
                    // Set response -> creditor_address_match
                    scenario3_corrid002_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario3_corrid002_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario3_corrid002_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO3-CORRID-003":
                    ValidationCheckReponse1 scenario3_corrid003_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario3_corrid003_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("PASS"));
                    // Set response -> creditor_account_match
                    scenario3_corrid003_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("MTCH"));
                    // Set response -> creditor_name_match
                    scenario3_corrid003_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("MTCH"));
                    // Set response -> creditor_address_match
                    scenario3_corrid003_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario3_corrid003_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario3_corrid003_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO3-CORRID-004":
                    ValidationCheckReponse1 scenario3_corrid004_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario3_corrid004_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("FAIL"));
                    // Set response -> creditor_account_match
                    scenario3_corrid004_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("NMTC"));
                    // Set response -> creditor_name_match
                    scenario3_corrid004_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOTC"));
                    // Set response -> creditor_address_match
                    scenario3_corrid004_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario3_corrid004_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario3_corrid004_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO3-CORRID-005":
                    ValidationCheckReponse1 scenario3_corrid005_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario3_corrid005_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("FAIL"));
                    // Set response -> creditor_account_match
                    scenario3_corrid005_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("NMTC"));
                    // Set response -> creditor_name_match
                    scenario3_corrid005_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOTC"));
                    // Set response -> creditor_address_match
                    scenario3_corrid005_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario3_corrid005_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario3_corrid005_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO3-CORRID-006":
                    ValidationCheckReponse1 scenario3_corrid006_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario3_corrid006_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("PASS"));
                    // Set response -> creditor_account_match
                    scenario3_corrid006_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("MTCH"));
                    // Set response -> creditor_name_match
                    scenario3_corrid006_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_address_match
                    scenario3_corrid006_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario3_corrid006_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario3_corrid006_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO4-CORRID-001":
                    ValidationCheckReponse1 scenario4_corrid001_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario4_corrid001_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("INCO"));
                    // Set response -> creditor_account_match
                    scenario4_corrid001_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("MTCH"));
                    // Set response -> creditor_name_match
                    scenario4_corrid001_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOTC"));
                    // Set response -> creditor_address_match
                    scenario4_corrid001_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario4_corrid001_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario4_corrid001_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO4-CORRID-002":
                    ValidationCheckReponse1 scenario4_corrid002_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario4_corrid002_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("FAIL"));
                    // Set response -> creditor_account_match
                    scenario4_corrid002_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("NMTC"));
                    // Set response -> creditor_name_match
                    scenario4_corrid002_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOTC"));
                    // Set response -> creditor_address_match
                    scenario4_corrid002_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario4_corrid002_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario4_corrid002_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO4-CORRID-003":
                    ValidationCheckReponse1 scenario4_corrid003_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario4_corrid003_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("INCO"));
                    // Set response -> creditor_account_match
                    scenario4_corrid003_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("MTCH"));
                    // Set response -> creditor_name_match
                    scenario4_corrid003_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOTC"));
                    // Set response -> creditor_address_match
                    scenario4_corrid003_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario4_corrid003_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario4_corrid003_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO4-CORRID-004":
                    ValidationCheckReponse1 scenario4_corrid004_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario4_corrid004_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("FAIL"));
                    // Set response -> creditor_account_match
                    scenario4_corrid004_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("NMTC"));
                    // Set response -> creditor_name_match
                    scenario4_corrid004_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOTC"));
                    // Set response -> creditor_address_match
                    scenario4_corrid004_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario4_corrid004_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario4_corrid004_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO4-CORRID-005":
                    ValidationCheckReponse1 scenario4_corrid005_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario4_corrid005_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("FAIL"));
                    // Set response -> creditor_account_match
                    scenario4_corrid005_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("NMTC"));
                    // Set response -> creditor_name_match
                    scenario4_corrid005_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOTC"));
                    // Set response -> creditor_address_match
                    scenario4_corrid005_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario4_corrid005_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario4_corrid005_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "SCENARIO4-CORRID-006":
                    ValidationCheckReponse1 scenario4_corrid006_check = new ValidationCheckReponse1();
                    // Set response -> account_validation_status
                    scenario4_corrid006_check.setAccountValidationStatus(AccountValidationResponse3Code.fromValue("INCO"));
                    // Set response -> creditor_account_match
                    scenario4_corrid006_check.setCreditorAccountMatch(AccountValidationResponse2Code.fromValue("MTCH"));
                    // Set response -> creditor_name_match
                    scenario4_corrid006_check.setCreditorNameMatch(AccountValidationResponse1Code.fromValue("NOTC"));
                    // Set response -> creditor_address_match
                    scenario4_corrid006_check.setCreditorAddressMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    // Set response -> creditor_organisation_identification_match
                    scenario4_corrid006_check.setCreditorOrganisationIdentificationMatch(AccountValidationResponse1Code.fromValue("NOAP"));
                    response_success.setResponse(scenario4_corrid006_check);
                    resp = Response.ok().entity(response_success);
                    break;
            case "scenario_not_allowed":
                    StatusCodeConnector scenario_not_allowed = new StatusCodeConnector();
                    scenario_not_allowed.setSeverity(StatusCodeConnector.SeverityEnum.FATAL);
                    scenario_not_allowed.setCode(StatusCodeConnector.CodeEnum.CANT);
                    scenario_not_allowed.setText("service provider is not allowed to provide an answer for this specific account");
                    response_error.setStatus(scenario_not_allowed);
                    resp = Response.status(400).entity(response_error);
                    break;
            case "scenario_no_integration":
                    StatusCodeConnector scenario_no_integration = new StatusCodeConnector();
                    scenario_no_integration.setSeverity(StatusCodeConnector.SeverityEnum.FATAL);
                    scenario_no_integration.setCode(StatusCodeConnector.CodeEnum.CANT);
                    scenario_no_integration.setText("account requested cannot be verified because unexisting integration with the book system where this account is maintained");
                    response_error.setStatus(scenario_no_integration);
                    resp = Response.status(400).entity(response_error);
                    break;
            case "scenario_bad_request_400":
                    StatusCodeConnector scenario_bad_request_400 = new StatusCodeConnector();
                    scenario_bad_request_400.setSeverity(StatusCodeConnector.SeverityEnum.FATAL);
                    scenario_bad_request_400.setCode(StatusCodeConnector.CodeEnum.SWAP501);
                    scenario_bad_request_400.setText("API request is malformed");
                    response_error.setStatus(scenario_bad_request_400);
                    resp = Response.status(400).entity(response_error);
                    break;
            case "scenario_invalid_token":
                StatusCodeConnector scenario_invalid_token = new StatusCodeConnector();
                scenario_invalid_token.setSeverity(StatusCodeConnector.SeverityEnum.FATAL);
                scenario_invalid_token.setCode(StatusCodeConnector.CodeEnum.fromValue("SwAP002"));
                scenario_invalid_token.setText("Invalid OAuth Token");
                response_error.setStatus(scenario_invalid_token);
                resp = Response.status(401).entity(response_error);
                break;
            case "scenario_bad_request_401":
                StatusCodeConnector scenario_bad_request_401 = new StatusCodeConnector();
                scenario_bad_request_401.setSeverity(StatusCodeConnector.SeverityEnum.FATAL);
                scenario_bad_request_401.setCode(StatusCodeConnector.CodeEnum.SWAP501);
                scenario_bad_request_401.setText("API request is malformed");
                response_error.setStatus(scenario_bad_request_401);
                resp = Response.status(401).entity(response_error);
                break;
            case "scenario_insufficient_scope":
                StatusCodeConnector scenario_insufficient_scope = new StatusCodeConnector();
                scenario_insufficient_scope.setSeverity(StatusCodeConnector.SeverityEnum.FATAL);
                scenario_insufficient_scope.setCode(StatusCodeConnector.CodeEnum.fromValue("SwAP003"));
                scenario_insufficient_scope.setText("OAuth access token has insufficient scope for the requested service.");
                response_error.setStatus(scenario_insufficient_scope);
                resp = Response.status(401).entity(response_error);
                break;
            case "scenario_service_not_provisioned":
                StatusCodeConnector scenario_service_not_provisioned = new StatusCodeConnector();
                scenario_service_not_provisioned.setSeverity(StatusCodeConnector.SeverityEnum.FATAL);
                scenario_service_not_provisioned.setCode(StatusCodeConnector.CodeEnum.fromValue("SwAP001"));
                scenario_service_not_provisioned.setText("API service not provisioned");
                response_error.setStatus(scenario_service_not_provisioned);
                resp = Response.status(401).entity(response_error);
                break;
            case "errorcode_404":
                StatusCodeConnector errorcode_404 = new StatusCodeConnector();
                errorcode_404.setSeverity(StatusCodeConnector.SeverityEnum.FATAL);
                errorcode_404.setCode(StatusCodeConnector.CodeEnum.SWAP506);
                errorcode_404.setText("Invalid Request. Resource does not exist.");
                response_error.setStatus(errorcode_404);
                resp = Response.status(404).entity(response_error);
                break;
            case "errorcode_429":
                StatusCodeConnector errorcode_429 = new StatusCodeConnector();
                errorcode_429.setSeverity(StatusCodeConnector.SeverityEnum.FATAL);
                errorcode_429.setCode(StatusCodeConnector.CodeEnum.SWAP507);
                errorcode_429.setText("Request cannot be processed at this time. Please try later. (header Retry-After indicates how long to wait before making a follow-up request)");
                response_error.setStatus(errorcode_429);
                resp = Response.status(429).entity(response_error);
                break;
            case "errorcode_500":
                StatusCodeConnector errorcode_500 = new StatusCodeConnector();
                errorcode_500.setSeverity(StatusCodeConnector.SeverityEnum.FATAL);
                errorcode_500.setCode(StatusCodeConnector.CodeEnum.INTERNALERROR);
                errorcode_500.setText("Server encountered an unexpected condition and cannot fulfill the request");
                response_error.setStatus(errorcode_500);
                resp = Response.status(500).entity(response_error);
                break;
            case "errorcode_502":
                StatusCodeConnector errorcode_502 = new StatusCodeConnector();
                errorcode_502.setSeverity(StatusCodeConnector.SeverityEnum.FATAL);
                errorcode_502.setCode(StatusCodeConnector.CodeEnum.SWAP508);
                errorcode_502.setText("Invalid response received from Service Provider");
                response_error.setStatus(errorcode_502);
                resp = Response.status(502).entity(response_error);
                break;
            case "errorcode_503":
                StatusCodeConnector errorcode_503 = new StatusCodeConnector();
                errorcode_503.setSeverity(StatusCodeConnector.SeverityEnum.TRANSIENT);
                errorcode_503.setCode(StatusCodeConnector.CodeEnum.SWAP590);
                errorcode_503.setText("Service is temporary unavailable (header Retry-After indicates how long to wait before making a follow-up request)");
                response_error.setStatus(errorcode_503);
                resp = Response.status(503).entity(response_error);
                break;
            case "errorcode_504":
                StatusCodeConnector errorcode_504 = new StatusCodeConnector();
                errorcode_504.setSeverity(StatusCodeConnector.SeverityEnum.TRANSIENT);
                errorcode_504.setCode(StatusCodeConnector.CodeEnum.SWAP590);
                errorcode_504.setText("Service Provider time out");
                response_error.setStatus(errorcode_504);
                resp = Response.status(504).entity(response_error);
                break;
        }
            return resp.build();
    }
}
