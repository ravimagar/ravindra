package com.dataprovider;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class DataProviderParameters {
    public WebDriver driver;
    @DataProvider(name = "test-data")
    public Object[][] dataProviderFun(){
        Object[][] arrayObj=getExcelData("C:\\Users\\Ravindra Magar\\OneDrive\\Desktop\\publish_events\\Test.xlsx","Dataset");
        return arrayObj;
    }
    public String[][] getExcelData(String fileName,String sheetName) {
        String[][] data = null;
        try {
            FileInputStream file = new FileInputStream(fileName); // for excel file access
            XSSFWorkbook wb = new XSSFWorkbook(file); // file type of excelSheet
            XSSFSheet sheet = wb.getSheet(sheetName); // access excel sheet inside excel file
            XSSFRow row = sheet.getRow(0);
            int noOfRows = sheet.getPhysicalNumberOfRows();
            int noOfCol = row.getLastCellNum();
            Cell cell;
            data = new String[noOfRows - 1][noOfCol];

            for (int i = 1; i < noOfRows; i++) {
                for (int j = 0; j < noOfCol; j++) {
                    row = sheet.getRow(i);
                    cell = row.getCell(j);
                    data[i - 1][j] = cell.getStringCellValue();

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;

    }
    @BeforeMethod
    public void befMethod() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Ravindra Magar\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "test-data")
    public void testMethod1(String keyword1 , String keyword2 ) {
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(keyword1, keyword2);
        element.sendKeys(Keys.ENTER);
    }
    @AfterMethod
    public void aftMethod(){
        driver.quit();
    }

}
