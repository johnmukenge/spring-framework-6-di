package com.johnson.spring6webappdi.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GrettingServiceSetterInjection implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - I'm injected by setter";
    }
}
