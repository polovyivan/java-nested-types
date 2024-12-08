package com.polovyi.ivan.tutorials.example.g;

public class InnerLocalClassAccess {

    static String outerStaticField = "outerStaticField";
    String outerInstanceField = "outerInstanceField";

    static void staticMethod() {
        final String finalField = "finalField";
        String effectivellyFinal = "effectivellyFinal";
        String nonFinalField = "nonFinalField";
        nonFinalField = "nonFinalFieldRedeclared";
        String nonFinalFieldWithoutValue;
        String sameNameField = "sameNameFieldEnclosingBlock";
        class InnerClass {

            void method() {
                System.out.println("finalField" + finalField);
                System.out.println("effectivellyFinal" + effectivellyFinal);
                // System.out.println("nonFinalField" + nonFinalField); // won't compile
                // System.out.println("nonFinalField" + nonFinalFieldWithoutValue); // won't compile
                System.out.println("outerStaticField = " + outerStaticField);
                System.out.println("sameNameField" + sameNameField);
                // System.out.println("outerInstanceField = " + outerInstanceField); // won't compile
            }
        }
    }

    void instanceMethod() {

        final String finalField = "finalField";
        String effectivellyFinal = "effectivellyFinal";
        String nonFinalField = "nonFinalField";
        nonFinalField = "nonFinalFieldRedeclared";
        String nonFinalFieldWithoutValue;
        String sameNameField = "sameNameFieldEnclosingBlock";
        class InnerClass {

            String sameNameField = "sameNameFieldInnerClass";

            void method() {
                System.out.println("finalField" + finalField);
                System.out.println("effectivellyFinal" + effectivellyFinal);
                // System.out.println("nonFinalField" + nonFinalField); // won't compile
                // System.out.println("nonFinalField" + nonFinalFieldWithoutValue); // won't compile
                System.out.println("sameNameField" + sameNameField);
                System.out.println("outerStaticField = " + outerStaticField);
                System.out.println("outerInstanceField = " + outerInstanceField);
            }
        }

    }
}
