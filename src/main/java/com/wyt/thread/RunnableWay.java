package com.wyt.thread;

public class RunnableWay implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("i="+i);
        }
    }

}