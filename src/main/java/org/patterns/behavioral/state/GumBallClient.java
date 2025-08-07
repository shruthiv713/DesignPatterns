package org.patterns.behavioral.state;

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
