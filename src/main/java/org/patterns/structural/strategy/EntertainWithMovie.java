package org.patterns.structural.strategy;

public class EntertainWithMovie implements EntertainmentBehavior {
    @Override
    public void entertain() {
        System.out.println("Going to a movie to have fun!");
    }
}
