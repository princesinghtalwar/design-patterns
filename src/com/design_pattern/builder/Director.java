package com.design_pattern.builder;

//DIRECTOR
public class Director {
    public void construct(Builder builder){
        builder.buildCpu();
        builder.buildRam();
        builder.buildStorage();
    }
}
