package com.wyt.thread;

public class ThreadTrainComb implements Runnable{
    //总票数
    private int ticketAmount = 100;
    public boolean flag = true;
    private Object threadLock = new Object();

    @Override
    public void run() {
        if (flag) {
            while (true) {
                synchronized (threadLock) {
                    if (ticketAmount > 0) {
                        try {
                            Thread.sleep(40);
                        } catch (Exception e) {

                        }
                        System.out.println(Thread.currentThread().getName() + ",出售 第" + (100 - ticketAmount + 1) + "张票.");
                        ticketAmount--;
                    }
                }
            }
        } else {
            while (true) {
                sale();
            }
        }
    }


    public synchronized void sale() {
        if (ticketAmount > 0) {
            try {
                Thread.sleep(40);
            } catch (Exception e) {

            }
            System.out.println(Thread.currentThread().getName() + ",出售 第" + (100 - ticketAmount + 1) + "张票.");
            ticketAmount--;
        }
    }

}
