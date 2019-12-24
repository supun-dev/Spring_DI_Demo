package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

public class SetterInjectedController
{
    public GreetingService greetingService;

    //Injecting through setter
    public void setGreetingService(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }
    
    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
    
}
