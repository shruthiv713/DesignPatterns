package org.patterns.structural.decorator;

public class Tea implements IBeverage{
    @Override
    public String getDescription() {

        return "Tea";
    }

    @Override
    public double getCost() {

        return 20;
    }
}
