package com;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest3 {
    static CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        Thread thread = new Thread(() -> {
            try {
                cyclicBarrier.await();
            } catch (Exception e) {

            }
        });
        thread.start();
        thread.interrupt();
        try {
            cyclicBarrier.await();
        } catch (Exception e) {
            System.out.println(cyclicBarrier.isBroken());
        }
    }
}
