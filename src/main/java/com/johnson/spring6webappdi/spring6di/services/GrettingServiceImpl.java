package com.johnson.spring6webappdi.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GrettingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello Evertone From Base Service";
    }
}
