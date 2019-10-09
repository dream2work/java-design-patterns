package com.dream2work.creational.abstractFactory;

public interface Instance {
    enum Capacity {micro, small, large}
    void attachStorage(Storage storage);
    void start();
    void stop();
}
