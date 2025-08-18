package org.patterns.behavioral.command.cmd;

import org.patterns.behavioral.command.receiver.Chef;

public class IdliOrder implements Command{

    Chef chef;
    int count;
    public IdliOrder(Chef chef, int count) {
        this.chef = chef;
        this.count = count;
    }

    @Override
    public void execute() {
        chef.makeIdli(count);
    }

    @Override
    public void unexecute() {
        chef.undoIdli();
    }
}
