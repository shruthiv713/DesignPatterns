package org.patterns.creational.abstractfactory.product.concrete;

import org.patterns.creational.abstractfactory.product.Button;
import org.patterns.creational.abstractfactory.product.CheckBox;

public class LinuxCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("I'm a Linux checkbox");
    }
}
