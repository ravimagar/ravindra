package com.exceptionhandling;

import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("D:\\Demo");
        } catch (Exception e) {
            System.out.println("ok");
        }
    }
/*// throws FileNotFoundException, ClassNotFoundException {
//        FileInputStream fi = new FileInputStream("D:\\desktop files");// this is checked exceptions which is checked
        // by compiler at the time of compiling we can handle it throw the exception handling
//Class.forName("com.mysql.jdbc.Driver");
//int a=10, b=0, c=a/b; // unchecked exception which is not checked by compiler but at the time of execution it will show error
  //      System.out.println(c);*/


}
