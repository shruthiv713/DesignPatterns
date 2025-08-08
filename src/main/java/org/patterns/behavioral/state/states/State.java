package org.patterns.behavioral.state.states;

/**
 * State interface for the State design pattern.
 * Defines actions that can be performed on the gumball machine, with behavior varying by state.
 */
public interface State {
    /**
     * Handle inserting a coin.
     */
    public void insertCoin();
    /**
     * Handle ejecting a coin.
     */
    public void ejectCoin();
    /**
     * Handle turning the crank.
     */
    public void turnCrank();
    /**
     * Handle dispensing a gumball.
     */
    public void dispense();
}
