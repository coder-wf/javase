package com.wyt.thread;

public class VolatileDemo extends Thread {
    public    boolean flag = true;

    @Override
    public void run() {
        System.out.println("开始执行子线程....");
        while (flag) {
            //System.out.println("线程停止");
        }
        System.out.println("线程停止");
    }

    public void setRuning(boolean flag) {
        this.flag = flag;
    }

}
