package org.patterns.behavioral.command.client;

import org.patterns.behavioral.command.cmd.Command;
import org.patterns.behavioral.command.cmd.remote.PowerOffCmd;
import org.patterns.behavioral.command.cmd.remote.PowerOffStereoCmd;
import org.patterns.behavioral.command.cmd.remote.PowerOnCmd;
import org.patterns.behavioral.command.cmd.remote.PowerOnStereoCmd;
import org.patterns.behavioral.command.invoker.RemoteController;
import org.patterns.behavioral.command.receiver.Stereo;
import org.patterns.behavioral.command.receiver.TV;

public class CouchPotato {
    public static void main(String[] args) {
        TV tv = new TV();
        Command tvOn = new PowerOnCmd(tv);
        Command tvOff = new PowerOffCmd(tv);

        Stereo stereo = new Stereo();
        Command stereoOn = new PowerOnStereoCmd(stereo);
        Command stereoOff = new PowerOffStereoCmd(stereo);
        RemoteController remoteController = new RemoteController(tvOn, tvOff);
        remoteController.powerOn();
        remoteController.setButton1(stereoOn);
        remoteController.powerOn();
    }
}
