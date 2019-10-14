package com.dream2work.structural.proxy.staticProxy;

import com.dream2work.structural.proxy.BitmapImage;
import com.dream2work.structural.proxy.Image;
import javafx.geometry.Point2D;

public class BitmapImageProxy implements Image {

    private BitmapImage bitmapImage;
    private String name;
    private Point2D location;

    public BitmapImageProxy(String name) {
        this.name = name;
    }


    @Override
    public Point2D getLocation() {
        if (bitmapImage != null) {
            return bitmapImage.getLocation();
        }
        return location;
    }

    @Override
    public void setLocation(Point2D location) {
        if (bitmapImage != null) {
            bitmapImage.setLocation(location);
        } else {
            this.location = location;
            System.out.println("Proxy Bitmap image location set to " + location);
        }

    }

    @Override
    public void render() {
        if (bitmapImage == null) {
            bitmapImage = new BitmapImage(name);
            if(location != null) {
                bitmapImage.setLocation(location);
            }
        }
        bitmapImage.render();
    }
}
