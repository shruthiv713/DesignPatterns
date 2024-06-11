package org.patterns.observer;

public interface ISubject {

    public void addObserver(IObserver observer);


    public void removeObserver(IObserver observer);
    public void notifyObservers();
}
