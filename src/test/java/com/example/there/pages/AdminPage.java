package com.example.there.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/button")
    private WebElement addEvent;

    @FindBy(xpath = "//*[@id=\":r1:\"]")
    private WebElement eventTitle;

    @FindBy(xpath = "//*[@id=\":r2:\"]")
    private WebElement eventUrl;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/form/div/div[1]/div/div/div/div/div[1]/div[3]/div[2]/div/div/button")
    private WebElement endDate;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[5]/button[2]")
    private WebElement date;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div/form/div/div[1]/div/div/div/div/div[1]/div[4]/div[2]")
    private WebElement eventDescription;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/form/div/div[1]/div/div/div/div/div[2]/button")
    private WebElement createEventNextButton;

    @FindBy(xpath = "//*[@id=\":rr:\"]")
    private WebElement venueName;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/form/div/div[3]/div/div/div/div/div[2]/button")
    private WebElement eventLocationNextButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/form/div/div[5]/div/div/div/div/div[2]/button[2]")
    private WebElement lineupNextButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/form/div/div[7]/div/div/div/div/div[3]/button")
    private WebElement imageColorNextButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/form/div/div[9]/div/div/div/div/div[2]/button")
    private WebElement ticketsNextButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/form/div/div[11]/div/div/div/div/div/button[2]")
    private WebElement publishEventButton;


    public void newEvent(){
        addEvent.click();
    }

    public void createEventFields(String title, String url, String description){
        eventTitle.sendKeys(title);
        eventUrl.sendKeys(url);
//        endDate.click();
//        date.click();
        eventDescription.sendKeys(description);
        createEventNextButton.click();
    }

    public void eventLocationFields(String name){
//        venueName.click();
        Select select = new Select(venueName);
        select.selectByVisibleText(name);

    }

}
