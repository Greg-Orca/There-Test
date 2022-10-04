package com.example.there.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[1]/div/div/div[2]")
    WebElement cartEvent;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div[3]/div[1]/span[2]/div")
    WebElement buttonAddTicket;

    public void addTicketToCart(){
            buttonAddTicket.click();
    }

    public boolean cartIsPresent(){
        return cartEvent.isDisplayed();
    }
}
