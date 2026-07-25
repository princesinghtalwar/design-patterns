package com.design_pattern.abstract_factory.global_car_manufacturing;

//CONCRETE FACTORY
public class NorthAmericaCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }
}
