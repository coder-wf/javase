package com.wyt.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        //创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolWay threadPool = new ThreadPoolWay();
        for(int i =0;i<10;i++){
            //为线程池分配任务
            executorService.submit(threadPool);
        }
        //关闭线程池
        executorService.shutdown();
    }
}
