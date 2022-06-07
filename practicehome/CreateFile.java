package com.practicehome;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        int a;
        File f = new File("C:\\Users\\Ravindra Magar", "magar1.txt");
        // f.createNewFile();// we can create a new file with the help of this methods
        //FileWriter fw= new FileWriter(f); filewriter we use for write the file
        //fw.write("Hi this is Ravindra Magar"); // using fw.write we create an object and write to the file
        // fw.close(); // close keyword use for complete the

        FileReader fr = new FileReader(f);
        while ((a = fr.read()) != -1) {

            System.out.print((char) a);
        }
        fr.close();
    }
}
