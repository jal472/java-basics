package com.jacklocasto.javabasics.zoo.canines;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Walker;

public class Wolf implements Animal, Walker {
    // Implementation of makeSound from Animal Interface
    @Override
    public String makeSound() {
        return "Wolf is howling...";
    }
    // Implementation of walk from LandAnimal Interface
    @Override
    public String walk() {
        return "Wolf is walking...";
    }
}
