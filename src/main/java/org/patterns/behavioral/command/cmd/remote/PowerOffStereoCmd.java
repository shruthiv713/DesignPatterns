package org.patterns.behavioral.command.cmd.remote;

import org.patterns.behavioral.command.cmd.Command;
import org.patterns.behavioral.command.receiver.Stereo;
import org.patterns.behavioral.command.receiver.TV;

public class PowerOffStereoCmd implements Command {
    Stereo tv;
    public PowerOffStereoCmd(Stereo tv) {
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
