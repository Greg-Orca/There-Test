package com.example.there.pages;

import com.example.there.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    private final Duration WAIT_DURATION = Duration.ofSeconds(3);
    private static String BASE_URL = "https://there-dev.web.app";
    private static String ADMIN_URL = "https://there-admin-dev.web.app";

    public BasePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, WAIT_DURATION);
        driver.manage().timeouts().implicitlyWait(WAIT_DURATION);
    }

    public void waitUntilElementLoaded(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilElementClickable(WebElement webElement){
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void openUrl(String path){
        driver.get(BASE_URL+path);
    }

    public void openAdminUrl(String path){ driver.get(ADMIN_URL+path);}
}
