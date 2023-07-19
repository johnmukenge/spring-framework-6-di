package com.johnson.spring6webappdi.spring6di.services;

import org.springframework.stereotype.Service;

// I'm giving this bean a custom name
@Service("propertyGreetingService")
public class GrettingServicePropertyInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Friends don't let friends use property injection";
    }
}
