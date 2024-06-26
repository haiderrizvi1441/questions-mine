package DesignPattern.AbstractFactoryDesignPattern.UIFactory;

import DesignPattern.AbstractFactoryDesignPattern.Application.Button;
import DesignPattern.AbstractFactoryDesignPattern.Application.CheckBox;

public interface UIFactory {
    
    Button createButton();
    CheckBox createCheckBox();
}
