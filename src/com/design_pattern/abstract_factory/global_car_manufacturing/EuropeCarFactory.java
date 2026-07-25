package com.design_pattern.abstract_factory.global_car_manufacturing;

//CONCRETE FACTORY
public class EuropeCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}
