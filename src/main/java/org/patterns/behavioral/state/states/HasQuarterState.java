package org.patterns.behavioral.state.states;

import org.patterns.behavioral.state.GumBallMachine;

/**
 * State representing the gumball machine when a quarter has been inserted.
 * Handles actions specific to the 'has quarter' state.
 */
public class HasQuarterState implements State {

    GumBallMachine gumBallMachine;

    public HasQuarterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted!");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Ejecting coin...");
        this.gumBallMachine.setState(gumBallMachine.getNoQuarterState());
        System.out.println("Coin Ejected!");
    }

    @Override
    public String toString() {
        return "HAS_QUARTER";
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning crank...");
        this.gumBallMachine.setState(gumBallMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball returned");
    }
}
