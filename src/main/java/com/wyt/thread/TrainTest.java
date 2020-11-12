package com.wyt.thread;

public class TrainTest {

    public static void main(String[] args) {
        //ThreadTrain threadTrain = new ThreadTrain();  不安全线程
        //ThreadTrainSync threadTrain = new ThreadTrainSync();  同步代码块
        //ThreadTrainFunc threadTrain = new ThreadTrainFunc();    //同步函数
        ThreadStatic threadTrain = new ThreadStatic();  //静态同步函数
        Thread t1 = new Thread(threadTrain,"一号窗口");
        Thread t2 = new Thread(threadTrain,"二号窗口");
        t1.start();
        t2.start();
    }

}
