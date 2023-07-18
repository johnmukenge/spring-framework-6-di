package com.johnson.spring6webappdi.spring6di.services;

public class GrettingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello Evertone From Base Service";
    }
}
