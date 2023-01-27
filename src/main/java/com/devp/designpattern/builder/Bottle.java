package com.devp.designpattern.builder;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
