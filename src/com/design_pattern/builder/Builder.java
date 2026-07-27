package com.design_pattern.builder;

//BUILDER
public interface Builder {
    void buildCpu();
    void buildRam();
    void buildStorage();
    Computer getComputer();
}
