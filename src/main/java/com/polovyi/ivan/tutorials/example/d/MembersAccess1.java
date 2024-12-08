package com.polovyi.ivan.tutorials.example.d;


public class MembersAccess1 {

    private static String outerStaticField = "outerStaticField";
    private String outerInstanceField = "innerInstanceField";

    public static class StaticMemberClassPublic {

        static String innerStaticField = outerStaticField;
        static String innerInstanceField2 = new MembersAccess1().outerInstanceField;
        // String innerInstanceField = outerInstanceField; // won't compile
        // String innerInstanceField = this.outerInstanceField; // won't compile
        String innerInstanceField = new MembersAccess1().outerInstanceField;

    }

}
