package com.wyt.Singleton;

public class SingletonL {
    private static SingletonL singletonL = null;

    private SingletonL(){};

    public SingletonL getSingletonL(){
        if(singletonL==null){
            singletonL =  new SingletonL();
        }
        return singletonL;
    }

}
