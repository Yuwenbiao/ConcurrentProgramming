package com.Java内存模型.双重检查锁定与延迟初始化;

/**
 * jvm在类的初始化阶段（即在Class被加载后，且被线程使用前）会执行类的初始化，并会去获取一个锁，
 * 这个锁可以同步多个线程对同一个类的初始化
 * 首次执行getInstance方法的线程将导致InstanceHolder被初始化
 */
public class InstanceFactory {
    private static class InstanceHolder {
        public static InstanceFactory instance = new InstanceFactory();
    }

    public static InstanceFactory getInstance() {
        return InstanceHolder.instance;
    }
}
