package org.patterns.creational.abstractfactory.factory;

import org.patterns.creational.abstractfactory.product.Button;
import org.patterns.creational.abstractfactory.product.CheckBox;
import org.patterns.creational.abstractfactory.product.concrete.WindowsButton;
import org.patterns.creational.abstractfactory.product.concrete.WindowsCheckBox;

public class WindowsGUIFactory implements IGUIFactory {
    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox getCheckBox() {
        return new WindowsCheckBox();
    }
}
