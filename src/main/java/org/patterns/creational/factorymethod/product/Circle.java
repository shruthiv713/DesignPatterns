package org.patterns.creational.factorymethod.product;

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("I'm a circle");
    }

}
