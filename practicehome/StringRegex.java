package com.practicehome;

public class StringRegex {
    // public static void main(String[] args) {
//        String name = "Ravindra Prakash Magar";
//        String [] array = name.split(" ");
//        StringRegex t = new StringRegex();


    String name = "Ravindra Magar wagholi";
    //String name2 = "wagholi"; // for comparing size

    String[] array = name.split(" "); // with the help of split regex we get the split result

    public static void main(String[] args) {
        StringRegex t = new StringRegex(); // object created
        //System.out.println(t.name.compareTo(t.name2));
        System.out.println(t.array[2]);// provided index value for getting output as we want
        System.out.println(t.array[1]);
        System.out.println(t.array[0]);
    }
}
