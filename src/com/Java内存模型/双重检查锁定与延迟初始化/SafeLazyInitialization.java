package com.Java内存模型.双重检查锁定与延迟初始化;

public class SafeLazyInitialization {
    private static SafeLazyInitialization instance;

    public synchronized static SafeLazyInitialization getInstance() {
        if (instance == null) {
            instance = new SafeLazyInitialization();
        }
        return instance;
    }
}
