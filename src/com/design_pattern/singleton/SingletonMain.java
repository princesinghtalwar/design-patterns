package com.design_pattern.singleton;

public class SingletonMain {
    public static void main(String[] args) {
//        Thread t1 = new Thread(
//                Singleton::getInstance
//        );
//
//        Thread t2 = new Thread(
//                Singleton::getInstance
//        );

        for (int i = 0;i<10;i++){
           Thread t1 = new Thread(Singleton::getInstance);
            System.out.println(Thread.currentThread().getName()+": "+t1);
           t1.start();
        }
    }
}
