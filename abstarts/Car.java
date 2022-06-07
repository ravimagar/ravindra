package com.abstarts;

public class Car extends Vehicle {
    Car(int b) {
        super(b);
    } // extend parent class

    @Override
    void start1() {
        System.out.println("car start with key");
    }

    public static void main(String[] args) {
    }
}
