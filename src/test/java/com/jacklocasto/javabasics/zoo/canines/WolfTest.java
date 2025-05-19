package com.jacklocasto.javabasics.zoo.canines;

import com.jacklocasto.javabasics.zoo.Animal;
import com.jacklocasto.javabasics.zoo.Walker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WolfTest {
    @Test
    void makeSound_wolf_test() {
        Animal animal = new Wolf();
        Assertions.assertEquals("Wolf is howling...", animal.makeSound());
    }

    @Test
    void walk_wolf_test(){
        Walker animal = new Wolf();
        Assertions.assertEquals("Wolf is walking...", animal.walk());
    }
}
