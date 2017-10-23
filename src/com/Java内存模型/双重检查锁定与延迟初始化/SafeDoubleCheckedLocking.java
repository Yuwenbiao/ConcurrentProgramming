package com.Java内存模型.双重检查锁定与延迟初始化;

/**
 * 当声明对象为volatile后，在多线程环境下重排序将会被禁止
 */
public class SafeDoubleCheckedLocking {
    private volatile static SafeDoubleCheckedLocking instance;

    public static SafeDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (SafeDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new SafeDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
