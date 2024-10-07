package com.interview;

public class StringReverse {
    public static void main(String[] args) {
        reverse("vijay");
    }
    static void reverse(String rev){
       String reverse = "";
       for(int i = rev.length()-1; i>=0; i--){
           reverse =reverse + rev.charAt(i);
       }
        System.out.println(reverse);
    }
}
