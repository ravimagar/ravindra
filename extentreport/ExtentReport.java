package com.extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExtentReport {
    ExtentReports reports = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("report.html");
    ExtentTest test ;
    @BeforeTest
    void beforeTest(){
        reports.attachReporter(spark);
    }


    @Test
    public void m1(){

        test = reports.createTest("launch the browser").assignAuthor("ravi").assignDevice("chrome");
        test.info("user is opening the browser");
        System.out.println("i am m1");
        test.pass("your test is failed");

    }
    @Test
    public void m2(){
        SoftAssert softAssert = new SoftAssert();
        test = reports.createTest("launch the browser").assignAuthor("magar").assignDevice("firefox");
        test.info("user is opening the browser");
        System.out.println("i am m2");
        softAssert.assertEquals("magar","value2","both value should be match");
        test.pass("your test is pass");
        softAssert.assertAll();
    }
    @Test
    public void m3(){
        test = reports.createTest("launch the browser").assignAuthor("Ravindra").assignDevice("edge");
        test.info("user is opening the browser");
        System.out.println("i am m3");
        test.pass("your test is pass");
    }
    @AfterTest
    void afterTest(){
        reports.flush();
    }
}


