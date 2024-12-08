package com.polovyi.ivan.tutorials.example.f;


import com.polovyi.ivan.tutorials.example.f.OuterClassInstance.InnerClass;

public class OuterClassInstance {

    class InnerClass {}

    InnerClass innerClass = new InnerClass();
    InnerClass innerClass2 = this.new InnerClass(); // "this" is not necessary

    public static InnerClass staticMethod() {
        //  return new InnerClass(); // won't compile
        return new OuterClassInstance().new InnerClass();
    }

    public InnerClass instanceMethod() {
        return new InnerClass();
    }

}

class OuterClassInstance2 {

    OuterClassInstance outerClassInstance = new OuterClassInstance();
    InnerClass innerClass1 = outerClassInstance.new InnerClass();
    InnerClass innerClass2 = outerClassInstance.new InnerClass();

    public static InnerClass staticMethod() {
        return new OuterClassInstance().new InnerClass();
    }

}