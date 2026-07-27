package com.design_pattern.prototype;

//DRIVER
public class Application {
    public static void main(String[] args) {

        //CREATE RED CIRCLE
        Shape redCirclePrototype = new Circle("red");
        ShapeClient redDCircleClient = new ShapeClient(redCirclePrototype);
        var redCircle = redDCircleClient.createShape();
        redCircle.draw();

        //CREATE BLUE CIRCLE
        Shape blueCirclePrototype = new Circle("blue");
        ShapeClient blueCircleShapeClient = new ShapeClient(blueCirclePrototype);
        var blueCircleShape = blueCircleShapeClient.createShape();
        blueCircleShape.draw();

        //CREATE GREEN RECTANGLE
        Shape greenRectanglePrototype = new Rectangle("green");
        ShapeClient greenRectangleClient = new ShapeClient(greenRectanglePrototype);
        var greenRectangleShape = greenRectangleClient.createShape();
        greenRectangleShape.draw();
    }
}
