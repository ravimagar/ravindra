package com.dataprovider;

import com.beust.jcommander.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeOfParametrization {
    WebDriver driver;

    @BeforeMethod
   // @Parameters({"browser"})
    public void beforeMethod(String browser) {
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:/Users/Ravindra Magar/Downloads/chromedriver_win32/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", "C:\\Users\\Ravindra Magar\\Downloads\\edgedriver_win64\\msedgedriver.exe");
                driver = new EdgeDriver();
                break;

        }
    }
   // @Parameters("value")
    @Test
    public void methodOne(String value) throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        WebElement item = driver.findElement(By.className("_3704LK"));
        item.click();
        Thread.sleep(5000);
//        JavascriptExecutor js= (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].scrollIntoView();",item);
        // WebElement email = driver.findElement(By.xpath("(//div[@class='_312yBx SFzpgZ'][1])"));
        //email.click();
//        JavascriptExecutor ja = (JavascriptExecutor)driver;
//        ja.executeScript("arguments[0].scrollIntoView();",email);
        Thread.sleep(5000);

    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }

}
