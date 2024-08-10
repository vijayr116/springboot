package com.task;

import com.example.springboot.Employee;

import java.util.*;
import java.util.stream.Collectors;

interface Animal {
    void eat();

    default void sleep() {
        System.out.println("Animal Sleeping");
    }
}

interface Human {
    void eat();

    default void sleep() {
        System.out.println("Human Sleeping");
    }
}

public class Tasks implements Animal, Human {
    @Override
    public void eat() {
        System.out.println("eating....");
    }

    @Override
    public void sleep() {
        Animal.super.sleep();
    }


    // ===================================================================

    void practice() {
        int num = 12;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (i % 2 == 0) {
                isPrime = false;
            }
        }
        System.out.println(isPrime);

    }

    void armstrongNumber() {
        int number = 155;
        int original = number;
        int sum = 0;
        while (number > 0) {
            int rev = number % 10;
            number = number / 10;
            sum = sum + rev * rev * rev;
        }

        if (original == sum) {
            System.out.println("its armstrong");
        } else {
            System.out.println("not ARms");
        }
    }

    void preserviceSpace() {
        String str = "I am not a String";
        // g ni rtS a tonmaI
        StringBuilder stringBuffer = new StringBuilder(str.replace(" ", ""));
        stringBuffer.reverse();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                stringBuffer.insert(i, ' ');
            }
        }
        System.out.println(stringBuffer);
    }

    void countWords() {
        String str = "Java J2EE Java JSP J2EE";
        char[] chars = str.toLowerCase().replace(" ", "").toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], 1);
            } else {
                map.put(chars[i], map.get(chars[i]) + 1);
            }
        }

        System.out.println(map);
    }

    void countChars() {
        String str = "Butter Better";
        str = str.toLowerCase().replace(" ", "");
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        System.out.println(map);
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println(list);
        list.stream().forEach(s -> System.out.println(s.getKey() + " : " + s.getValue()));
    }

    void revWord() {
        String s = "Welcome to java";
        char[] slist = s.toCharArray();
        String rev = "";
        for (int i = slist.length - 1; i >= 0; i--) {
            rev = rev + slist[i];
        }
        System.out.println(rev);

    }

    void occurences() {
        String s = "java programming java oops";
        int s1 = s.length();
        int s2 = s.replace("a", "").length();
        System.out.println("---- " + (s1 - s2));
//        int count = 0;
//        for(int i =0; i<s.length();i++){
//            if(s.charAt(i) == 'a'){
//                count++;
//            }
//        }
//        System.out.println("Count is : "+count);
    }

    void findDuplicatesFromArray() {
        String arr[] = {"python", "java", "flutter", "java"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("we found one duplicate :" + arr[j]);
                }
            }
        }
    }

    void findMaxandMinnum() {
        int arr[] = {20, 30, 40, 60, 10, 5, 39, 50};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }

    void sumOfArrayElemets() {
        int arr[] = {5, 2, 7, 9, 6};
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    void factorialNum() {
        int num = 6;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("your factorial is " + factorial);
    }

    void sumOfNums() {
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            int last = num % 10;
            sum = sum + last;
            num = num / 10;
        }
        System.out.println("sum of the number is : " + sum);
    }

    void addEvenCounts() {
        int num = 22222;
        int addCount = 0;
        int evenCount = 0;
        while (num > 0) {
            int f = num % 10;
            if (f % 2 == 0) {
                evenCount += 1;
            } else {
                addCount++;
            }
            num = num / 10;
        }
        System.out.println("add Number" + addCount);
        System.out.println("even Number" + evenCount);

    }

    void numberCount() {
        int num = 4373;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);

    }

    void reversNum(int num) {
        int last;
        int reverse = 0;
        while (num > 0) {
            last = num % 10;
            reverse = reverse * 10 + last;
            num = num / 10;
        }
        System.out.println("Reversed :" + reverse);

    }

    void fibonancySeries() {
        int count = 10;
        int f = 0;
        int s = 1;
        int t;

        System.out.println(f);
        System.out.println(s);
        for (int i = 3; i <= count; i++) {
            t = f + s;
            f = s;
            s = t;
        }

    }

    void replaceChar() {
//      str = str.replace(c,' ').replaceAll("\\s+","");
//        System.out.println(str.length());
        {
            String s = "Java is java again java again";

            int count = s.length() - s.replace("a", "").length();

            System.out.println("Number of occurances of 'a' in " + s + " = " + count);
        }
    }

    void testFindWordOccurences(String str) {
        String words[] = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], 1);
            } else {
                map.put(words[i], map.get(words[i]) + 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.stream().forEach(s -> System.out.println(s.getKey() + " : " + s.getValue()));
    }

    boolean findPrimeNum(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    int isPalindrome2(String str) {
        // code here
        str = str.toLowerCase();
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return 0;
            }

        }
        return 1;


    }

    int missingNum(int num, int[] arr) {
        num = num * (num + 1) / 2;
        int arrnum = 0;
        for (int i : arr) {
            arrnum = arrnum + i;
        }
        return num - arrnum;
    }

    void countNumsOfString(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        List<Character> res = new ArrayList<>();
        for (char c : chars) {
            if (Character.isLetter(c)) {
                res.add(c);
            }
        }
        System.out.println(res.size());

    }

    void findWordOccurences(String str) {
        String[] words = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])) {
                map.put(words[i].toLowerCase(), 1);
            } else {
                map.put(words[i].toLowerCase(), map.get(words[i]) + 1);
            }
        }
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        set.stream().forEach(s -> System.out.println(s.getKey() + " " + s.getValue()));
    }

    void isPalindrome(String s) {
        s = s.toLowerCase();
        char[] str = s.toCharArray();
        String rev = "";

        for (int i = str.length - 1; i >= 0; i--) {
            rev = rev + str[i];

        }
        if (s.equals(rev.toLowerCase())) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    void sortMap() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "vijay");
        map.put(2, "ajith");
        Set<Map.Entry<Integer, String>> entryList = map.entrySet();
        List<Map.Entry<Integer, String>> list = new ArrayList<>(entryList);
        Collections.sort(list, Map.Entry.comparingByValue());
        System.out.println(list);
    }

    void checkAnagram(String s1, String s2) {
        char[] first = s1.toLowerCase().toCharArray();
        char[] second = s2.toLowerCase().toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        if (Arrays.equals(first, second)) {
            System.out.println("is anagram");
        } else {
            System.out.println("not anagram");
        }
    }

    void checkPangram(String str) {
        str = str.toLowerCase();
        Set<Character> unique = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                unique.add(ch);
            }
        }
        if (unique.size() == 26) {
            System.out.println("its panagram");
        } else {
            System.out.println("not panagram");
        }
    }


}
