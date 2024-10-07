package com.interview;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(checkPrime(7));  // Output: true
        System.out.println(checkPrime(10)); // Output: false
    }

    static boolean checkPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {  // Loop till the square root of num
            if (num % i == 0) {
                return false; // If divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }
}
