package com.polovyi.ivan.tutorials.example.h;

public class AnonymousClassWithConstructor {

    class ToExtend {

        String instanceVariable;

        public ToExtend(String instanceVariable) {
            this.instanceVariable = instanceVariable;
        }

        void methodInClass() {
            System.out.println("Inside ToExtend class method");
        }
    }

    void instanceMethod() {
        ToExtend anonymousClass = new ToExtend("Hello") {
            @Override
            void methodInClass() {
                System.out.println("instanceVariable: " + instanceVariable);
            }
        };
        anonymousClass.methodInClass();

        ToExtend anonymousClass2 = new ToExtend("Hello") {

            static String anonymousStaticVariable = "anonymousStaticVariable";
            String anonymousInstanceVariable = "anonymousInstanceVariable";
            String anonymousInstanceVariable2;

            {
                anonymousInstanceVariable2 = "anonymousInstanceVariable2";
            }

            @Override
            void methodInClass() {
                System.out.println("instanceVariable: " + instanceVariable);
                System.out.println("anonymousStaticVariable: " + anonymousStaticVariable);
                System.out.println("anonymousInstanceVariable: " + anonymousInstanceVariable);
                System.out.println("anonymousInstanceVariable2: " + anonymousInstanceVariable2);
            }
        };
        anonymousClass2.methodInClass();
    }

    public static void main(String[] args) {
        new AnonymousClassWithConstructor().instanceMethod();
    }
}
