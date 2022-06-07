package com.practicehome;

import java.io.File;
import java.io.IOException;

public class NewFile {
    public static void main(String[] args) throws IOException {
        try {
            File f = new File("C:\\Users\\Ravindra Magar", "FirstProgram1.txt");

            f.createNewFile();
        } catch (Exception e) {
            System.out.println("if not working");
        }

    }
}
