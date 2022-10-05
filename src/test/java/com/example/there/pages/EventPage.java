package com.example.there.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[1]/div/div/div[2]")
    WebElement cartEvent;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div[3]/div[1]/span[2]/div")
    WebElement buttonAddTicket;

    @FindBy(css = "#__next > div.Home_content__Zy02X > div.css-15711vh > div.css-1m6ueoc > div.css-1mdqpac > div.TicketsBox_ticketRow__EY245 > span.TicketsBox_activeTicket__4KS4S.TicketsBox_price__I0cZh > div > svg")
    WebElement buttonRemoveTicket;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div[3]/div[2]/button")
    WebElement buttonBuy;

    public void addTicketToCart(){
            buttonAddTicket.click();
    }

    public void removeTicket(){
        waitUntilElementClickable(buttonRemoveTicket);
        buttonRemoveTicket.click();
    }

    public boolean cartIsPresent(){
        return cartEvent.isDisplayed();
    }

    public void buyTicket(){
        waitUntilElementClickable(buttonBuy);
        buttonBuy.click();
    }
}
