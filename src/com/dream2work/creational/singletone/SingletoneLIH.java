package com.dream2work.creational.singletone;

public class SingletoneLIH {
    private SingletoneLIH() {
      // some useful initialization
    }

    private static class Registry{
        private static SingletoneLIH INSTANCE = new SingletoneLIH();
    }

    public static SingletoneLIH getInstance() {
        return Registry.INSTANCE;
    }
}
