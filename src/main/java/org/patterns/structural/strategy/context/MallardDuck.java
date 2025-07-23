package org.patterns.structural.strategy.context;

import org.patterns.structural.strategy.algorithms.FlyWithWings;

public class MallardDuck extends Duck{
    public MallardDuck() {
        this.setFlyBehavior(new FlyWithWings());
    }
}
