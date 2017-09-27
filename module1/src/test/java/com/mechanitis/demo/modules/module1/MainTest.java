package com.mechanitis.demo.modules.module1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void shouldReturnCorrectName() {
        final Main main = new Main();

        Assertions.assertEquals("Module 1", main.getName());
    }

}