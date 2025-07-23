package org.patterns.creational.singleton;

public class SingletonConfig {
    public static SingletonConfig singletonConfig;
    private SingletonConfig() {

    }

    private static SingletonConfig getSingletonConfig() {
        if(singletonConfig == null) {
            singletonConfig = new SingletonConfig();
        }
        return singletonConfig;
    }


}
