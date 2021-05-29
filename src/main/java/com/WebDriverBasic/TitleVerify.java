package com.WebDriverBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class TitleVerify {
    public static void main(String[] args) {
        //Implement WebDriver
        WebDriver driver;

        //Set browser Driver Path
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rahat\\Downloads\\Software Testing and QA\\Software required for Learning Test Automation\\WebDriver\\geckodriver.exe");

        // launch Browser
        driver = new FirefoxDriver();

        //Open test URL/site
        driver.get("https://www.google.com");

        String expectedTitle="Bangladesh";
        String actualTitle= driver.getTitle();
        System.out.println(actualTitle) ;

        //Verify Title
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title Matched");
        }
        else{
            System.out.println("Title not matched, Actual Title is:" +actualTitle+ ". Expected Title is:" +expectedTitle);
        }




    }
}
