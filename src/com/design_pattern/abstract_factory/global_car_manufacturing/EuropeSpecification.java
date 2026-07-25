package com.design_pattern.abstract_factory.global_car_manufacturing;

//CONCRETE PRODUCT
public class EuropeSpecification implements CarSpecification{
    @Override
    public void display() {
        System.out.println("Europe Car Specification: Fuel efficiency and compliant with local regulations.");
    }
}
