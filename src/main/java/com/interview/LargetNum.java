package com.interview;

import java.util.Arrays;
import java.util.Comparator;

public class LargetNum {

    public static void main(String[] args) {
        findLarge(new int[]{3, 5, 7, 2, 8});
    }

    private static void findLarge(int[] ints) {
        Integer e = Arrays.stream(ints).boxed().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
        System.out.println(e);
    }

}
