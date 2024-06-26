package DesignPattern.AbstractFactoryDesignPattern.OS.mac;

import DesignPattern.AbstractFactoryDesignPattern.Application.Button;

public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
    
}
