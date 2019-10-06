package com.company;

import com.company.Creational.Builder.LunchOrder;
import com.company.Creational.Prototype.BookItem;
import com.company.Creational.Prototype.ItemTypes;
import com.company.Creational.Prototype.Registry;

public class Main {

    public static void main(String[] args) {
    //	=== Creational ===
    // Builder
        LunchOrder.Builder builder = new LunchOrder.Builder();
        LunchOrder lunchOrder = builder.meat("meat 1").salad("salad 3").build();
        System.out.println(lunchOrder);
     //Prototype
        Registry registry = new Registry();
        BookItem bookItem = (BookItem) registry.createItem(ItemTypes.BOOK);
        bookItem.setPrice(9999);
        System.out.println(bookItem);


    }
}
