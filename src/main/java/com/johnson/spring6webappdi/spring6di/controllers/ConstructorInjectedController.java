package com.johnson.spring6webappdi.spring6di.controllers;

import com.johnson.spring6webappdi.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    // This is the constructor

    // @Qualifier is used to specify which bean to use
    // If there is no @Qualifier annotation, the application will not know which bean to use
    // by default, the bean name is the class name with the first letter in lower case
    public ConstructorInjectedController(@Qualifier("grettingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
