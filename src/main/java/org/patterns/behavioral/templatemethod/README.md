# Template Method Pattern

This pattern defines the skeleton of the algorithm in the superclass, but lets subclasses override specific steps of the algorithm without changing its structure.

## Core idea

- Think of it like a recipe, The main steps for baking a cake are always the same: prepare the pan, mix the ingredients, bake, and then frost. However, the specific ingredients and the frosting method can be different for a chocolate cake versus a vanilla cake.  
- The Template Method is the high-level recipe (e.g., bakeCake()) defined in a base class or abstract class. This method calls a series of other methods in a specific order. Some of these methods are abstract and must be implemented by subclasses (e.g., addIngredients()), while others have a default implementation and can be overridden (e.g., preparePan()), and some are concrete methods that are fixed and cannot be changed (e.g., bakeFor30Minutes()).

## Components in Java

- Abstract Class (AbstractClass): This class contains the template method, which is a final method that defines the algorithm's structure. It also declares a series of other methods that make up the algorithm. Some of these are abstract methods that subclasses must implement, and others are concrete methods with default or fixed behavior.

- Concrete Class (ConcreteClass): This class extends the abstract class and implements the abstract methods to provide concrete functionality for the specific steps of the algorithm. It can also override optional methods from the parent class.