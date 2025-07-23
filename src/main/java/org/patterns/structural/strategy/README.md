# Strategy Pattern
 The Strategy pattern lets you define a family of algorithms, encapsulate each one and make them interchangeable
 
## Core problem it solves
Let's say your class has to perform a task, but there are multiple ways (algorithms) of doing the task. Instead of hard-cording the algorithm
into the class, or using a long list of if-else blocks to choose between the algorithms, you create a separate class for each 
implementation i.e you encapsulate each algorithm in a class. Then the original object (context) holds a reference to an interface that
represents the algorithm.

This allows you to: 
  - Change algorithms at runtime - Swap one algorithm with another without modifying the context class
  - Add new algorithms easily - To introduce a new algorithm, you simply create a new class that implements the algorithm interface, without touching the existing code. (open-close principle)
  - Avoid conditional logic - Avoid long if-else blocks that decide which algorithm to use


## Design Principles used
 - Identify the aspects of your system that vary and separate them from what stays the same. The behaviors (algorithms) vary, so separate them from the context class.


## Key Components of the Strategy Pattern
- Context 
  - This is the class that uses the algorithm. 
  - It holds a reference of the Strategy object and delegates the execution of the algorithm to this object
  - Has a **setter method** to set the strategy at runtime.
- Strategy - Common interface for all supported algorithms. All concrete implementations must adhere to this. Declares a method that the context will use, that will be implemented by the concrete algorithms.
- Concrete Strategy - These are the actual implementations of the algorithms. They implement the Strategy interface