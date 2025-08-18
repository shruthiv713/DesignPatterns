package org.patterns.behavioral.chainofresponsibility;

public class RateLimitingHandler extends BaseRequestHandler{
    @Override
    public void handle(Request request) {
        if(request.requestCount>100) {
            System.out.println("RateLimitingHandler: Rate limit exceeded. Returning :(");
            return;
        }
        System.out.println("RateLimitingHandler: Wihtin rate limit! Proceeding further... ");
        forward(request);
    }
}
