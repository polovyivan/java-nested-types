package com.polovyi.ivan.tutorials.example.d;

import java.util.stream.DoubleStream;

public class MembersAccess4 {

    private static String outerStaticField1 = StaticMemberClassPublic.NestedInterface.TEST_NESTED_INTERFACE;
    private static String outerStaticField2 = "outerStaticField2";

    public static void main(String[] args) {
        System.out.println(StaticMemberClassPublic.NestedInterface.getOuterStaticField());
        // Output:
        // outerStaticField2
    }

    public static class StaticMemberClassPublic {

        interface NestedInterface {

            String TEST_NESTED_INTERFACE = "testInnerStaticField";

            static String getOuterStaticField() {
                return outerStaticField2;
            }
        }

    }
}
