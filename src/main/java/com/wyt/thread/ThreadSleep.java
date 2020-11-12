package com.wyt.thread;

/**
 * 使用sleep使线程进入休眠状态，到时候继续运行，不交出锁
 */
class SThread extends Thread{
    @Override
    public void run() {

        for (int i = 0; i <10 ; i++) {
            try {
                //Thread.sleep(1000);
                currentThread().sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("id="+getId()+"name"+getName()+"i="+i);
        }
    }
}

//实现Runnable接口的时候通过Thread.currentThread()获取ID和名称

public class ThreadSleep {
    public static void main(String[] args) {
        //new SThread().start();
        SThread sThread = new SThread();
        sThread.setName("线程1");
        sThread.start();
    }
}
