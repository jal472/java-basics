package com.jacklocasto.javabasics.zoo.birds;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Flyer;

public class Cardinal implements Animal, Flyer {
    // Implementation of makeSound from Animal Interface
    @Override
    public String makeSound() {
        return "Cardinal is tweeting...";
    }
    // Implementation of fly from AirAnimal Interface
    @Override
    public String fly() {
        return "Cardinal is flying...";
    }
}
