package com.wyt.thread;

public class InnerTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i< 10; i++) {
                    System.out.println("i=" + i);
                }
            }
        });
        System.out.println("线程开始了。");
        thread.start();
        System.out.println("线程结束了。");
    }
}
