package com.WebDriverBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
    public static void main(String[] args) {
        //Implement WebDriver
        WebDriver driver;

        //Set browser Driver Path
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rahat\\Downloads\\Software Testing and QA\\Software required for Learning Test Automation\\WebDriver\\geckodriver.exe");

        // launch Browser
        driver = new FirefoxDriver();
    }
}
