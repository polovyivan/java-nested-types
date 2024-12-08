package com.polovyi.ivan.tutorials.example.a;

public class EnclosingClass {

    int outerField;

    // Inner class within EnclosingClass, with EnclosingClass as the enclosing context
    class InnerClass {

        void accessOuter() {
            // Accessing the outer class field within the inner class
            outerField = 10;
        }
    }
}
