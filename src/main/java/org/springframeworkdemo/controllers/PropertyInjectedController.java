package org.springframeworkdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframeworkdemo.services.GreetingService;

@Controller //Indicates that this is a spring managed bean
public class PropertyInjectedController
{
    @Autowired //Tells Spring framework to inject this bean - This bean also needs to have an annotation like @Service,@Component,@Controller 
    public GreetingService greetingService;
    
    //Injecting through property
    public String sayHello()
    {
        return greetingService.sayGreeting();
    }  
}
