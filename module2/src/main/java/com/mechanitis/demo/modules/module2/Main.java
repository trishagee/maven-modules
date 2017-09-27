package com.mechanitis.demo.modules.module2;

import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        final Main main = new Main();
        LOGGER.info(main::getName);
    }

    String getName() {
        return "Module 2";
    }
}
