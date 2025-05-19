package com.jacklocasto.javabasics.zoo.birds;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Flyer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EagleTest {
    @Test
    void makeSound_eagle_test() {
        Animal animal = new Eagle();
        Assertions.assertEquals("Eagle is screeching...", animal.makeSound());
    }

    @Test
    void fly_eagle_test() {
        Flyer animal = new Eagle();
        Assertions.assertEquals("Eagle is flying...", animal.fly());
    }
}
