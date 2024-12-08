package com.polovyi.ivan.tutorials.example.d;


public class MembersAccess2 {

    // private static String outerStaticField = innerStaticField; // won't compile
    private static String outerStaticField = StaticMemberClassPublic.innerStaticField;
    private String outerInstanceField = new StaticMemberClassPublic().innerInstanceField;
    // private String outerInstanceField = innerInstanceField; // won't compile

    public static class StaticMemberClassPublic {

        private static String innerStaticField = "outerStaticField";
        private String innerInstanceField = "innerInstanceField";
    }
}
