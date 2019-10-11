package com.dream2work.structural.flyweight;

public class SystemErrorMessage implements ErrorMessage {

    private String messageTemplate;
    private String url;

    public SystemErrorMessage(String errorTemplate, String url) {
        this.messageTemplate = errorTemplate;
        this.url = url;
    }

    @Override
    public String getMessage(String errorCode) {
        return messageTemplate.replace("$errorCode", errorCode) + " " + url + errorCode;
    }
}
