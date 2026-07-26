package com.design_pattern.abstract_factory.cross_platform_ui_toolkit;

//CONCRETE PRODUCT
public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Linux Button render");
    }

    @Override
    public void onclick() {
        System.out.println("Linux Button click");
    }
}
