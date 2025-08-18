package org.patterns.behavioral.chainofresponsibility;

public class AuthorizationHandler extends BaseRequestHandler{
    @Override
    public void handle(Request request) {
        if(request.userRole==null||!request.userRole.equalsIgnoreCase("ADMIN")) {
            System.out.println("AuthorizationHandler: User not authorized. Only admins are authorized. Returning...");
            return;
        }
        System.out.println("AuthorizationHandler: User authorized! Proceeding further... ");
        forward(request);
    }
}
