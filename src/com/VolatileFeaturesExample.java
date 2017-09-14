package com;

public class VolatileFeaturesExample {
//    volatile long vl = 0L;
//
//    public void setVl(long l) {
//        vl = l;
//    }
//
//    public void getAndIncrement() {
//        vl++;
//    }
//
//    public long getVl() {
//        return vl;
//    }

    long vl = 0L;

    public synchronized void setVl(long l) {
        vl = l;
    }

    public void getAndIncrement() {
        long temp = getVl();
        temp += 1L;
        setVl(temp);
    }

    public synchronized long getVl() {
        return vl;
    }
}
