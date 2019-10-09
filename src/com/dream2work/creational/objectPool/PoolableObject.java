package com.dream2work.creational.objectPool;

public class PoolableObject implements Poolable {
    private String value;

    public PoolableObject(String value) {
        this.value = value;
    }

    @Override
    public void reset() {
        this.value = "default value";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
