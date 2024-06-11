package org.patterns.strategy;

public class ChineseOlympian extends Olympian{
    public ChineseOlympian() {
        this.setEatBehavior(new EatWithChopsticks());
        this.setEntertainmentBehavior(new EntertainWithVideoGames());
    }

    @Override
    public void description() {
        System.out.println("I'm a Chinese Olympian");
    }
}
