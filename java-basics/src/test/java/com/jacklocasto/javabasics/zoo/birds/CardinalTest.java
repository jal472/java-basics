package com.jacklocasto.javabasics.zoo.birds;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Flyer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardinalTest {
    @Test
    void makeSound_cardinal_test(){
        Animal animal = new Cardinal();
        Assertions.assertEquals("Cardinal is tweeting...", animal.makeSound());
    }

    @Test
    void fly_cardinal_test(){
        Flyer animal = new Cardinal();
        Assertions.assertEquals("Cardinal is flying...", animal.fly());
    }
}
