package com.dream2work;

import com.dream2work.creational.abstractFactory.AWSResourceFactory;
import com.dream2work.creational.abstractFactory.Client;
import com.dream2work.creational.abstractFactory.GoogleCloudResourceFactory;
import com.dream2work.creational.abstractFactory.Instance;
import com.dream2work.creational.builder.LunchOrder;
import com.dream2work.creational.factoryMethod.*;
import com.dream2work.creational.objectPool.ObjectPool;
import com.dream2work.creational.objectPool.PoolableObject;
import com.dream2work.creational.prototype.BookItem;
import com.dream2work.creational.prototype.ItemTypes;
import com.dream2work.creational.prototype.Registry;
import com.dream2work.creational.simpleFactory.Page;
import com.dream2work.creational.simpleFactory.PageFactory;
import com.dream2work.creational.singletone.Singletone;
import com.dream2work.creational.singletone.SingletoneLIH;
import com.dream2work.structural.adapter.*;
import com.dream2work.structural.bridge.ArrayLinkedList;
import com.dream2work.structural.bridge.Queue;
import com.dream2work.structural.composite.BinaryFile;
import com.dream2work.structural.composite.Directory;
import com.dream2work.structural.composite.File;
import com.dream2work.structural.decorator.Base64TextDecorator;
import com.dream2work.structural.decorator.Message;
import com.dream2work.structural.decorator.TextMessage;
import com.dream2work.structural.decorator.UpperCaseTextDecorator;
import com.dream2work.structural.facade.Order;
import com.dream2work.structural.facade.email.EmailFacade;
import com.dream2work.structural.flyweight.ErrorMessage;
import com.dream2work.structural.flyweight.ErrorMessageFactory;

public class Main {

    public static void main(String[] args) {
        // *** Creational

        // Builder
        LunchOrder.Builder builder = new LunchOrder.Builder();
        LunchOrder lunchOrder = builder.meat("meat 1").salad("salad 3").build();
        System.out.println(lunchOrder);

        // Prototype
        Registry registry = new Registry();
        BookItem bookItem = (BookItem) registry.createItem(ItemTypes.BOOK);
        bookItem.setPrice(9999);
        System.out.println(bookItem);

        // Singletone (Classic)
        Singletone singletoneInstanceC = Singletone.getInstance();
        Singletone anotherSingletoneInstanceC = Singletone.getInstance();
        if (singletoneInstanceC == anotherSingletoneInstanceC) {
            System.out.println("Both instances are equal");
        } else {
            System.out.println("Both instances are not equal");
        }

        // Singletone (Lazy Initialization Holder)
        SingletoneLIH singletoneInstanceLIH = SingletoneLIH.getInstance();
        SingletoneLIH anotherSingletoneInstanceLIH = SingletoneLIH.getInstance();
        if (singletoneInstanceLIH == anotherSingletoneInstanceLIH) {
            System.out.println("Both instances are equal");
        } else {
            System.out.println("Both instances are not equal");
        }

        // Simple Factory
        Page blogPage = PageFactory.getInstance("blog");
        Page imagePage = PageFactory.getInstance("image");
        System.out.println("Blog page - " + blogPage);
        System.out.println("Image page - " + imagePage);

        // Factory Method
        MessageCreator messageCreator = new JSONMessageCreator();
        System.out.println(messageCreator.getMessage());
        messageCreator = new TextMessageCreator();
        System.out.println(messageCreator.getMessage());

        // Abstract Factory
        Client client;
        Instance instance;

        client = new Client(new GoogleCloudResourceFactory());
        instance = client.createServer(Instance.Capacity.small, 2000);
        instance.start();
        instance.stop();

        client = new Client(new AWSResourceFactory());
        instance = client.createServer(Instance.Capacity.small, 2000);
        instance.start();
        instance.stop();

        // Object pool
        ObjectPool<PoolableObject> poolableObjectObjectPool =
                new ObjectPool<>(() -> new PoolableObject("default value"), 1);
        PoolableObject poolableObject =  poolableObjectObjectPool.get();
        poolableObject.setValue("new test value");
        System.out.println(poolableObject.getValue());
        poolableObjectObjectPool.release(poolableObject);
        poolableObject =  poolableObjectObjectPool.get();
        System.out.println(poolableObject.getValue());

        // *** Structural

        // Adapter (Class adapter/ Two way adapter)
        EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
        EmployeeStorage.fillData(classAdapter);
        BusinessCard card = new BusinessCard();
        String cardString = card.designCard(classAdapter);
        System.out.println(cardString);

        // Adapter (Object adapter)
        Employee employee = new Employee();
        EmployeeStorage.fillData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        cardString = card.designCard(objectAdapter);
        System.out.println(cardString);

        // Bridge
        Queue<String> queue = new Queue<>(new ArrayLinkedList<>());
        queue.offer("A");
        queue.poll();

        // Decorator
        Message m = new TextMessage("Test text");
        System.out.println(m.getContent());
        Message decorator = new UpperCaseTextDecorator(m);
        System.out.println(decorator.getContent());
        decorator = new Base64TextDecorator(decorator);
        System.out.println(decorator.getContent());

        //Composite
        File root = new Directory("dir 1");
        root.addFile(new BinaryFile("file 1", 100));
        root.addFile(new BinaryFile("file 2", 200));
        File root2 = new Directory("dir 2");
        root.addFile(root2);
        root2.addFile(new BinaryFile("dir 3", 300));

        root.ls();

        // Facade

        EmailFacade emailFacade = new EmailFacade();
        emailFacade.sendOrderEmail(new Order("1", 100));

        // Flyweight
        ErrorMessage errorMessage = ErrorMessageFactory.getInstance().getErrorMessage(ErrorMessageFactory.ErrorType.PageNotFoundError);
        System.out.println(errorMessage.getMessage("777"));



    }
}
