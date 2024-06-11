package org.patterns.strategy;

public class EatWithHands implements EatBehavior {

    @Override
    public void eat() {
        System.out.println("Eating rice with my hands!");
    }
}
