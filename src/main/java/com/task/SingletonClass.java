package com.task;

public class SingletonClass {
    private static SingletonClass singletonClass;

    private SingletonClass(){

    }

    static public SingletonClass getInstance(){
        if(singletonClass == null){
            return new SingletonClass();
        }
        return singletonClass;
    }
     void info(){
        System.out.println("Accessing...");
    }

}
