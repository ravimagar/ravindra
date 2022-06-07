package com.polymorphism;

public class Son extends MotherFather {
    void marriage(){   // method overriding
        System.out.println("i am already Married");
    }
    public static void main(String[] args) {
        Son s = new Son();
        s.marriage();
        System.out.println();

    }
}

