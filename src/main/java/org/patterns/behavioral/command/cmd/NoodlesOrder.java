package org.patterns.behavioral.command.cmd;

import org.patterns.behavioral.command.client.SpiceLevel;
import org.patterns.behavioral.command.receiver.Chef;

public class NoodlesOrder implements Command{

    Chef chef;
    SpiceLevel spiceLevel;

    public NoodlesOrder(Chef chef, SpiceLevel spiceLevel) {
        this.chef = chef;
        this.spiceLevel = spiceLevel;
    }

    @Override
    public void execute() {
          chef.makeNoodles(spiceLevel);
    }

    @Override
    public void unexecute() {
        chef.undoNoodles();
    }
}
