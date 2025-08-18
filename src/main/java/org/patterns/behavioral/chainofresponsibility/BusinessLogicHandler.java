package org.patterns.behavioral.chainofresponsibility;

public class BusinessLogicHandler extends BaseRequestHandler{
    @Override
    public void handle(Request request) {
        System.out.println("Executing Business logic!");
    }
}
