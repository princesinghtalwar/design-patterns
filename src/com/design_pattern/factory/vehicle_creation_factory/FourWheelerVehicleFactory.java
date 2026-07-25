package com.design_pattern.factory.vehicle_creation_factory;

public class FourWheelerVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
