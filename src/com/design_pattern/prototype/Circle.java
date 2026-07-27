package com.design_pattern.prototype;

//CONCRETE PROTOTYPE
public class Circle implements Shape{
    private final String color;

    public Circle(String color){
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Circle(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a "+color+" color circle");
    }
}
