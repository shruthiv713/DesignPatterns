package org.patterns.behavioral.observer.subject;

import org.patterns.behavioral.observer.observer.IObserver;

/**
 * Subject interface for the Observer design pattern.
 * Defines methods for attaching, detaching, and notifying observers.
 */
public interface ISubject {
    /**
     * Attaches an observer to the subject.
     * @param observer the observer to add
     * @return true if the observer was added successfully
     */
    public boolean addObserver(IObserver observer);

    /**
     * Detaches an observer from the subject.
     * @param observer the observer to remove
     * @return true if the observer was removed successfully
     */
    public boolean removeObserver(IObserver observer);

    /**
     * Notifies all attached observers of a state change.
     * @return true if observers were notified
     */
    public boolean notifyObservers();
}
