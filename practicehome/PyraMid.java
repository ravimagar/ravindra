package com.practicehome;

public class PyraMid {
    public static void main(String[] args) {

        int rows = 5, k = 0;
        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - 1; ++space) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}

//int rows=5;
//for(int i=1; i<=rows; ++i){
//    for (int j=1; j <=i; ++j){
//        System.out.print("* ");
//    }
//    System.out.println();
//}
//    }
//
//}

//    char last ='E', alphabet='A';
//    for(int i=1 ; i<=(last-'A' +1); ++i) {
//        for (int j = 1; j <= i; ++j) {
//            System.out.print(alphabet + " ");
//        }
//        ++alphabet;
//        System.out.println();


