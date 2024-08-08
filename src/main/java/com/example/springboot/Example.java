package com.example.springboot;

public class Example{

    int i;
    public Example(int i){
        this.i=i;
        System.out.println(" I am in construct"+i);
    }
    static{
        System.out.println("I am in static block");
    }
    public void m1(String str){
        System.out.println("I am in m1");
    }

    public static void m2(String str){
        System.out.println("I am in m2");
    }


}

