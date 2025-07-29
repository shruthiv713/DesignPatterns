# Proxy Pattern
The proxy pattern provides a substitute or placeholder for another object, so that you can control the access to it.  
It acts as an intermediary allowing you to add extra logic (like security checks, lazy loading, caching, logging etc), before or after accessing the actual object

Think of it like this: instead of directly interacting with a "real" object, a client interacts with a "proxy" object. This proxy then manages the interaction with the real object. The key is that the proxy has the same interface as the real object, so the client doesn't even know it's talking to a proxy instead of the real thing.

## Core Components
1. **Subject Interface** - This defines the common interface for both the real subject and the proxy. This is crucial as it allows the proxy to be used interchangeably with the Real subject.
2. **Real Subject** - This is the actual object that performs core business logic. This is the object you want to control access to.
3. **Proxy** - This clas implements the Subject Interface and holds an reference of the Real Subject & controls access to it. Proxy can perform additional operations (eg: logging, caching, checks) before or after delegating the request to the Real Subject.
4. **Client** - This is the object that interacts with the Subject Interface. It can work with both the proxy or the real subject, unaware of the difference. 

## How it works
1. The client requests an operation from the Subject interface.
2. It receives an instance of the Proxy instead of the Real subject.
3. The Proxy intercepts the request.
4. Before or after forwarding the request to the Real Subject, the proxy can
   - Perform access control (eg, check user permissions)
   - Lazy loading - delay the creation of the Real Subject until it's actually needed
   - Log requests
   - Cache the result of expensive operations.
5. The proxy eventually delegates the request to the Real object
6. The Real Subject performs the actual operation
7. The result is returned to the Client, via proxy

## Common Use cases
1. Virtual Proxy - for lazy loading
2. Protection proxy - Controls access to an object based on permissions or security rules. For example, a proxy checks if the user has admin privileges before executing a sensitive command.
3. Smart Proxy - Adds extra functionality when an object is accessed, such as
  - Logging - Recording all operations performed on the real object.
  - Caching -  Storing the results of operations to avoid re-computation.
