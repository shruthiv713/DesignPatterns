package org.patterns.decorator;

public class Sugar implements ICondimentDecorator {
    IBeverage beverage;

    public Sugar(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {

        return "Sugar + "+beverage.getDescription();
    }

    @Override
    public double getCost() {

        return 5+beverage.getCost();
    }
}
