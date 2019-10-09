package com.dream2work.creational.abstractFactory;

public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity){
        System.out.println("Google Compute Engine Instance of capacity " + capacity + " is created");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Storage " + storage + " is attached to Google Compute Engine Instance");
    }

    @Override
    public void start() {
        System.out.println("Google Compute Engine Instance is started");
    }

    @Override
    public void stop() {
        System.out.println("Google Compute Engine Instance is stopped");
    }
}
