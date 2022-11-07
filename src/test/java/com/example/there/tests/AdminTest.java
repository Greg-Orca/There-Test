package com.example.there.tests;

import com.example.there.pages.AdminPage;
import com.example.there.pages.EventPage;
import com.example.there.utils.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdminTest {
    AdminPage adminPage;
    EventPage eventPage;

    @BeforeEach
    public void setUp(){
        adminPage = new AdminPage();
        eventPage = new EventPage();
        adminPage.openAdminUrl("");
    }

    @AfterEach
    public void tearDown(){
        Driver.quitDriver();

    }

    @Test
    public void createEventSuccessful(){
    adminPage.newEvent();
    adminPage.createEventFields("test event", "test-url", "test description");
    adminPage.eventLocationFields("Berkhaim");
    adminPage.lineupFields();
    adminPage.imageColorFields();
    adminPage.ticketFields();
    adminPage.finalizePublish();
    adminPage.setEventVisible();
    adminPage.saveEdit();
    eventPage.openUrl("/test-url");
    Assertions.assertEquals("test event", eventPage.getEventTitle());

    }

    @Test
    public void eventVisible(){
        adminPage.setEventVisible();
        adminPage.saveEdit();
        eventPage.openUrl("/test-url");
        Assertions.assertEquals("test event", eventPage.getEventTitle());
    }
}
