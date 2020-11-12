package com.wyt.thread;

public class ThreadTest {
    public static void main(String[] args) {
        Thread t = new ThreadWay();

        System.out.println("线程开始了");
        t.start();
        System.out.println("线程结束了");
    }
}
