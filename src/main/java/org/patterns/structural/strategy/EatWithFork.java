package org.patterns.structural.strategy;

public class EatWithFork implements EatBehavior {


    @Override
    public void eat() {
        System.out.println("Eating pasta with fork!");
    }
}
