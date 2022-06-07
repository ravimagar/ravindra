package com.annotations;

import org.testng.annotations.*;

public class Annotations {
    @BeforeClass
    public void runBeforeClass(){
        System.out.println("Hi, I'm before class ");
    }
    @AfterClass
    public void runAfterClass(){
        System.out.println("Hi, I'm After Class");
    }
    @BeforeMethod
    public void runBefore(){
        System.out.println("Hey I am Before Method");
    }
    @AfterMethod
    public void runAfter(){
        System.out.println("Hey, I'm After Method");
    }
    @Test
    public void runFirstMethod1(){
        System.out.println("run First Method 1");
    }
    @Test
    public void runFirstMethod2(){
        System.out.println("run First Method 2");

    } 
}
