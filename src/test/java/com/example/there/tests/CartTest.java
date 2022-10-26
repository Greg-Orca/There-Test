package com.example.there.tests;

import com.example.there.pages.CartPage;
import com.example.there.pages.EventPage;
import com.example.there.utils.Driver;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CartTest {
    EventPage eventPage;
    CartPage cartPage;

    @BeforeEach
    public void setUp(){
        eventPage = new EventPage();
        cartPage = new CartPage();
        eventPage.openUrl("DE-MARKT");
    }

    @AfterEach
    public void tearDown(){
        Driver.quitDriver();
    }

    @Test
    public void addTicketToCartSuccessful() {
        String eventTitle = "DE MARKT jubilee nightmarket";
        String ticketType = "Asztal jegy";
        String quantityAndPrice = "1x 5,000Ft";
        List<String> expectedList= new ArrayList<>();
        expectedList.add(eventTitle);
        expectedList.add(ticketType);
        expectedList.add(quantityAndPrice);

        eventPage.addTicketToCart();
        Assertions.assertTrue(eventPage.cartIsPresent());
        eventPage.openUrl("checkout");
        List<String> resultList = cartPage.cartItems();

        Assertions.assertEquals(expectedList,resultList);
    }

    @Test
    public void removeTicketFromCartSuccessful() {
        String expected = "0Ft";
        eventPage.addTicketToCart();
        eventPage.removeTicket();
        eventPage.openUrl("checkout");
        String actual = cartPage.getCartSum();
        System.out.println(expected + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkoutWithEmptyCartUnsuccessful(){
        eventPage.openUrl("checkout");
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
