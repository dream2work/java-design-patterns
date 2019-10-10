package com.dream2work.structural.decorator;

import java.util.Base64;

public class Base64TextDecorator implements Message {

    private Message message;

    public Base64TextDecorator(Message message){
        this.message = message;
    }

    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(message.getContent().getBytes());
    }
}
