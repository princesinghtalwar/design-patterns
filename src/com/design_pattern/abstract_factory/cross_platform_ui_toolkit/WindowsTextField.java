package com.design_pattern.abstract_factory.cross_platform_ui_toolkit;

public class WindowsTextField implements TextField{
    @Override
    public void render() {
        System.out.println("Windows TextField render");
    }
}
