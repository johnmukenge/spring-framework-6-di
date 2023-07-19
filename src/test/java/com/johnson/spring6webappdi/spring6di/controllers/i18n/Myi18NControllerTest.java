package com.johnson.spring6webappdi.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

/*
* Without @ActiveProfiles("EN"), the test will fail because it will go in conflict
* and spring will not know which bean to use
* */
@ActiveProfiles("ES")
@SpringBootTest
class Myi18NControllerTest {

    @Autowired
    Myi18NController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}