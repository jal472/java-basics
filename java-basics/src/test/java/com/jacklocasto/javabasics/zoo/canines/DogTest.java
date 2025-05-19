package com.jacklocasto.javabasics.zoo.canines;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Walker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DogTest {
    @Test
    void makeSound_dog_test() {
        Animal animal = new Dog();
        Assertions.assertEquals("Dog is barking...", animal.makeSound());
    }

    @Test
    void walk_dog_test(){
        Walker animal = new Dog();
        Assertions.assertEquals("Dog is walking...", animal.walk());
    }
}
