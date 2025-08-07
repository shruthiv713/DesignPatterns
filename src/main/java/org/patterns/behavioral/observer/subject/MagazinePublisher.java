package org.patterns.behavioral.observer.subject;

import org.patterns.behavioral.observer.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class MagazinePublisher implements ISubject {

    List<IObserver> observerList;
    String magazineTitle;
    String latestIssue;


    public MagazinePublisher(String magazineTitle) {
        observerList = new ArrayList<>();
        this.magazineTitle = magazineTitle;
    }

    public void publishNewIssue(String issueDetails) {
        System.out.println("\n*** " + magazineTitle + " Publisher: New issue published! ***");
        this.latestIssue = issueDetails;
        notifyObservers();
    }

    @Override
    public boolean addObserver(IObserver observer) {
        observerList.add(observer);
        return true;
    }

    @Override
    public boolean removeObserver(IObserver observer) {
        observerList.remove(observer);
        return true;
    }

    @Override
    public boolean notifyObservers() {
        observerList.forEach(observer -> observer.update(magazineTitle,latestIssue));
        return true;
    }
}
