package com.wyt.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileAtomic extends Thread{
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            //等同于i++
            atomicInteger.incrementAndGet();
        }
        System.out.println(atomicInteger);
    }

    public static void main(String[] args) {
        // 初始化10个线程
        VolatileAtomic[] volatileAtomic = new VolatileAtomic[10];
        for (int i = 0; i < 10; i++) {
            // 创建
            volatileAtomic[i] = new VolatileAtomic();
        }
        for (int i = 0; i < volatileAtomic.length; i++) {
            volatileAtomic[i].start();
        }
    }

}
