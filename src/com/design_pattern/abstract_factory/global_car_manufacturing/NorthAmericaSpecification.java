package com.design_pattern.abstract_factory.global_car_manufacturing;

//CONCRETE PRODUCT
public class NorthAmericaSpecification implements CarSpecification{
    @Override
    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local regulations.");
    }
}
