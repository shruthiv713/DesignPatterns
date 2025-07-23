package org.patterns.structural.decorator.component;

public class Tea implements IBeverage {
    @Override
    public String getDescription() {
        return "Tea";
    }

    /**
     * Base cost
     */
    @Override
    public double getCost() {
        return 5;
    }
}
