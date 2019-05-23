package com.swift.gpi.preval.factories;

import com.swift.gpi.preval.V1ApiService;
import com.swift.gpi.preval.impl.V1ApiServiceImpl;

public class V1ApiServiceFactory {
    private final static V1ApiService service = new V1ApiServiceImpl();

    public static V1ApiService getV1Api() {
        return service;
    }
}
