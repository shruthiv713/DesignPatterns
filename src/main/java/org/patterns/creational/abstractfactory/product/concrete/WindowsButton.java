package org.patterns.creational.abstractfactory.product.concrete;

import org.patterns.creational.abstractfactory.product.Button;

public class WindowsButton implements Button {

    @Override
    public void click() {
        System.out.println("I'm a Windows Button");
    }
}
