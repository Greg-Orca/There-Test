package com.example.there.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver = null;

    private Driver(){}

    public static WebDriver getDriver(){
        if (driver ==null){
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver(){
        driver.quit();
        driver = null;
        System.out.println("App closed");
    }
}
