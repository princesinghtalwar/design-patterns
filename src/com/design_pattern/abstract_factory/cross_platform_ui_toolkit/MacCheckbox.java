package com.design_pattern.abstract_factory.cross_platform_ui_toolkit;

//CONCRETE PRODUCT
public class MacCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("MacOS Checkbox render");
    }
}
