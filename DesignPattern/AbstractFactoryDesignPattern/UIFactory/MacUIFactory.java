package DesignPattern.AbstractFactoryDesignPattern.UIFactory;

import DesignPattern.AbstractFactoryDesignPattern.Application.Button;
import DesignPattern.AbstractFactoryDesignPattern.Application.CheckBox;
import DesignPattern.AbstractFactoryDesignPattern.OS.mac.MacButton;
import DesignPattern.AbstractFactoryDesignPattern.OS.mac.MacCheckBox;

public class MacUIFactory implements UIFactory {
    
    @Override
    public Button createButton(){
        return new MacButton();
    }

    @Override 
    public CheckBox createCheckBox(){
        return new MacCheckBox();
    }
}
