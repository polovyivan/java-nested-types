package com.polovyi.ivan.tutorials.example.c;


import com.polovyi.ivan.tutorials.example.c.StaticMemberTypesInClass.StaticMemberClassPackagePrivate;

public class StaticNestedClassesInstance {

    public static void main(String[] args) {
        // new StaticMemberTypesInClass.StaticMemberClassPrivate();
        StaticMemberClassPackagePrivate inst1 = new StaticMemberClassPackagePrivate();
        new StaticMemberTypesInClass.StaticMemberClassProtected();
        new StaticMemberTypesInClass.StaticMemberClassPublic();

    }
}
