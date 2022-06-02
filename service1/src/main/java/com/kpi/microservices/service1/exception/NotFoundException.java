package com.kpi.microservices.service1.exception;

public class NotFoundException extends APIException{
    public NotFoundException(String message) {
        super(message);
    }
}
