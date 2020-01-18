package org.springframeworkdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframeworkdemo.services.GreetingService;

@Controller
public class MyController
{
    private GreetingService greetingService;
    
    public MyController(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }
    
    
    public String doGreeting()
    {
        return greetingService.sayGreeting();
    }
}
