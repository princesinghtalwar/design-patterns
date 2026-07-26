package com.design_pattern.abstract_factory.cross_platform_ui_toolkit;

//CONCRETE PRODUCT
public class LinuxTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Linux TextField render");
    }
}
