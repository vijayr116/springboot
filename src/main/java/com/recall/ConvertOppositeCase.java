package com.recall;

public class ConvertOppositeCase {

    public static void main(String[] args) {
        System.out.println(convertCase("Vijay"));

    }

    private static String convertCase(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                res.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                res.append(Character.toLowerCase(c));
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
