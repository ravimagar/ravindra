package com.hundredjavaprogram;

import java.io.IOException;

public class Notepad {
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
        try {
            rs.exec("Notepad" );
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

}
