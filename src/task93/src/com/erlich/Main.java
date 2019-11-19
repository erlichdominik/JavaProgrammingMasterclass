package com.erlich;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(40,false);

        System.out.println(printer.isDuplex());
    }
}
