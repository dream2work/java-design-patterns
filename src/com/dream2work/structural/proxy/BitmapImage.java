package com.dream2work.structural.proxy;

import javafx.geometry.Point2D;

public class BitmapImage implements Image {

    private Point2D location;
    private String name;

    public BitmapImage(String name){
        this.name = name;
        System.out.println("Bitmap image is created with name " + name);
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
        System.out.println("Bitmap image location is set to " + location);
    }

    @Override
    public void render() {
        System.out.println("Bitmap image render " + name);
    }
}
