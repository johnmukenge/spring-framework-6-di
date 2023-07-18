package com.johnson.spring6webappdi.spring6di.controllers;

import com.johnson.spring6webappdi.spring6di.services.GreetingService;

public class SetterInjectedController {

        private GreetingService greetingService;

        public String sayHello(){
            return greetingService.sayGreeting();
        }

        // This is the setter method
        public void setGreetingService(GreetingService greetingService) {
            this.greetingService = greetingService;
        }
}
