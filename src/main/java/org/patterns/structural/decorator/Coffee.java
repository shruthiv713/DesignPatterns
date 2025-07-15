package org.patterns.structural.decorator;

public class Coffee implements IBeverage{
    @Override
    public String getDescription() {

        return "Coffee";
    }

    @Override
    public double getCost() {

        return 30;
    }
}
