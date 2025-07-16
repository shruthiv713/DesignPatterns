package org.patterns.creational.factorymethod.factory;

import org.patterns.creational.factorymethod.product.Circle;
import org.patterns.creational.factorymethod.product.Shape;

public class CircleFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
