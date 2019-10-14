package com.dream2work.structural.proxy.dynamicProxy;

import com.dream2work.structural.proxy.BitmapImage;
import com.dream2work.structural.proxy.Image;

import java.lang.reflect.Proxy;

public class BitmapImageFactory {
    public static Image getBitmapImage(String name){
        return (Image) Proxy.newProxyInstance(
                BitmapImage.class.getClassLoader(),
                new Class[] {Image.class},
                new ImageInvocationHandler(name));
    }
}
