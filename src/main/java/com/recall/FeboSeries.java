package com.recall;


import java.util.stream.Stream;

public class FeboSeries {
    public static void main(String[] args) {
        febo(10);
    }
    private static void febo(int i) {
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for (int j = 2; j < i; j++) {
            int n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
