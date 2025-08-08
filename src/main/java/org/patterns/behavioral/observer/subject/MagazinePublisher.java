package org.patterns.behavioral.observer.subject;

import org.patterns.behavioral.observer.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of the ISubject interface.
 * Represents a magazine publisher that notifies subscribers (observers) when a new issue is published.
 */
public class MagazinePublisher implements ISubject {

    List<IObserver> observerList;
    String magazineTitle;
    String latestIssue;

    /**
     * Constructs a new MagazinePublisher with the given magazine title.
     * @param magazineTitle the title of the magazine
     */
    public MagazinePublisher(String magazineTitle) {
        observerList = new ArrayList<>();
        this.magazineTitle = magazineTitle;
    }

    /**
     * Publishes a new magazine issue and notifies all observers.
     * @param issueDetails details about the new issue
     */
    public void publishNewIssue(String issueDetails) {
        System.out.println("\n*** " + magazineTitle + " Publisher: New issue published! ***");
        this.latestIssue = issueDetails;
        notifyObservers();
    }

    /**
     * Adds an observer to the subscriber list.
     * @param observer the observer to add
     * @return true if added successfully
     */
    @Override
    public boolean addObserver(IObserver observer) {
        observerList.add(observer);
        return true;
    }

    /**
     * Removes an observer from the subscriber list.
     * @param observer the observer to remove
     * @return true if removed successfully
     */
    @Override
    public boolean removeObserver(IObserver observer) {
        observerList.remove(observer);
        return true;
    }

    /**
     * Notifies all observers about the latest issue.
     * @return true if notification was sent
     */
    @Override
    public boolean notifyObservers() {
        observerList.forEach(observer -> observer.update(magazineTitle,latestIssue));
        return true;
    }
}
