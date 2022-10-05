package com.example.there.pages;

import org.checkerframework.common.reflection.qual.GetClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class CartPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[1]/div/h2")
    private WebElement eventTitle;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[1]/div/h2[2]/span[1]")
    private WebElement ticketType;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[1]/div/h2[2]/span[2]")
    private WebElement ticketQuantityXPrice;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[1]/div/h2/span[2]")
    private WebElement cartSum;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div/div/form/div/div[6]/input")
    private WebElement buttonPay;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div/div/form/div/div[1]/input")
    private WebElement filedFullName;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div/div/form/div/div[2]/input")
    private WebElement fieldEmail;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div/div/form/div/div[3]/input")
    private WebElement filedPhoneNumber;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div/div/form/div/div[4]/input")
    private WebElement fieldStreet;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div/div/form/div/div[5]/div[1]/input")
    private WebElement fieldZIP;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div/div/form/div/div[5]/div[2]/input")
    private WebElement fieldCity;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div/div/form/div/div[6]/input")
    private WebElement filedCountry;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div/div/form/div/div[8]/div[1]/div")
    private WebElement acceptConditions;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div/div/form/div/div[6]/div[contains(@class, 'helper-text error')]")
    private WebElement countryRequired;

    public List<String> cartItems(){
        List<String> list = new ArrayList<>();
        waitUntilElementLoaded(ticketType);
        list.add(eventTitle.getText());
        list.add(ticketType.getText());
        list.add(ticketQuantityXPrice.getText());
        return list;
    }

    public String getCartSum(){
        waitUntilElementLoaded(buttonPay);
        return cartSum.getText();
    }

    public void fillPersonalData(String fullName, String email, String phone, String street, String zip, String city, String country){
        filedFullName.sendKeys(fullName);
        fieldEmail.sendKeys(email);
        filedPhoneNumber.sendKeys(phone);
        fieldStreet.sendKeys(street);
        fieldZIP.sendKeys(zip);
        fieldCity.sendKeys(city);
        filedCountry.sendKeys(country);
        acceptConditions.click();
    }

    public void goPay(){
        wait.until(ExpectedConditions.invisibilityOf(countryRequired));
        buttonPay.click();
    }
}
