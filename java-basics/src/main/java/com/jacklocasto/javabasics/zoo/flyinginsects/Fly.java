package com.jacklocasto.javabasics.zoo.flyinginsects;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Flyer;

public class Fly implements Animal, Flyer {
    // Implementation of makeSound from Animal Interface
    @Override
    public String makeSound() {
        return "Fly is buzzing...";
    }
    // Implementation of fly from AirAnimal Interface
    @Override
    public String fly() {
        return "Fly is flying, buzz... buzz...";
    }
}
