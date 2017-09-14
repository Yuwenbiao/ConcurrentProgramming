package com;

public class UnsafeLazyInitialization {
    private static UnsafeLazyInitialization instance;

    public static UnsafeLazyInitialization getInstance() {
        if (instance == null) {
            instance = new UnsafeLazyInitialization();
        }
        return instance;
    }
}
