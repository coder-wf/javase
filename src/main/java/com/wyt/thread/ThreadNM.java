package com.wyt.thread;

/**
 * 使用匿名内部类
 */
public class ThreadNM {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    System.out.println("子线程"+i);
                }
            }
        }).start();

        for (int i = 0; i <1000 ; i++) {
            System.out.println("主线程"+i);
        }

    }
}
