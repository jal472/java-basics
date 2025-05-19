package com.jacklocasto.javabasics.zoo.flyinginsects;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Flyer;

public class Bee implements Animal, Flyer {
    // Implementation of makeSound from Animal Interface
    @Override
    public String makeSound() {
        return "Bee is buzzing...";
    }
    // Implementation of fly from AirAnimal Interface
    @Override
    public String fly() {
        return "Bee is flying, buzz... buzz...";
    }
}
