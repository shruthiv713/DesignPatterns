# The Observer Pattern

 The Observer Pattern defines a one-to-many dependency between objects so that when one object (Subject) changes state, all its dependents (the observers) are notified and updated automatically.  
The subject maintains a list of observers and notifies them of any state changes.

## Core Problem it Solves
In many applications, there are scenarios where one object (the subject) needs to notify multiple other objects (the observers) about changes in its state.  
This is common in event-driven systems, where the subject's state change should trigger updates in multiple observers without tightly coupling them.  

## Core Components

1. Subject Interface - Defines methods for attaching, detaching and notifying observers. It's a contract for any object that can be observed
2. Concrete Subject - Implements the subject interface. It holds the data or state that observers are interested in. When it's state changes it notifies all the observers.
3. Observer Interface - Defines an update() method. This is the method that the Subject calls to notify the observer of state changes.
4. Concrete Observer - An object that implements the Observer interface, and performs an action when notified of a state change.

