package com.example.there.tests;

import com.example.there.pages.AdminPage;
import com.example.there.utils.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdminTest {
    AdminPage adminPage;

    @BeforeEach
    public void setUp(){
        adminPage = new AdminPage();
        adminPage.openAdminUrl("");
    }

    @AfterEach
    public void tearDown(){
//        Driver.quitDriver();

    }

    @Test
    public void createEventSuccessful(){
    adminPage.newEvent();
    adminPage.createEventFields("test event", "test-url", "test description");
    adminPage.eventLocationFields("Berkhaim");
    }
}
