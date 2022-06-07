package com.constructor;

public class SuperKeyB extends SuperKey{
    // extend parent class
    int a= 10; // data type variable and value
    // without giving any input for call default constructor its showing output
    void show(){  // user defined method
        super.show();  // call parent class method with the help of super keyword
        System.out.println(a);
        System.out.println(super.a);// call parent class variable with the help of super keyword
        System.out.println("child class");
    }
    public static void main(String[] args) { // main method
        SuperKeyB b= new SuperKeyB(); // object created
        b.show(); // call same class method with the help of object
    }
}
