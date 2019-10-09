package com.dream2work.creational.abstractFactory;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int size);
}
