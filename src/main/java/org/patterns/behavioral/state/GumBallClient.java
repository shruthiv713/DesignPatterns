package org.patterns.behavioral.state;

/**
 * Client class to demonstrate the State design pattern using a GumBallMachine.
 * Simulates user interactions with the gumball machine.
 */
public class GumBallClient {
    public static void main(String[] args) {
        GumBallMachine gumBallMachine = new GumBallMachine(2);
        gumBallMachine.printCurrentState();
        gumBallMachine.insertCoin();
        gumBallMachine.printCurrentState();
        gumBallMachine.turnCrank();
        gumBallMachine.printCurrentState();
        gumBallMachine.insertCoin();
    }
}
