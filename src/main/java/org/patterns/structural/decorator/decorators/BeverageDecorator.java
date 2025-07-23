package org.patterns.structural.decorator.decorators;

import org.patterns.structural.decorator.component.IBeverage;

public abstract class BeverageDecorator implements IBeverage {

    IBeverage beverage;

    BeverageDecorator(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double getCost() {
        return beverage.getCost();
    }

}
