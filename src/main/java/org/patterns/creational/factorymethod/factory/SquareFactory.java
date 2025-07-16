package org.patterns.creational.factorymethod.factory;

import org.patterns.creational.factorymethod.product.Shape;
import org.patterns.creational.factorymethod.product.Square;

public class SquareFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
