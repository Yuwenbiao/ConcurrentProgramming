package com;

public class SafeLazyInitialization {
    private static SafeLazyInitialization instance;

    public synchronized static SafeLazyInitialization getInstance() {
        if (instance == null) {
            instance = new SafeLazyInitialization();
        }
        return instance;
    }
}
