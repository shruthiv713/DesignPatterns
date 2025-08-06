# The Observer Pattern

 The Observer Pattern defines a one-to-many dependency between objects so that when one object (Subject) changes state, all its dependents (the observers) are notified and updated automatically.

## Core Problem it Solves
In many applications, there are scenarios where one object (the subject) needs to notify multiple other objects (the observers) about changes in its state.  
This is common in event-driven systems, where the subject's state change should trigger updates in multiple observers without tightly coupling them.
For example, in a stock market application, when the price of a stock changes, multiple components (like charts, notifications, and logs) need to be updated with the new price. Instead of                   