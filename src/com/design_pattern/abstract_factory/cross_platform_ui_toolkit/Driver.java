package com.design_pattern.abstract_factory.cross_platform_ui_toolkit;

public class Driver {
    public static void main(String[] args) {
        //CREATE WINDOWS UI
        GUIFactory guiFactory = new WindowsGUIFactory();
        GUIApplication windowsGUIApplication = new GUIApplication(guiFactory);
        windowsGUIApplication.renderUI();

        System.out.println("===============================");

        //CREATE MacOS UI
        GUIFactory macGuiFactory = new MacGUIFactory();
        GUIApplication macGuiApplication = new GUIApplication(macGuiFactory);
        macGuiApplication.renderUI();

        System.out.println("===============================");

        //CREATE LINUX UI
        GUIFactory linuxGuiFactory = new LinuxGUIFactory();
        GUIApplication linuxGuiApplication = new GUIApplication(linuxGuiFactory);
        linuxGuiApplication.renderUI();

    }
}
