package com.design_pattern.abstract_factory.cross_platform_ui_toolkit;

public class GUIApplication {
    private final GUIFactory guiFactory;

    public GUIApplication(GUIFactory guiFactory){
        this.guiFactory = guiFactory;
    }

    public void renderUI(){
        Button button = this.guiFactory.createButton();
        Checkbox checkbox = this.guiFactory.createCheckbox();
        TextField textField = this.guiFactory.createTextField();

        button.onclick();
        button.render();
        checkbox.render();
        textField.render();
    }

}
