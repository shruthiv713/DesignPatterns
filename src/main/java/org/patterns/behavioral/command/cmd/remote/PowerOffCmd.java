package org.patterns.behavioral.command.cmd.remote;

import org.patterns.behavioral.command.cmd.Command;
import org.patterns.behavioral.command.receiver.TV;

public class PowerOffCmd implements Command {
    TV tv;
    public PowerOffCmd(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.powerOff();
    }

    @Override
    public void unexecute() {
        tv.powerOn();
    }
}
