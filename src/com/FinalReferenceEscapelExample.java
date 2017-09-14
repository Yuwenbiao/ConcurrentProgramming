package com;

public class FinalReferenceEscapelExample {
    final int i;
    static FinalReferenceEscapelExample obj;

    public FinalReferenceEscapelExample() {
        i = 1;
        obj = this;//this 引用在此逸出
    }

    public static void writer() {
        new FinalReferenceEscapelExample();
    }

    public static void reader() {
        if (obj != null) {
            int temp = obj.i;
        }
    }
}
