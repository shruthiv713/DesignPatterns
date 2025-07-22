# Singleton Pattern

The singleton pattern **ensures that a class has only one instance**, and provides a global point of access to it. 

It guarantees that for a given class, there will never be more than one object instantiated throughout the application's lifecycle.

## Core Problem is solves 
In many applications, there are certain resources that should logically have only one instance
eg: Logger - A single logging instance to write all log messages  
    Database Connection Pool - Managing a pool of database connections to optimize performance.Creating multiple pools would be resource-intensive and inefficient
    Configuration Manager - An application has a single object to manage its configuration settings