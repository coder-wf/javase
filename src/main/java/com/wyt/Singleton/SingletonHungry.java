package com.wyt.Singleton;

public class SingletonHungry {

    private static final SingletonHungry singleton = new SingletonHungry();


    private SingletonHungry(){

    }

    public SingletonHungry getSingleton(){
        return singleton;
    }
}

