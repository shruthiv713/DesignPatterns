package org.patterns.behavioral.observer.observer;

public class Person implements IObserver{

    String name;
    public Person(String name) {
        this.name = name;

    }

    @Override
    public void update(String magazineTitle, String issueDetails) {
        System.out.println(name + " received the latest issue of " + magazineTitle + ": " + issueDetails);
    }

}
