package org.patterns.structural.strategy;

public class EatWithHands implements EatBehavior {

    @Override
    public void eat() {
        System.out.println("Eating rice with my hands!");
    }
}
