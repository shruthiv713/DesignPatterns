package org.patterns.behavioral.state;

import org.patterns.behavioral.state.states.*;

/**
 * Represents a gumball vending machine that changes its behavior based on its internal state.
 * Implements the State design pattern by delegating actions to state objects.
 */
public class GumBallMachine {

    int count;

    State hasQuarterState;
    State noQuarterState;
    State soldState;
    State soldOutState;

    State currentState = soldOutState;

    public GumBallMachine(int count) {
        this.count = count;
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        if(count>0) {
            currentState = noQuarterState;
        }
    }

    public void printCurrentState() {
        System.out.println(currentState.toString());
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    public void releaseBall() {
        System.out.println("Releasing 1 gumball...");
        if(count>0) {
            count--;
        }
    }

    public int getCount() {
        return count;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }


    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getSoldState() {
        return soldState;
    }


    public State getSoldOutState() {
        return soldOutState;
    }



}
