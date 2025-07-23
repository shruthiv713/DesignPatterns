package org.patterns.structural.decorator.decorators;

import org.patterns.structural.decorator.component.IBeverage;

public class Sugar extends BeverageDecorator {

    public Sugar(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "Sugar " + super.getDescription();
    }

    @Override
    public double getCost() {
        return 2 + super.getCost();
    }
}
