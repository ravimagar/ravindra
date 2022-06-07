package com.asserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertExamples {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Ravindra Magar/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @Test
    public void firstMethod(){
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Google");
    }
    @Test
    public void secondMethod(){
        System.out.println(driver.getTitle());
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

}

