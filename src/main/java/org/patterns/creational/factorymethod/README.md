The factory method pattern provides an interface for object creation, and lets the subclasses decide the type of object that would be created.

The Factory Method pattern delegates the object creation to a "factory method" that can be overridden by subclasses.

A factory object is an object whose role is to create “product”
objects of particular types.
Factory method pattern adheres to the Open-Close principle while Simple Factory pattern doesn't

Key Components of Factory Method Pattern

- Product  (Interface/Abstract class) - 
  - Declares the interface for the object that the factory method will create
  - eg: Shape
- Concrete Product - 
  - Implements the Product interface. These are the actual objects that will be created. 
  - eg: Circle, Square
- Creator (Abstract class/Interface) - 
  - Declares the factory method, that returns a type of Product.
  - May also define an implementation for other methods that use the factory method.
  - eg: ShapeFactory
- Concrete Creator ()