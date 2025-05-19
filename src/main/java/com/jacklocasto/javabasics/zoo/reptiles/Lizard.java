package com.jacklocasto.javabasics.zoo.reptiles;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Walker;

public class Lizard implements Animal, Walker {
    // Implementation of makeSound from Animal Interface
    @Override
    public String makeSound() {
        return "Lizard is hissing...";
    }
    // Implementation of walk from LandAnimal Interface
    @Override
    public String walk() {
        return "Lizard is walking...";
    }
}
