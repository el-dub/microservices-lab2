package com.kpi.microservices.service2.exception;

public class NotFoundException extends APIException{
    public NotFoundException(String message) {
        super(message);
    }
}
