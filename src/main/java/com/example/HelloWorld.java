package com.example;

public class HelloWorld {
    public static void main(String[] args) {
        greet("World");
    }

    public static void greet(String name) {
        // PMD violation: unused variable
        String unused = "badCode";

        System.out.println("Hello, " + name + "!");
    }
}

