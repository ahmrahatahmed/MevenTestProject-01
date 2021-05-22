package com.WebDriverBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
    public static void main(String[] args) {
        //Implement WebDriver
        WebDriver driver;

        //Set browser Driver Path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahat\\Downloads\\Software Testing and QA\\Software required for Learning Test Automation\\WebDriver\\chromedriver.exe");

        // launch Browser
        driver = new ChromeDriver();
    }
}
