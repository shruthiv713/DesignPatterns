package org.patterns.structural.composite;

public class CompositeClient {
    public static void main(String[] args) {
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
