package com.practicehome;

public class Variables {
    int a = 10; // instance variable- inside the class
    static int b = 20;  // static variable which is declare with the help of static keyword

    public static void main(String[] args) {
        int x = 30; //local variable inside the method
        System.out.println(x);
        System.out.println(b);
        // System.out.println(a);// unable to create an object
    }

}
// Local variable which is declare inside the body of the method or method parameter
// instance variable which is declare inside the class but outside of all the methods

