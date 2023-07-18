package com.johnson.spring6webappdi.spring6di.controllers;

import com.johnson.spring6webappdi.spring6di.services.GrettingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest // This annotation is needed to run the test
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController controller;

    @Test
    void sayHello() {
        System.out.println("SetterInjectedController.setGreetingService()");
        System.out.println(controller.sayHello());
    }

    @Test
    void setGreetingService() {
    }
}