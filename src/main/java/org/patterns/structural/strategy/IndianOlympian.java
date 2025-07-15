package org.patterns.structural.strategy;

public class IndianOlympian extends Olympian{
    public IndianOlympian() {
        this.setEatBehavior(new EatWithHands());
        this.setEntertainmentBehavior(new EntertainWithMovie());
    }
    @Override
    public void description() {
        System.out.println("I'm an Indian Olympian");
    }
}
