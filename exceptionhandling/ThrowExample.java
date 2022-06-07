package com.exceptionhandling;

import java.util.Scanner;

public class ThrowExample extends RuntimeException {
    ThrowExample(String msg) {
        super(msg);
    }

}

class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        if (age < 18) {
            throw new ThrowExample("you are not eligible ");
        } else {
            System.out.println("please vote");
        }
    }
}

