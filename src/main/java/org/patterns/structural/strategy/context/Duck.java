package org.patterns.structural.strategy.context;

import org.patterns.structural.strategy.algorithms.FlyBehavior;


public abstract class Duck {
    FlyBehavior flyBehavior;
    public void swim() {
        System.out.println("All Ducks swim!");
    }
    public void performFly() {
        flyBehavior.fly(); // delegates flying to a seperate behavior object
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

}
