package com.design_pattern.abstract_factory.cross_platform_ui_toolkit;

//CONCRETE PRODUCT
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows Button render");
    }

    @Override
    public void onclick() {
        System.out.println("Windows Button Click");
    }
}
