package org.patterns.behavioral.chainofresponsibility;

public interface IRequestHandler {
    void handle(Request request);
    void setNext(IRequestHandler handler);
}
