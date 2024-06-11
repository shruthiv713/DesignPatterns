package org.patterns.strategy;

public abstract class Olympian {
    EatBehavior eatBehavior;
    EntertainmentBehavior entertainmentBehavior;
    public void run() {
        System.out.println("I'm running!");
    }
    public void eat() {
        eatBehavior.eat();
    }
    public void entertain() {
        entertainmentBehavior.entertain();
    }
    public void description() {
        System.out.println("I'm an Olympian");
    }
    public void sleep() {
        System.out.println("I'm going to sleep...zzz");
    }
    public void setEatBehavior(EatBehavior eatBehavior) {
        this.eatBehavior = eatBehavior;
    }
    public void setEntertainmentBehavior(EntertainmentBehavior entertainmentBehavior) {
        this.entertainmentBehavior = entertainmentBehavior;
    }
}
