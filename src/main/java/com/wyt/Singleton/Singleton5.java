package com.wyt.Singleton;
public class Singleton5 {  
    private static class Singleton5Holder {  
    private static final Singleton5 INSTANCE = new Singleton5();  
    }  
    private Singleton5 (){}  
    public static final Singleton5 getInstance() {  
    return Singleton5Holder.INSTANCE;  
    }  
}