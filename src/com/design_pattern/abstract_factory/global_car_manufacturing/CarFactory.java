package com.design_pattern.abstract_factory.global_car_manufacturing;

//ABSTRACT FACTORY
public interface CarFactory {
    Car createCar();
    CarSpecification createSpecification();
}
