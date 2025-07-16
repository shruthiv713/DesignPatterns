The Abstract family pattern is used, if you want to create families of related or dependent objects.
Each concrete factory creates objects of a particular family.

eg: you want to create buttons, checkboxes, and text fields. These are 3 type of products. 
But there are 2 variations of these. You can have linux-typed or Windows-type buttons/checkboxes/text fields.
You don't want to mix-up these 2 familes. So you have 2 factories, one for Linux and another for Windows.

Key Components
- Abstract Product : Interface for a type of product object. 1 for each distinct type of product 
 eg: Button, CheckBox
- Concrete Product - Implements the Abstract product interface. These are the actual objects that are created and belong to a specific family.
eg: LinuxButton, WindowsButton, LinuxCheckBox
- Abstract Factory - The "factory of factories". An interface that contains methods to create each type of Abstract Product in the family.
eg: GUIFactory
- ConcreteFactory - Implements the abstract factory, and creates the actual concrete products of its family. There's one concrete product factory for each family.
 eg: LinuxGUIFactory, WindowsGUIFactory.

How it Works 
- The client depends on the AbstractFactory and the AbstractProduct interfaces
- At runtime, it decides which concrete factory to instantiate. This is typically done once during application startup.
- The client then uses the Concrete Factory to call its creation methods. 
- Each creation method within the concreteFactory creates the appropriate Concrete Product belonging to that factory's family.
- The client receives the Abstract Products and works with them without knowing their concrete types or which specific factory produced them.