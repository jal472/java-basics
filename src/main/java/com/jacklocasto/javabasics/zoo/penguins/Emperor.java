package com.jacklocasto.javabasics.zoo.penguins;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Swimmer;
import com.jacklocasto.javabasics.zoo.Walker;

public class Emperor implements Animal, Walker, Swimmer {
    @Override
    public String makeSound() {
        return "Emperor Penguin is making the sound: WAAAHHH...";
    }

    @Override
    public String swim() {
        return "Emperor Penguin is swimming...";
    }

    @Override
    public String walk() {
        return "Emperor Penguin is walking...";
    }
}
