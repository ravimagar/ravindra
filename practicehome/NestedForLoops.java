package com.practicehome;

public class NestedForLoops {
    public static void main(String[] args) {
        for (long l = 10 ; l <=12; l++){
            for (int i = 10; i<= 12; i++){ // nested for loop run still the inner loop  is not false
                System.out.println(l+" "+i);
            }
        }
    }
}
