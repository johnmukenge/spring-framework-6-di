package com.johnson.spring6webappdi.spring6di.controllers;

import com.johnson.spring6webappdi.spring6di.services.GreetingService;
import com.johnson.spring6webappdi.spring6di.services.GrettingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GrettingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in the controller");
        return greetingService.sayGreeting();
    }
}
