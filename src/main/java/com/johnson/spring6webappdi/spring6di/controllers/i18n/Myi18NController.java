package com.johnson.spring6webappdi.spring6di.controllers.i18n;

import com.johnson.spring6webappdi.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi18NController {
    private final GreetingService gretingService;

    public Myi18NController(@Qualifier("i18nService") GreetingService gretingService) {
        this.gretingService = gretingService;
    }

    public String sayHello(){
        return gretingService.sayGreeting();
    }

}
