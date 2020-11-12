package com.wyt.thread;

public class VolatileTest {
    public static void main(String[] args) throws InterruptedException {
        VolatileDemo threadVolatileDemo = new VolatileDemo();
        threadVolatileDemo.start();
        Thread.sleep(3000);
        threadVolatileDemo.setRuning(false);
        System.out.println("flag 已经设置成false");
        Thread.sleep(1000);
        System.out.println(threadVolatileDemo.flag);
    }
}
