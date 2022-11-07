package com.example.there.pages;

import org.openqa.selenium.Keys;
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

    @FindBy(xpath = "//div[contains(@class, 'notranslate public-DraftEditor-content')]")
    private WebElement eventDescription;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/form/div/div[1]/div/div/div/div/div[2]/button")
    private WebElement createEventNextButton;

    @FindBy(xpath = "//*[@id=\":r5:\"]")
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

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/ul/li[1]/button")
    private WebElement editEventButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/form/div/div[1]/div[2]/label/span[1]/span[1]")
    private WebElement eventVisibleSlider;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/form/div/div[2]/button")
    private WebElement saveEditButton;


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
        createEventNextButton.click();
    }

    public void eventLocationFields(String name){
        waitUntilElementLoaded(eventLocationNextButton);
        venueName.click();
        venueName.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN);
        venueName.sendKeys(Keys.ENTER);
        eventLocationNextButton.click();
    }

    public void lineupFields(){
        lineupNextButton.click();
    }

    public void imageColorFields(){
        imageColorNextButton.click();
    }

    public void ticketFields(){
        ticketsNextButton.click();
    }

    public void finalizePublish(){
        waitUntilElementClickable(publishEventButton);
        publishEventButton.click();
        publishEventButton.click();
    }

    public void setEventVisible(){
        waitUntilElementClickable(editEventButton);
        editEventButton.click();
        waitUntilElementClickable(eventVisibleSlider);
        eventVisibleSlider.click();
    }

    public void saveEdit(){
        saveEditButton.click();
    }
}
