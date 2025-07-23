package org.patterns.structural.decorator.component;

public class Coffee implements IBeverage {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    /**
     * Base cost
     */
    @Override
    public double getCost() {
        return 10;
    }
}
