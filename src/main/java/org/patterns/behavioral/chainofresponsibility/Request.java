package org.patterns.behavioral.chainofresponsibility;

public class Request {
    String user;
    String userRole;
    int requestCount;
    String payload;
    public Request(String user, String userRole, int requestCount, String payload) {
        this.user = user;
        this.userRole = userRole;
        this.requestCount = requestCount;
        this.payload = payload;
    }
}
