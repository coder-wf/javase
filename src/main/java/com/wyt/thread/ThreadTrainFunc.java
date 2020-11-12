package com.wyt.thread;

public class ThreadTrainFunc implements Runnable{
    //总票数
    private int ticketAmount = 100;

    @Override
    public void run() {
        //循环是指线程不停的去卖票
        while (ticketAmount > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sale();
        }
    }

    private synchronized void sale() {
        if(ticketAmount>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ",出售 第" + (100 - ticketAmount + 1) + "张票.");
            ticketAmount--;
        }
    }
}
