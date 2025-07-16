package org.patterns.creational.abstractfactory.product.concrete;


import org.patterns.creational.abstractfactory.product.CheckBox;

public class WindowsCheckBox implements CheckBox {

    @Override
    public void check() {
        System.out.println("I'm a Windows checkbox");
    }
}
