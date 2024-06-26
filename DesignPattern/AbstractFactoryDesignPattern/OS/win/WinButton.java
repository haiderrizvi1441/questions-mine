package DesignPattern.AbstractFactoryDesignPattern.OS.win;

import DesignPattern.AbstractFactoryDesignPattern.Application.Button;

public class WinButton implements Button {
    
    @Override
    public void paint(){
        System.out.println("Windows Button");
    }
}
