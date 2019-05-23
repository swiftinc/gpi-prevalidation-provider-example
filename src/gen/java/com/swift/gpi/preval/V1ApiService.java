package com.swift.gpi.preval;

import com.swift.gpi.preval.*;
import com.swift.gpi.preval.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import com.swift.gpi.preval.model.AccountVerificationRequest;
import com.swift.gpi.preval.model.AccountVerificationResponse1;
import com.swift.gpi.preval.model.ErrorCodeConsumer;
import com.swift.gpi.preval.model.ErrorCodeProducer;

import java.util.Map;
import java.util.List;
import com.swift.gpi.preval.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
public abstract class V1ApiService {
    public abstract Response verifyAccount(AccountVerificationRequest body,String xBic,String subjectDN,String institution,SecurityContext securityContext) throws NotFoundException;
}
