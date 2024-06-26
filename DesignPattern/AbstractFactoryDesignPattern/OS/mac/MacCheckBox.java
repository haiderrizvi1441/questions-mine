package DesignPattern.AbstractFactoryDesignPattern.OS.mac;

import DesignPattern.AbstractFactoryDesignPattern.Application.CheckBox;

public class MacCheckBox implements CheckBox {
    
    @Override
    public void paint(){
        System.out.println("Mac CheckBox");
    }
}
