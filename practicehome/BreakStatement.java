package com.practicehome;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;  // break the statement as mentioned on if it will break
            }
            System.out.println(i);
        }
    }
}
