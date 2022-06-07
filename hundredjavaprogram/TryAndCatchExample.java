package com.hundredjavaprogram;

public class TryAndCatchExample {
    public static void main(String[] args) {
       int a=10;
       int b=0;
       int div;
       try {
           div=a/b;

       }catch (Exception e){
           System.out.println(e);
       }
    }
}