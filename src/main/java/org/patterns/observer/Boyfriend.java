package org.patterns.observer;

public class Boyfriend implements IObserver{

    public Boyfriend(ISubject subject) {
        subject.addObserver(this);
    }
    @Override
    public void update(int teddy) {
        System.out.println("Boyfriend: My girlfriend would love "+teddy+" teddies!!");
    }
}
