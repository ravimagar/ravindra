package com.constructor;

public class SuperB extends SuperA {
    int a = 10;
    void Ravii(){
        super.Magar();// using super keyword call parent class user defined method
        System.out.println(super.name);// call parent class variable with the help of super keyword
        System.out.println(a);

    }

    public static void main(String[] args) {
        SuperB su= new SuperB();
        System.out.println(su.a);
        su.Ravii();

    }

}
