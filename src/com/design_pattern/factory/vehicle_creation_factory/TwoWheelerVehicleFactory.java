package com.design_pattern.factory.vehicle_creation_factory;
//CONCRETE CREATOR
public class TwoWheelerVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
