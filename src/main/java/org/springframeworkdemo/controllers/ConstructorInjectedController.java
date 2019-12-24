package org.springframeworkdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframeworkdemo.services.GreetingService;

@Controller
public class ConstructorInjectedController
{
    @Autowired //In constructor injection, @Autowired annotation is not mandatory
    public GreetingService greetingService;

    //Injecting through constructor
    public ConstructorInjectedController(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }
    
    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
