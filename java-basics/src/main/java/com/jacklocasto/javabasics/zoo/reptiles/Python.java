package com.jacklocasto.javabasics.zoo.reptiles;

public class Python extends Snake {
    // Constructor
    public Python() {
        super("Python");
    }
    @Override
    public String slither() {
        return this.species +" is slithering...";
    }
}
