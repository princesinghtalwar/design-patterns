package com.design_pattern.abstract_factory.global_car_manufacturing;

//CONCRETE PRODUCT
public class Sedan implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling sedan car");
    }
}
