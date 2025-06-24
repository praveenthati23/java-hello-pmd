package com.example;

public class HelloWorld {
    public static void main(String[] args) {
        greet("World");
    }

    public static void greet(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Hello!");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
}

