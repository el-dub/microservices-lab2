package com.kpi.microservices.service1.exception;

public class APIException extends RuntimeException {

    public APIException(String message) {
        super(message);
    }
}
