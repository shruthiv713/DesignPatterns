package org.patterns.behavioral.chainofresponsibility;

public abstract class BaseRequestHandler implements IRequestHandler{

    IRequestHandler next;

    @Override
    public void setNext(IRequestHandler next) {
        this.next = next;
    }
    protected void forward(Request request) {
        if(next!=null) {
            next.handle(request);
        }
    }
}
