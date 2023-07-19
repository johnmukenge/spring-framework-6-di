package com.johnson.spring6webappdi.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GrettingServicePrimary implements GreetingService{
    /*
    * Without a @Primary annotation, the application will not know which bean to use
    * and will throw an error.
    * Error creating bean with name 'constructorInjectedController' defined in file
    * [C:\git\corso\spring-framework-6-di\target\classes\com\johnson\spring6webappdi\spring6di\controllers\ConstructorInjectedController.class]:
    * Unsatisfied dependency expressed through constructor parameter 0: No qualifying bean of type 'com.johnson.spring6webappdi.spring6di.services.GreetingService'
    * available: expected single matching bean but found 2: grettingServiceImpl,grettingServicePrimary
    *
    * */
    @Override
    public String sayGreeting() {
        return "Hello From Primary Bean";
    }
}
