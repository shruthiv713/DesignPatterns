package org.patterns.structural.facade.client;

import org.patterns.structural.facade.facade.ComputerFacade;

public class User {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();
        System.out.println("User is working on the computer...");
        computerFacade.shutDown();
    }

}
