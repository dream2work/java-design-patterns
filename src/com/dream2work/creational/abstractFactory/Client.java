package com.dream2work.creational.abstractFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory){
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity instanceCapacity, int storageSize){
        Instance instance = factory.createInstance(instanceCapacity);
        Storage storage = factory.createStorage(storageSize);
        instance.attachStorage(storage);
        return instance;
    }


}
