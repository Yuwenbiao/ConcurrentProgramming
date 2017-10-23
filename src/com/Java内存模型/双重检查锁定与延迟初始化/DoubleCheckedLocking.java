package com.Java内存模型.双重检查锁定与延迟初始化;

public class DoubleCheckedLocking {
    private static DoubleCheckedLocking instance;

    public static DoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
