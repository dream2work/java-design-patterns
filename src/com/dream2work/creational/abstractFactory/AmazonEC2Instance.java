package com.dream2work.creational.abstractFactory;

public class AmazonEC2Instance implements Instance {
    public AmazonEC2Instance(Capacity capacity){
        System.out.println("Amazon EC2 Instance of capacity " + capacity + " is created");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Storage " + storage + " is attached to Amazon EC2 Instance");
    }

    @Override
    public void start() {
        System.out.println("Amazon EC2 Instance is started");
    }

    @Override
    public void stop() {
        System.out.println("Amazon EC2 Instance is stopped");
    }
}
