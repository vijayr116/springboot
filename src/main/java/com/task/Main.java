package com.task;

import org.hibernate.dialect.function.TrimFunction;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.function.*;

abstract class Testtt{
    public void dd(){

    }
    abstract void asd();
}

public class Main {
    public static void main(String[] a) {
        Tasks t = new Tasks();
        t.progress();

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