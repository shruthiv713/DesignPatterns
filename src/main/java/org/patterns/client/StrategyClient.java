package org.patterns.client;

import org.patterns.structural.strategy.AmericanOlympian;
import org.patterns.structural.strategy.ChineseOlympian;
import org.patterns.structural.strategy.IndianOlympian;
import org.patterns.structural.strategy.Olympian;

public class StrategyClient {
    public static void invoke() {
        System.out.println("Welcome to the Olympics!");

        Olympian olympian = new AmericanOlympian();
        olympian.description();
        olympian.eat();
        olympian.entertain();
        olympian.run();

        Olympian olympian2 = new IndianOlympian();
        olympian2.description();
        olympian2.eat();
        olympian2.entertain();
        olympian2.run();

        Olympian olympian3 = new ChineseOlympian();
        olympian3.description();
        olympian3.eat();
        olympian3.entertain();
        olympian3.run();

    }
}
