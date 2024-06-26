package DesignPattern.AbstractFactoryDesignPattern.Application;

import DesignPattern.AbstractFactoryDesignPattern.UIFactory.UIFactory;

public class Application {
    

    private Button button;
    
    private CheckBox checkBox;


    // Constructor
    public Application(UIFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
