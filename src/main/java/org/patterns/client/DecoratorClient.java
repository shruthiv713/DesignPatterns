package org.patterns.client;

import org.patterns.decorator.*;

public class DecoratorClient {
    public static void invoke() {
        System.out.println("Welcome to Shruthi's Blend Cafe!");

        IBeverage sweetHotChocolateWithGinger = new Ginger(new Sugar(new Chocolate(new Milk())));
        System.out.println(sweetHotChocolateWithGinger.getDescription());
        System.out.println("Cost - "+ sweetHotChocolateWithGinger.getCost());
        IBeverage gingerTea = new Ginger(new Tea());
        System.out.println(gingerTea.getDescription());
        System.out.println(gingerTea.getCost());
    }
}
