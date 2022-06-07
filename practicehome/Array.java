package com.practicehome;

public class Array {
    public static void main(String[] args) {
         String [] array = new String[]{"Ravindra", "Prakash", "Magar"};
        System.out.println(array.length);
        int[] arr = new int[5];
        arr[0]= 1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        // arr[4]=5;
        // arr[5]=6;// Index 5 out of bounds for length 5 error showing
        //for (int i : arr){

       //  System.out.println(i);

        for(int i = 0; i <=3;i++){
            System.out.println(arr[i]);
        }
    }
}
