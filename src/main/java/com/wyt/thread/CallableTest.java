package com.wyt.thread;

import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) {
        //执行Callable 方式，需要FutureTask实现实现，用于接收运算结果
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new CallableWay());
        System.out.println("线程开始了。");
        new Thread(futureTask).start();
        System.out.println("线程结束了。");
        //接收线程运算后的结果
        try {
            Integer sum = futureTask.get();
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
