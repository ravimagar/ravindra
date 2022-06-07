package com.constructor;

public class ConstructorExample {
    String s;

    ConstructorExample(int a, int b) { // constructor name should be same as a class name
        System.out.println(a + b);  // constructor never used any return type method
    }

    ConstructorExample() {
        System.out.println("hey i am your default Constructor");
    }

    public static void main(String[] args) {
        ConstructorExample ce1 = new ConstructorExample(10, 20); // memory allocated when object created
        ConstructorExample ce2 = new ConstructorExample(20, 20);
        ConstructorExample ce3 = new ConstructorExample(30, 20);
        ConstructorExample ce4 = new ConstructorExample(40, 20);
        ConstructorExample ce5 = new ConstructorExample();
        System.out.println(ce1.s);
    }
}
