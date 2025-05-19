package com.jacklocasto.javabasics.zoo.flyinginsects;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Flyer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BeeTest {
    @Test
    void makeSound_bee_test() {
        Animal animal = new Bee();
        Assertions.assertEquals("Bee is buzzing...", animal.makeSound());
    }

    @Test
    void fly_bee_test(){
        Flyer animal = new Bee();
        Assertions.assertEquals("Bee is flying, buzz... buzz...", animal.fly());
    }
}
