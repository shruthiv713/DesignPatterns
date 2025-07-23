package org.patterns.structural.strategy.context;

import org.patterns.structural.strategy.algorithms.FlyNoWay;
import org.patterns.structural.strategy.algorithms.FlyWithWings;

public class RubberDuck extends Duck{

    public RubberDuck() {
        this.setFlyBehavior(new FlyNoWay());
    }
}
