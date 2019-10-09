package com.dream2work.creational.factoryMethod;

public class JSONMessage extends Message {
    public String getJSON(){
        return "JSON - " + this.someCommonData;
    }
}
