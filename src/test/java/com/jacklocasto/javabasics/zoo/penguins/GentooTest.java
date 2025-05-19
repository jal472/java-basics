package com.jacklocasto.javabasics.zoo.penguins;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Swimmer;
import com.jacklocasto.javabasics.zoo.Walker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GentooTest {
    @Test
    void makeSound_gentoo_test() {
        Animal animal = new Gentoo();
        Assertions.assertEquals("Gentoo Penguin is making the sound: WAAAHHH...", animal.makeSound());
    }

    @Test
    void walk_gentoo_test() {
        Walker animal = new Gentoo();
        Assertions.assertEquals("Gentoo Penguin is walking...", animal.walk());
    }

    @Test
    void swim_gentoo_test() {
        Swimmer animal = new Gentoo();
        Assertions.assertEquals("Gentoo Penguin is swimming...", animal.swim());
    }
}
