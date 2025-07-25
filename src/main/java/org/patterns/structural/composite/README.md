# Composite Pattern

The composite pattern allows you to treat individual objects and compositions of objects uniformly.
It's used to build tree-like structures where both individual elements (leaves) and groups (composites) can be treated uniformly.
This simplifies client code, allowing it to interact with both individual and group objects uniformly through a common interface. 

Think of it like the filesystem in your computer. You have individual files, and you have folders which can contain both files and other folders.
As a client you can perform operations like "delete", "copy" or "move" - you can apply it to a single file, or to a folder (which then recursively applies it all its contents).
The client interacts with both files and folders in the same way. 

## Core Problem it solves
Imagine you have system, that has objects that can be grouped together to groups,and these groups can contain other groups forming a tree-like hierarchy.  
You want to perform operations on these objects, regardless of whether they are individual items or collections of items. 

Without the composite pattern the problems you would face
 - Complex client code - Client would have to distinguish between individual objects and composite objects using an if-else. If it's a composite it would have to iterate over the individual elements 
 - Increased complexity for adding a new type - Adding a new type of component (eg: a new kind of leaf or a composite) would require modifying the client

## Core Idea
The Composite pattern introduces a common interface (Component) that both individual objects (the "Leaf" objects) and composite objects (the "Composite" objects) implement.  
The Composite objects also maintain a collection of Component objects, allowing them to contain both Leaf objects and other Composite objects.

## Key Components
1. Component - 
    - The common interface for both individual objects and composite ones
2. Leaf object
 - Represents the individual objects in the composition
3. Composite object that contat