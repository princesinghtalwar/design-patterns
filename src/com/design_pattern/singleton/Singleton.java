package com.design_pattern.singleton;

public class Singleton {
    private static volatile Singleton singleton = null;

    private Singleton(){
//        throw new IllegalArgumentException("Object creation using 'new' is restricted");
    }

    public static Singleton getInstance(){
        if(singleton == null){
//            synchronized (Singleton.class){
//                if(singleton == null){
                    singleton = new Singleton();
//                }

//            }
        }
        System.out.println(singleton);
        return singleton;
    }
}
