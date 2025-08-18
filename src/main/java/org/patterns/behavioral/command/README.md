# Command Pattern

The Command pattern is a behavioral design pattern that turns a request into a standalone object. This lets you queue many requests together, delay execute them, batch them etc 
This lets you parameterize clients with different requests, queue or log requests and support undo operation.

For example, think of a remote controller for a TV (invoker). It has 4 buttons. You can press each button to perform a command.
The buttons can be programmed to turn on a video player too. All the remote controller needs to know is to run command.execute() that it is configured with. 

## Core Components

1. Command Interface - A common command interface with the execute() and unexecute() methods. All concrete commands must implement this.
2. Concrete Commands - These commands implement the command interface. It encapsulates the receiver object and the specific actions to be performed on that object.
3. Invoker - It holds a reference to the command object and asks it to carry out the request. It doesn't know the internal details of the command. Similar to how you can program your remote control to either turn on a TV or a video player.
4. Receiver - The object that performs the actual work. It knows how to carry out the actions requested by the concrete command. 
5. Client - The client creates the concrete command and sets its receiver. It then hands the command to the Invoker. 

Think of a restaurant order system.

1. The Customer (Client) is the person who wants to eat. or you want to want TV
2. The Waiter (Invoker) takes the order. The waiter doesn't know how to cook; they just know how to take orders and give them to the kitchen.
3. The Order Slip (Command) is the request object. It contains details about the dish to be prepared (e.g., "prepare a burger").
4. The Chef (Receiver) is the person who performs the action (the cooking).
5. The order slip is a concrete object that encapsulates all the information needed for the chef to cook the food. The waiter just takes the order slip and "executes" it by handing it to the chef.

## Advantages

1. Decoupling and Flexibility - 
    - The most significant advantage is that the pattern **decouples the invoker from the receiver**. The invoker (e.g., a button on a remote or the waiter) doesn't need to know anything about the receiver (e.g., the TV or the chef) or how the action is performed.  
    - It only needs to know how to execute the command object. 
    - This makes it easy to:Change or replace the receiver without affecting the invoker.

Switch command objects at runtime to perform different actions without changing the invoker.