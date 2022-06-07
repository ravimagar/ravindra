package com.constructor;

public class PrivateConstructor {
    private PrivateConstructor() {

    }

    public void display() {
        System.out.println(" private constructor");
    }

    public static void main(String[] args) {
        PrivateConstructor p1 = new PrivateConstructor();
        p1.display();
    }


}
