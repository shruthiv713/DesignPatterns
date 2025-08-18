package org.patterns.behavioral.chainofresponsibility;

public class RequestClient {

    public static void main(String[] args) {
        IRequestHandler authenticationHandler = new AuthenticationHandler();
        IRequestHandler authorizationHandler = new AuthorizationHandler();
        IRequestHandler rateLimitingHandler = new RateLimitingHandler();
        IRequestHandler businessLogicHandler = new BusinessLogicHandler();
        Request request = new Request("shru", "admin", 102, "dummy");
        authenticationHandler.setNext(authorizationHandler);
        authorizationHandler.setNext(rateLimitingHandler);
        rateLimitingHandler.setNext(businessLogicHandler);
        authenticationHandler.handle(request);
    }
}
