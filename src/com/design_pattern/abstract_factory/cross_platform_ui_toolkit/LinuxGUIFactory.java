package com.design_pattern.abstract_factory.cross_platform_ui_toolkit;

//CONCRETE FACTORY
public class LinuxGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }

    @Override
    public TextField createTextField() {
        return new LinuxTextField();
    }
}
