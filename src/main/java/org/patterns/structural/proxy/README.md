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
1. **Virtual Proxy** -  Used for lazy loading. It defers the creation of an expensive or resource-intensive object until it's actually needed. For example, loading a large image only when it's displayed, not when its details are listed.
2. **Protection proxy** - Controls access to an object based on permissions or security rules. For example, a proxy checks if the user has admin privileges before executing a sensitive command.
3. **Smart Proxy** - Adds extra functionality when an object is accessed, such as
   - Logging - Recording all operations performed on the real object.
   - Caching -  Storing the results of operations to avoid re-computation.

The Proxy design pattern is a structural design pattern that provides a substitute or placeholder for another object to control access to it. It acts as an intermediary, allowing you to add extra logic (like security checks, lazy loading, caching, logging, etc.) before or after accessing the real object.

Think of it like this: instead of directly interacting with a "real" object, a client interacts with a "proxy" object. This proxy then manages the interaction with the real object. The key is that the proxy has the same interface as the real object, so the client doesn't even know it's talking to a proxy instead of the real thing.

Core Components:
Subject Interface: This defines the common interface for both the Real Subject and the Proxy. This is crucial because it allows the Proxy to be used interchangeably with the Real Subject.

Real Subject: This is the actual object that performs the core business logic. It's the object you want to control access to.

Proxy: This class implements the Subject interface. It holds a reference to the Real Subject and controls access to it. The Proxy can perform additional operations (e.g., checks, logging, caching) before or after delegating the request to the Real Subject.

Client: This is the object that interacts with the Subject interface. It can work with either a Real Subject or a Proxy, unaware of the difference.

How it Works:
The Client requests an operation from the Subject interface.

The Client receives an instance of the Proxy instead of the Real Subject.

The Proxy intercepts the request.

Before or after forwarding the request to the Real Subject, the Proxy can:

Perform access control (e.g., check user permissions).

Delay the creation of the Real Subject until it's actually needed (lazy loading).

Cache results of expensive operations.

Log requests.

Handle remote communication (if the Real Subject is on another server).

The Proxy eventually delegates the request to the Real Subject.

The Real Subject performs the actual operation.

The result is returned to the Client, possibly via the Proxy.

Common Use Cases (Types of Proxies):
Virtual Proxy: Used for lazy loading. It defers the creation of an expensive or resource-intensive object until it's actually needed. For example, loading a large image only when it's displayed, not when its details are listed.

Protection Proxy: Controls access to an object based on permissions or security rules. For example, a proxy that checks if a user has administrative rights before allowing them to execute a sensitive command.

Remote Proxy: Provides a local representation (a "stub") for an object that resides in a different address space (e.g., on a remote server). This hides the complexities of network communication from the client. Java RMI (Remote Method Invocation) heavily uses this concept.

Smart Proxy (or Smart Reference): Adds extra functionality when an object is accessed, such as:

Logging: Recording all operations performed on the real object.

Caching: Storing the results of operations to avoid re-computation.

Reference Counting: Managing the lifecycle of the real object by counting its references and disposing of it when no longer needed.

Real-World Analogy:
A great real-world analogy is a credit card or debit card.

Real Subject: Your bank account, which holds your actual money.

Subject Interface: The actions you want to perform (e.g., make a purchase, withdraw cash).

Proxy: Your credit card or debit card.

Client: You, the user.

When you want to make a purchase, you don't directly interact with your bank account. Instead, you use your credit/debit card. The card (proxy) then:

Checks if you have sufficient funds (protection/validation).

Communicates with the bank (remote access).

Manages the transaction (additional logic).

Eventually, the real money is deducted from your bank account.

You interact with the card (proxy) as if it is your money, even though it's just a stand-in that controls access to your actual funds.

## Benefits  
- Controlled Access: You can control when, how, and by whom an object is accessed.
- Lazy Initialization: Expensive objects are created only when necessary, improving performance and resource utilization.
- Security: Enforce access permissions and perform security checks.
- Decoupling: The client is decoupled from the real object, making the system more flexible and maintainable.
