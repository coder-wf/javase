package com.wyt.thread;

public class RunnableTest {

    public static void main(String[] args) {
        RunnableWay rThread = new RunnableWay();

        System.out.println("线程开始了。");
        Thread t = new Thread(rThread);
        t.start();
        System.out.println("线程结束了。");

    }

}
