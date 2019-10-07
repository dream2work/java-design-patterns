package com.dream2work.Creational.Singletone;

public class Singletone {

    private static Singletone instance = null;

    private Singletone() {
        // some useful initialization
    }
    public static Singletone getInstance() {
        if (instance == null){
            synchronized (Singletone.class) {
                if (instance == null) {
                    instance = new Singletone();
                }
            }
        }
        return instance;
    }
}
