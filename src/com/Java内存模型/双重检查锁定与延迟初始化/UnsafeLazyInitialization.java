package com.Java内存模型.双重检查锁定与延迟初始化;

public class UnsafeLazyInitialization {
    private static UnsafeLazyInitialization instance;

    public static UnsafeLazyInitialization getInstance() {
        if (instance == null) {//1:A线程执行
            instance = new UnsafeLazyInitialization();//2:B线程执行
        }
        return instance;
    }
}
