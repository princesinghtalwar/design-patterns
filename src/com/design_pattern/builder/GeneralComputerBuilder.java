package com.design_pattern.builder;

//CONCRETE BUILDER
public class GeneralComputerBuilder implements Builder{

    private final Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("General Computer");
    }

    @Override
    public void buildRam() {
        computer.setRam("8GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("500GB SSD");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
