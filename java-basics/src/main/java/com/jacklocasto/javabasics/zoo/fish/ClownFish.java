package com.jacklocasto.javabasics.zoo.fish;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Swimmer;

public class ClownFish implements Animal, Swimmer {
    @Override
    public String makeSound() {
        return "ClownFish is glubbing...";
    }

    @Override
    public String swim() {
        return "ClownFish is swimming...";
    }
}
