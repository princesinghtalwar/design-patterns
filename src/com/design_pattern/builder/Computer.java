package com.design_pattern.builder;

//PRODUCT
public class Computer {
    private String cpu;
    private String ram;
    private String storage;

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void displayInfo() {
        System.out.println( "Computer{" +
                "\ncpu='" + cpu + '\'' +
                ",\nram='" + ram + '\'' +
                ", \nstorage='" + storage + '\'' +
                "\n"+'}');
    }
}
