package com.design_pattern.factory.vehicle_creation_factory;
//CONCRETE PRODUCT
public class TwoWheeler implements Vehicle{
    @Override
    public void printVehicle() {
        System.out.println("I am a two wheeler");
    }
}
