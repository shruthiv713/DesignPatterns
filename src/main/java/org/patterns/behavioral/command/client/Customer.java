package org.patterns.behavioral.command.client;

import org.patterns.behavioral.command.cmd.Command;
import org.patterns.behavioral.command.cmd.IdliOrder;
import org.patterns.behavioral.command.cmd.NoodlesOrder;
import org.patterns.behavioral.command.invoker.Waiter;
import org.patterns.behavioral.command.receiver.Chef;

public class Customer {

    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter  = new Waiter();
        Command idliOrder = new IdliOrder(chef, 4);
        waiter.setCommand(idliOrder);
        waiter.takeOrder();
        waiter.setCommand(new NoodlesOrder(chef, SpiceLevel.HIGH));
        waiter.takeOrder();
        waiter.undoOrder();
    }
}
