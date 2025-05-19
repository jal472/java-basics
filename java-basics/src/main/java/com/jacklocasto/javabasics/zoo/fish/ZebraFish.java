package com.jacklocasto.javabasics.zoo.fish;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Swimmer;

public class ZebraFish implements Animal, Swimmer {

    @Override
    public String makeSound() {
        return "ZebraFish is glubbing...";
    }

    @Override
    public String swim() {
        return "ZebraFish is swimming...";
    }
}
