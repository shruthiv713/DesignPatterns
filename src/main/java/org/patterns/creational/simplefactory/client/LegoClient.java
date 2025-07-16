package org.patterns.creational.simplefactory.client;

import org.patterns.creational.simplefactory.factory.ShapeFactory;
import org.patterns.creational.simplefactory.product.Shape;

public class LegoClient {
    public static void main(String[] args) {
        Shape shape= ShapeFactory.getShape("circle");
        shape.draw();
    }
}
