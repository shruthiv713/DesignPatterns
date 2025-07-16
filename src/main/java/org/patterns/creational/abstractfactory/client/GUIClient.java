package org.patterns.creational.abstractfactory.client;

import org.patterns.creational.abstractfactory.factory.IGUIFactory;
import org.patterns.creational.abstractfactory.factory.LinuxGUIFactory;
import org.patterns.creational.abstractfactory.factory.WindowsGUIFactory;
import org.patterns.creational.abstractfactory.product.Button;
import org.patterns.creational.abstractfactory.product.CheckBox;

public class GUIClient {
    public static void main(String[] args) {
        String os = "linux";
        IGUIFactory factory;
        Button button;
        CheckBox checkBox;
        if(os.equals("windows")) {
            factory = new WindowsGUIFactory();
        } else {
            factory = new LinuxGUIFactory();
        }
        button = factory.getButton();
        checkBox = factory.getCheckBox();
        button.click();
        checkBox.check();
    }
}
