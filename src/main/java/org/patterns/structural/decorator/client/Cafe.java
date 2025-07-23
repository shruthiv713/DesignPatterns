package org.patterns.structural.decorator.client;

import org.patterns.structural.decorator.component.Coffee;
import org.patterns.structural.decorator.component.IBeverage;
import org.patterns.structural.decorator.component.Tea;
import org.patterns.structural.decorator.decorators.Ginger;
import org.patterns.structural.decorator.decorators.Sugar;

public class Cafe {
    public static void main(String[] args) {
        IBeverage tea = new Ginger(new Sugar(new Tea()));
        System.out.println(tea.getDescription());
        IBeverage coffee = new Ginger(new Coffee());
        System.out.println(coffee.getDescription());
    }
}
