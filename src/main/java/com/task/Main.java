package com.task;

import org.hibernate.dialect.function.TrimFunction;

import java.io.PrintStream;
import java.util.function.*;

public class Main {
    public static void main(String[] a) {
        Tasks t = new Tasks();
        t.practice();

    }



}

@FunctionalInterface
interface Isum {
    void toUpperCase(String s);

}

class Sample{
    int sum(int i, int j){

        return i+j;
    }
}