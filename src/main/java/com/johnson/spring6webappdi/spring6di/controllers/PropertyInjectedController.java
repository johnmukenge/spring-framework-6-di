package com.johnson.spring6webappdi.spring6di.controllers;

import com.johnson.spring6webappdi.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
