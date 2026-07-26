package com.design_pattern.abstract_factory.cross_platform_ui_toolkit;

//ABSTRACT FACTORY
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
    TextField createTextField();
}
