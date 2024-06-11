package org.patterns.strategy;

public class EntertainWithVideoGames implements EntertainmentBehavior {
    @Override
    public void entertain() {
        System.out.println("Going to a play a video game to have fun!");
    }
}
