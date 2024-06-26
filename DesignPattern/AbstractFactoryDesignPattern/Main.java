package DesignPattern.AbstractFactoryDesignPattern;

import DesignPattern.AbstractFactoryDesignPattern.Application.Application;
import DesignPattern.AbstractFactoryDesignPattern.UIFactory.MacUIFactory;
import DesignPattern.AbstractFactoryDesignPattern.UIFactory.WinUIFactory;

public class Main {
    

    public static void main(String[] args){
        Application application = new Application(new WinUIFactory());
        application.paint();

        Application application2 = new Application(new MacUIFactory());
        application2.paint();
    }
}
