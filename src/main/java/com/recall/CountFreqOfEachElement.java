package com.recall;

import java.util.*;
import java.util.stream.*;

public class CountFreqOfEachElement {
    public static void main(String[] args) {
        int[] a = {10, 10, 20, 5, 5, 5, 20, 30};
        myFunc2(a);
    }

    private static void myFunc(int[] a) {
        Arrays.stream(a).boxed()
                .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new, Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + " is Presented " + value + " times "));
    }


    private static void myFunc2(int[] a) {
        Arrays.stream(a).boxed()
                .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .forEach(s -> System.out.println(s.getKey() + " is Presented " + s.getValue() + " times "));
    }
}
