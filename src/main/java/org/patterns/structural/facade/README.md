# Facade Pattern

The facade pattern aims to provide a simple, unified interface to a complex subsystem.
The client does not have to know the intricate details of the subsystems, and can instead use the simpler Facade. 
It decouples the client from the complex subsystem

## Components of the Facade Pattern

1. Facade
    - Provides a simplified, high-level interface to the subsystem.
    - Delegates client requests to the appropriate subsystem
    - It does not add new functionality, merely simplifies access to existing functionality.
    - eg: ComputerFacade
2. Subsystem classes
    - The internal classes that perform the actual work.
    - These classes are usually complex and numerous, interacting with each other.
    - The facade shields the client from direct interaction with these classes.
    - eg: BIOS, Memory, HardDrive, OperatingSystem
3. Client
    - The part of the system that uses the facade.
    - Interacts only with the facade, and is unaware of the complexity of the system.

