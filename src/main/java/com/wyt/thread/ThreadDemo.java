package com.wyt.thread;

/**
 * 继承Thread类
 * 交叉执行
 */
class NiceThread extends Thread{

    @Override
    public void run() {

        for (int i = 0; i <1000 ; i++) {
            System.out.println("子线程"+i);
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        NiceThread niceThread = new NiceThread();

        niceThread.start();


        for (int i = 0; i <1000 ; i++) {
            System.out.println("主线程"+i);
        }


    }
}
