package com.polovyi.ivan.tutorials.example.g;

public class InnerLocalClass {

    static {
        // InnerClass innerClass = new InnerClass(); // won't compile
        class InnerClass {
            private static String field="staticField";
            private int field1;
            public int field2;
        }
        final class FinalInnerClass {}
        abstract class AbstractInnerClass {}
        // static class InnerClass {} // won't compile
        // private class InnerClass {} // won't compile
        InnerClass innerClass = new InnerClass();
        int field1 = innerClass.field1;
        int field2 = innerClass.field2;
        String staticField = InnerClass.field;
    }

    {
        class InnerClass {
            private static String field="staticField";
            private int field1;
            public int field2;
        }
        final class FinalInnerClass {}
        abstract class AbstractInnerClass {}
        // static class InnerClass {} // won't compile
        // private class InnerClass {} // won't compile
        InnerClass innerClass = new InnerClass();
        int field1 = innerClass.field1;
        int field2 = innerClass.field2;
        String staticField = InnerClass.field;
    }

    InnerLocalClass() {
        class InnerClass {}
    }

    static void staticMethod() {
        class InnerClass {}
    }

    static void instanceMethod() {
        class InnerClass {}
    }

}
