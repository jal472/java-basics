package com.jacklocasto.javabasics.zoo.fish;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Swimmer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZebraFishTest {
    @Test
    void makeSound_zebrafish_test() {
        Animal animal = new ZebraFish();
        Assertions.assertEquals("ZebraFish is glubbing...", animal.makeSound());
    }

    @Test
    void swim_zebrafish_test() {
        Swimmer animal = new ZebraFish();
        Assertions.assertEquals("ZebraFish is swimming...", animal.swim());
    }
}
