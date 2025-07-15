package org.patterns.structural.decorator;

public class Ginger implements ICondimentDecorator {
    IBeverage beverage;

    public Ginger(IBeverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {

        return "Ginger + "+beverage.getDescription();
    }

    @Override
    public double getCost() {

        return 5+ beverage.getCost();
    }
}
