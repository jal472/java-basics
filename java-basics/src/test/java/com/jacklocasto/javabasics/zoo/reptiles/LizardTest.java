package com.jacklocasto.javabasics.zoo.reptiles;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Walker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LizardTest {
    @Test
    void makeSound_lizard_test() {
        Animal animal = new Lizard();
        Assertions.assertEquals("Lizard is hissing...", animal.makeSound());
    }

    @Test
    void walk_lizard_test() {
        Walker animal = new Lizard();
        Assertions.assertEquals("Lizard is walking...", animal.walk());
    }
}
