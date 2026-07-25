package com.design_pattern.factory.vehicle_creation_factory;

public class Client {
    private Vehicle pVehicle = null;

    public Client(VehicleFactory vehicleFactory){
        this.pVehicle = vehicleFactory.createVehicle();
    }

    public Vehicle getVehicle(){
       return this.pVehicle;
    }
}
