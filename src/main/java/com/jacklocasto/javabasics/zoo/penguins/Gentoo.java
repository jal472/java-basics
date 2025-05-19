package com.jacklocasto.javabasics.zoo.penguins;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Swimmer;
import com.jacklocasto.javabasics.zoo.Walker;

public class Gentoo implements Animal, Walker, Swimmer {
    @Override
    public String makeSound() {
        return "Gentoo Penguin is making the sound: WAAAHHH...";
    }

    @Override
    public String swim() {
        return "Gentoo Penguin is swimming...";
    }

    @Override
    public String walk() {
        return "Gentoo Penguin is walking...";
    }
}
