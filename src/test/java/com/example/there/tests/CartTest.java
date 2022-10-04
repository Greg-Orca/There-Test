package com.example.there.tests;

import com.example.there.pages.BasePage;
import com.example.there.pages.EventPage;
import org.junit.jupiter.api.BeforeEach;

public class CartTest {
    EventPage eventPage;

    @BeforeEach
    public void setUp(){
        eventPage = new EventPage();
    }

}
