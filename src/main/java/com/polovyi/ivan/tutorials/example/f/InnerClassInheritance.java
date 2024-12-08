package com.polovyi.ivan.tutorials.example.f;

public class InnerClassInheritance {

    String sameNameVariable = "outerSameNameVariable";

    public static void main(String[] args) {
        new InnerClassInheritance().new InnerClass().innerMethod();
    }

    class InnerClass extends SuperOfInnerClass implements InterfaceOfInnerClass {

        String sameNameVariable = "innerSameNameVariable";

        void innerMethod() {
            System.out.println("Inside inner method:");
            System.out.println("outer variable: " + InnerClassInheritance.this.sameNameVariable);
            System.out.println("inner variable: " + this.sameNameVariable); // "this" is optional
            System.out.println("super variable: " + super.sameNameVariable);
        }
    }
}

class SuperOfInnerClass {
    String sameNameVariable = "superSameNameVariable";
}

interface InterfaceOfInnerClass {}