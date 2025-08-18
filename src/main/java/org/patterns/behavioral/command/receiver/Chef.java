package org.patterns.behavioral.command.receiver;

import org.patterns.behavioral.command.client.SpiceLevel;

public class Chef {

    public void makeIdli(int count) {
        System.out.println("Making "+count+ " hot idlis!");
    }

    public void undoIdli() {
        System.out.println("Undoing idli ordre...I'm eating the idlis myself ;)");
    }

    public void makeNoodles(SpiceLevel spiceLevel) {
        System.out.println("Making noodles with "+spiceLevel.name()+" spice level!!");
    }

    public void undoNoodles() {
        System.out.println("Undoing noodles order...Will serve to the next customer ;)");
    }
}
