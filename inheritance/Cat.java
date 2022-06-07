package com.inheritance;

public class Cat extends Animal {
    public static void main(String[] args) {
        Cat c= new Cat();
        c.eating();
        c.sleeping();
        c.running();
        c.home();
        System.out.println();
    }
}
