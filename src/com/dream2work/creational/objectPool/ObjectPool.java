package com.dream2work.creational.objectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {
    private BlockingQueue<T> pool;
    public ObjectPool(Supplier<T> creator, int count){
        pool = new LinkedBlockingQueue<>();
        for (int i = 0; i < count; i++){
            pool.offer(creator.get());
        }
    }

    public T get(){
        try {
            return pool.take();
        } catch (InterruptedException e){
            System.out.println("take was interrupted");
        }
        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            pool.put(obj);
        } catch (InterruptedException e){
            System.out.println("put was interrupted");
        }
    }


}
