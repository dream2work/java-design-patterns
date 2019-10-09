package com.dream2work.creational.factoryMethod;

public abstract class MessageCreator {

    public Message getMessage(){
        Message message = createMessage();
        message.someCommonData = "some data";
        message.doSomething();
        return message;
    }

    // factory method
    public abstract Message createMessage();
}
