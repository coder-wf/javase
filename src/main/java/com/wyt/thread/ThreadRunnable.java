package com.wyt.thread;

/**
 * 继承Runnable接口
 */
class RThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println("子线程"+i);
        }
    }
}

public class ThreadRunnable {

    public static void main(String[] args) {

        RThread rThread = new RThread();
        Thread thread = new Thread(rThread);
        thread.start();


        for (int i = 0; i <1000 ; i++) {
            System.out.println("主线程"+i);
        }


    }
}
