package com.wyt.jdk8;

public class learnLambda {

    public static void main(String[] args) {
        /*Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("jdk8新特性之Lambda表达式");
            }
        };*/
        Runnable r = () -> System.out.println("jdk8新特性之Lambda表达式");
        r.run();
    }
}
