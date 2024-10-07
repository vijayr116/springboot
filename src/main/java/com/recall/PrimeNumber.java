package com.recall;

    public class PrimeNumber {
        public static void main(String[] args) {
            System.out.println(findPrimeOrNot(10));
        }

        private static boolean findPrimeOrNot(int n) {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
