package com.dream2work.structural.proxy.dynamicProxy;

import com.dream2work.structural.proxy.BitmapImage;
import com.dream2work.structural.proxy.Image;
import javafx.geometry.Point2D;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ImageInvocationHandler implements InvocationHandler {
    private String name;
    private BitmapImage bitmapImage;
    private Point2D location;

    private final static Method getLocationMethod;
    private final static Method setLocationMethod;
    private final static Method renderMethod;

    static {
        try {
            getLocationMethod = Image.class.getMethod("getLocation", null);
            setLocationMethod = Image.class.getMethod("setLocation", new Class[]{Point2D.class});
            renderMethod = Image.class.getMethod("render", null);
        } catch (NoSuchMethodException e) {
            throw new NoSuchMethodError(e.getMessage());
        }
    }
    private Object handleGetLocation() {
        if (bitmapImage != null) {
            return bitmapImage.getLocation();
        }
        return location;
    }

    private Object handleSetLocation(Object args[]) {
        if (bitmapImage != null) {
            bitmapImage.setLocation((Point2D) args[0]);
        } else {
            this.location = (Point2D) args[0];
            System.out.println("Proxy Bitmap image location set to " + location);
        }
        return null;
    }

    private Object handleRender() {
        if (bitmapImage == null) {
            bitmapImage = new BitmapImage(name);
            if(location != null) {
                bitmapImage.setLocation(location);
            }
        }
        bitmapImage.render();
        return null;
    }

    public ImageInvocationHandler(String name) {
        this.name = name;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Invoking method " + method);
        if (method.equals(getLocationMethod)) {
            return handleGetLocation();
        } else if (method.equals(setLocationMethod)) {
            return handleSetLocation(args);
        } else if(method.equals(renderMethod)) {
            return handleRender();
        }
        return null;
    }
}
