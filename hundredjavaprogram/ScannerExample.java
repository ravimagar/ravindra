package com.hundredjavaprogram;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        sc.next();
        System.out.println("enter your accounts marks");
        float subject1 = sc.nextFloat();
        System.out.println("enter your Eco marks");
        float subject2 = sc.nextFloat();
        System.out.println("enter your english marks");
        float subject3 = sc.nextFloat();
        System.out.println("Enter your oc marks");
        float subject4 = sc.nextFloat();
        System.out.println("Enter your costing marks");
        float subject5 = sc.nextFloat();
        float percentage = ((subject1 + subject2 + subject3 + subject4 + subject5) / 500) * 100;
        System.out.println("Your percentage is: " + percentage);
        if (percentage >= 35 && subject1 >= 35 && subject2 >= 35 && subject3 >= 35 && subject4 >= 35 && subject5 >= 35) {
            System.out.println("you are failed");
        } else {
            System.out.println(" you are pass");
        }


    }
}