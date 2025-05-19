package com.jacklocasto.javabasics.zoo.reptiles;

import com.jacklocasto.javabasics.zoo.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PythonTest {
    @Test
    void makeSound_python_test() {
        Animal animal = new Python();
        Assertions.assertEquals("Python is hissing...", animal.makeSound());
    }

    @Test
    void slither_python_test() {
        Snake animal = new Python();
        Assertions.assertEquals("Python is slithering...", animal.slither());
    }
}
