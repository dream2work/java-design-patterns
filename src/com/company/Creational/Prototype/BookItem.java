package com.company.Creational.Prototype;

public class BookItem extends Item {
    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    private int numOfPages;

    @Override
    public String toString() {
        return "BookItem{" +
                "numOfPages=" + numOfPages +
                "} " + super.toString();
    }
}
