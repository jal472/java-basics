package com.jacklocasto.javabasics.zoo.penguins;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Walker;
import com.jacklocasto.javabasics.zoo.Swimmer;
import com.jacklocasto.javabasics.zoo.fish.ClownFish;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmperorTest {
    @Test
    void makeSound_emperor_test() {
        Animal animal = new Emperor();
        Assertions.assertEquals("Emperor Penguin is making the sound: WAAAHHH...", animal.makeSound());
    }

    @Test
    void walk_emperor_test() {
        Walker animal = new Emperor();
        Assertions.assertEquals("Emperor Penguin is walking...", animal.walk());
    }

    @Test
    void swim_emperor_test() {
        Swimmer animal = new Emperor();
        Assertions.assertEquals("Emperor Penguin is swimming...", animal.swim());
    }
}
