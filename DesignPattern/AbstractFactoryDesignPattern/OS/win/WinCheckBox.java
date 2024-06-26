package DesignPattern.AbstractFactoryDesignPattern.OS.win;

import DesignPattern.AbstractFactoryDesignPattern.Application.CheckBox;

public class WinCheckBox implements CheckBox {
    
    @Override
    public void paint(){
        System.out.println("Windows CheckBox");
    }
}
