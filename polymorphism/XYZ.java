package com.polymorphism;

public class XYZ extends Test2 {
    void show() // same method extend for override
    {   super.show();// call parent class method using super key
        System.out.println("2");
    }

    public static void main(String[] args) {
        //Test t = new Test();
        // t.show(10);
        XYZ x = new XYZ();// object created for child class
        x.show();

}}
