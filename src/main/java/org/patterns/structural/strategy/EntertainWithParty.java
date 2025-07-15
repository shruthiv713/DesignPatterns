package org.patterns.structural.strategy;

public class EntertainWithParty implements EntertainmentBehavior {
    @Override
    public void entertain() {
        System.out.println("Going to a party to have fun!");
    }
}
