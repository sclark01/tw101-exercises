package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(1000000);
        printList(primeFactors);
    }

    private static List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<>();
        if(n % 2 == 0) factors.add(2);
        for (int i = 1; i <= n; i += 2) {
            if(n % i == 0){
                if(isPrime(i)) {
                    factors.add(i);
                }
            }
        }
        return factors;
    }

    private static void printList(List<Integer> lst){
        for(Integer i : lst){
            System.out.println(i);
        }
    }
    private static Boolean isPrime(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        if(n == 3) return true;
        if(n % 2 == 0) return false;
        if(n % 3 == 0) return false;
        int i = 5;
        int w = 2;
        while (i * i <= n){
            if (n % i == 0){
                return false;
            }
            i += w;
            w = 6 - w;
        }
        return true;
    }
}
