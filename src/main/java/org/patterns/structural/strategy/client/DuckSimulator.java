package org.patterns.structural.strategy.client;

import org.patterns.structural.strategy.algorithms.FlyWithRocket;
import org.patterns.structural.strategy.context.Duck;
import org.patterns.structural.strategy.context.MallardDuck;
import org.patterns.structural.strategy.context.RubberDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly(); // default flybehavior
        rubberDuck.setFlyBehavior(new FlyWithRocket()); //swap algorithm at runtime!
        rubberDuck.performFly(); // updated one!
    }
}
