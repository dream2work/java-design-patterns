package com.dream2work.Creational.Singletone;

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
