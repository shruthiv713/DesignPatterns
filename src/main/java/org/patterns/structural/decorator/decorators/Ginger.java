package org.patterns.structural.decorator.decorators;

import org.patterns.structural.decorator.component.IBeverage;

public class Ginger extends BeverageDecorator {

    public Ginger(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "Ginger " + super.getDescription();
    }

    @Override
    public double getCost() {
        return 3 + super.getCost();
    }
}
