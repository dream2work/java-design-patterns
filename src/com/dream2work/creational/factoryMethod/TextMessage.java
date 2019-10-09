package com.dream2work.creational.factoryMethod;

public class TextMessage extends Message {
    public String getText(){
        return "Text - " + this.someCommonData;
    }
}
