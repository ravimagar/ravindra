package com.practicehome;

public class EqualsTO {
    public static void main(String[] args) {
        String name = "Ravi";
        String name2 = "Ravi";
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));

        String s1 = new String();
 String s2 = new String();
        System.out.println(s1==s2);// comparison the JVM storage
        System.out.println(s1.equals(s2));// comparison the value
        System.out.println("hello \" world");
    }
}
