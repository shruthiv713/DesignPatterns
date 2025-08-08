package org.patterns.behavioral.observer.observer;

/**
 * Concrete implementation of the IObserver interface.
 * Represents a person who subscribes to magazine updates and receives notifications.
 */
public class Person implements IObserver{

    String name;

    /**
     * Constructs a new Person observer with the given name.
     * @param name the name of the person
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Receives notification of a new magazine issue.
     * @param magazineTitle the title of the magazine
     * @param issueDetails details about the new issue
     */
    @Override
    public void update(String magazineTitle, String issueDetails) {
        System.out.println(name + " received the latest issue of " + magazineTitle + ": " + issueDetails);
    }

}
