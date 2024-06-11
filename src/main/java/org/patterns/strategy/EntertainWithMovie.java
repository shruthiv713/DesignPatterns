package org.patterns.strategy;

public class EntertainWithMovie implements EntertainmentBehavior {
    @Override
    public void entertain() {
        System.out.println("Going to a movie to have fun!");
    }
}
