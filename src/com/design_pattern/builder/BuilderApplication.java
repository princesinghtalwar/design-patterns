package com.design_pattern.builder;

//CLIENT
public class BuilderApplication {
    public static void main(String[] args) {
        //CREATE GAMING PC
        Builder gamingGuilder = new GamingComputerBuilder();
        Director director = new Director();//SHARED/REUSABLE
        director.construct(gamingGuilder);
        var gaminComputer = gamingGuilder.getComputer();
        gaminComputer.displayInfo();

        //CREATE GENERAL PC
        Builder generalBuilder = new GeneralComputerBuilder();
        director.construct(generalBuilder);
        var generalComputer = generalBuilder.getComputer();
        generalComputer.displayInfo();
    }
}
