package com.wyt.Singleton;

public class SingletonH {
    private static final SingletonH sington = new SingletonH();

    private SingletonH(){};

    public SingletonH getSington() {
        return sington;
    }
}
