package org.patterns.creational.abstractfactory.factory;

import org.patterns.creational.abstractfactory.product.Button;
import org.patterns.creational.abstractfactory.product.CheckBox;
import org.patterns.creational.abstractfactory.product.concrete.LinuxButton;
import org.patterns.creational.abstractfactory.product.concrete.LinuxCheckBox;

public class LinuxGUIFactory implements IGUIFactory {
    @Override
    public Button getButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox getCheckBox() {
        return new LinuxCheckBox();
    }
}
