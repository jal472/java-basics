package com.jacklocasto.javabasics.zoo.flyinginsects;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Flyer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlyTest {
    @Test
    void makeSound_fly_test() {
        Animal animal = new Fly();
        Assertions.assertEquals("Fly is buzzing...", animal.makeSound());
    }

    @Test
    void fly_fly_test(){
        Flyer animal = new Fly();
        Assertions.assertEquals("Fly is flying, buzz... buzz...", animal.fly());
    }
}
