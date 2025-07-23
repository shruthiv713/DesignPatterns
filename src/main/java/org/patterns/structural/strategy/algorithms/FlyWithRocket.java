package org.patterns.structural.strategy.algorithms;

public class FlyWithRocket implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!!!");
    }
}
