package com.dream2work.creational.abstractFactory;

public class AmazonS3Storage implements Storage {

    public AmazonS3Storage(int size){
        System.out.println("Amazon S3 storage is created with size " + size);
    }

    @Override
    public String getId(){
        return "Amazon S3 Storage";
    }

    @Override
    public String toString() { return getId(); }

}
