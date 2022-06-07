package com.practicehome;

public class Array2D {
    // class name Array2D

    public static void main(String[] args) {  // main class
        int[][] a = new int[][]{{100,200,300}, {1000, 2000,3000}, {10000, 20000, 30000}}; // int = datatype,new int= is an object, [array],{blocks} and value
        for (int i = 0; i < a.length; i++) {     //ForLoop
            for (int j = 0; j < a.length; j++) {   //NesTed ForLoop
                System.out.print(a[i][j] + " ");   // print on same line
            }
            System.out.println();   // println for newline.
        }
    }

}

