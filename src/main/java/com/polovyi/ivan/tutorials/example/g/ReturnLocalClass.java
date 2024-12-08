package com.polovyi.ivan.tutorials.example.g;

public class ReturnLocalClass {

    SuperClassForLocalClass returnLocalClassExtendingClass() {
        class LocalClass extends SuperClassForLocalClass {}
        return new LocalClass();
    }

    InterfaceForLocalClass returnLocalClassImplementingInterface() {
        class LocalClass implements InterfaceForLocalClass {}
        return new LocalClass();
    }
}

class SuperClassForLocalClass {}

interface InterfaceForLocalClass {}