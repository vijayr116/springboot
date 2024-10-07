package com.recall;

public class SwappingWithout3rdVar {
    public static void main(String[] args) {
        swapnum();
    }

    private static void swapme() {
        String s1 = "hi";
        String s2 = "Hello";
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println(s1);
        System.out.println(s2);
    }

    private static void swapnum() {
        int n1 = 10;
        int n2 = 20;
        n1 = n1 + n2; //30
        n2 = n1 - n2; //10
        n1 = n1 - n2; //20
        System.out.println(n1);
        System.out.println(n2);
    }
}
