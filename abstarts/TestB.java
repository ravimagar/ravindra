package com.abstarts;

public class TestB extends TestA {
    TestB(int a) { // parameterized constructor created
        super(a); // call parent class variable by super key
        System.out.println("Ravi");
    }

    void s() { // user defined method
        System.out.println("Magar");
    }

    @Override
        // must overridden parent class method for abstract class
    void c() {
    }

    public static void main(String[] args) {  // use main method for getting output
        TestB t = new TestB(64);// initialize the value with the help of constructor
        t.s();// called method with the help of object
    }
}
