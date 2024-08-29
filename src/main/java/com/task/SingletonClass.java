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


abstract class AbTest{
    abstract void sum();
    abstract void mul();
    public void print(){
        System.out.println("Printed Abstract class");
    }
}

interface IfTest{
    void sum();
    default void print(){
        System.out.println("Printed Interface");
    }
}