package com.task;


public class Main {
    public static void main(String[] a) {
        Tasks t = new Tasks();
        t.trying();
//        Runnable runnable = ()->
//                System.out.println("A show");
//        Thread thread = new Thread(runnable);
//        thread.start();


        String s = new String("vijay");
        String s1 = new String("vijay");

        System.out.println(s==s1);
        System.out.println(s.equals(s1));

    }
}




