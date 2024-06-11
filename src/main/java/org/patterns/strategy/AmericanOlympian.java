package org.patterns.strategy;

public class AmericanOlympian extends Olympian {
    public AmericanOlympian() {
        this.setEatBehavior(new EatWithFork());
        this.setEntertainmentBehavior(new EntertainWithParty());
    }

    @Override
    public void description() {
        System.out.println("I'm an American Olympian");
    }
}
