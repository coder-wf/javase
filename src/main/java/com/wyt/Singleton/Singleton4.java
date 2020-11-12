package com.wyt.Singleton;
public class Singleton4 {  
    private volatile static Singleton4 Singleton4;  
    private Singleton4 (){}  
    public static Singleton4 getSingleton4() {  
    if (Singleton4 == null) {  
        synchronized (Singleton4.class) {  
        if (Singleton4 == null) {  
            Singleton4 = new Singleton4();  
        }  
        }  
    }  
    return Singleton4;  
    }  
}