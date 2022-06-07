package com.invocation;

import org.testng.annotations.*;

public class Invocation {
    @Test(invocationCount = 2)
    public void testCase1(){
        System.out.println("testcases");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }
    @BeforeMethod
    public void beforeMethod () {
        System.out.println("beforeMethod");
    }
    @Test
    public void firstMethod(){
        System.out.println("First");
    }
    @Test
    public void secondMethod(){
        System.out.println("Second");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }

}
