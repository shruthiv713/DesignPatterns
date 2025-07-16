package org.patterns.creational.factorymethod.factory;

import org.patterns.creational.factorymethod.product.Shape;

/*
Abstract factory with a factory method
 */
public abstract class ShapeFactory {

    public abstract Shape createShape();

    public void draw() {
        Shape shape = createShape();
        shape.draw();
    }
}
