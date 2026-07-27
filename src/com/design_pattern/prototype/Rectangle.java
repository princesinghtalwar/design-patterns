package com.design_pattern.prototype;

//CONCRETE PROTOTYPE
public class Rectangle implements Shape{

    private final String color;

    public Rectangle(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Rectangle(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a "+color+" color rectangle");
    }
}
