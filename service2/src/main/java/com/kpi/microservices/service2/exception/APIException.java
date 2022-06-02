package com.kpi.microservices.service2.exception;

public class APIException extends RuntimeException {

    public APIException(String message) {
        super(message);
    }
}
