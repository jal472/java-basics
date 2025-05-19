package com.jacklocasto.javabasics.zoo.fish;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Swimmer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClownFishTest {
    @Test
    void makeSound_clownfish_test() {
        Animal animal = new ClownFish();
        Assertions.assertEquals("ClownFish is glubbing...", animal.makeSound());
    }

    @Test
    void swim_clownfish_test() {
        Swimmer animal = new ClownFish();
        Assertions.assertEquals("ClownFish is swimming...", animal.swim());
    }
}
