package com.dream2work.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private final Map<ItemTypes, Item> items;

    public Registry() {
        items = new HashMap<>();
        loadItems();
    }

    public Item createItem(ItemTypes type){
        Item item = null;
        try {
            item = items.get(type).clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        BookItem bookItem = new BookItem();
        bookItem.setName("Default book");
        bookItem.setPrice(10);
        bookItem.setNumOfPages(100);
        items.put(ItemTypes.BOOK, bookItem);

        MovieItem movieItem = new MovieItem();
        movieItem.setName("Default movie");
        movieItem.setPrice(3);
        movieItem.setLength(2);
        items.put(ItemTypes.MOVIE, movieItem);
    }
}
