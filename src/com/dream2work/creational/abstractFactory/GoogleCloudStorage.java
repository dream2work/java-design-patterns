package com.dream2work.creational.abstractFactory;

public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int size){
        System.out.println("Google Cloud Storage is created with size " + size);
    }

    @Override
    public String getId(){ return "Google Cloud Storage"; }

    @Override
    public String toString(){ return getId(); }
}
