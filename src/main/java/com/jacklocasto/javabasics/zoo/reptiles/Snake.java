package com.jacklocasto.javabasics.zoo.reptiles;

import com.jacklocasto.javabasics.zoo.Animal;

public abstract class Snake implements Animal {
    protected String species;

    public Snake(String species) {
        this.species = species;
    }
    // Implementation of makeSound from Animal Interface
    @Override
    public String makeSound() {
        return this.species + " is hissing...";
    }
    // Notice, walk is not implemented here. That is because snakes don't walk but they are still land animals.
    // Instead, snakes slither().
    public abstract String slither();
}
