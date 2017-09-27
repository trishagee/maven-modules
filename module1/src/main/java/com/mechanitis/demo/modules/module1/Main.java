package com.mechanitis.demo.modules.module1;

public class Main {
    public static void main(String[] args) {
        final Main main = new Main();
        System.out.println(main.getName());
    }

    String getName() {
        return "Module 1";
    }
}
