package com.hundredjavaprogram;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        System.out.println(primes.length);
        for (int t : primes) {
            System.out.println(t);
        }
    }
}
