package com.polovyi.ivan.tutorials.example.a;

public class EnclosingConstructor {

    public EnclosingConstructor() {
        class InnerConstructorClass {

        }
    }

    static {
        class LocalClass {

            void display() {
                System.out.println("Static initialization block.");
            }
        }
    }

    {
        class LocalClass {

            void display() {
                System.out.println("Instance initialization block.");
            }
        }
    }

    public void conditionExample(boolean condition) {
        if (condition) {
            class IfLocalClass {

                void display() {
                    System.out.println("Local class in an if block.");
                }
            }
        }
    }

    public void loopExample() {
        for (int i = 0; i < 5; i++) {
             class LoopLocalClass {

                void display() {
                    System.out.println("Local class in a loop.");
                }
            }
        }
    }

    Runnable runnable = () -> {
        class LocalClass {

            void print() {
                System.out.println("Hello");
            }
        }
        new LocalClass().print();
    };
}
