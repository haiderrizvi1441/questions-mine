package DesignPattern.AbstractFactoryDesignPattern.UIFactory;

import DesignPattern.AbstractFactoryDesignPattern.Application.Button;
import DesignPattern.AbstractFactoryDesignPattern.Application.CheckBox;
import DesignPattern.AbstractFactoryDesignPattern.OS.win.WinButton;
import DesignPattern.AbstractFactoryDesignPattern.OS.win.WinCheckBox;

public class WinUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
    

}
