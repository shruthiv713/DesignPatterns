package org.patterns.behavioral.state.states;

import org.patterns.behavioral.state.GumBallMachine;

/**
 * State representing the gumball machine after a sale has occurred.
 * Handles actions specific to the 'sold' state, such as dispensing a gumball.
 */
public class SoldState implements State{

    GumBallMachine gumBallMachine;

    public SoldState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Please wait, we are already giving you a gumball");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public String toString() {
        return "SOLD";
    }

    @Override
    public void dispense() {
        gumBallMachine.releaseBall();
        System.out.println("count - "+this.gumBallMachine.getCount());
        if(this.gumBallMachine.getCount()>0) {
            this.gumBallMachine.setState(this.gumBallMachine.getNoQuarterState());
        } else {
            this.gumBallMachine.setState(this.gumBallMachine.getSoldOutState());
        }
    }
}
