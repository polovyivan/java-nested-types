package com.polovyi.ivan.tutorials.example.a;

public class EnclosingMethod {
    void method() {
        // Local class within the method, with the method as the enclosing context
        class LocalClass {
            void display() {
                System.out.println("This is a local class.");
            }
        }
    }
}
