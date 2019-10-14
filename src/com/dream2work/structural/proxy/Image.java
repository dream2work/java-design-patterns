package com.dream2work.structural.proxy;

import javafx.geometry.Point2D;

public interface Image {
    Point2D getLocation();
    void setLocation(Point2D location);
    void render();
}
