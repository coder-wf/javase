package com.wyt.Singleton;

public class SingletonLazy {
    private static SingletonLazy singleton = null;

    private SingletonLazy(){

    }

    public SingletonLazy getSingleton(){
        if(singleton == null){
            singleton = new SingletonLazy();
        }
        return singleton;
    }
}
