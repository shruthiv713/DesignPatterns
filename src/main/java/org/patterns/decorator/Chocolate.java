package org.patterns.decorator;

public class Chocolate implements ICondimentDecorator {
    IBeverage beverage;

    public Chocolate(IBeverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {

        return "Chocolate + "+beverage.getDescription();
    }

    @Override
    public double getCost() {

        return 20+ beverage.getCost();
    }
}
