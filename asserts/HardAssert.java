package com.asserts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert {
//
//    SoftAssert softAssert = new SoftAssert();
//    public void hardAssert(){
//    System.out.println("1");
//    Assert.assertEquals("ravi","magar");
//    System.out.println("2");
//}

    @Test
    public void HardAssert2() {
        String name = "Ravindra";
        SoftAssert softAssert = new SoftAssert();
        System.out.println("1");
        softAssert.assertEquals("magar", "magar");
        System.out.println("2");
        System.out.println("3");
        softAssert.assertFalse(name.contains("magar"),"name contains Ravindra");
        softAssert.assertAll();
    }}

