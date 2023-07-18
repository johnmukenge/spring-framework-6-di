package com.johnson.spring6webappdi.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest // This annotation is needed to run the test, so spring know that it is a Spring managed component
class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController controller;
    @Test
    void sayHello() {

        System.out.println(controller.sayHello());
    }
}