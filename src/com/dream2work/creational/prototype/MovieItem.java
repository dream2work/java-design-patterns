package com.dream2work.creational.prototype;

public class MovieItem extends Item{

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int length;

    @Override
    public String toString() {
        return "MovieItem{" +
                "length=" + length +
                "} " + super.toString();
    }
}
