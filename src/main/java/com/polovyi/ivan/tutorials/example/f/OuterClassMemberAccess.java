package com.polovyi.ivan.tutorials.example.f;

public class OuterClassMemberAccess {

    private static String outerStaticVariable = "outerStaticVariable";
    private String outerInstanceVariable = "staticVariable";
    private String sameNameVariable = "outerSameNameVariable";

    private static void staticOuterMethod() {
        System.out.println("staticOuterMethod");
    }

    private void instanceOuterMethod() {
        System.out.println("instanceOuterMethod");
    }

    private void sameNameMethod() {
        System.out.println("outerSameNameMethod");
    }

    public static void main(String[] args) {
        new OuterClassMemberAccess().new InnerClass().innerMethod();
    }

    class InnerClass {

        private String sameNameVariable = "innerSameNameVariable";

        private void sameNameMethod() {
            System.out.println("innerSameNameMethod");
        }

        void innerMethod() {
            System.out.println("Inside inner method:");
            System.out.println("outerStaticVariable = " + outerStaticVariable);
            System.out.println("outerInstanceVariable = " + outerInstanceVariable);
            System.out.println("sameVariable (inner)= " + sameNameVariable);
            System.out.println("sameVariable (outer) = " + OuterClassMemberAccess.this.sameNameVariable);
            staticOuterMethod();
            instanceOuterMethod();
            this.sameNameMethod();
            OuterClassMemberAccess.this.sameNameMethod();
        }
    }
}
