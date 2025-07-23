package org.patterns.structural.strategy.algorithms;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with wings!!!");
    }
}
