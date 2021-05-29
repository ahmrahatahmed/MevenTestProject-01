package com.WebDriverBasic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSize {
    public static void main(String[] args) {
        //Implement WebDriver
        WebDriver driver;

        //Set browser Driver Path
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rahat\\Downloads\\Software Testing and QA\\Software required for Learning Test Automation\\WebDriver\\geckodriver.exe");

        // launch Browser
        driver = new FirefoxDriver();

        //Open test URL/site
        driver.get("https://www.google.com");

        //get browser size - size will be shown in console message
        Dimension browserSize = driver.manage().window().getSize();
        System.out.println("Maximum Browser Size: " +browserSize);

        // setBrowserSize
        driver.manage().window().setSize(new Dimension(800,600));
        Dimension customBrowserSize = driver.manage().window().getSize();
        System.out.println("Custom Browser Size: " +customBrowserSize);


        //driver.quit();


    }
}
