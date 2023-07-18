package com.johnson.spring6webappdi.spring6di.controllers;

import com.johnson.spring6webappdi.spring6di.services.GrettingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest // This annotation is needed to run the test
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController controller;

    //@BeforeEach
    //void setUp() {
      //  controller = new PropertyInjectedController();
        //controller.greetingService = new GrettingServiceImpl();
    //}

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}