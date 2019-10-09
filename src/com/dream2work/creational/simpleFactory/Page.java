package com.dream2work.creational.simpleFactory;

public abstract class Page {
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    private String text;
    private String caption;
}
