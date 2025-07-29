# Adapter Pattern

The adapter pattern allows objects with incompatible interfaces to communicate via an adapter class.  
It acts as a bridge between two interfaces

Think of it like a power adapter you use when traveling. You have a device with a specific plug (interface) and a wall socket with a different type of outlet (incompatible interface). The power adapter converts one interface to be compatible with the other, allowing your device to function.

## Core problem it solves
You have a client that expects data in a particular format/calls methods with a specific signature. Now we need to integrate  from a 3rd party library. But the 3rd party library does not comply with the client's expected interface.
Then you have an adapter class in the middle that acts as a translator for the two.
eg: You have a client that expects String data to be returned when XML data is given as input. But the 3-rd party interface expects JSON as input and gives JSON as output.
In this scenario, you'll have an Adapter class in the middle that performs the translation.

## Key Components
1. Target (or Client interface)
    This is the interface that your client expects to work with
2. Client
   - The client that uses the target interface. (has-a)
   - It's part of your system and needs to work with the incompatible adaptee
3. Adaptee (or Service)
   - An existing class (usually from a 3-rd party library), that is incompatible with the Target interface but whose functionality is needed by the Client
4. Adapter
   - The class that makes the Adaptee compatible with the Target interface.
   - It implements the target interface (is-a)
   - It holds an instance of the Adaptee (has-a)
   - Translates the calls from the Target interface to the Adaptee and vice versa
   
## How it works
How the Client uses the Adapter:

The client makes a request to the adapter by calling a method on it using the target interface.
The adapter translates the request into one or more calls on the adaptee using the adaptee interface.
The client receives the results of the call and never knows there is an adapter doing the translation.