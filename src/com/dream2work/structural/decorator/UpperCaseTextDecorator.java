package com.dream2work.structural.decorator;


public class UpperCaseTextDecorator implements Message {

    private Message message;

    public UpperCaseTextDecorator(Message message){
        this.message = message;
    }

    @Override
    public String getContent() {
        return message.getContent().toUpperCase();
    }
}
