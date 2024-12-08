package com.polovyi.ivan.tutorials.example.h;

class ToExtend {
    void methodInClass() {
        System.out.println("Inside ToExtend class method");
    }
}

interface ToImplement {
    void methodInInterface();
}

public class AnonymousClasses {

    public static void anonymousClassInStaticMethod() {
        System.out.println("Inside static method");
        ToExtend anonynousInstance = new ToExtend() {
            @Override
            void methodInClass() {
                System.out.println("Inside an anonymous class that extends a class");
            }
        };
        anonynousInstance.methodInClass();
        ToImplement anonynousInstance2 = new ToImplement() {
            @Override
            public void methodInInterface() {
                System.out.println("Inside an anonymous class that implements an interface");
            }
        };
        anonynousInstance2.methodInInterface();
    }

    public static void anonymousClassInInstanceMethod() {
        System.out.println("Inside instance method");
        ToExtend anonynousInstance = new ToExtend() {
            @Override
            void methodInClass() {
                System.out.println("Inside an anonymous class that extends a class");
            }
        };
        anonynousInstance.methodInClass();
        ToImplement anonynousInstance2 = new ToImplement() {
            @Override
            public void methodInInterface() {
                System.out.println("Inside an anonymous class that implements an interface");
            }
        };
        anonynousInstance2.methodInInterface();
    }

    public static void main(String[] args) {
        anonymousClassInStaticMethod();
        new AnonymousClasses().anonymousClassInInstanceMethod();
    }
}
