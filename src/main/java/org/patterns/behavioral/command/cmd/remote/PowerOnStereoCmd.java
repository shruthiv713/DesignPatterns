package org.patterns.behavioral.command.cmd.remote;

import org.patterns.behavioral.command.cmd.Command;
import org.patterns.behavioral.command.receiver.Stereo;
import org.patterns.behavioral.command.receiver.TV;

public class PowerOnStereoCmd implements Command {
    Stereo tv;
    public PowerOnStereoCmd(Stereo tv) {
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
