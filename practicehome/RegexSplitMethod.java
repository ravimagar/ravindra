package com.practicehome;

public class RegexSplitMethod {
    public static void main(String[] args) {
        String s = "Ravindra#Prakash#Magar";
        //String[] str = s.split("#");
        String[] str = s.split("#",3);
        for (String a :str){
            System.out.println(a);
        }
    }
}
