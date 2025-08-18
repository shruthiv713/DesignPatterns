package org.patterns.behavioral.command.invoker;

import org.patterns.behavioral.command.cmd.Command;

public class RemoteController {
    Command button1; Command button2;
    public RemoteController(Command button1, Command button2) {
        this.button1 = button1;
        this.button2 = button2;
    }
    public void setButton1(Command button1) {
        this.button1 = button1;
    }
    public void setButton2(Command button2) {
        this.button2 = button2;
    }
    public void powerOn() {
        button1.execute();
    }
    public void powerOff() {
        button2.execute();
    }

}
