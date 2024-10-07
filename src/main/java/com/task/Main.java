package com.task;

public class Main {
    public static void main(String[] a) {
        var t =new Tasks();
        t.testMe();
    }

    static void swaping() {
        String first = "hi";
        String second = "vijay";

        first = first + second;
        second = first.substring(0, first.length() - second.length());
        first = first.substring(second.length());
        System.out.println(first);
        System.out.println(second);

        int a = 10;
        int b = 5;

        a = a+b; //15
        b = a-b; //10
        a = a-b; // 5
        System.out.println(a);
        System.out.println(b);

//        int arr[] = {26, 5, 26, 12, 5, 17};
//        int i = Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
//        System.out.println(i);
    }

    public void pali(){
    int num = 10;


    }

}







