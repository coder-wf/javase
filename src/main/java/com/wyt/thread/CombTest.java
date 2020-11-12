package com.wyt.thread;

public class CombTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadTrainComb threadTrain = new ThreadTrainComb();    //定义一个实例
        Thread thread1 = new Thread(threadTrain, "一号窗口");
        Thread thread2 = new Thread(threadTrain, "二号窗口");
        thread1.start();
        Thread.sleep(40);
        threadTrain.flag = false;
        thread2.start();

    }
}
