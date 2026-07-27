package com.design_pattern.builder;

//CONCRETE BUILDER
public class GamingComputerBuilder implements Builder{

    private final Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("Gaming CPU");
    }

    @Override
    public void buildRam() {
        computer.setRam("16GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
