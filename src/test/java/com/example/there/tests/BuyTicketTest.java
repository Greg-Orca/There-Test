package com.example.there.tests;

import com.example.there.pages.BasePage;
import com.example.there.pages.CartPage;
import com.example.there.pages.EventPage;
import com.example.there.utils.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BuyTicketTest {
    CartPage cartPage;
    EventPage eventPage;

    @BeforeEach
    public void setUp(){
        cartPage = new CartPage();
        eventPage = new EventPage();
    }

    @AfterEach
    public void tearDown(){
//        Driver.quitDriver();
    }

    @Test
    public void buyTicketSuccessful(){
        eventPage.openUrl("DE-MARKT");
        eventPage.addTicketToCart();
        eventPage.buyTicket();
        String fullName = "Se Lenium";
        String email = "test@test.com";
        String phone = "+362212121212";
        String street = "Long street 22";
        String zip = "4433";
        String city = "London";
        String country = "UK";
        cartPage.fillPersonalData(fullName,email,phone,street,zip,city,country);
        cartPage.goPay();
    }



}
