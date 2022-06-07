//package com.annotations;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
//
//import java.io.File;
//
//public class screenshot {
//    private Object IOException;
//
//    @Test
//    public void Screenshot() {
//
//// launch browser and URL
//
//        WebDriver driver=new FirefoxDriver();
//        driver.get("https://apps.fresco.me");
//
//// Capture screenshot and store as a file format
//
//        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        Try{
//
////Now we are copying the screenshot to the desired location using "copyFile" //method
//
//            FileUtils.copyFile(src, newFile("D:/selenium_workspace/error.png"));
//        }
//
//catch (IOException e)
//        {
//            System.out.println(e.getMessage());
//
//        }
//    }
//
//    private File newFile(String s) {
//    }
//
//
//}
