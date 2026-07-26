package com.design_pattern.abstract_factory.global_car_manufacturing;

//GUIApplication Code
public class CarFactoryClient {
    public static void main(String[] args) {
        //Create Cars for North America
        CarFactory northAmericaCarFactory = new NorthAmericaCarFactory();
        CarSpecification northAmericaCarSpecification = new NorthAmericaSpecification();
        var northAmericaCar = northAmericaCarFactory.createCar();
        var northAmericaSpecification = northAmericaCarFactory.createSpecification();
        northAmericaCar.assemble();
        northAmericaSpecification.display();

        System.out.println("=====================================");

        //create cars for Europe
        CarFactory europeCarFactory = new EuropeCarFactory();
        var hatchbackCar = europeCarFactory.createCar();
        var europeSpecification = europeCarFactory.createSpecification();
        hatchbackCar.assemble();
        europeSpecification.display();


    }
}
