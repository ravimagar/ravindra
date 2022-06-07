package com.exception;

import org.testng.annotations.Test;

import java.io.IOException;

public class ExpectedException {
    @Test(expectedExceptions = {ArithmeticException.class,},groups = "smoke")
    public void exceptionExample(){
        System.out.println(10/0);
        System.out.println("exceptionhandle");
    }
    @Test(expectedExceptions = {IOException.class})
    public void exceptionExample1() throws Exception {
        throw new IOException();
    }
    @Test(expectedExceptions = {NullPointerException.class})
    public void exceptionExample2() throws Exception {
        String r = null;
        System.out.println(r.length());
    }

}
