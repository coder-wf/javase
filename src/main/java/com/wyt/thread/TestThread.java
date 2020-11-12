package com.wyt.thread;

/**
 * @Author wf
 * @Date 2019/9/19 22:36
 * @Description 继承Thread类
 */
public class TestThread extends Thread {

    private int count = 5;
    public String name;

    public TestThread(String name){
        this.name = name;
    }

    public void run(){
        for(int i=0;i<5;i++){

            System.out.println(name+"运行 count"+count--);

            try {
                sleep((int)Math.random()*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread("A");
        TestThread t2 = new TestThread("B");

        t1.start();
        t2.start();
    }


}
