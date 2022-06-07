package com.abstarts;

abstract class Vehicle {
    // 2. if abstract method available inside the class then we must need to change class with abstract
    // abstract method define with the help of abstract keyword
    int a;

    Vehicle(int a) {
        System.out.println("  Engine Start" + a);
    }

    void e() {  // concrete method
    }

    abstract void start1();// 1. a method without body is abstract method

}
