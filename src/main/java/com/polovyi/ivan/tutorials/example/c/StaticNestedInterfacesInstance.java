package com.polovyi.ivan.tutorials.example.c;


import com.polovyi.ivan.tutorials.example.c.StaticMemberTypesInClass.StaticMemberInterfacePackagePrivate;

public class StaticNestedInterfacesInstance implements
        // StaticMemberTypesInClass.StaticMemberInterfacePrivate, // won't compile
        StaticMemberInterfacePackagePrivate,
        StaticMemberTypesInClass.StaticMemberInterfaceProtected,
        StaticMemberTypesInClass.StaticMemberInterfacePublic,
        StaticMemberTypesInInterface.StaticMemberInterface {

    public static void main(String[] args) {
        StaticMemberTypesInClass.StaticMemberInterfacePackagePrivate inst1 = new StaticNestedInterfacesInstance();
        StaticMemberTypesInClass.StaticMemberInterfaceProtected inst2 = new StaticNestedInterfacesInstance();
        StaticMemberTypesInClass.StaticMemberInterfacePublic inst3 = new StaticNestedInterfacesInstance();
    }
}
