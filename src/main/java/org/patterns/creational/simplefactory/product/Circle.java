package org.patterns.creational.simplefactory.product;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("I'm a circle");
    }
}
