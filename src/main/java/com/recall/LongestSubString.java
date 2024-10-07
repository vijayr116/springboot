package com.recall;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(longestString2("abcbkl"));
    }

    private static void longestString(String str) {

        int len = 0;
        int templen = 0;

        Set<Character> set = new HashSet<>();
        //abcabcd
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!set.contains(currentChar)) {
                set.add(currentChar);
                templen = templen + 1;
            } else {
                set.clear();
                set.add(currentChar);
                len = templen > len ? templen : len;
                templen = 0;
                templen = templen + 1;
            }
        }
        System.out.println(templen);

    }

    private static int longestString2(String str) {
        int len = 0; // To store the longest length
        int left = 0; // Left pointer for the sliding window
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {
            char currentChar = str.charAt(right);

            // If the character already exists in the set, adjust the window by removing from the left
            while (set.contains(currentChar)) {
                set.remove(str.charAt(left));
                left++;
            }

            // Add the current character and update the length of the window
            set.add(currentChar);
            len = Math.max(len, right - left + 1);
        }

        return len;  // Return the length of the longest substring
    }
}
