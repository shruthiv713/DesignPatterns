package org.patterns.behavioral.state.states;

import org.patterns.behavioral.state.GumBallMachine;

/**
 * State representing the gumball machine when it is sold out of gumballs.
 * Handles actions specific to the 'sold out' state.
 */
public class SoldOutState implements State{

    GumBallMachine gumBallMachine;
    public SoldOutState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insertCoin() {
        System.out.println("No more gumballs!");
    }

    @Override
    public void ejectCoin() {
        System.out.println("No more gumballs!");
    }

    @Override
    public void turnCrank() {
        System.out.println("no more gumballs");
    }
    @Override
    public String toString() {
        return "SOLD_OUT";
    }

    @Override
    public void dispense() {
        System.out.println("No more gumballs");
    }
}
