package com.hundredjavaprogram;

public class StarPattern {
    public static void main(String[] args) {
//        int row, numberOfStars;
//        for (row = 1; row <= 10; row++) {
//            for (numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
//                System.out.print("* ");
//            }
//            System.out.println();} // Go to next line }

for(int i = 1; i <= 5; i++){
    for(int j= 1; j<=i; j++){
        System.out.print("* ");
    }
    System.out.println();
}
    }
}


