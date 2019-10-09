package com.dream2work.creational.abstractFactory;

public class AWSResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new AmazonEC2Instance(capacity);
    }

    @Override
    public Storage createStorage(int size) {
        return new AmazonS3Storage(size);
    }
}
