package org.patterns.behavioral.observer;

public class TeddyFanatic implements IObserver{

    public TeddyFanatic(ISubject subject) {
        subject.addObserver(this);
    }
    @Override
    public void update(int teddy) {
        System.out.println("TeddyFanatic: I'm going to buy all "+teddy+" teddies now!!");
    }
}
