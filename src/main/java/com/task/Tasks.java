package com.task;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tasks {

    void streamExercises() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 2, 3);
//        double d = list.stream().mapToInt(value -> value).average().getAsDouble();
//
//       Double ans = list.stream().map(v->v*v)
//                .filter(v->v>100)
//                .mapToInt(v->v).average().getAsDouble();
//
//       list = list.stream().filter(v->v%2==0).toList();

//       list = list.stream()
//               .map(v->String.valueOf(v))
//               .filter(v-> v.startsWith("2") | v.startsWith("-2"))
//               .map(Integer::valueOf)
//               .collect(Collectors.toList());

//        Set<Integer> s = list.stream()
//                .filter(e -> Collections.frequency(list, e) > 1)
//                .collect(Collectors.toSet());
//        Set<Integer> dup = new HashSet<>();
//        Set<Integer> collect = list.stream().filter(e -> !dup.add(e))
//                .collect(Collectors.toSet());

//        int max = list.stream().min(Comparator.comparingInt(Integer::valueOf)).get();

//        list = list.stream().sorted(Comparator.reverseOrder()).toList();

//       int sum =  list.stream().limit(5).collect(Collectors.summingInt(e->e));
//       int sum = list.stream().limit(5).collect(Collectors.toList()).stream().reduce((a,b)->a+b).get();

//        int secondLowest = list.stream().distinct().sorted().skip(1).findFirst().get();
//        int secondHighest = list.stream()
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(1).findFirst().get();
//        System.out.println(secondLowest);
//        System.out.println(secondHighest);


        //        System.out.println(res);

    }

    void trying() {
    }

    void stream2() {
        List<Student> students = Arrays.asList(
                new Student(1, "vijay", 20, "Male", "Computer Science", "New York", 5, Arrays.asList("1234567890", "0987654321")),
                new Student(2, "Jane Smith", 22, "Female", "Electrical Engineering", "Los Angeles", 3, Arrays.asList("2345678901", "9876543210")),
                new Student(3, "Michael Johnson", 21, "Male", "Mechanical Engineering", "Chicago", 7, Arrays.asList("3456789012", "8765432109")),
                new Student(4, "Emily Davis", 23, "Female", "Civil Engineering", "Kumbakonam", 2, Arrays.asList("4567890123", "7654321098")),
                new Student(5, "David Brown", 24, "Male", "Information Technology", "Kumbakonam", 8, Arrays.asList("5678901234", "6543210987")),
                new Student(6, "Sarah Wilson", 22, "Female", "Chemical Engineering", "Kumbakonam", 4, Arrays.asList("6789012345", "5432109876")),
                new Student(7, "James Miller", 20, "Male", "Aerospace Engineering", "San Antonio", 6, Arrays.asList("7890123456", "4321098765")),
                new Student(8, "Olivia Martinez", 21, "Female", "Biomedical Engineering", "San Diego", 1, Arrays.asList("8901234567", "3210987654")),
                new Student(9, "William Garcia", 23, "Male", "Computer Science", "Dallas", 9, Arrays.asList("9012345678", "2109876543")),
                new Student(10, "Sophia Rodriguez", 24, "Female", "Environmental Engineering", "San Jose", 10, Arrays.asList("0123456789", "1098765432"))
        );

//        students.stream().filter(student->student.getRank()>5 & student.getRank()<10).forEach(s-> System.out.println(s));
//        students.stream().filter(student -> student.getCity().equals("Kumbakonam"))
//                .sorted(Comparator.comparing(s->s.getName())).forEach(System.out::println);
//        List<String> sl = students.stream().flatMap(s -> s.getContactNumbers().stream()).distinct().toList();
//        Map.Entry<String, Long> stringLongEntry = students.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
//        Set<Map.Entry<String, Double>> entries = students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(s->s.getAge()))).entrySet();
//        Set<Map.Entry<String, Optional<Student>>> entries = students.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.minBy(Comparator.comparingInt(s -> s.getRank())))).entrySet();
        Student student = students.stream().sorted(Comparator.comparingInt(s -> s.getRank())).skip(1).findFirst().get();
        System.out.println(student);

    }

    void stream3() {
        String str = "ilovejavatechie";
        String arr[] = str.split("");
//        Map<String,Long> res =Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

//        List<String> list = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(s -> s.getValue() == 1).map(s -> s.getKey()).toList();

//        Map<String, Long> collect = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
//        Map.Entry<String, Long> stringLongEntry = collect.entrySet().stream().filter(s -> s.getValue() == 1).findFirst().get();
//        System.out.println(stringLongEntry.getKey());

        int intArr[] = {5, 9, 11, 2, 8, 21, 1};
//        int min = Arrays.stream(intArr).boxed().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();

        Arrays.stream(intArr).boxed().map(n -> n.toString()).filter(s -> s.startsWith("1")).forEach(System.out::println);

//        String[] strings = {"java","techie","Springboot","Microservices"};
//        String max = Arrays.stream(strings).min(Comparator.comparingInt(String::length)).get();

//        System.out.println(max);
    }

    void practice() {
        String str = "MrtyNNgMM";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == 'M') {
                if (res.length() > 0) {
                    char pre = str.charAt(res.length() - 1);
                    res.append(pre);
                }
            } else if (currentChar == 'N') {
                i++;
            } else {
                res.append(currentChar);
            }
        }
        System.out.println(res);
    }

    void rotateArray() {

        int[] arr = {5, 4, 3, 4, 5, 6, 1, 2};
        int[] res = new int[arr.length];
        int firstIndex = arr[0];
        int index = 0;
        String ans = "";

        for (int i = firstIndex; i < arr.length; i++) {
            res[index++] = arr[i];
        }
        for (int i = 0; i < firstIndex; i++) {
            res[index++] = arr[i];
        }
        for (int i : res) {
            ans = ans + i;
        }
        System.out.println(ans);

    }

    void vowelsCount() {
        String str = "vijay";
        str = str.replace(" ", "");

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char let = str.charAt(i);
            switch (let) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
            }

        }
        System.out.println("Count : " + count);

    }

    void sortNum() {
        int[] arr = {1, 2, 3, 6, 5, 5, 4, 10, 7, 9, 8};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    void progress() {
        String str = "dkl";
        str = str.toLowerCase();
        String res = " ";
        for (int i = 0; i < str.length(); i++) {
            boolean isDup = false;
            if (i > 0) {
                if (str.charAt(i - 1) != str.charAt(i)) {
                    for (int j = i + 1; j < str.length(); j++) {
                        if (str.charAt(i) == (str.charAt(j))) {
                            isDup = true;
                            break;
                        }
                    }
                    if (!isDup) {
                        res = String.valueOf(str.charAt(i));
                        break;
                    } else {
                        res = "None";
                    }
                }
            }

        }
        System.out.println("First Non-Repeating Character : " + res);
    }

    void sum() {
        String str = "vijay";
        String repeated = null;
        for (int i = 0; i < str.length(); i++) {
            boolean isdup = false;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    repeated = String.valueOf(str.charAt(i));
                    isdup = true;
                    break;
                }
            }
            if (isdup) {
                break;
            }
        }
        System.out.println(repeated);
    }

    void largestWord() {
        String str = "The quick brown fox jumps";
        String arr[] = str.split(" ");
        String large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > large.length()) {
                large = arr[i];
            }
        }
        System.out.println("Largest : " + large);
    }

    void removeDupsfromArray() {
        int arr[] = {1, 2, 3, 4, 5, 5, 6};
        int len = arr.length;
        int unique[] = new int[len];
        int k = 0;
        int dupCouts = 0;
        for (int i = 0; i < len; i++) {
            boolean isDup = false;
            for (int j = 0; j < unique.length; j++) {
                if (arr[i] == unique[j]) {
                    isDup = true;
                    dupCouts++;
                    break;
                }
            }
            if (!isDup)
                unique[k++] = arr[i];
        }

        int finalArr[] = new int[len - dupCouts];
        for (int i = 0; i < unique.length - dupCouts; i++) {
            finalArr[i] = unique[i];
        }
        System.out.println(Arrays.toString(finalArr));
    }

    void findDuplicateUsingStream() {
        String arr[] = {"python", "java", "flutter", "java"};
        Arrays.stream(arr)
                .collect(Collectors.groupingBy(o -> o, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s -> s.getValue() > 1)
                .forEach(s -> System.out.println(s.getKey() + " : " + s.getValue()));

    }

    void armstrongNumber() {
        var number = 155;
        int original = number;
        int sum = 0;
        while (number > 0) {
            int last = number % 10;
            number = number / 10;
            sum = sum + last * last * last;
        }

        if (original == sum) {
            System.out.println("its armstrong" + sum);
        } else {
            System.out.println("not ARms ");
        }
    }

    void preserveSpace() {
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

        var str = "Java J2EE Java JSP J2EE";
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

    void findMaxAndMinimum() {
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

    void sumOfArrayElements() {
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
        System.out.println("Reversed : " + reverse);

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

