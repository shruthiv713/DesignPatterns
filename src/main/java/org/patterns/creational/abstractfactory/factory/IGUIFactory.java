package org.patterns.creational.abstractfactory.factory;

import org.patterns.creational.abstractfactory.product.Button;
import org.patterns.creational.abstractfactory.product.CheckBox;

public interface IGUIFactory {

    public Button getButton();
    public CheckBox getCheckBox();
}
