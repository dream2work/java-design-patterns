package com.dream2work;

import com.dream2work.Creational.Builder.LunchOrder;
import com.dream2work.Creational.Prototype.BookItem;
import com.dream2work.Creational.Prototype.ItemTypes;
import com.dream2work.Creational.Prototype.Registry;
import com.dream2work.Creational.SimpleFactrory.Page;
import com.dream2work.Creational.SimpleFactrory.PageFactory;
import com.dream2work.Creational.Singletone.Singletone;
import com.dream2work.Creational.Singletone.SingletoneLIH;

public class Main {

    public static void main(String[] args) {
        System.out.println(" * Creational");

        System.out.println(" ** Builder");
        LunchOrder.Builder builder = new LunchOrder.Builder();
        LunchOrder lunchOrder = builder.meat("meat 1").salad("salad 3").build();
        System.out.println(lunchOrder);

        System.out.println(" ** Prototype");
        Registry registry = new Registry();
        BookItem bookItem = (BookItem) registry.createItem(ItemTypes.BOOK);
        bookItem.setPrice(9999);
        System.out.println(bookItem);

        System.out.println(" ** Singletone (Classic)");
        Singletone singletoneInstanceC = Singletone.getInstance();
        Singletone anotherSingletoneInstanceC = Singletone.getInstance();
        if (singletoneInstanceC == anotherSingletoneInstanceC) {
            System.out.println("Both instances are equal");
        } else {
            System.out.println("Both instances are not equal");
        }

        System.out.println(" ** Singletone (Lazy Initialization Holder)");
        SingletoneLIH singletoneInstanceLIH = SingletoneLIH.getInstance();
        SingletoneLIH anotherSingletoneInstanceLIH = SingletoneLIH.getInstance();
        if (singletoneInstanceLIH == anotherSingletoneInstanceLIH) {
            System.out.println("Both instances are equal");
        } else {
            System.out.println("Both instances are not equal");
        }

        System.out.println(" ** Simple Factory");
        Page blogPage = PageFactory.getInstance("blog");
        Page imagePage = PageFactory.getInstance("image");
        System.out.println("Blog page - " + blogPage);
        System.out.println("Image page - " + imagePage);


    }
}
