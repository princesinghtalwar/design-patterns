package com.design_pattern.factory.vehicle_creation_factory;

public class Driver {
    public static void main(String[] args) {
       VehicleFactory vehicleFactory = new TwoWheelerVehicleFactory();
        Client client = new Client(vehicleFactory);
        var twoVehicle = client.getVehicle();
        twoVehicle.printVehicle();

        VehicleFactory vehicleFactory1 = new FourWheelerVehicleFactory();
        Client client1 = new Client(vehicleFactory1);
        var fourWheeler = client1.getVehicle();
        fourWheeler.printVehicle();
    }
}
