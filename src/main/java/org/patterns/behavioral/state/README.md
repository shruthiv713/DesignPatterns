# State Pattern

The state pattern allows an object to alter its behavior based on its state.  
Instead of using a long list of if-else conditionals based on the state, the behavior associated with each state is encapsulated in separate State objects.

The core principle behind the State design pattern is to abstract out the state-related behaviour in a separate class  
State related behaviors are delegated to the State classes.

The core idea is that an object's behavior is determined by its state. For example, a LightSwitch object can behave differently depending on whether it's in an On state or an Off state. 

## Core Components

1. Context - 
   - This is the object, whose behavior changes based on its state. 
   - It holds a reference to a State object.
   - It delegates state-specific behavior to its current state object.
2. State Interface 
   - Defines common methods for all concrete state objects
3. Concrete State
   - This class implements the State Interface. Each class represents a particular state and provides its own implementation for the state-dependent methods.