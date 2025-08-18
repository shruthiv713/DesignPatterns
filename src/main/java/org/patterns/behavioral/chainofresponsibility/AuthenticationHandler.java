package org.patterns.behavioral.chainofresponsibility;

public class AuthenticationHandler extends BaseRequestHandler{
    @Override
    public void handle(Request request) {
        if(request.user==null||request.user.isEmpty()) {
            System.out.println("AuthenticationHandler: User not authenticated. Returning...");
            return;
        }
        System.out.println("AuthenticationHandler: User authenticated! Proceeding further... ");
        forward(request);
    }
}
