package com.dream2work.structural.proxy.staticProxy;

import com.dream2work.structural.proxy.Image;

public class BitmapImageFactory {
    public static Image getBitmapImage(String name) {
        return new BitmapImageProxy(name);
    }
}
