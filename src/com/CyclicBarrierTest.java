package com;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
    static CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                cyclicBarrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(1);
        }).start();
        try {
            cyclicBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(2);
    }
}
