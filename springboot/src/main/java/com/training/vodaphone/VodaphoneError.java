package com.training.vodaphone;

import java.util.ArrayList;
import java.util.List;

public class VodaphoneError {

    private String               subDomain;
    private String               boundedContext;
    private String               microservice;
    private String               desc;
    private int                  error;
    private List<VodaphoneError> subErrors;


    public VodaphoneError(final String subDomainParam,
                          final String boundedContextParam,
                          final String microserviceParam,
                          final String descParam,
                          final int errorParam) {
        super();
        this.subDomain = subDomainParam;
        this.boundedContext = boundedContextParam;
        this.microservice = microserviceParam;
        this.desc = descParam;
        this.error = errorParam;
    }


    public VodaphoneError() {
    }

    public void addSubError(final VodaphoneError errorParam) {
        if (this.subErrors == null) {
            this.subErrors = new ArrayList<>();
        }
        this.subErrors.add(errorParam);
    }

    public String getSubDomain() {
        return this.subDomain;
    }

    public void setSubDomain(final String subDomainParam) {
        this.subDomain = subDomainParam;
    }

    public String getBoundedContext() {
        return this.boundedContext;
    }

    public void setBoundedContext(final String boundedContextParam) {
        this.boundedContext = boundedContextParam;
    }

    public String getMicroservice() {
        return this.microservice;
    }

    public void setMicroservice(final String microserviceParam) {
        this.microservice = microserviceParam;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(final String descParam) {
        this.desc = descParam;
    }

    public int getError() {
        return this.error;
    }

    public void setError(final int errorParam) {
        this.error = errorParam;
    }

    public List<VodaphoneError> getSubErrors() {
        return this.subErrors;
    }

    public void setSubErrors(final List<VodaphoneError> subErrorsParam) {
        this.subErrors = subErrorsParam;
    }


}
