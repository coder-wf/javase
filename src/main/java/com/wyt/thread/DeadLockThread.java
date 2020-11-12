package com.wyt.thread;

public class DeadLockThread implements Runnable{
    //总票数
    private int ticketAmount = 100;
    public boolean flag = true;
    private Object obj = new Object();

    @Override
    public void run() {
        if (flag) {
            while (true) {
                synchronized (obj) {
                    // 锁(同步代码块)在什么时候释放？代码执行完，自动释放锁.
                    // 如果flag为true 先拿到 obj锁,在拿到this锁，才能执行。
                    // 如果flag为false先拿到this，在拿到obj锁，才能执行。
                    // 死锁解决办法:不要在同步中嵌套同步。
                    sell();
                }
            }
        } else {
            while (true) {
                sale();
            }
        }
    }


    public synchronized void sale() {
        synchronized (obj) {
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

    public synchronized void sell(){
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
