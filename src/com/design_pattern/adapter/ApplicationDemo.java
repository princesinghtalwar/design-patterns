package com.design_pattern.adapter;

//CLIENT
public class ApplicationDemo {

    public static void clientCode(Printer printer){
        printer.print();
    }

    public static void main(String[] args) {
        PrinterAdapter printerAdapter = new PrinterAdapter();
        clientCode(printerAdapter);

    }
}
