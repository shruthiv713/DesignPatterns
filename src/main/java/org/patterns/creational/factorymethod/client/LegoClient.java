package org.patterns.creational.factorymethod.client;

import org.patterns.creational.factorymethod.factory.CircleFactory;
import org.patterns.creational.factorymethod.factory.ShapeFactory;
import org.patterns.creational.factorymethod.factory.SquareFactory;

public class LegoClient {
    public static void main(String[] args) {
        ShapeFactory shape = new CircleFactory();
        shape.draw();
        shape = new SquareFactory();
        shape.draw();
    }
}
