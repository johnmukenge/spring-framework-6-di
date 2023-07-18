package com.johnson.spring6webappdi.spring6di.controllers;

import com.johnson.spring6webappdi.spring6di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
