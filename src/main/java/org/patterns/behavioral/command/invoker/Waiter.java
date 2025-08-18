package org.patterns.behavioral.command.invoker;

import org.patterns.behavioral.command.cmd.Command;

public class Waiter {
    Command command;

    public Waiter() {

    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public void takeOrder() {
        this.command.execute();
    }

    public void undoOrder() {
        this.command.unexecute();
    }
}
