package org.patterns.behavioral.command.cmd.remote;

import org.patterns.behavioral.command.cmd.Command;
import org.patterns.behavioral.command.receiver.TV;

public class PowerOnCmd implements Command {

    TV tv;
    public PowerOnCmd(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.powerOn();
    }

    @Override
    public void unexecute() {
        tv.powerOff();
    }
}
