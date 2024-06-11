package org.patterns.client;

import org.patterns.composite.Box;
import org.patterns.composite.IComponent;
import org.patterns.composite.Item;
import org.patterns.strategy.AmericanOlympian;
import org.patterns.strategy.ChineseOlympian;
import org.patterns.strategy.IndianOlympian;
import org.patterns.strategy.Olympian;

public class CompositeClient {
    public static void invoke() {
        System.out.println("Welcome to Amazon!");
        Box shippingBox = new Box("ShippingBox");
        IComponent phone = new Item("mobile", 1000);
        IComponent charger = new Item("charger", 200);
        Box smallBox = new Box("SmallBox");
        smallBox.addComponent(phone);
        smallBox.addComponent(charger);
        shippingBox.addComponent(smallBox);
        shippingBox.addComponent(new Item("Receipt",1));
        System.out.println(shippingBox.getName());
        System.out.println(shippingBox.getCost());

    }
}
