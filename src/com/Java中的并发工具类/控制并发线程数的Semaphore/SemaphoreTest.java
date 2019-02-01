package com.Java中的并发工具类.控制并发线程数的Semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 控制并发线程数的Semaphore
 *
 * @author yuwb@corp.21cn.com
 * @date 2019/2/1 15:41
 */
public class SemaphoreTest {
    private static final int THREAD_COUNT = 30;
    private static ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_COUNT);
    private static Semaphore s = new Semaphore(10);

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            threadPool.execute(test);
        }
        threadPool.shutdown();
    }

    private static Runnable test = () -> {
        try {
            s.acquire();
            System.out.println("save data");
            s.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };
}
