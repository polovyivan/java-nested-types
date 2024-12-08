package com.polovyi.ivan.tutorials.example.e;

public class LocalStaticTypeUsage {

    // class NestedClass implements LocalInterface {} // won't compile
    // String constName = LocalEnumType.CONST_1.name(); // won't compile
    // LocalRecord localRecord = new LocalRecord();

    public static void main(String[] args) {

        interface LocalInterface { }
        enum LocalEnumType {CONST_1}
        record LocalRecord() {}

        LocalRecord localRecord = new LocalRecord();

        if (true) {
            System.out.println("localRecord = " + localRecord);
            System.out.println("LocalEnum = " + LocalEnumType.CONST_1.name());
        }

        for (LocalEnumType localEnumType : LocalEnumType.values()) {
            record LocalRecordInLoop (LocalEnumType localEnumType) { }
            LocalRecordInLoop localRecordInLoop = new LocalRecordInLoop(localEnumType);
            System.out.println("localRecordInLoop = " + localRecordInLoop);
        }

        for (LocalEnumType localEnumType : LocalEnumType.values()) {
            // new LocalRecordInLoop(); // won't compile
        }

    }

}
