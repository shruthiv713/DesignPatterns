package org.patterns.structural.decorator;

public class Milk implements IBeverage{
    @Override
    public String getDescription() {

        return "Milk";
    }

    @Override
    public double getCost() {

        return 25;
    }
}
