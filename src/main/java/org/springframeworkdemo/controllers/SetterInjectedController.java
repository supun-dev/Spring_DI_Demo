package org.springframeworkdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframeworkdemo.services.GreetingService;

@Controller
public class SetterInjectedController
{
    //@Autowired
    public GreetingService greetingService;

    //Injecting through setter
    @Autowired
    @Qualifier("setterGreetingService")
    public void setGreetingService(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }
    
    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
    
}
