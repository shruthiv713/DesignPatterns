package org.patterns.behavioral.observer.client;

import org.patterns.behavioral.observer.subject.ISubject;
import org.patterns.behavioral.observer.observer.IObserver;
import org.patterns.behavioral.observer.observer.Person;
import org.patterns.behavioral.observer.subject.MagazinePublisher;

public class SubscriptionService {

    public static void main(String[] args) {
        IObserver alice = new Person("Alice");
        IObserver aiz = new Person("Aiz");

        MagazinePublisher teenMagazine = new MagazinePublisher("Teen Idols 2025");
        teenMagazine.addObserver(alice);
        teenMagazine.publishNewIssue("First Issue!!");
        teenMagazine.addObserver(aiz);
        teenMagazine.publishNewIssue("Second Issue!!");
        teenMagazine.removeObserver(alice);
        teenMagazine.publishNewIssue("Third Issue!!");
    }
}
