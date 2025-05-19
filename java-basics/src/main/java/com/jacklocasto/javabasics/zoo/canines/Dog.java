package com.jacklocasto.javabasics.zoo.canines;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Walker;

public class Dog implements Animal, Walker {
    // Implementation of makeSound from Animal Interface
    @Override
    public String makeSound() {
        return "Dog is barking...";
    }
    // Implementation of walk from LandAnimal Interface
    @Override
    public String walk() {
        return "Dog is walking...";
    }
}
