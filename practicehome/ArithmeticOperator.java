package com.practicehome;

public class ArithmeticOperator {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println("addition is " + (a + b));
        System.out.println("Sub is " + (b - a));
        System.out.println("multiplication is " + (a * b));
        System.out.println("division is " + (b / a));
        System.out.println("remainder is " + (b % b)); // this is use for remainder
        System.out.println(a != b);// not equal to
        System.out.println(a == b); // equal to equal to
        System.out.println(a ^ b); //
        System.out.println(a < b); // less than b
        System.out.println(a <= b); // less than is equal to
        System.out.println(a < b); // greater than b
        System.out.println(a <= b);// greater than is equal to
        int max = (a > b) ? a : b;
        System.out.println(max); // ternary operator
        if (a < b && c > d) { // this is && operator , in this operator we need both the conditions are true
            System.out.println(" 1");
        } else {
            System.out.println("2");

        }
    }
}
