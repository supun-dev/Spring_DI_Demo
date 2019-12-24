package org.springframeworkdemo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframeworkdemo.services.GreetingService;

@Controller
public class ConstructorInjectedController
{
    //@Autowired //In constructor injection, @Autowired annotation is not mandatory
    public GreetingService greetingService;

    //Injecting through constructor
    //Qualifier needs the class name starting from lower case letter
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }
    
    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
