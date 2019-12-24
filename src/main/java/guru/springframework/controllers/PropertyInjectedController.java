package guru.springframework.controllers;

import guru.springframework.services.GreetingService;


public class PropertyInjectedController
{
    public GreetingService greetingService;
    
    //Injecting through property
    public String sayHello()
    {
        return greetingService.sayGreeting();
    }  
}
