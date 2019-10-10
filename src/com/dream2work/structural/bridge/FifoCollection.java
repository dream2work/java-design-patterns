package com.dream2work.structural.bridge;

public interface FifoCollection<T> {
    void offer(T element);
    T poll();
}
