package org.patterns.structural.strategy;

public class EatWithChopsticks implements EatBehavior {


    @Override
    public void eat() {
        System.out.println("Eating noodles with chopsticks!");
    }
}
