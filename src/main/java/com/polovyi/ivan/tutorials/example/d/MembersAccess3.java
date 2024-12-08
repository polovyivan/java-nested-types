package com.polovyi.ivan.tutorials.example.d;


public class MembersAccess3 {

    private static String testStaticField = "testOuterStaticField";
    private String testInstanceField = "testOuterInstanceField";

    public static class StaticMemberClassPublic {

        private static String testStaticField = "testNestedStaticField";
        private String testInstanceField = "testNestedInstanceField";

        public static void main(String[] args) {
            System.out.println(testStaticField);
            System.out.println(new StaticMemberClassPublic().testInstanceField);
            System.out.println(MembersAccess3.testStaticField);
            System.out.println(new MembersAccess3().testInstanceField);
            // Output:
            // testNestedStaticField
            // testNestedInstanceField
            // testOuterStaticField
            // testOuterInstanceField
        }
    }
}
