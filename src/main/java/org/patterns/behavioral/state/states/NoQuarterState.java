package org.patterns.behavioral.state.states;

import org.patterns.behavioral.state.GumBallMachine;

/**
 * State representing the gumball machine when no quarter has been inserted.
 * Handles actions specific to the 'no quarter' state.
 */
public class NoQuarterState implements State {

    GumBallMachine gumBallMachine;

    public NoQuarterState(GumBallMachine gumBallMachine) {
            this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted!");
        this.gumBallMachine.setState(gumBallMachine.getHasQuarterState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin inserted to eject!");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but no coin inserted!");
    }
    @Override
    public String toString() {
        return "NO_QUARTER";
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first!");
    }
}
