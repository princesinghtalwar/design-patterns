package com.design_pattern.abstract_factory.cross_platform_ui_toolkit;

//CONCRETE PRODUCT
public class LinuxCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Linux Checkbox render");
    }
}
