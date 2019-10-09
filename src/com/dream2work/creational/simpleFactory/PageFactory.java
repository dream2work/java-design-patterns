package com.dream2work.creational.simpleFactory;

public class PageFactory {
    public static Page getInstance(String pageType) {
        switch(pageType) {
            case "blog":
                return new BlogPage();
            case "image":
                return new ImagePage();
            default:
                throw new IllegalArgumentException("Page type is not supported");
        }
    }
}
