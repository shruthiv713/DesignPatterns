package org.patterns.creational.simplefactory.factory;

import org.patterns.creational.simplefactory.product.Circle;
import org.patterns.creational.simplefactory.product.Square;
import org.patterns.creational.simplefactory.product.Shape;

public class ShapeFactory {

    public static Shape getShape(String type) {
        if(type.equals("square")) {
            return new Square();
        } else {
            return new Circle();
        }

    }

}
