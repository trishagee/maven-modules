package com.mechanitis.demo.modules.module2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void shouldReturnCorrectName() {
        final Main main = new Main();

        Assertions.assertEquals("Module 2", main.getName());
    }

}