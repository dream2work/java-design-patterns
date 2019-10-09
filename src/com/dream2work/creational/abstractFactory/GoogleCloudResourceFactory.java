package com.dream2work.creational.abstractFactory;

public class GoogleCloudResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int size) {
        return new GoogleCloudStorage(size);
    }
}
