package com.polovyi.ivan.tutorials.example.c;

public class StaticMemberTypesInClass {

    public static void main(String[] args) {
        new StaticMemberClassPrivate();
    }

    private static class StaticMemberClassPrivate {}
    static class StaticMemberClassPackagePrivate {}
    protected static class StaticMemberClassProtected {}
    public static class StaticMemberClassPublic {}

    private interface StaticMemberInterfacePrivate {}
    interface StaticMemberInterfacePackagePrivate {}
    protected interface StaticMemberInterfaceProtected {}
    public interface StaticMemberInterfacePublic {}

    private  enum StaticMemberEnumPrivate {}
    enum StaticMemberEnumPackagePrivate {}
    protected enum StaticMemberEnumProtected {}
    public enum StaticMemberEnumPublic {}

    private record StaticMemberRecordPrivate() {}
    record StaticMemberRecordPackagePrivate() {}
    protected record StaticMemberRecordProtected() {}
    public record StaticMemberRecordPublic() {}

}
