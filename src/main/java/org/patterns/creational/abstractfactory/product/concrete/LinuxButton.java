package org.patterns.creational.abstractfactory.product.concrete;

import org.patterns.creational.abstractfactory.product.Button;

public class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("I'm a Linux Button!");
    }
}
