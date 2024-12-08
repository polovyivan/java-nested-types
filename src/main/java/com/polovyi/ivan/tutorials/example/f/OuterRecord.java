package com.polovyi.ivan.tutorials.example.f;

public record OuterRecord() {
    private class PrivateInnerClass {}
    class PackagePrivateInnerClass {}
    protected class ProtectedInnerClass {}
    public class PublicInnerClass {}
}
