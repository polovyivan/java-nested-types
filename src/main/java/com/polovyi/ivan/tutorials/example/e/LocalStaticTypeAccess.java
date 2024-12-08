package com.polovyi.ivan.tutorials.example.e;

public class LocalStaticTypeAccess {

    private static String privateStaticClassField = "privateStaticClassField";
    private String privateInstanceClassField = "privateInstanceClassField";

    private static void classStaticMethod() {
        System.out.println("Inside classStaticMethod ");
    }

    private void classInstanceMethod() {
        System.out.println("Inside classInstanceMethod ");
    }

    public static void main(String[] args) {
        String localVariableField = "localVariableField";
        String localFinalVariableField = "localFinalVariableField";

        interface LocalInterface {

            default void introduce() {
                System.out.println("Inside LocalInterface method:");
            }

            default void method() {
                this.introduce();
                classStaticMethod();
                // classInstanceMethod(); // won't compile
                // this.classInstanceMethod(); // won't compile
                System.out.println("privateStaticField = " + privateStaticClassField);
                // System.out.println("privateInstanceClassField = " + privateInstanceClassField); // won't compile
                // System.out.println("localVariableField = " + localVariableField); // won't compile
                // System.out.println("localFinalVariableField = " + localFinalVariableField); // won't compile
            }
        }
        enum LocalEnumType {
            CONST_1;

            void introduce() {
                System.out.println("Inside LocalEnumType method:");
            }

            void method() {
                this.introduce();
                classStaticMethod();
                // classInstanceMethod(); // won't compile
                // this.classInstanceMethod(); // won't compile
                System.out.println("privateStaticField = " + privateStaticClassField);
                // System.out.println("privateInstanceClassField = " + privateInstanceClassField); // won't compile
                // System.out.println("localVariableField = " + localVariableField); // won't compile
                // System.out.println("localFinalVariableField = " + localFinalVariableField); // won't compile
            }
        }
        record LocalRecord() {

            void introduce() {
                System.out.println("Inside LocalRecord method:");
            }

            void method() {
                this.introduce();
                classStaticMethod();
                // classInstanceMethod(); // won't compile
                // this.classInstanceMethod(); // won't compile
                System.out.println("privateStaticField = " + privateStaticClassField);
                // System.out.println("privateInstanceClassField = " + privateInstanceClassField); // won't compile
                // System.out.println("localVariableField = " + localVariableField); // won't compile
                // System.out.println("localFinalVariableField = " + localFinalVariableField); // won't compile
            }
        }

        // init types
        class LocalInterfaceImpl implements LocalInterface {}
        new LocalInterfaceImpl().method();
        LocalEnumType.CONST_1.method();
        new LocalRecord().method();

    }
}
