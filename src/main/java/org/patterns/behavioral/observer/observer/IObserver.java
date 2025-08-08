package org.patterns.behavioral.observer.observer;

/**
 * Observer interface for the Observer design pattern.
 * Implementing classes receive updates from a Subject when its state changes.
 */
public interface IObserver {
    /**
     * Called by the Subject to notify the Observer of a state change.
     *
     * @param magazineTitle  the title of the magazine or subject
     * @param issueDetails   details about the new issue or state
     */
    public void update(String magazineTitle, String issueDetails);
}
