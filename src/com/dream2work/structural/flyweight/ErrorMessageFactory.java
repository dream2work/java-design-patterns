package com.dream2work.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ErrorMessageFactory {

    public enum ErrorType {GenericSytemError, PageNotFoundError, InternalServerError}

    private static final ErrorMessageFactory errorMessageFactory = new ErrorMessageFactory();

    public static ErrorMessageFactory getInstance() { return  errorMessageFactory; }

    private final Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

    private ErrorMessageFactory() {
        errorMessages.put(ErrorType.GenericSytemError, new SystemErrorMessage(
                "Generic error $errorCode",
                "http://errors.com/="));
        errorMessages.put(ErrorType.PageNotFoundError, new SystemErrorMessage(
                "Page not found $errorCode",
                "http://errors.com/="));
        errorMessages.put(ErrorType.InternalServerError, new SystemErrorMessage(
                "Internal server error $errorCode",
                "http://errors.com/="));
    }

    public SystemErrorMessage getErrorMessage(ErrorType errorType){
        return  errorMessages.get(errorType);
    }
}
