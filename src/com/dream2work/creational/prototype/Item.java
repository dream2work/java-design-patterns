package com.dream2work.creational.prototype;

public abstract class Item implements Cloneable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String name;

    private double price;

    @Override
    public Item clone() throws CloneNotSupportedException {
        return (Item) super.clone();
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
