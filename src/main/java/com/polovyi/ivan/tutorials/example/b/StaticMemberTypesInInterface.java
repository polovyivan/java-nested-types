package com.polovyi.ivan.tutorials.example.b;

public interface StaticMemberTypesInInterface {

    // private static class StaticMemberClassPrivate {} // won't compile
    // protected static class StaticMemberClassProtected {} // won't compile
    class StaticMemberClass {}

    // private interface StaticMemberInterfacePrivate {} // won't compile
    // protected interface StaticMemberInterfaceProtected {} // won't compile
    interface StaticMemberInterface {}

    // private enum StaticMemberEnumPrivate {} // won't compile
    // protected enum StaticMemberEnumProtected {} // won't compile
    enum StaticMemberEnumPublic {}

    // private record StaticMemberRecordPrivate() {}
    // protected record StaticMemberRecordProtected() {}
    record StaticMemberRecordPublic() { }

}
