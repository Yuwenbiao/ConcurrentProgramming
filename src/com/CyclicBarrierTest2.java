package com;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest2 {
    static CyclicBarrier c = new CyclicBarrier(2, () -> System.out.println(3));

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                c.await();
            } catch (Exception e) {
            }
            System.out.println(1);
        }).start();
        try {
            c.await();
        } catch (Exception e) {
        }
        System.out.println(2);
    }
}
