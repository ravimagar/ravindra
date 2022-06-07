package com.practicehome;

public class UnaryOperator {
    public static void main(String[] main) {
        int a = 1;
        int b = a++; // this is the postfix increment operator
        System.out.println(b); // first assign the value then increase
        int c = 2;
        int d = c--;  // this is the postfix decrement operator
        System.out.println(d); // first assign the value then decrease
        int f = 3;
        int g = ++f; // this is the prefix increment
        System.out.println(f); // first increase the value then assign
        int h = 4;
        int i = --h; // this is the prefix decrement operator
        System.out.println(h); // first decrease the value then assign

        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }
    }
}
