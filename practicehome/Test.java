package com.practicehome;

public class Test {
    // this is class
    int a = 10;   // this is an instance variable declared inside the class and outside the main methods
    int b = 20;     //
    int sum = a + b;// addition


    public static void main(String[] args) {  // main method
        Test t = new Test();  // created an object for call the instance variable
        System.out.println(t.a);// t.a is an object a
        System.out.println(t.b);// t.b is an object of b
        System.out.println("sum of " + (t.a + t.b)); // addition
    }
}
