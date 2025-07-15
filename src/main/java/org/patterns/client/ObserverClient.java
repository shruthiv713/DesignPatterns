package org.patterns.client;

import org.patterns.behavioral.observer.*;

public class ObserverClient {
    public static void invoke() {
        System.out.println("Welcome to Shruthi's Teddy Store!");
        TeddyBearStock subject = new TeddyBearStock();
        TeddyFanatic fanatic = new TeddyFanatic(subject);
        Boyfriend boyfriend = new Boyfriend(subject);
        subject.setTeddy(5);
        subject.setTeddy(0);
        subject.setTeddy(12);

    }
}
