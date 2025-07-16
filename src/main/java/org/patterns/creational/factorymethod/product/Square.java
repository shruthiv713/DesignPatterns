package org.patterns.creational.factorymethod.product;

/*
Concrete product class
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("I'm a square!");
    }
}
