package com.wyt.thread;

public class ThreadPoolWay implements Runnable{

    public void run() {
        for(int i = 0 ;i<10;i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
