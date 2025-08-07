package org.patterns.behavioral.observer.subject;

import org.patterns.behavioral.observer.observer.IObserver;

public interface ISubject {
    public boolean addObserver(IObserver observer);
    public boolean removeObserver(IObserver observer);
    public boolean notifyObservers();
}
