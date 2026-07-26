package com.design_pattern.abstract_factory.cross_platform_ui_toolkit;

//CONCRETE PRODUCT
public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("MacOS Button render");
    }

    @Override
    public void onclick() {
        System.out.println("MacOS Button click");
    }
}
