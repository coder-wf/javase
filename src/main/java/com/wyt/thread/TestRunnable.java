package com.wyt.thread;

/**
 * @Author wf
 * @Date 2019/9/19 23:25
 * @Description 实现Runnable接口
 */
public class TestRunnable implements Runnable {
    private int count =15;

    @Override
    public void run() {
       for(int i=0;i<5;i++){
           System.out.println(Thread.currentThread().getName()+"运行 count"+count--);

           try {
               Thread.sleep((int)Math.random()*10);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }

    public static void main(String[] args) {
        TestRunnable t = new TestRunnable();

        new Thread(t,"C").start();
        new Thread(t,"D").start();
        new Thread(t,"E").start();
        //通过Runnable接口可以写出第二个Main方法中的实现方式，也就是多个线程共享一个Thread实例，达到了资源共享的目的，但是如果通过继承Thread的方式是做不到这一点的。
    }
}
