package com.abstarts;

public abstract class TestA { // abstract class created
    int a;

    TestA(int a) { // parameterized constructor
        System.out.println("weight of mine is " + a);
    }

    void b() { // concrete method
        System.out.println(" print me");
    }

    abstract void c();// abstract method

    {
    }
}

