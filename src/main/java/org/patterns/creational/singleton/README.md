# Singleton Pattern

The singleton pattern **ensures that a class has only one instance**, and provides a global point of access to it. 

It guarantees that for a given class, there will never be more than one object instantiated throughout the application's lifecycle.

## Core Problem is solves 
In many applications, there are certain resources that should logically have only one instance  
eg: Logger - A single logging instance to write all log messages    
    Database Connection Pool - Managing a pool of database connections to optimize performance.Creating multiple pools would be resource-intensive and inefficient    
    Configuration Manager - An application has a single object to manage its configuration settings  

## How it works
- Make a class itself responsible for its instantiation.
  - Private constructor - to prevent direct instantiation from outside using 'new'
  - Static instance - to hold the single object. Static object belongs to the class. If the object wasn't static, then we would need another object to call the method that would return this object, that defeats the purpose.
  - Static method to retrieve the instance 
    - It checks if the instance already exists, and creates one if it doesn't exist (lazy initialization)