package com.design_pattern.prototype;

//CLIENT
public class ShapeClient {
    private Shape prototypeShape;

    public ShapeClient(Shape prototypeShape){
        this.prototypeShape = prototypeShape;
    }

    public Shape createShape(){
        return prototypeShape.clone();
    }
}
